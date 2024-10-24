## Описание
1. Создать Entity, которая соответствует таблице.
2. Написать репозиторий для работы с БД.
3.  Создать метод getPersonsByCity(String city), который будет принимать название города и возвращать ваше Entity из базы данных, соответствующие этому city.
4.  Написать контроллер с методом-обработчиком GET-метода запроса с маппингом на endpoint /persons/by-city. В query params запроса будет приходить строковый параметр city, который вам надо будет передавать дальше в репозиторий. То есть, метод должен уметь обрабатывать запрос вида localhost:8080/persons/by-city?city=Moscow. Контроллер должен будет возвращать всех людей, которых он получит от репозитория.
