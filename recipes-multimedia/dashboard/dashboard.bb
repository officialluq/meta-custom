SUMMARY = "Flutter Dashboard Application"
LICENSE = "CLOSED"


FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
            file://app.service \
            file://flutter_assets \
            "



do_install() {
    mkdir -p ${D}/opt/
    mkdir -p ${D}/usr/lib/systemd/system/
    cp -r ${WORKDIR}/flutter_assets ${D}/opt/dashboard_app
    cp ${WORKDIR}/app.service ${D}/usr/lib/systemd/system/
}

FILES:${PN} = "/*"
INSANE_SKIP:${PN} += " ldflags"
inherit systemd
SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE:${PN} = " \
    app.service \
"