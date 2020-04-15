# https://github.com/aqiank/gphoto2-liveview-example

LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/aqiank/${BPN}.git;protocol=https"

DEPENDS = "libsdl2 libsdl2-image"
RDEPENDS_${PN} = "libsdl2 libsdl2-image gphoto2"

BINARYNAME = "${PN}"

PV = "0.1+git${SRCPV}"
SRCREV = "d653a441891954ac9b3e297c3eaad805e5302f27"

S = "${WORKDIR}/git"

do_compile () {
    # intree Makefile is somehow not suitable for Cross-Compiling
	${CC} main.c -std=c99 -o ${BINARYNAME} -lSDL2 -lSDL2_image -O
}

do_install () {
    install -d ${D}/${bindir}
    install -m 755 ${S}/${PN} ${D}/${bindir}/
}

