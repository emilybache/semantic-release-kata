---
title: Release a new version
nav_order: 1
---

# Release a new version of the Lift Button
{: .no_toc }

How-to release a new version of the Lift Button software.
{: .fs-6 .fw-300 }

Use semantic commit messages to document the nature of the changes you make to the codebase.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Initial release

Start by making your first commit to `main` with the code for the first feature . For example:

```
feat: first feature for your software
```

## Releasing a new feature

When you want to release a new feature, simply make a commit to `main` with the message:

```
feat: add new user authentication module
```

## Releasing a bug fix

When you want to release a bug fix, simply make a commit to `main` with the message:

```
fix: correct typo in user interface
```

## Releasing a BREAKING CHANGE

If your change introduces a breaking change, make a commit to `main` with the appropriate type and include a
`BREAKING CHANGE:` section in the commit message body or footer. For example:

```
feat: lift doors are open on lift creation

BREAKING CHANGE: Lift doors now remain open when the lift is initialized.
Users must update their code to accommodate this new behavior.
A new method 'closeDoors()' has been added to manually close the doors after lift creation.
```