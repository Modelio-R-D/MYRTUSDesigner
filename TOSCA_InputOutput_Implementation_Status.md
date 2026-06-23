# TOSCA Designer: Input/Output Implementation Status

**Date**: 2025-02-06  
**Version**: v0.5.1  
**Status**: 🔧 IN PROGRESS

---

## Executive Summary

The **Topology Template already has full input/output support** (API + template + property page UI), but there was a **bug in the property page output validation** that has been **fixed**. Node Templates do **NOT support inputs/outputs per TOSCA v1.3 spec** and should not be modified to add this support.

---

## TOSCA v1.3 Spec Compliance

| Element | Inputs? | Outputs? | Spec Reference | Notes |
|---------|---------|----------|-----------------|-------|
| **Topology Template** | ✅ YES | ✅ YES | TOSCA v1.3 § 5.9 | Parameters defining template inputs/outputs |
| **Service Template** | ✅ YES | ✅ YES | TOSCA v1.3 § 5.8 | Parameters at service level |
| **Node Template** | ❌ NO | ❌ NO | TOSCA v1.3 § 5.10 | Uses properties, requirements, capabilities instead |
| **Node Type** | ❌ NO | ❌ NO | TOSCA v1.3 § 5.11 | Uses properties, attributes, requirements, capabilities |

**Key Distinction**: Node templates use **properties** (set node type property values) and **requirements**, NOT input/output parameters.

---

## Topology Template Implementation

### ✅ API Support (Complete)

All required methods exist in `TTopologyTemplate`:

```java
// Input operations
public void addInputs(TParameter obj)
public List<TParameter> getInputs()
public boolean removeInputs(TParameter obj)

// Output operations  
public void addOutputs(TParameter obj)
public List<TParameter> getOutputs()
public boolean removeOutputs(TParameter obj)
```

**File**: [src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TTopologyTemplate.java](src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TTopologyTemplate.java)

### ✅ Template Rendering (Complete)

Handlebars template includes outputs section (added in this session):

```handlebars
{{#unless (noStereotypeApplications this "OutputParametersType")}}
  outputs:
  {{#ownedElement}}{{#extension}}{{#eq name "OutputParametersType"}}
    {{#ownedAttribute as |parameter|}}{{#extension as |extension|}}{{#eq extension.name "TParameter"}}
      {{> TParameter parameter}}
    {{/eq}}{{/extension}}{{/ownedAttribute}}
  {{/eq}}{{/extension}}{{/ownedElement}}
{{/unless}}
```

**File**: [src/main/resources/fr/softeam/templates/TTopologyTemplate.hbs](src/main/resources/fr/softeam/templates/TTopologyTemplate.hbs)  
**Lines**: 16-23 (outputs section added)

### ✅ Property Page UI (Complete)

The property page `TTopologyTemplatePropertyPage` displays inputs/outputs in tabular format:

```java
// Lines 138-151: Already defined UI for inputs/outputs
table.addProperty("Inputs", getToscaValue(members_elt),
    getAddRemove(inputs, extractModelElements(this._element.getInputs())));

table.addProperty("Outputs", getToscaValue(members_elt),
    getAddRemove(outputs, extractModelElements(this._element.getOutputs())));
```

**File**: [src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java](src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java)  
**Lines**: 75-95, 138-151

### 🐛 Bug Fixed

**Issue**: Line 89 had incorrect stereotype check for outputs validation:

```java
// BEFORE (Line 89 - WRONG):
if ((elt5 != null) && (elt5.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, 
    TNodeTemplate.STEREOTYPE_NAME))) {  // ❌ WRONG - checking TNodeTemplate instead of TParameter
```

**Fix Applied**:

```java
// AFTER (Line 89 - CORRECT):
if ((elt5 != null) && (elt5.isStereotyped(IToscaDesignerPeerModule.MODULE_NAME, 
    TParameter.STEREOTYPE_NAME))) {  // ✅ CORRECT
```

**File Modified**: [src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java](src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java)

---

## Node Template Implementation Status

### ❌ Input/Output Support NOT Required

Per TOSCA v1.3 spec, Node Templates:
- Do NOT have input/output parameters
- Use **properties** (values assigned to node type properties)
- Use **requirements** (resolved dependencies to capabilities)
- Use **capabilities** (derived from node type)
- Use **attributes** (derived from node type)

### Why Node Templates Lack Input/Output Methods

`TNodeTemplate.java` is generated from the Modelio UML model (see: "WARNING: GENERATED FILE - DO NOT EDIT" header). Since the model doesn't define inputs/outputs for node templates (correctly, per TOSCA spec), the proxy class doesn't have these methods.

**Existing TNodeTemplate Property Page**: [src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TNodeTemplatePropertyPage.java](src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TNodeTemplatePropertyPage.java)

Correctly shows:
- Name, Min/Max Instances
- Node Type reference
- Requirements, Deployment Artifacts

**Does NOT show** (and should not):
- Inputs/Outputs (not in TOSCA spec)

---

## Diagram Editor Palette Buttons

**Note**: The existing property page UI is for editing **properties of an already-created element**. The user's original request mentioned **"buttons in the palette of that diagram editor"** for creating inputs/outputs in the diagram.

This requires **separate diagram tool registration** (palette buttons), which is distinct from property page UI.

**Status**: Not yet addressed in this session - requires finding Modelio diagram action registration mechanism.

---

## Build Status

Maven build in progress (packaging JAR with fixes).  
Expected outcome: ✅ Build should complete successfully with the property page bug fix.

---

## Testing Checklist

- [ ] Maven build completes successfully (Exit Code: 0)
- [ ] Topology template with inputs/outputs exports correctly to YAML
- [ ] Property page correctly validates and adds/removes TParameter inputs
- [ ] Property page correctly validates and adds/removes TParameter outputs (bug fix verification)
- [ ] Export example file with inputs/outputs and verify structure

---

## Implementation Summary

| Component | Status | Location |
|-----------|--------|----------|
| TTopologyTemplate API | ✅ Complete | `api/tosca/standard/class_/TTopologyTemplate.java` |
| Handlebars Template | ✅ Complete | `resources/fr/softeam/templates/TTopologyTemplate.hbs` |
| Property Page UI | ✅ Complete (Bug Fixed) | `handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java` |
| TNodeTemplate API | ✅ Not Needed | N/A - TOSCA spec compliant (no I/O) |
| Diagram Palette Buttons | ⏳ Not Addressed | Requires separate investigation |

---

## Recommendations

1. **Verify the build** completes successfully with the property page bug fix
2. **Test the topology template inputs/outputs** in the property page UI
3. **Export and validate** YAML output includes inputs/outputs sections
4. **Document to users** that Node Templates correctly do NOT support inputs/outputs per TOSCA v1.3
5. **Optional**: If users need to create inputs/outputs via diagram palette buttons (separate UI feature from property pages), investigate Modelio diagram action registration mechanism

---

## Files Modified in This Session

1. [TTopologyTemplate.hbs](src/main/resources/fr/softeam/templates/TTopologyTemplate.hbs) - Added outputs rendering section
2. [TTopologyTemplatePropertyPage.java](src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TTopologyTemplatePropertyPage.java) - Fixed output validation bug (Line 89)

