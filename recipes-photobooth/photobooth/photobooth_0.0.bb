SUMMARY = "Photobooth Application"
DESCRIPTION = "Photobooth Application"

LICENSE = "CLOSED"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello.cpp \
    file://hello.h \
    file://main.cpp \
"

S = "${WORKDIR}"

inherit cmake

EXTRA_OECMAKE = ""

