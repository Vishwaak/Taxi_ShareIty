#!/bin/bash

set -ev
cd TaxiShareity/
mvn install:install-file -Dfile=External_Dependencies/rs2xml/rs2xml.jar -DgroupId=net.proteanit.sql -DartifactId=rs2xml -Dversion=1.0 -Dpackaging=jar
mvn clean install
