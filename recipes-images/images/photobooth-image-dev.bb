require photobooth-image.bb

DESCRIPTION = "Development Chruselpoky RasPi-Image with Sato Desktop for Photobooth."

IMAGE_FEATURES += "dev-pkgs staticdev-pkgs dbg-pkgs tools-sdk tools-debug \
    tools-profile tools-testapps debug-tweaks photobooth-tools photobooth-benchmarks \
"
IMAGE_FEATURES_remove += "read-only-rootfs"

WKS_FILE = "chrusel-photobooth-dev.wks"
