#!/bin/sh
mkdir -p bin
mkdir -p plugins
rm -rf bin/*
rm -rf plugins/*
mvn clean install

echo '*'
echo '*'
echo '* Build is done, now run'
echo '*'
echo '*'
echo Copy runtime jars to \"bin\" csv plugin to \"plugins\"
cp plugin-typelib/target/*.jar bin
cp plugin-application/target/*.jar bin
echo '*'
echo Run with simulator only
java -cp ./bin/*:./plugins/* no.baardl.plugins.App
echo '*'
echo Add CSV plugin to \"plugins\" and re-run
cp csv-plugin/target/*.jar plugins
java -cp ./bin/*:./plugins/* no.baardl.plugins.App