require blackpole-dvb-fw-git.inc
DESCRIPTION = "DVB firmwares"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc


PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-fe-af9013.fw ${D}${base_libdir}/firmware
}
