@ECHO OFF
CLS
CD "%USERPROFILE%\Desktop"
IF EXIST "JMN Aufgaben" RMDIR /S /Q "JMN Aufgaben"
CD "%~dp0"
XCOPY "Aufgaben" "%USERPROFILE%\Desktop\JMN Aufgaben\" /S /E /Y >nul
CD "%USERPROFILE%\Desktop\JMN Aufgaben\.idea"
DEL "vcs.xml"
CD ..
START explorer.exe "%USERPROFILE%\Desktop\JMN Aufgaben"
START Aufgaben.iml
EXIT