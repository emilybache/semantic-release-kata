---
title: Versioning in Python
parent: Semantic Versioning
nav_order: 3
---

# Versioning in Python
{: .no_toc }

This document explains versioning strategies for [Python] packages.
{: .fs-6 .fw-300 }

For more information on versioning Python packages, see [Python Packaging User Guide] in the official Python
documentation.  

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

   
## Version number in Python projects

In the Python implementation of the LiftButton, the version number is specified in the `pyproject.toml` file located in the
`python/` directory:

```toml
[project]
version = "0.0.1.dev1"
```

In Python projects, development releases include a release segment `.dev1` in the version identifier.
See [Developmental releases] in the Python documentation for more details.

Different Python projects may use different versioning schemes based on the needs of that particular project.

## Incrementing version numbers

For incrementing version numbers in Python projects, refer to the [bump2version] documentation.



[Python]: https://www.python.org/
[Python Packaging User Guide]: https://packaging.python.org/en/latest/
[Version specifiers]: https://packaging.python.org/en/latest/specifications/version-specifiers/#
[Developmental releases]: https://packaging.python.org/en/latest/specifications/version-specifiers/#developmental-releases
[bump2version]: https://pypi.org/project/bump2version/