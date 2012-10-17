DESCRIPTION = "DVB em28xx drivers"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc

DVBPROVIDER ?= "kernel"

RDEPENDS_${PN} = " \
	${DVBPROVIDER}-module-em28xx \
        ${DVBPROVIDER}-module-em28xx-alsa \
        ${DVBPROVIDER}-module-em28xx-dvb \
        "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY_${PN} = "1"

