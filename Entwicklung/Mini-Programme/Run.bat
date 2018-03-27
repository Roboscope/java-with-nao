@ECHO OFF
CALL JavaPaths.bat
setlocal EnableDelayedExpansion

CD ..
SET cp=%cd%\JavaWithNAO\out\artifacts\JavaWithNAO_jar\JavaWithNAO.jar
CD %~dp0
SET dp=%~dp0

:REPEAT
CLS
SET /A n=0
FOR /d %%i in ("%dp%*") DO (
 SET vector[!n!]="%%i"
 ECHO [!n!] %%~ni
 SET /A n+=1
)

:ASK
ECHO/
ECHO Program?
SET /P num=
SET /A numa=%num% 

IF NOT "%num%"=="%numa%" ECHO Invalid number & GOTO ASK
IF %numa% GEQ %n% ECHO Invalid number & GOTO ASK
IF %numa% LSS 0 ECHO Invalid number & GOTO ASK
CD !vector[%numa%]!
DEL "*.class">nul
SET filelist=
FOR %%f IN ("*.java") DO (
 IF "!filelist!"=="" (
  SET filelist="%%f"
 ) ELSE (
  SET filelist=!filelist! "%%f"
 )
)
%javac% -classpath "%cp%" %filelist%
%java% -classpath "%cp%;%cd%" Main
CD %dp%
PAUSE>nul
GOTO REPEAT