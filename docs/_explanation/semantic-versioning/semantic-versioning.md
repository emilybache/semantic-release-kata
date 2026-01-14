---
title: Semantic Versioning
nav_order: 1
---

# Semantic Versioning
{: .no_toc }

The Lift Button software follows the [Semantic Versioning] 2.0.0 specification for managing its versions. 
{: .fs-6 .fw-300 }

[Semantic Versioning] (SemVer) is a versioning scheme that consist in a simple set of rules and requirements that
dictate how version numbers are assigned and incremented for software releases.

## Table of Contents
{: .no_toc .text-delta }

1. TOC 
{:toc}

## Declaring the public API

> _Software using Semantic Versioning MUST declare a public API._

In this repository, the public API is declared through the public classes and methods exposed in the language-specific
implementations of the LiftButton software.

For example, in the Java implementation, the public API is defined by the public classes and methods in the
`com.ibanfr.liftbutton` package.

Changes to these public interfaces are carefully managed to ensure that version increments adhere to the SemVer
guidelines.

## Semantic Versioning Scheme

SemVer uses a three-part version number - `MAJOR.MINOR.PATCH` - to communicate changes to the software with specific
increments to the version number:

- `MAJOR` version, incremented for backwards incompatible changes.
- `MINOR` version, incremented for new features/functionality in a backwards compatible manner.
- `PATCH` version, incremented for backwards compatible bug fixes.

## Initial Development

> _Major version zero (0.y.z) is for initial development. Anything MAY change at any time. The public API SHOULD NOT be
> considered stable._

The LiftButton software is currently in its initial development phase, and as such, it is in version `0.0.1`. During
this phase, the public API is subject to change without notice, and users should not rely on its stability.

```java
package com.ibanfr.liftbutton;

// Version 0.0.1 - Initial development
public class Lift {
}
```

## Version 1.0.0 defines the public API

> _The way in which the version number is incremented after this release is dependent on this public API and how it
> changes._

The public API of the Lift Button software will be formally established with the release of its first stable feature.

```java
package com.ibanfr.liftbutton;

public class Lift {
    
    // Version 1.0.0 - Public API established
    public String doorStatus(){
        return "Closed"; // first feature released: Doors should be closed when the lift is created
    }
}
```

This initial release will serve as the baseline for future versioning decisions.

Future changes to the public API will be communicated through version increments according to the SemVer guidelines.

## Incrementing PATCH version

> _Patch version Z (x.y.Z | x > 0) MUST be incremented if only backward compatible bug fixes are introduced. A bug 
> fix is defined as an internal change that fixes incorrect behavior._

Changes that fix issues without adding new features or breaking existing functionality.

```java
public class Lift {
    
    public String doors;
    
    // Version 1.0.0 - contains a bug
    public Lift(){
        this.doors = ""; // Bug: Doors should be closed when the lift is created
    }
    
    // Version 1.0.1 - PATCH increment to fix the bug
    public Lift(){
        this.doors = "Closed"; // Bug fixed, API remains unchanged
    }
}
```

The `PATCH` version is incremented when bug fixes are made to the LiftButton software that do not affect the public API.

## Incrementing MINOR version

> _Minor version Y (x.Y.z | x > 0) MUST be incremented if new, backwards compatible functionality is introduced to the
> public API._

Changes that add new features without breaking existing functionality:

- New public methods or classes.
- Adding new overloads.
- Adding new optional parameters to existing methods (language-specific).

```java
public class Lift {
    
    public String doors;
    
    // Version 1.0.1
    public Lift(){
        this.doors = "Closed";
    }
    
    // Version 1.1.0 - MINOR increment to add new feature
    public void openDoors(){
        this.doors = "Open"; // New feature added, API remains backward compatible
    }
}
```

The `MINOR` version is incremented when new features are added to the LiftButton software without breaking existing 
functionality.

## Incrementing MAJOR version

> _Major version X (X.y.z | X > 0) MUST be incremented if any backward incompatible changes are introduced to the 
> public API._

These changes require users to modify their code to work with the new version:

- Removing public properties, methods or classes.
- Changing method signatures by adding required parameters.
- Changing behavior of existing methods in a way that is not backward compatible.

```java

public class Lift {

    public String doors;

    // Version 1.4.0
    public Lift() {
        this.doors = "Closed";
    }

    // Version 2.0.0 - MAJOR increment due to breaking change
    public Lift() {
        this.doors = "Open"; // Breaking change: Lift now starts with doors open
    }
}
```

## Language-specific Versioning

Every implementation of the Lift Button software declares its version number within its artifact metadata, following 
the conventions of its respective ecosystem.

For learning more about versioning strategies, see [Implement a versioning strategy] Microsoft Training Module.


[Semantic Versioning]: https://semver.org/
[Understand versioning of artifacts]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/2-understand-versioning-of-artifacts
[Implement a versioning strategy]: https://learn.microsoft.com/en-us/training/modules/implement-versioning-strategy/
