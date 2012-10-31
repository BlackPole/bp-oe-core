DESCRIPTION = "driver for Realtek USB wireless devices"
SECTION = "kernel/modules"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://hal/hal_init.c;beginline=1;endline=19;md5=f8d10a6bd2fdfa240c0634a7c660c57f"

RREPLACES_${PN} = "kernel-module-rtl8192cu"

inherit module machine_kernel_pr

SRC_URI = "http://sources.vuplus-community.net/rtl8188C_8192C_usb_linux_v3.4.4_4749.20120730.tar.gz \
	file://additional_productids.patch \
	"

S = "${WORKDIR}/rtl8188C_8192C_usb_linux_v3.4.4_4749.20120730"

MACHINE_KERNEL_PR_append = ".2"

EXTRA_OEMAKE = "KSRC=${STAGING_KERNEL_DIR}"

do_install() {
	install -d ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
	install -m 0644 ${S}/8192cu.ko ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
	install -d ${D}/etc/modules-load.d
	echo 8192cu > ${D}/etc/modules-load.d/r8192cu.conf
}

SRC_URI[md5sum] = "31f0c1433473debf4e2429cf33d35c13"
SRC_URI[sha256sum] = "b30e5bef7d130680ae98b83d4676445a5e0f3e6dee34ecfb4fc0678197c8b708"

