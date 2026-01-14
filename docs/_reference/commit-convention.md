---
title: Commit Message Convention
---

# Commit Message Convention
{: .no_toc }

This repository uses a standardized Commit Message Convention to communicate changes to the LiftButton software.
{: .fs-6 .fw-300 }

The team follows a standardized **Commit Message Convention** to ensure clarity and consistency in our versioning and
release process.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Commit Message Format

Each commit message should adhere to the following format:

```
<header>
<BLANK LINE>
<optional body>
<BLANK LINE>
<optional footer>
```
## Commit Message Header

The commit message header must conform to the following format:

```
<type>: <summary>
  │         │
  │         └─⫸ Summary in present tense. Not capitalized. No period at the end.
  │       
  └─⫸ Commit Type: build|ci|docs|feat|fix|refactor|test
```


### Type

Must be one of the following types:

| Type         | Description                                                                                                |
|--------------|------------------------------------------------------------------------------------------------------------|
| **feat**     | A new feature                                                                                              |
| **fix**      | A bug fix                                                                                                  |
| **refactor** | A behavior preserving change (neither fixes a bug nor adds a feature)                                      |
| **test**     | Adding new tests or refactoring existing ones                                                              |
| **docs**     | Documentation only changes                                                                                 |
| **build**    | Changes that affect the build system or external dependencies (`pom.xml`,`.sln`,`.csproj` etc)             |
| **ci**       | Changes to our CI configuration files and scripts (`java.yml`, `updateVersion.sh`, `.releaserc.json`, etc) |

### Summary

Use the summary to provide a succinct description of the change:

- use the imperative, present tense: "change" not "changed" nor "changes"
- don't capitalize the first letter
- no dot (.) at the end

## Commit Message Body

Explain the motivation for the change in the commit message body:

```
This commit message should explain _why_ you are making the change.
```

## Commit Message Footer

Include information about breaking changes in the commit message footer:

```
BREAKING CHANGE: <breaking change summary>
<BLANK LINE>
<breaking change description + migration instructions>
```
