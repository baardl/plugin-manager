#!/bin/sh
rm -rf bin/*
rm -rf plugins/*
mvn clean install
cp plugin-typelib/target/*.jar bin
cp plugin-application/target/*.jar bin

echo '*'
echo '*'
echo '* Build is done, now run'
echo '*'
echo '*'

echo Run with simulator only
java -cp ./bin/*:./plugins/* no.baardl.plugins.App
echo '*'
echo Add CSV plugin and re-run
cp csv-plugin/target/*.jar plugins
java -cp ./bin/*:./plugins/* no.baardl.plugins.App