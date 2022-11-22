
DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "CLOSED"
SRC_URI = "file:///home/himanshu/yocto/work/autotools/output/amhello-1.0.tar"

S = "${WORKDIR}"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""
