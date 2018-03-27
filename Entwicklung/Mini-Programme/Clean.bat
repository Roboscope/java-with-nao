@ECHO OFF

SET dp=%~dp0

FOR /d %%i in ("%dp%*") DO (
 CD "%%i"
 DEL /Q /F /S "*.class">nul
 CD %dp%
)

CLS
ECHO Cleaned up!
IF NOT "%cleancalled%"=="TRUE" PAUSE>nul