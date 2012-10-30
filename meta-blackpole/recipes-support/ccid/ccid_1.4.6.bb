DESCRIPTION = "Generic USB CCID smart card reader driver"
HOMEPAGE = "http://pcsclite.alioth.debian.org/ccid.html"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1"
PR = "r0"

DEPENDS = "libusb1 pcsc-lite"
RDEPENDS_${PN} = "pcsc-lite"

SRC_URI = "https://alioth.debian.org/frs/download.php/3711/ccid-${PV}.tar.bz2"

inherit autotools

FILES_${PN} += "${libdir}/pcsc/"
FILES_${PN}-dbg += "${libdir}/pcsc/drivers/*/*/*/.debug"

SRC_URI[md5sum] = "3600dfbc74efb321c37de15a64efbbe6"
SRC_URI[sha256sum] = "f31151fc7683f24165e2498a673e81a50c497731ff9530ff98233bd56af60f8a"

