DISABLE_OVERSCAN = "1"
ENABLE_SPI_BUS = "1"
BOOT_DELAY = "0"
HDMI_GROUP = "1"
HDMI_MODE = "4"
RASPBERRYPI_CAMERA_V2 = "1"
VIDEO_CAMERA = "1"
VC4GRAPHICS = "1"


do_deploy:append () {
 echo 'dtoverlay=disable-bt' >> $CONFIG
 echo 'dtoverlay=sdtweak,overclock_50=100' >> $CONFIG
}

# ENABLE_UART = "1"
