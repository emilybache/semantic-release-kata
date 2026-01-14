---
title: Releasing in Python
parent: Semantic Release
nav_order: 1
---

# Packaging Python projects
{: .no_toc }

Python [Distribution Packages] are the standard mechanism for distributing and installing Python libraries and
applications. 
{: .fs-6 .fw-300 }

Python packages can be published to the [Python Package Index (PyPI)], the default package repository for the Python
ecosystem, where they are made available to the wider developer community.


## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## The configuration file

The standard practice is to use a `pyproject.toml` file to define the package metadata, dependencies, and build
settings.

Change the `name` to include your username; this ensures that you have a unique package name that doesn’t conflict with
packages uploaded by other people following this learning hour.

```toml
[project]
name = "lift_button_ibanfr"
```
Change `authors` to include your name and email address.

```toml
authors = [
    { name="Iván Fernández", email="ibanFR@users.noreply.github.com" },
]
```

Change the `[project.urls]` to include links to your repository.

```toml
Homepage = "https://github.com/ibanFR/semantic-release-python"
Issues = "https://github.com/ibanFR/semantic-release-python/issues"
```

For more details on how to configure the `pyproject.toml` file, refer to [Writing your pyproject.toml] in the Python 
Packaging User Guide.

## Create an account on TestPyPI

TestPyPI is a separate instance of the Python Package Index (PyPI) that allows you to try out the distribution tools and
process without worrying about affecting the real index.

To register an account, go to [https://test.pypi.org/account/register/](https://test.pypi.org/account/register/) and
complete the steps on that page. You will also need to verify your email address before you're able to upload any
packages.

## Configure Trusted Publishing

This guide relies on PyPI’s [Trusted Publishing] implementation to connect to GitHub Actions. To add a new trusted 
publisher follow these steps:

1. Go to [https://test.pypi.org/manage/account/publishing/](https://test.pypi.org/manage/account/publishing/).
2. Fill in the name you wish to publish your new PyPI project under (the `name` value in your `pyproject.toml`), the
   GitHub repository owner's name, the repository name, and the filename of the release publishing workflow (`python.
   yml`). 
3. Register the trusted publisher.

## Update the python workflow for publishing to TestPyPI

In your GitHub repository, open the `.github/workflows/python.yml` file and update the environment url with your 
package name:

```yaml
jobs:
  semantic-release:
    runs-on: ubuntu-latest

    environment:
      name: testpypi
      url: https://test.pypi.org/p/lift_button_ibanfr # update with your package name
```

For more details on how to configure the GitHub Actions workflow for publishing to TestPyPI, refer to
[Publishing Package Distribution Releases using GitHub Actions CI/CD workflows] in the [Python Packaging User Guide].




[Distribution Packages]: https://packaging.python.org/en/latest/glossary/#term-Distribution-Package
[Python Package Index (PyPI)]: https://pypi.org/
[Writing your pyproject.toml]: https://packaging.python.org/en/latest/guides/writing-pyproject-toml/#writing-pyproject-toml
[Trusted Publishing]: https://docs.pypi.org/trusted-publishers/
[Python Packaging User Guide]: https://packaging.python.org/en/latest/
[Publishing Package Distribution Releases using GitHub Actions CI/CD workflows]: https://packaging.python.org/en/latest/guides/publishing-package-distribution-releases-using-github-actions-ci-cd-workflows/#