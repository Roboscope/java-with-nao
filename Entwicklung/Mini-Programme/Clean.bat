@ECHO OFF

SET dp=%~dp0

FOR /d %%i in ("%dp%*") DO (
 CD "%%i"
 IF EXIST Main.class DEL Main.class>nul
 CD %dp%
)

ECHO Cleaned up!
IF NOT "%cleancalled%"=="TRUE" PAUSE>nul