DESCRIPTION = "Vuplus Specific plugins"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9e255efa454e0155c1fd758df7dcaf3"

DEPENDS = "python-native"
PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = "${AUTOREV}"
inherit gitpkgv
 
PV = "experimental-git${SRCPV}"
PKGV = "experimental-git${GITPKGV}"
PR = "r3"
BRANCH = "vuplus_experimental"

SRC_URI = "git://code.vuplus.com/git/dvbapp.git;protocol=http;branch=${BRANCH} \
file://vuplus_enigma2_packages.patch;striplevel=1 \
"

S = "${WORKDIR}/git"

do_install() {
	install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/VuplusEvent
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/UI3DSetup
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/UIPositionSetup
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/ManualFancontrol
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/Fancontrol
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/FPGAUpgrade
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/Blindscan
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/FirmwareUpgrade
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/RemoteControlCode
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/LEDBrightnessSetup
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/ZappingModeSelection
	install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/StreamTV
	install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/StreamTV/icons
	install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNABrowser
	install -d  ${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	
	install -m 0644 ${S}/lib/python/Plugins/Extensions/VuplusEvent/*.py \
	${S}/lib/python/Plugins/Extensions/VuplusEvent/*.so \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/VuplusEvent

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/UI3DSetup/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/UI3DSetup

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/UIPositionSetup/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/UIPositionSetup

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/ManualFancontrol/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/ManualFancontrol

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/Fancontrol/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/Fancontrol

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/FPGAUpgrade/*.py \
	${S}/lib/python/Plugins/SystemPlugins/FPGAUpgrade/*.conf \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/FPGAUpgrade

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/Blindscan/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/Blindscan

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/FirmwareUpgrade/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/FirmwareUpgrade

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/RemoteControlCode/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/RemoteControlCode

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/LEDBrightnessSetup/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/LEDBrightnessSetup

	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/ZappingModeSelection/*.py \
	${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/ZappingModeSelection

	install -m 0644 ${S}/lib/python/Plugins/Extensions/StreamTV/*.py \
	${S}/lib/python/Plugins/Extensions/StreamTV/*.png \
	${S}/lib/python/Plugins/Extensions/StreamTV/*.xml \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/StreamTV
	install -m 0755 ${S}/lib/python/Plugins/Extensions/StreamTV/rtmpdump \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/StreamTV
	install -m 0644 ${S}/lib/python/Plugins/Extensions/StreamTV/icons/*.png \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/StreamTV/icons

	install -m 0644 ${S}/lib/python/Plugins/Extensions/DLNABrowser/*.py \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNABrowser

	install -m 0644 ${S}/lib/python/Plugins/Extensions/DLNAServer/*.py \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer
	install -m 0755 ${S}/lib/python/Plugins/Extensions/DLNAServer/dlnaserver \
	${D}/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer


	python -O -m compileall ${D}/usr/lib/enigma2/python/Plugins/
}

FILES_enigma2-plugin-extensions-vuplusevent = "/usr/lib/enigma2/python/Plugins/Extensions/VuplusEvent"
FILES_enigma2-plugin-systemplugins-ui3dsetup = "/usr/lib/enigma2/python/Plugins/SystemPlugins/UI3DSetup"
FILES_enigma2-plugin-systemplugins-uipositionsetup = "/usr/lib/enigma2/python/Plugins/SystemPlugins/UIPositionSetup"
FILES_enigma2-plugin-systemplugins-manualfancontrol = "/usr/lib/enigma2/python/Plugins/SystemPlugins/ManualFancontrol"
FILES_enigma2-plugin-systemplugins-fancontrol = "/usr/lib/enigma2/python/Plugins/SystemPlugins/Fancontrol"
FILES_enigma2-plugin-systemplugins-fpgaupgrade = "/usr/lib/enigma2/python/Plugins/SystemPlugins/FPGAUpgrade"
FILES_enigma2-plugin-systemplugins-blindscan = "/usr/lib/enigma2/python/Plugins/SystemPlugins/Blindscan"
FILES_enigma2-plugin-systemplugins-firmwareupgrade = "/usr/lib/enigma2/python/Plugins/SystemPlugins/FirmwareUpgrade"
FILES_enigma2-plugin-systemplugins-remotecontrolcode = "/usr/lib/enigma2/python/Plugins/SystemPlugins/RemoteControlCode"
FILES_enigma2-plugin-systemplugins-ledbrightnesssetup = "/usr/lib/enigma2/python/Plugins/SystemPlugins/LEDBrightnessSetup"
FILES_enigma2-plugin-systemplugins-zappingmodeselection = "/usr/lib/enigma2/python/Plugins/SystemPlugins/ZappingModeSelection"
FILES_enigma2-plugin-extensions-streamtv = "/usr/lib/enigma2/python/Plugins/Extensions/StreamTV"
FILES_enigma2-plugin-extensions-dlnabrowser = "/usr/lib/enigma2/python/Plugins/Extensions/DLNABrowser"
FILES_enigma2-plugin-extensions-dlnaserver = "/usr/lib/enigma2/python/Plugins/Extensions/DLNAServer"

PACKAGES = "\
	enigma2-plugin-extensions-vuplusevent \
	enigma2-plugin-systemplugins-ui3dsetup \
	enigma2-plugin-systemplugins-uipositionsetup \
	enigma2-plugin-systemplugins-manualfancontrol \
	enigma2-plugin-systemplugins-fancontrol \
	enigma2-plugin-systemplugins-fpgaupgrade \
	enigma2-plugin-systemplugins-blindscan \
	enigma2-plugin-systemplugins-firmwareupgrade \
	enigma2-plugin-systemplugins-remotecontrolcode \
	enigma2-plugin-systemplugins-ledbrightnesssetup \
	enigma2-plugin-systemplugins-zappingmodeselection \
	enigma2-plugin-extensions-streamtv \
	enigma2-plugin-extensions-dlnabrowser \
	enigma2-plugin-extensions-dlnaserver \
	"

PROVIDES="${PACKAGES}"

