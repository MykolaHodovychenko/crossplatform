# Лабораторная работа 1. Создание простой RESTful веб-службы с помощью Spring Boot

## Цели лабораторной работы:

 - создать веб-сервис с поддержкой архитектурного стиля REST;
 - используя принцип инверсии управления, реализовать трехслойную архитектуру веб-сервиса;
 - используя эмулятор клиента Postman, осуществить проверку веб-сервиса на локальной машине.

Требования к оформлению и сдаче лабораторной работы:
протокол лабораторной работы должен содержать исходный код классов с пояснениями;
протокол лабораторной работы должен содержать раздел тестирования разработанного веб-сервиса в виде клиентских запросов и ответов от сервера в формате JSON.
Варианты заданий:
Вариант 1. Сценарий "Магазин"
ER-диаграмма базы данных

Список REST-запросов:
добавить новый товара в заказ с указанным id;
изменить товар в заказе с указанным id;
создать новый заказ;
удалить заказ с указанным id;
изменить фамилию пользователя в заказе с указанным id;
удалить товар с указанным id из заказа с указанным id.
Вариант 2. Сценарий "Электронный журнал"
ER-диаграмма базы данных

Список REST-запросов:
добавить нового студента в группу с указанным id;
удалить студента с указанной фамилией из группы с указанным id;
создать новую группу;
удалить студента с указанным id;
получить список студентов с указанной фамилией;
получить список студентов из группы с указанным id.
Вариант 3. Сценарий "Электронный институт"
ER-диаграмма базы данных

Список REST-запросов:
добавление нового преподавателя на кафедру с указанным id;
изменение названия кафедры с указанным id;
изменение id кафедры у преподавателя с одной на вторую;
удаление преподавателя с указанной фамилией из кафедры с указанным id;
изменение фамилии преподавателя с указанным id;
получить список преподавателей с указанной фамилией.
Вариант 4. Сценарий "Книжный магазин"
ER-диаграмма базы данных

Список REST-запросов:
добавить нового автора;
изменить книгу с указанным id;
удалить книги, выпущенные между XXXX и YYYY годами, автора с указанным id;
удалить автора с указанным id;
получить список книг автора с указанной фамилией;
получить списка книг, выпущенных между XXXX и YYYY годами.