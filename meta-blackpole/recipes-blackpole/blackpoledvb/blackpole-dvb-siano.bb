DESCRIPTION = "DVB Siano drivers"
LICENSE="GPLv2"
require conf/license/blackpole-gplv2.inc

DVBPROVIDER ?= "kernel"

RDEPENDS_${PN} = " \
	${DVBPROVIDER}-module-smsdvb \
        ${DVBPROVIDER}-module-smsmdtv \
        ${DVBPROVIDER}-module-smsusb \
        "

PV = "1.0"
PR = "r0"

ALLOW_EMPTY_${PN} = "1"

