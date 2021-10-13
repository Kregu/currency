Сurency service
====

Обращается к стороннему сервису курсов валют, и отдает gif в ответ:
- если курс по отношению к рублю за сегодня стал выше вчерашнего, отдет рандомную отсюда https://giphy.com/search/rich 
- если ниже - отсюда https://giphy.com/search/broke 

REST API курсов валют - https://docs.openexchangerates.org/ 

REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide 

Сервис на Spring Boot 2 + Java.
Запросы приходят на HTTP endpoint, туда передается код валюты.

Для взаимодействия с внешними сервисами используется Feign.

Параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в файл: /currency/src/main/resources/application.properties

Написаны тесты.

Для сборки используется Gradle.


Go!
===

Download and run:

    git clone https://github.com/Kregu/currency

    cd currency
    gradle build  # To create jar file
    java -jar ./build/libs/currency-0.0.1-SNAPSHOT.jar # To run this service


Try to open: [http://localhost:8080/exchangerates?currency_code=EUR](http://localhost:8080/exchangerates?currency_code=EUR)

Docker
===

    docker pull kregu/currency
    docker run -p 8080:8080 currency
Try to open: http://localhost:8080/exchangerates?currency_code=EUR
