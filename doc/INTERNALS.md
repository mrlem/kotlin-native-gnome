# Internals

The goal of this project is to provide a set of tools to develop GNOME application as easily as possible.
For this, the app developer should only have to focus on:
* designing the UI
* coding other app behaviours
* have an API as complete as possible

## General architecture

This project is an opiniated implementation of these goals, with 2 use-cases in mind.

**App developer**

* code in your IDE with objects for GNOME libraries
* design your UIs with Glade side-by-side with you IDE
* be able to reference UI elements from your code easily and safely

**Library maintainer**
* generate the objects API for GNOME libraries

Hence, as stated initially, we have the following workflow:

![Generator](readme-generator.png)

## Components

To achieve the above workflow, the project includes:
* a [Glade gradle plugin](../plugins/glade/README.md) to handle Glade files
* an [API bindings](../bindings/gtk) module, with the current API bindings
* an [API bindings generator](../bindings-generator/README.md)
