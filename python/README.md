# Python implementation of the Lift Button software

## Create a virtual environment

It is recommended to use a virtual environment to manage dependencies for this project.

```shell
python3 -m venv .venv
```

See [Creation of virtual environments] in the Python documentation for more details.

## Install dependencies

Install the required dependencies using pip:

```shell
python3 -m pip install -r requirements.txt
```

## Run the tests

To run the tests, use the following command:

```shell
PYTHONPATH=src:tests python3 -m pytest
```

For more details, see the top-level [README.md](../README.md) file.

[Creation of virtual environments]: https://packaging.python.org/en/latest/guides/installing-using-pip-and-virtual-environments/#create-a-new-virtual-environment
