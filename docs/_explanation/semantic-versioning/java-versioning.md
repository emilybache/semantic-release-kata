---
title: Versioning in Java
parent: Semantic Versioning
nav_order: 2
---

# Versioning in Java
{: .no_toc }

This document explains versioning strategies for the [Java Platform].
{: .fs-6 .fw-300 }

For more information on the Java Platform versioning scheme, see [Version-String Format] in the official Oracle
documentation.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

   
## Version number in Maven projects

In the Java implementation of the LiftButton, the version number is specified in the `pom.xml` file located in the
`java/` directory.

The format used is defined by Maven, the build tool used for Java projects:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ibanfr</groupId>
    <artifactId>semantic-release-kata</artifactId>
    <version>0.0.1-SNAPSHOT</version>
```

In Java projects, the `-SNAPSHOT` suffix is commonly appended to the version to indicate that this is a development
version prior to a stable release.


[Java Platform]: https://docs.oracle.com/en/java/index.html
[Version-String Format]: https://docs.oracle.com/en/java/javase/25/install/version-string-format.html