#  MYRTUSDesigner

**TOSCA Designer** is an open-source module for **Modelio 5.4.1**, enabling graphical modeling of cloud-based applications using the [OASIS TOSCA Standard](https://www.oasis-open.org/committees/tosca/).  It allows users to specify the components comprising the topology of cloud-based applications along with the processes for their orchestration.  TOSCA supports the specification of types and templates. It also allows exporting these models as `.tosca` and `.csar` files.

---

##  About TOSCA Designer

TOSCA Designer is developed by the **Softeam R&D Department**, as part of the [MYRTUS Horizon Europe project](https://myrtus-project.eu/) (Grant No. 101135183).

---

## Key Features

- Supports **TOSCA Standard v1.3**
- Graphical modeling of:
  - Topology templates
  - Node types
  - Relationship types
  - Policies and requirements
- Export capabilities:
  - `.tosca` files (from Node Types and Topology Templates)
  - `.csar` files (experimental support)

---

## Dependencies

Ensure the following tools are installed on your system:

- [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Modelio Open Source 5.4.1](https://github.com/ModelioOpenSource/Modelio/releases/tag/v5.4.1)

---

## Installation Guide

### Step 1: Install Modelio 5.4.1  (open source version)

1. Download the appropriate installer from the [Modelio 5.4.1 release page](https://github.com/ModelioOpenSource/Modelio/releases/tag/v5.4.1).
2. Install Modelio on your system.
3. Ensure Java 8 is correctly installed and added to your system's PATH.

###  Step 2: Download the TOSCA Designer Module

1. Visit the [TOSCA Designer release page](https://github.com/Modelio-R-D/MYRTUSDesigner/releases/tag/v0.1.0).
2. Download the latest `.jmdac` file (module archive).

###  Step 3: Add the Module to Modelio

1. Launch **Modelio 5.4.1**.
2. Navigate to `Configuration > Modules catalog`.
3. Click **Add a module**.
4. Select the downloaded `.jmdac` file.
5. Confirm to add it to your module catalog.

### Step 4: Deploy the Module in a Project

1. Create or open a UML project in Modelio.
2. Go to `Configuration > Install a module in this project`.
3. Select **TOSCA Designer** from the available list.
4. Click **Finish** — the module is now active and ready to use.

---

##  Example Projects

The release includes two example model projects that demonstrate usage:

- `MYRTUS.Face.Application.zip`
- `Smart.City.Traffic.Management.zip`

To import an example project:

1. In Modelio, go to `File > Import project`.
2. Select one of the example `.zip` files.

You can also explore the full **Myrtus Template Project**, which integrates additional modules (Java Designer, SysML Architect, Attack Tree Designer) and provides a broader modeling environment:

[MYRTUS Template Project on GitHub](https://github.com/Modelio-R-D/MYRTUS)

---

##  Contributing

Contributions are welcome!

- Fork the repository
- Create a feature branch and make your changes
- Submit a pull request

For major changes, please open an issue first to discuss them with the maintainers.

---

##  Affiliation

This module is developed by the **Softeam R&D Department** and supported by the European Commission through the [MYRTUS Horizon Europe project](https://myrtus-project.eu/).
