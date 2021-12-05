this project is a servlet project for BIRT Reporting
took the source code from BIRT run time jar file downlaod from BIRT eclipse community - https://www.eclipse.org/birt/documentation/integrating/reapi.php

the main project given in the run time bundle as a normal J2EE application which has web.xml and required jar files placed in WEB-INF/lib
https://download.eclipse.org/birt/downloads/drops/R-R1-4_4_1-201409161320/birt-runtime-4_4_1-20140916.zip

this link has sample viewer project has all source code,
but the required jar files in this viewservlets project maven dependenices hand picked from the vebviwerexample given inside the package and installed locally into .m2 folder to compile
Tewaked session.setAttribute to work with normal and redis session also