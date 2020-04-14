DESCRIPTION = "Development Chruselpoky RasPi-Image with Sato Desktop for Photobooth."

IMAGE_FEATURES += "splash package-management x11-base x11-sato hwcodecs photobooth-base photobooth-tools photobooth-transfer photobooth-webserver photobooth-benchmarks"

LICENSE = "MIT"
inherit core-image
inherit chrusel-photobooth

TOOLCHAIN_HOST_TASK_append = " nativesdk-intltool nativesdk-glib-2.0"
TOOLCHAIN_HOST_TASK_remove_task-populate-sdk-ext = " nativesdk-intltool nativesdk-glib-2.0"

WKS_FILE = "chrusel-photobooth-dev.wks"
