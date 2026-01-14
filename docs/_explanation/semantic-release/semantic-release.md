---
title: Semantic Release
nav_order: 2
---

# Semantic Release
{: .no_toc }

This repository uses [Semantic Release] to automate the release process of the LiftButton software.
{: .fs-6 .fw-300 }

The repository is pre-configured to release a version for each commit to the `main` branch that introduces 
code changes that affect the software functionalities since the previous release.


## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## What is a Release?

A release is a specific version of the software that is made available to users. It typically includes new features,
bug fixes, and other improvements.

## Release Steps

The release process using Semantic Release involves the following steps:

1. Analyze commit messages since the last release.
2. Determine the type of release based on the type of changes (e.g., feature, fix, breaking change).
3. Generate release notes for the commits added since the last release.
4. Update version number in the project files or metadata.
5. Create a new tag in the version control system.
6. Publish the new version to the appropriate package registry or distribution platform.

## Configuration

The configuration for Semantic Release is located in a `.releaserc.json` file within each programming language 
folder of the repository.

Even though semantic-release is a Node CLI application, it can be used to manage releases for projects in any
programming language.

See [Can I use semantic-release to publish non-JavaScript packages?] in the semantic-release documentation for more details.

For more information on how to customize the configuration, refer to [semantic-release usage configuration].



[Semantic Release]: https://semantic-release.gitbook.io/semantic-release/
[Can I use semantic-release to publish non-JavaScript packages?]: https://semantic-release.gitbook.io/semantic-release/support/faq#can-i-use-semantic-release-to-publish-non-javascript-packages
[semantic-release usage configuration]: https://semantic-release.gitbook.io/semantic-release/usage/configuration
[CI configurations]: https://semantic-release.gitbook.io/semantic-release/recipes/ci-configurations/github-actions