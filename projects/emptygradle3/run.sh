#!/bin/bash

# Exit if any command fail...
set -e

read -p "Enter a input to main: " maininput
./gradlew clean build
./gradlew installDist
result=$(./build/install/wordspring/bin/wordspring "${maininput}")
echo "Här kommer resultatet: ${result}"
