@echo off
echo Создание JAR-файла из библиотеки...

REM Создаем директорию для JAR-файла если её нет
if not exist "..\..\target\lib" mkdir "..\..\target\lib"

REM Переходим в директорию с классами
cd src\main\lib

REM Создаем JAR-файл из всех классов
jar cf entities.jar org/ com/ generated/

REM Перемещаем JAR-файл в нужное место
move entities.jar ..\..\..\target\lib\

REM Возвращаемся в исходную директорию
cd ..\..

echo JAR-файл успешно создан
pause