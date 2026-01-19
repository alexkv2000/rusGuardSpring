@echo off
echo Создание JAR-файла библиотеки...
call create_jar.bat

echo Сборка проекта...
mvn clean generate-sources package

if %ERRORLEVEL% neq 0 (
    echo Ошибка при сборке проекта
    pause
    exit /b %ERRORLEVEL%
)

echo Запуск приложения...
java -jar target/rusguard-web-service-1.0.0.jar

pause