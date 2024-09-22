DESCRIPTION = "Realtime communication kernel module between coprocessor(ESP32)"
LICENSE = "CLOSED"


SRC_REPO = "github.com/officialluq/realtime-comm-module.git"
SRC_URI = "git://github.com/officialluq/realtime-comm-module.git;branch=main;protocol=https"
SRCREV = "2b33b4a959b4be9465e813a821217fa1f107c820"
inherit module

S = "${WORKDIR}/git"

EXTRA_OEMAKE += "KERNEL_DIR=${STAGING_KERNEL_DIR}"
MAKE_TARGETS = "all"
MODULES_INSTALL_TARGET = "modules_install"
RPROVIDES:${PN} += "kernel-module-cproc"
