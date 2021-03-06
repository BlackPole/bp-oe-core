require blackpole-dvb-fw-git.inc
DESCRIPTION = "DVB firmwares"

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-usb-it9135-01.fw ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-usb-it9135-02.fw ${D}${base_libdir}/firmware
        install -m 0644 ${S}/dvb-usb-it9137-01.fw ${D}${base_libdir}/firmware
}

