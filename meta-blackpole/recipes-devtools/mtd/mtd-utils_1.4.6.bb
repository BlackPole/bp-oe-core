require mtd-utils.inc

PR_append = ".2"

DEPENDS += "zlib lzo e2fsprogs util-linux"

PARALLEL_MAKE = ""
ARM_INSTRUCTION_SET = "arm"

# This is the default package, thus we lock to a specific git version so 
# upstream changes will not break builds.

TAG = "v${PV}"

SRC_URI = "git://git.infradead.org/mtd-utils.git;protocol=git;tag=${TAG} \
	   file://0001-mkfs.ubifs-allow-output-file-creation-on-different-device.patch;patch=1 \
	  "

S = "${WORKDIR}/git/"
