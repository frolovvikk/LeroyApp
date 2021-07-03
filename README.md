# LeroyApp это тестовое задание для Леруа Мерлен
### Это приложение включает в себя: springboot приложение, базу данных (mongoDB), dockerfile, docker-compose, а теперь еще и монитор в виде жинкса (UPD 3.07.21. Добавил SSL сертификат).
### Что может приложение:
* "/" - выдать недоделанное портфолио (html страница)
* "/addIntern" - POST запрос, добавляет запись в БД
* "/findIntern" - GET запрос, выводит все записи БД
### Проверить работоспособность можно подняв docker-compose и ввести в командную строку:
``` bash
curl -i -X POST -H "Content-type:application/json" -d "{ \"id\" : \"1\", \"firstName\" : \"Viktor\" , \"lastName\" : \"Frolov\", \"education\" : \"HSE\"}" localhost:8080/addIntern
```
### Далее проверим наличие записи:
``` bash
curl localhost/findIntern
```
### Архетип взят со [Spring Initializr](https://start.spring.io), а значит следующие файлы и дериктории писались не мной:
* mvnw
* mvnw.cmd
* .mvn/wrapper
* src/test/java/com/example/demo
