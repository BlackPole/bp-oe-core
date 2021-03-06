DESCRIPTION = "DVB firmwares"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc

SRC_URI = " \
	http://linuxtv.org/downloads/firmware/dvb-usb-vp7045-01.fw \
	"

S = "${WORKDIR}"

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-usb-vp7045-01.fw ${D}${base_libdir}/firmware
}
