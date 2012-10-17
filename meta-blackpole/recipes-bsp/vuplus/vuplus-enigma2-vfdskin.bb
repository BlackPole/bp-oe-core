require conf/license/blackpole-gplv2.inc

RDEPENDS_${PN} = "enigma2"

PR = "r0"

SRC_URI = "file://skin_user.xml \
	file://vfd_icons \
	file://analog.ttf \
"

do_install() {
	install -d ${D}/etc/enigma2
	install -m 0644 ${WORKDIR}/skin_user.xml ${D}/etc/enigma2/
        install -d ${D}/usr/share/enigma2/vfd_icons/
        install -m 0644 ${WORKDIR}/vfd_icons/*.png ${D}/usr/share/enigma2/vfd_icons/
	install -d ${D}/usr/share/fonts
	install -m 0755 ${WORKDIR}/analog.ttf ${D}/usr/share/fonts/
}

FILES_${PN} = "/etc/enigma2"
FILES_${PN} += "/usr/share/enigma2/vfd_icons"
FILES_${PN} += "/usr/share/fonts"

PACKAGE_ARCH = "${MACHINE_ARCH}"
