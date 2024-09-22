SUMMARY = "Basic image for Flutter Dashboard Application"
LICENSE = "CLOSED"

IMAGE_FEATURES += "ssh-server-dropbear hwcodecs"


inherit core-image

IMAGE_FEATURES += "\
ssh-server-openssh \
"


QB_MEM = "-m 512"
IMAGE_OVERHEAD_FACTOR = "3"
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"



PREFERRED_VERSION_libcamera = "0.1%"
IMAGE_INSTALL:append = " flutter-engine \
                         flutter-pi \
                         strace \
                         mpv \  
                         gcc \ 
                         cmake \
                         gstreamer1.0-plugins-bad \
                         gstreamer1.0-plugins-base \
                         gstreamer1.0-plugins-ugly \
                         gstreamer1.0-plugins-good \
                         gstreamer1.0-meta-base \
                         gstreamer1.0-libav \
                         dashboard \
                         libcamera \
                         kernel-devsrc \
                         kernel-modules \
                         kernel-dev \ 
                         v4l-utils \
                         ffmpeg \
                         procps \
                         libcamera-gst \
                         sudo \
                         realtime-comm \
                        systemd-analyze \
                        "


                        
inherit extrausers

EXTRA_USERS_PARAMS = "\
    useradd -p '\$6\$WkNptRmB1urz9qxB$1hHIBvrvBia6K5RoS7oABUmFetkhjxwPc0JZC12rGu9dYq9gt8TlcneAUFlxlpxyyICMzJjbwgpANQJLwNsqe0' user; \
    usermod -a -G sudo user; \
    useradd -p '\$6\$WkNptRmB1urz9qxB$1hHIBvrvBia6K5RoS7oABUmFetkhjxwPc0JZC12rGu9dYq9gt8TlcneAUFlxlpxyyICMzJjbwgpANQJLwNsqe0' root; \
"