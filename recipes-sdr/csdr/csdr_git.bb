SUMMARY = "A simple DSP library and command-line tool for Software Defined Radio."

LICENSE = "CLOSED"

SRCREV = "84e00184af8d3220f22d85830e8856533774f2d0"
SRC_URI = "git://github.com/simonyiszk/csdr.git \
           file://makefile_openembedded_fix.patch;patch=1;pnum=0"

S = "${WORKDIR}/git"

PACKAGES = "${PN}-dbg ${PN}"
DEPENDS = "fftwf"

FILES_${PN} = "${libdir}/*.so"
FILES_${PN} += "${bindir}/*"

do_install () {
    oe_runmake install DESTDIR=${D}
}
