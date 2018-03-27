@ECHO OFF
CALL JavaPaths.bat
SET cleancalled=TRUE
CALL Clean.bat
setlocal EnableDelayedExpansion

CD ..
SET cp=%cd%\JavaWithNAO\out\artifacts\JavaWithNAO_jar\JavaWithNAO.jar
CD %~dp0
SET dp=%~dp0

FOR /d %%i in ("%dp%*") DO (
 ECHO Building %%~ni ...
 CD "%%i"
 SET filelist=
 FOR %%f IN ("*.java") DO (
  IF "!filelist!"=="" (
   SET filelist="%%f"
  ) ELSE (
   SET filelist=!filelist! "%%f"
  )
 )
 %javac% -classpath "%cp%" !filelist!
 CD %dp%
)

ECHO Done!
PAUSE>nul
EXIT