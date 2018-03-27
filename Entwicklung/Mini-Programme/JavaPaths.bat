@ECHO OFF
CALL :testLabelExist "%COMPUTERNAME%" && GOTO %COMPUTERNAME% || GOTO INVALID

:EDULAB-20
SET javac="C:\Program Files (x86)\Java\jdk1.8.0_144\bin\javac.exe"
SET java="C:\Program Files (x86)\Java\jdk1.8.0_144\bin\java.exe"

:TAREK-WINX
SET javac="C:\Program Files\Java\jdk1.8.0_91\bin\javac.exe"
SET java="C:\Program Files\Java\jdk1.8.0_91\bin\java.exe"

:testLabelExist
FOR /f "delims=" %%t IN (
    'forfiles /p "%~dp0." /m "%~nx0" /c "cmd /d /c @echo 0x09"'
) DO (
    findstr /i /m /r /c:"^[^:]*[ %%t]*:%~1[ %%t:;,=+]" /c:"^[^:]*[ %%t]*:%~1$" "%~f0" >nul 2>nul 
)
EXIT /b %errorlevel%

:INVALID
SET javac=javac
SET java=java
