# Yocto-onlogic-Scarthgap

This repository contains a Yocto Project build environment for OnLogic x86_64 industrial PCs, based on the **Scarthgap (Yocto 5.0)** release.  
It includes Poky, SWUpdate integration for OTA/system updates, and the `meta-openembedded` layer for additional recipes.

---

## Table of Contents

- [Cloning this Repo](#cloning-this-repo)
- [Build Host Packages](#build-host-packages)
- [Setting Up the Build Environment](#setting-up-the-build-environment)
- [Useful Stuff](#useful-stuff)

---

### Cloning this Repo
```bash
git clone --recurse-submodules <your-repo-url>
cd yocto-onlogic-scarthgap
git submodule update --init --recursive
```

## Build Host Packages

Install the required packages on your host machine:

```bash
sudo apt install build-essential chrpath cpio debianutils diffstat file gawk gcc git iputils-ping libacl1 liblz4-tool locales python3 python3-git python3-jinja2 python3-pexpect python3-pip python3-subunit socat texinfo unzip wget xz-utils zstd
```

## Setting Up the Build Environment

Initialize the Yocto build environment. This creates the build/ directory and adds bitbake and other tools to your PATH:

```bash
source /poky/oe-init-build-env
```

## Useful Stuff
### Layers

Known working layers for Yocto 5.0 (Scarthgap) can be found here:
[OpenEmbedded Layer Index](https://layers.openembedded.org/layerindex/branch/master/layers/)

### Useful Commands

List all layers in your build:
```bash
bitbake-layers show-layers
```

Build a minimal image:
```bash
bitbake core-image-minimal
```


Build your custom image:
```bash
bitbake <your-image-recipe>
```


