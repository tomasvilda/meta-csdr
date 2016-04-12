SUMMARY = "A simple DSP library and command-line tool for Software Defined Radio."

LICENSE = "CLOSED"

SRCREV = "c50ffaac1b3f2d9ce9a4c8a3c44c660276b505ca"
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
