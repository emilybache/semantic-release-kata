---
title: Publishing a NuGet package
parent: Semantic Release
nav_order: 2
---

# Publishing a NuGet Package
{: .no_toc }

[NuGet] is the package manager for .NET. It is used by developers to create, share, and consume .NET libraries.
{: .fs-6 .fw-300 }

For more information about NuGet, see [An introduction to NuGet].

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## What is a package?

A package is a compiled library with its descriptive metadata.

## Add package metadata to project file

To publish a NuGet package, you need to add some metadata to your project file (`.csproj`). Here is an example of the
necessary properties to include:

```xml
<PropertyGroup>
    <PackageId>IbanFR.SemanticRelease.LiftButton</PackageId>
    <Version>0.1.0</Version>
    <Authors>Iván Fernández</Authors>
    <Company>IbanFR</Company>
    <Description>Csharp implementation of the LiftButton software</Description>
</PropertyGroup>
```

`PackageId` should be unique across NuGet.org. For example, you can prefix it with your GitHub username: `<PackageId>YourGitHubUsername.SemanticRelease.LiftButton</PackageId>`.

## Create a NuGet.org account

To create a NuGet.org account, you need to have a personal Microsoft account. If you don't have one, you can create 
it [here](https://signup.live.com/?lic=1).

Make sure to enable two-factor authentication (2FA) for your Microsoft account, as it is required to publish NuGet
packages. Instructions for enabling 2FA can be found at [How to turn two-step verification on or off for your Microsoft account].

Once you have your Microsoft account ready, follow the steps from the [Individual accounts on NuGet.org] to create your
NuGet.org account.

## Create your NuGet API key

To create your NuGet API key, follow instructions at [Acquire an API key].

## Create a secret for the NuGet API key in your GitHub repository

To securely store your NuGet API key in your GitHub repository, you need to create a secret. 

Follow the instructions at
[Use secrets in GitHub Actions] to create a new secret named `NUGET_TOKEN` and set its value to your NuGet API key.

## Other sources and inspiration

- [.NET Package Management with NuGet for Beginners]
- [Create a NuGet package with the dotnet CLI]
- [Publish NuGet packages]
- [Automating Releases of .NET SDKs using Semantic Release]

[NuGet]: https://www.nuget.org/
[An introduction to NuGet]: https://learn.microsoft.com/en-us/nuget/what-is-nuget
[How to turn two-step verification on or off for your Microsoft account]: https://support.microsoft.com/en-gb/account-billing/how-to-use-two-step-verification-with-your-microsoft-account-c7910146-672f-01e9-50a0-93b4585e7eb4
[Individual accounts on NuGet.org]: https://learn.microsoft.com/en-us/nuget/nuget-org/individual-accounts#add-a-new-individual-account
[Acquire an API key]: https://learn.microsoft.com/en-us/nuget/nuget-org/scoped-api-keys#acquire-an-api-key
[Use secrets in GitHub Actions]: https://docs.github.com/en/actions/how-tos/write-workflows/choose-what-workflows-do/use-secrets
[Create a NuGet package with the dotnet CLI]: https://learn.microsoft.com/en-us/nuget/create-packages/creating-a-package-dotnet-cli
[Publish NuGet packages]: https://learn.microsoft.com/en-us/nuget/nuget-org/publish-a-package
[.NET Package Management with NuGet for Beginners]: https://learn.microsoft.com/en-us/shows/dotnet-package-management-with-nuget-for-beginners/
[Automating Releases of .NET SDKs using Semantic Release]: https://medium.com/@gpanga/automating-releases-of-net-sdks-using-semantic-release-e3df46013876
