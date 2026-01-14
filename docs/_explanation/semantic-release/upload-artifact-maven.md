---
title: Uploading artifacts to Maven Central
parent: Semantic Release
nav_order: 3
---

# Uploading artifacts to Maven Central
{: .no_toc }

The [Central Repository] is the world’s largest collection of Java and open source components, making it simple for
developers to publish, access, and share Java artifacts globally.
{: .fs-6 .fw-300 }

[Apache Maven] is a build tool for Java projects. Using a project object model (POM), Maven manages a project's
compilation, testing, and documentation.

For more information about Maven, see [What is Maven?].

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Sign in to the Central Repository

[Sign in] to the Central Repository using your Sonatype account. If you don't have an account, you can create one 
for free or sign in using your GitHub, Google, or LinkedIn account.

## Choose a namespace

Before you can upload artifacts, you need to create a namespace (also known as a group ID) for your project. 

If you have signed up with your GitHub account, Sonatype has automatically created a verified namespace for you based on
your GitHub username. For example, if your GitHub username is `johnDoe`, you could use `io.github.johnDoe` as your group
ID.

You can use this namespace or create a new one. See [Register a Namespace] for more information.

## Update project coordinates

In your Maven project's `pom.xml` file, update the `<groupId>`, `<artifactId>`, and `<version>` elements to match
your own coordinates. 

For example:

```xml
<groupId>io.github.johnDoe</groupId>
<artifactId>my-awesome-library</artifactId>
<version>0.1.0</version>
```

## Update project name, description, and URL

In your `pom.xml` file, update the `<name>`, `<description>`, and `<url>` elements to provide more information about
your project.

For example:

```xml
<name>My Awesome Library</name>
<description>A library that does awesome things.</description>
<url>https://johndoe.github.io/my-awesome-library</url>     
```

## License information

In your `pom.xml` file, add a `<licenses>` section to specify the license under which your project is distributed.
For example, to specify the MIT License:

```xml
<licenses>
    <license>
        <name>MIT License</name>
        <url>https://opensource.org/license/mit</url>
    </license>
</licenses>
```

## Developer information

In your `pom.xml` file, add a `<developers>` section to provide information about the developers of your project.

For example:

```xml
<developers>
    <developer>
      <name>John Doe</name>
      <email>john.doe@sonatype.com</email>
      <organization>Sonatype</organization>
      <organizationUrl>http://www.sonatype.com</organizationUrl>
    </developer>
</developers>
```

## SCM information

In your `pom.xml` file, add a `<scm>` section to provide information about your project's source control system. 
For example, if your project is hosted on GitHub:

```xml
<scm>
  <connection>scm:git:git://github.com/johndoe/my-awesome-library.git</connection>
  <developerConnection>scm:git:ssh://github.com:johndoe/my-awesome-library.git</developerConnection>
  <url>http://github.com/johndoe/my-awesome-library/tree/master</url>
</scm>
```

## Generate a Key Pair

To publish artifacts to the Central Repository, you must sign them with PGP. This requires generating a GPG key pair,
which is used to securely sign your artifacts. 

GnuPG (GPG), a free implementation of the OpenPGP standard, provides the tools needed to create and manage your key 
pair.

1. Generate a GPG key pair by running the following command in your terminal:

    ```shell
    gpg --gen-key
    ```
   
2. Export your public key by running the following command:

    ```shell
    gpg --export-secret-keys --armor YOUR_KEY_ID
    ```

For more details on how to install GPG and generate a key pair, see [GPG].

## Generate a Portal Token

To publish artifacts to the [Central Repository], you must create a User Token for authentication.

Follow the steps in [Generating a Portal Token for Publishing] to generate your token. You will use this token when
authenticating during the publishing process.

## Create GitHub Secrets

In your GitHub repository, create the following secrets to store your GPG key and Sonatype credentials:

- `MAVEN_GPG_PRIVATE_KEY`: Your GPG private key (exported in the previous step).
- `MAVEN_GPG_PASSPHRASE`: The passphrase for your GPG private key.
- `MAVEN_CENTRAL_USERNAME`: Your User Token from the Central Repository.
- `MAVEN_CENTRAL_TOKEN`: Your Username to login to the Central Repository.

## Other sources and inspiration

- https://maven.apache.org/repository/guide-central-repository-upload.html
- https://docs.github.com/en/actions/tutorials/publish-packages/publish-java-packages-with-maven
- https://github.com/simpligility/ossrh-demo/tree/master
- https://github.com/actions/setup-java/blob/main/docs/advanced-usage.md#Publishing-using-Apache-Maven
- https://medium.com/@jtbsorensen/publish-your-artifact-to-the-maven-central-repository-using-github-actions-15d3b5d9ce88


[Central Repository]: https://central.sonatype.org/pages/about/
[Apache Maven]: https://maven.apache.org/
[What is Maven?]: https://maven.apache.org/what-is-maven.html
[Sign in]: https://central.sonatype.com/
[Register a Namespace]: https://central.sonatype.org/register/namespace/
[GPG]: https://central.sonatype.org/publish/requirements/gpg
[Generating a Portal Token for Publishing]: https://central.sonatype.org/publish/generate-portal-token/