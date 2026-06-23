# TOSCA Designer Input/Output Capability Assessment

**Assessment Date**: 2026-06-22  
**ToscaDesigner Version**: 0.5.1  
**Modelio Version**: 5.4.1  
**TOSCA Standard**: v1.3

---

## Executive Summary

The ToscaDesigner module has **partial support for inputs and outputs**, with significant gaps in export rendering. The API layer supports inputs and outputs for topology templates, but the export functionality is incomplete:

- ✅ **Topology Template Inputs**: Supported (API + Rendering)
- ❌ **Topology Template Outputs**: API exists but not rendered
- ❌ **Node Template Inputs/Outputs**: Minimal API support, no rendering
- ❌ **Node Type Inputs/Outputs**: No implementation found
- ⚠️ **Operations/Interfaces**: String-based inputs/outputs only

---

## Detailed Findings

### 1. Topology Template Support

#### API Level ✅ PARTIAL
**File**: `src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TTopologyTemplate.java`

**Supported Methods**:
- `List<TParameter> getInputs()` - Retrieve input parameters
- `void addInputs(TParameter obj)` - Add input parameter
- `boolean removeInputs(TParameter obj)` - Remove input parameter
- `List<TParameter> getOutputs()` - Retrieve output parameters
- `void addOutputs(TParameter obj)` - Add output parameter
- `boolean removeOutputs(TParameter obj)` - Remove output parameter

**Type**: TParameter (same for both inputs and outputs)

#### Export/Rendering ⚠️ INCOMPLETE
**File**: `src/main/resources/fr/softeam/templates/TTopologyTemplate.hbs`

**Current Template**:
```handlebars
{{#unless (noStereotypeApplications this "InputParametersType")}}
  inputs:
  {{#ownedElement}}{{#extension}}{{#eq name "InputParametersType"}}
    {{#ownedAttribute as |parameter|}}{{#extension as |extension|}}{{#eq extension.name "TParameter"}}
      {{> TParameter parameter}}
    {{/eq}}{{/extension}}{{/ownedAttribute}}
  {{/eq}}{{/extension}}{{/ownedElement}}
{{/unless}}
```

**Issue**: **No outputs section** despite API support for `getOutputs()`

**Missing Template Block**:
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

#### Evidence from Examples ❌
Generated topology template example: `examples/generated-tosca/MyrtusSmartTrafficManagementTopologyTemplate.tosca`
- Contains: `topology_template:` with `node_templates:`, `groups:`, `policies:`
- Missing: `inputs:` and `outputs:` sections (even though template supports inputs)

---

### 2. Node Template Support

#### API Level ❌ NOT FOUND
**File**: `src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TNodeTemplate.java`

**Properties**:
- `minInstances` (int)
- `maxInstances` (int)
- `name` (string)

**Relationships**:
- `nodeType` (TNodeType reference)
- `deploymentArtifacts` (TDeploymentArtifacts)
- `requirements` (RequirementsType)

**NOT FOUND**: No `inputs`, `outputs`, `attributes` methods

#### Property Page ❌ NO INPUTS/OUTPUTS
**File**: `src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TNodeTemplatePropertyPage.java`

Properties shown in UI:
- Name
- Min Instance
- Max Instance
- Deployment Artifacts
- Requirements
- Node Type

**Missing**: Inputs and Outputs fields

#### Export/Rendering ❌ NOT IMPLEMENTED
**File**: `src/main/resources/fr/softeam/templates/TNodeTemplate.hbs`

```handlebars
{{name}}:
  type: {{getProperty this "nodeType"}}
  metadata:
    ...
  properties:
    ...
  requirements:
    ...
  artifacts:
    ...
```

**Missing**: `inputs:` and `outputs:` sections

---

### 3. Node Type Support

#### API Level ❌ NO INPUT/OUTPUT METHODS
**File**: `src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TNodeType.java`

**Methods Found**:
- `List<ImportElement> get()` - Imports
- `List<PropertiesDefinitionType> getProperties()` - Properties
- `List<InterfacesType> getInterfaces()` - Interfaces

**NOT FOUND**: 
- `getInputs()` / `addInputs()`
- `getOutputs()` / `addOutputs()`
- `getAttributes()` / `addAttributes()`

#### Export/Rendering ❌ NO INPUTS/OUTPUTS
**File**: `src/main/resources/fr/softeam/templates/TNodeType.hbs`

```handlebars
node_types:
  {{owner.name}}.{{name}}:
    properties:
      ...
    requirements:
      ...
    capabilities:
      ...
```

**Missing**: `inputs:`, `outputs:`, `attributes:` sections

#### TOSCA Compliance Issue
TOSCA v1.3 specification allows node types to define:
- `attributes` (not currently supported)
- Not `inputs`/`outputs` at node type level (those are for node templates)

---

### 4. Operation/Interface Support

#### API Level ⚠️ STRING-BASED ONLY
**File**: `src/main/java/fr/softeam/toscadesigner/handlers/propertypages/core/TOperationPropertyPage.java`

```java
this._element.setInputs(value);      // String only
this._element.setOutputs(value);     // String only
```

**Issue**: Operations store inputs/outputs as **plain text strings**, not structured TParameter objects

