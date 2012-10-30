DESCRIPTION = "PC/SC Lite smart card framework and applications"
HOMEPAGE = "http://pcsclite.alioth.debian.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=a39d325b7d9cf2f07826a5154b16500c"
PR = "r3"

SRC_URI = "https://alioth.debian.org/frs/download.php/3706/pcsc-lite-${PV}.tar.bz2"

inherit autotools

EXTRA_OECONF = " \
	--enable-libusb \
	--enable-embedded \
	--enable-usbdropdir=${libdir}/pcsc/drivers \
	--disable-libudev \
	"

S = "${WORKDIR}/pcsc-lite-${PV}"

PACKAGES =+ "${PN}-lib"

RRECOMMENDS_${PN} = "ccid"

FILES_${PN}-lib = "${libdir}/lib*${SOLIBS}"

SRC_URI[md5sum] = "7ad8c97c89f77aab7a00317eb7e811e9"
SRC_URI[sha256sum] = "b4442d76e9d033340844fb419783f4ee4817dc8d0e5ff208991bb0be1db45d73"

