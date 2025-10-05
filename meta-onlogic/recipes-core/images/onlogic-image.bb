DESCRIPTION = "Minimal image for OnLogic x86_64 with SWUpdate"
LICENSE = "MIT"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL:append = " swupdate swupdate-www"