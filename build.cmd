@echo off
:: BUILD COMMAND ::

set JDK_PATH="C:\Program Files\Java\jdk-22"

cd Mylib
javac -h . mylib.java
g++ -shared -o mylib.dll mylib.cpp -I%JDK_PATH%\include -I%JDK_PATH%\include\win32
cd ..

javac Program.java
java Program