# template
Template Design Pattern

## 1. Compila os arquivos

javac -d bin app/*.java

## 2. Crie o manifest.txt no diretorio bin
Manifest-Version: 1.0
Main-Class: app.App

## 3. Integra todos os arquivos .class no .jar
jar cfm app.jar bin/manifest.txt -C bin .

## 4. Executa a classe principal App do .jar
java -jar app.jar

## 5. Resultado

Serao criados dois arquivos: um arquivo xml normal e outro arquivo zipado contendo o mesmo conteúdo do arquivo xml normal. 