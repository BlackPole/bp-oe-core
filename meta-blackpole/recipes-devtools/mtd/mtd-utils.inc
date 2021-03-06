DESCRIPTION = "Tools for managing memory technology devices."
SECTION = "base"
DEPENDS = "zlib lzo"
HOMEPAGE = "http://www.linux-mtd.infradead.org/"
LICENSE = "GPLv2"
require conf/license/blackpole-gplv2.inc
PR = "r0"

SRC_URI = "ftp://ftp.infradead.org/pub/mtd-utils/mtd-utils-${PV}.tar.bz2"

S = "${WORKDIR}/mtd-utils-${PV}"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS} -I${S}/include -DWITHOUT_XATTR'"

#do_stage () {
#	install -d ${STAGING_INCDIR}/mtd
#	for f in ${S}/include/mtd/*.h; do
#		install -m 0644 $f ${STAGING_INCDIR}/mtd/
#	done
#	for binary in ${mtd_utils}; do
#		if [ -f $binary ]; then
#			install -m 0755 $binary ${STAGING_BINDIR}
#		fi
#	done
#}

do_install () {
	install -d ${D}${bindir}
	install -d ${D}${includedir}/mtd
	for binary in ${mtd_utils}; do
		if [ -f $binary ]; then
			install -m 0755 $binary ${D}${bindir}
		fi
	done
	for f in ${S}/include/mtd/*.h; do
		install -m 0644 $f ${D}${includedir}/mtd
	done
}


mtd_utils = " docfdisk \
	doc_loadbios \
	flashcp \
	flash_erase \
	flash_eraseall \
	flash_info \
	flash_lock \
	flash_otp_dump \
	flash_otp_info \
	flash_unlock \
	ftl_check \
	ftl_format \
	jffs2dump \
	mkfs.jffs2 \
	mtd_debug \
	nanddump \
	nandtest \
	nandwrite \
	nftldump \
	nftl_format \
	recv_image \
	rfddump \
	rfdformat \
	serve_image \
	sumtool \
	mkfs.ubifs/mkfs.ubifs \
	ubi-utils/ubiattach \
	ubi-utils/ubicrc32 \
	ubi-utils/ubidetach \
	ubi-utils/ubiformat \
	ubi-utils/ubimkvol \
	ubi-utils/ubinfo \
	ubi-utils/ubinize \
	ubi-utils/ubirmvol \
	ubi-utils/ubiupdatevol"

PACKAGES =+ "mkfs-jffs mkfs-jffs2 mkfs-ubifs"
FILES_mkfs-jffs = "${bindir}/mkfs.jffs"
FILES_mkfs-jffs2 = "${bindir}/mkfs.jffs2"
FILES_mkfs-ubifs = "${bindir}/mkfs.ubifs ${bindir}/ubinize"
