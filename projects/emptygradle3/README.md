# Emptygradle

## Kör applikationen
Använd ``run.sh`` skriptet för att bygga, testa och köra applikationen lokalt.  
Om du får ``permission denied`` vid försök att köra skriptet kör ``chmod +x run.sh``

## Bygg
``./gradlew clean build``

## Test
``./gradlew test``

## Kör appen med gradle
`./gradlew run --args="emptygradle"`  

Exempel  
``./gradlew run --args=apa``

## Skapa filer för distribution
``./gradlew installDist``  
Gradle kommer skapa nödvändiga filer och skript för att distribuera applikationen.  
Skript som genereras hittar du i ``/build/install/wordspring/bin/``
