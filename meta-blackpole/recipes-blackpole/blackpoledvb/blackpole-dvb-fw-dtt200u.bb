DESCRIPTION = "DVB firmwares"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc

SRC_URI = " \
	http://linuxtv.org/downloads/firmware/dvb-usb-dtt200u-01.fw \
	"

S = "${WORKDIR}"

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-usb-dtt200u-01.fw ${D}${base_libdir}/firmware
}

SRC_URI[md5sum] = "d68d6ad6b6eebf7e4435935c1bbaf313"
SRC_URI[sha256sum] = "a79eeda394ee64b386fcacadb37600e8a30d8c3a9c1e3512cd4c16b4839b0f0b"

