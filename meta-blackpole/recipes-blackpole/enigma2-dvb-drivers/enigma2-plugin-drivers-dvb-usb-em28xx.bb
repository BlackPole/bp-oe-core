DESCRIPTION = "USB DVB driver for EM28xx chipset"

require conf/license/blackpole-gplv2.inc

DVBPROVIDER ?= "kernel"

RDEPENDS_${PN} = " \
	${DVBPROVIDER}-module-em28xx-dvb \
	firmware-dvb-fe-tda10071 \
	"

PV = "1.0"
PR = "r0"

ALLOW_EMPTY_${PN} = "1"
