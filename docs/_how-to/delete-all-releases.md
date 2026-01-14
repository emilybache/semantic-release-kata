---
title: Roll back a released version
nav_order: 2
---

# Rollback a released version of the Lift Button
{: .no_toc }

How-to roll back a released version of the Lift Button software.
{: .fs-6 .fw-300 }

To reset the history of a GitHub repository and delete all releases, you can follow the steps below:

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Generate a Personal Access Token (PAT)

To interact with the GitHub API, you need to generate a Personal Access Token (PAT) with the necessary permissions.

1. Generate a Personal Access Token (PAT):
    - Go to your GitHub account settings.
    - Navigate to "Developer settings" > "Personal access tokens".
    - Click on "Generate new token". 
    - Provide necessary permissions (at least `repo` scope), and generate the token.

    {: .warning }
    Make sure to copy it as you
    won't be able to see it again.

2. Set the Personal Access Token as an environment variable:

    ```shell
     export TOKEN="your_personal_access_token_here"
    ```

## Delete all releases from the GitHub repository

To delete all releases from a GitHub repository, you can use the GitHub API. Here are the steps:

```shell
OWNER="ibanFR"
REPO="semantic-versioning-kata"

curl -s -H "Authorization: token $TOKEN" \
  "https://api.github.com/repos/$OWNER/$REPO/releases" \
| grep '"id":' | awk '{print $2}' | tr -d ',' \
| while read id; do
    echo "Deleting release $id"
    curl -s -X DELETE -H "Authorization: token $TOKEN" \
      "https://api.github.com/repos/$OWNER/$REPO/releases/$id"
  done
```
   
## Delete all tags from a GitHub repository

To delete all tags from a GitHub repository using the GitHub API, you can run the following script:

```shell
OWNER="ibanFR"
REPO="semantic-versioning-kata"

curl -s -H "Authorization: token $TOKEN" \
"https://api.github.com/repos/$OWNER/$REPO/tags" \
| grep '"name":' \
| awk -F '"' '{print $4}' \
| while read tag; do
echo "Deleting tag $tag"
curl -s -X DELETE \
-H "Authorization: token $TOKEN" \
"https://api.github.com/repos/$OWNER/$REPO/git/refs/tags/$tag"
done
```

## Reset remote branch to a previous commit

To reset the remote branch to a previous commit, follow these steps:

1. Find the commit hash:

    ```shell
    git log
    ```

2. Reset to the previous commit:

    ```shell
    git reset --hard 59e5056b4fe8c14665fa7949ab1e881ffcda3c97
    ```

3. Force push to remote:

    ```shell
    git push origin HEAD --force
    ```

4. Enter Username and Password (Personal Access Token) when prompted:

    ```shell
    Username for 'https://github.com': ibanFR
    Password for 'https://ibanFR@github.com': 
    Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
    To https://github.com/ibanFR/semantic-versioning-kata.git
     + 9cb8bb8...c5e64bb HEAD -> main (forced update)
    ```
     
