require blackpole-dvb-fw-git.inc
DESCRIPTION = "DVB firmwares"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc

PV = "1.0"
PR = "r1"

ALLOW_EMPTY_${PN} = "1"

do_install() {
        install -d ${D}${base_libdir}/firmware
        install -m 0644 ${S}/as102_data1_st.hex ${D}${base_libdir}/firmware
        install -m 0644 ${S}/as102_data2_st.hex ${D}${base_libdir}/firmware
}
