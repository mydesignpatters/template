# template
Template Design Pattern

## Compila os arquivos

javac -d bin app/*.java

## Crie o manifest.txt no diretorio bin
Manifest-Version: 1.0
Main-Class: app.App

## Integra todos os arquivos .class no .jar
jar cfm app.jar bin/manifest.txt -C bin .

## Executa a classe principal App do .jar
java -jar app.jar