**Type**: Not strongly typed; no parameter definitions

---

### 5. Related Stereotypes & Model Elements

#### Available in Model ✅
Files found in `src/main/java/fr/softeam/toscadesigner/api/tosca/infrastructure/modelelement/`:
- `InputParameterType1.java`
- `InputParametersType.java`
- `OutputParametersType1.java`
- `OutputParametersType.java`

These are used by the factory for instantiation but not actively used in rendering.

---

## Summary Table

| Component | API Support | Rendering | Capability |
|-----------|-------------|-----------|------------|
| Topology Template Inputs | ✅ Yes | ✅ Yes | **IMPLEMENTED** |
| Topology Template Outputs | ✅ Yes | ❌ No | **BLOCKED** |
| Node Template Inputs | ❌ No | ❌ No | **NOT IMPLEMENTED** |
| Node Template Outputs | ❌ No | ❌ No | **NOT IMPLEMENTED** |
| Node Template Attributes | ❌ No | ❌ No | **NOT IMPLEMENTED** |
| Node Type Inputs | ❌ No | ❌ No | **NOT APPLICABLE** |
| Node Type Outputs | ❌ No | ❌ No | **NOT APPLICABLE** |
| Node Type Attributes | ❌ No | ❌ No | **NOT IMPLEMENTED** |
| Operation Inputs | ⚠️ String | ❌ No | **INCOMPLETE** |
| Operation Outputs | ⚠️ String | ❌ No | **INCOMPLETE** |

---

## Gaps & Limitations

### Gap 1: Topology Template Outputs Not Exported
- **Severity**: HIGH
- **Fix Complexity**: LOW (template addition + handlebars helper)
- **Required Changes**: Add outputs section to `TTopologyTemplate.hbs`

### Gap 2: Node Template Inputs/Outputs Missing
- **Severity**: MEDIUM
- **Fix Complexity**: MEDIUM
- **Required Changes**:
  1. Extend TNodeTemplate API with input/output methods
  2. Update property page UI
  3. Add rendering to TNodeTemplate.hbs
  4. Create InputParametersType/OutputParametersType relationships

### Gap 3: Node Type Attributes Missing
- **Severity**: MEDIUM
- **Fix Complexity**: MEDIUM
- **Required Changes**:
  1. Extend TNodeType API with attributes support
  2. Add attributes rendering to TNodeType.hbs
  3. Update UI property pages

### Gap 4: Operation Inputs/Outputs Not Structured
- **Severity**: LOW
- **Fix Complexity**: HIGH
- **Required Changes**:
  1. Refactor TOperation to use structured TParameter objects
  2. Add UI editor for parameter definitions
  3. Update export rendering

---

## Recommendations

### Priority 1 (Critical)
**Enable Topology Template Outputs**
- Add outputs rendering section to `TTopologyTemplate.hbs`
- Estimated effort: 30 minutes
- Impact: Full TOSCA v1.3 topology template support

### Priority 2 (High)
**Implement Node Template Inputs/Outputs**
- Add input/output parameter support to TNodeTemplate
- Estimated effort: 4-6 hours
- Impact: Enables complete topology template definitions

### Priority 3 (Medium)
**Implement Node Type Attributes**
- Add attribute definitions to TNodeType
- Estimated effort: 3-4 hours
- Impact: Full node type definitions per TOSCA spec

### Priority 4 (Low)
**Refactor Operation Inputs/Outputs to Structured Types**
- Migrate from string-based to TParameter-based
- Estimated effort: 8-10 hours
- Impact: Better type safety and editor support

---

## TOSCA v1.3 Specification Alignment

**Partially Compliant** ⚠️

What's missing:
- ❌ Topology template outputs (API ready, rendering missing)
- ❌ Node template inputs (no API)
- ❌ Node template attributes (no API)
- ❌ Node type attributes (no API)

What's working:
- ✅ Topology template inputs
- ✅ Basic node template structure
- ✅ Node type definitions (properties, requirements, capabilities)

---

## Files Requiring Changes

To enable full input/output support:

1. **Template files**:
   - `src/main/resources/fr/softeam/templates/TTopologyTemplate.hbs` (outputs rendering)
   - `src/main/resources/fr/softeam/templates/TNodeTemplate.hbs` (inputs/outputs)
   - `src/main/resources/fr/softeam/templates/TNodeType.hbs` (attributes)

2. **API files**:
   - `src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TNodeTemplate.java` (input/output methods)
   - `src/main/java/fr/softeam/toscadesigner/api/tosca/standard/class_/TNodeType.java` (attribute methods)

3. **Property pages**:
   - `src/main/java/fr/softeam/toscadesigner/handlers/propertypages/topologyTemplate/TNodeTemplatePropertyPage.java`
   - `src/main/java/fr/softeam/toscadesigner/handlers/propertypages/serviceTemplate/TNodeTypePropertyPage.java`

---

## Conclusion

The TOSCA Designer module has a **solid foundation** for inputs and outputs support but needs **completion work** to fully leverage the TOSCA v1.3 specification. The most critical gap is the missing **topology template outputs rendering**, which is a quick fix. Node template and type support requires more development effort but would significantly enhance modeling capabilities.
