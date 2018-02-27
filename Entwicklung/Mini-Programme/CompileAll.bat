@ECHO OFF
CALL JavaPaths.bat

SET cleancalled=TRUE
CALL Clean.bat

CD ..
SET cp=%cd%\JavaWithNAO\out\artifacts\JavaWithNAO_jar\JavaWithNAO.jar
CD %~dp0
SET dp=%~dp0

FOR /d %%i in ("%dp%*") DO (
 CD "%%i"
 %javac% -classpath "%cp%" Main.java
 CD %dp%
)

ECHO Done!
PAUSE>nul
EXIT