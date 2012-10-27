require blackpole-image.bb

BP_DVB_USB_DRIVERS = " \
	blackpole-dvb-common-modules \
        blackpole-dvb-frontends \
        blackpole-dvb-usb-modules \
        blackpole-dvb-siano \
        blackpole-dvb-em28xx \
	blackpole-dvb-firmwares \
	"

WIFI_DRIVERS = " \
	${@base_contains("MACHINE_FEATURES", "wifiusblegacy", \
	"rt73 rt3070 rtl8192cu rtl871x", \
	" \
	kernel-module-ath9k-htc \
	kernel-module-carl9170 \
	kernel-module-rtl8187 \
	kernel-module-r8712u \
	kernel-module-rt2500usb \
	kernel-module-rt2800usb \
	kernel-module-rt73usb \
	kernel-module-zd1211rw \
	rtl8192cu \
	firmware-carl9170 \
	firmware-htc9271 \
	firmware-rt2870 \
	", d)} \
	firmware-rt73 \
	firmware-rtl8192cu \
	firmware-rtl8712u \
	firmware-zd1211 \
	"


ENIGMA2_PLUGINS = " \
	enigma2-plugin-extensions-audiosync \
	enigma2-plugin-extensions-autobackup \
	enigma2-plugin-extensions-cutlisteditor \
	enigma2-plugin-extensions-graphmultiepg \
	enigma2-plugin-extensions-mediaplayer \
	enigma2-plugin-extensions-mediascanner \
	enigma2-plugin-extensions-openwebif \
	enigma2-plugin-extensions-pictureplayer \
	enigma2-plugin-systemplugins-fastscan \
	enigma2-plugin-systemplugins-hotplug \
	enigma2-plugin-systemplugins-networkbrowser \
	enigma2-plugin-systemplugins-positionersetup \
	enigma2-plugin-systemplugins-satfinder \
	enigma2-plugin-systemplugins-skinselector \
	enigma2-plugin-systemplugins-softwaremanager \
	enigma2-plugin-systemplugins-videomode \
	enigma2-plugin-systemplugins-videotune \
	enigma2-plugin-systemplugins-hdmicec \
	enigma2-plugin-systemplugins-wirelesslan \
	enigma2-plugin-systemplugins-commoninterfaceassignment \
	enigma2-plugin-systemplugins-ui3dsetup \
  	enigma2-plugin-systemplugins-uipositionsetup \
	enigma2-plugin-extensions-vuplusevent \
	enigma2-plugin-extensions-remotestreamconvert \
	enigma2-plugin-systemplugins-zappingmodeselection \
	enigma2-plugin-extensions-streamtv \
	enigma2-plugin-extensions-addstreamurl \
	enigma2-plugin-systemplugins-crossepg \
	enigma2-plugin-extensions-mytube \
	enigma2-plugin-extensions-dyndns \
	enigma2-plugin-extensions-dlnabrowser \
        \
	${@base_contains("MACHINE_FEATURES", "dvb-c", "enigma2-plugin-systemplugins-cablescan" , "", d)} \
	${@base_contains('MACHINE_FEATURES', 'dvd', 'enigma2-plugin-extensions-dvdplayer', '', d)} \
	"

ENIGMA2_PLUGINS_append_bm750 = " \
	enigma2-plugin-systemplugins-fancontrol \
"
ENIGMA2_PLUGINS_append_vuuno = " \
	enigma2-plugin-systemplugins-satscan \
	enigma2-plugin-systemplugins-fpgaupgrade \
	enigma2-plugin-systemplugins-manualfancontrol \
	enigma2-plugin-systemplugins-remotecontrolcode \
"
ENIGMA2_PLUGINS_append_vuultimo = " \
	enigma2-plugin-systemplugins-satscan \
	vuplus-enigma2-vfdskin \
	enigma2-plugin-systemplugins-firmwareupgrade \
	enigma2-plugin-systemplugins-manualfancontrol \
	enigma2-plugin-systemplugins-remotecontrolcode \
	enigma2-plugin-systemplugins-ledbrightnesssetup \
"

DEPENDS += " \
	enigma2 \
	enigma2-plugins \
	"


ENIGMA2_OPTIONAL = " \
	channelsettings-enigma2-meta \
	enigma2-plugin-extensions-tuxcom \
	enigma2-plugin-extensions-tuxterm \
	enigma2-plugin-extensions-xmltvimport \
	enigma2-plugin-security-firewall \
	enigma2-plugins \
	picons-enigma2-meta \
	task-openplugins \
	"

IMAGE_INSTALL += " \
	aio-grab \
	enigma2 \
	libavahi-client \
	settings-autorestore \
	tuxbox-common \
	enigma2-plugin-drivers-usbserial \
	${ENIGMA2_PLUGINS} \
	${EXTRA_IMAGEDEPENDS} \
	${WIFI_DRIVERS} \
	${BP_DVB_USB_DRIVERS} \
	"

OPTIONAL_PACKAGES += " \
	${ENIGMA2_OPTIONAL} \
	"

export IMAGE_BASENAME = "blackpole-enigma2"
