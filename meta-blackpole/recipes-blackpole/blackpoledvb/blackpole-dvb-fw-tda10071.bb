require blackpole-dvb-fw-git.inc
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc
DESCRIPTION = "DVB firmwares"

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-fe-tda10071.fw ${D}${base_libdir}/firmware
}

