#!/bin/sh

set -ex

javac -d bin/ src/com/hello/world/*.java

set +e
cd bin
jar cmvf MANIFEST.mf ./Hello.jar *

set +x
echo "$(pwd)/Hello.jar"
cd - > /dev/null
