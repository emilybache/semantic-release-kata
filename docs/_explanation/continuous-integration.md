---
title: Continuous Integration
nav_order: 3
---

# Continuous Integration
{: .no_toc }

This repository leverages [GitHub Actions] to automate CI/CD workflows for the Lift Button software.
{: .fs-6 .fw-300 }

With each push to the `main` branch, the workflows defined in the `.github/workflows/` directory are triggered to
build, test, and release the software across its Java and .NET implementations.


## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}



## Java workflow

The `.github/workflows/java.yml` workflow automates build, test, and release for the Java implementation of the
LiftButton software.

It checks out the code, runs Maven tests, and then uses `semantic-release` to publish a new release to GitHub.

## .NET workflow

The `.github/workflows/dotnet.yml` workflow automates build, test, release, and NuGet package publishing for the C#
implementation of the LiftButton software.

It is triggered by push and pull request events targeting the `main` branch, and runs only when files within the `csharp/` directory are modified.

For more details on building and testing .NET projects with GitHub Actions, see the
[Building and testing .NET projects] GitHub Actions Tutorial.

## Python workflow

For more details on building and testing Python projects with GitHub Actions, see the
[Building and testing Python] GitHub Actions Tutorial. 

## Pages workflow

To publish your software documentation to GitHub Pages, configure your repository by following the steps in
[Publishing with a custom GitHub Actions workflow].

After the configuration is complete, the `.github/workflows/pages.yml` workflow will automatically build and deploy the
documentation site to GitHub Pages whenever changes under the `docs/` directory are pushed to the `main` branch.

[GitHub Actions]: https://docs.github.com/en/actions
[Using secrets in GitHub Actions]: https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions
[Building and testing .NET projects]: https://docs.github.com/en/actions/tutorials/build-and-test-code/net
[Building and testing Python]: https://docs.github.com/en/actions/tutorials/build-and-test-code/python
[Publishing with a custom GitHub Actions workflow]: https://docs.github.com/en/pages/getting-started-with-github-pages/configuring-a-publishing-source-for-your-github-pages-site#publishing-with-a-custom-github-actions-workflow


