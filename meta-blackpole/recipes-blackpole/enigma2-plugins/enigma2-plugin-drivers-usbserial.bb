DESCRIPTION = "USB serial drivers"

require conf/license/blackpole-gplv2.inc

RDEPENDS_${PN} = "kernel-module-usbserial kernel-module-ftdi-sio kernel-module-pl2303 kernel-module-belkin-sa kernel-module-keyspan"

PV = "1.0"
PR = "r0"

ALLOW_EMPTY_${PN} = "1"
