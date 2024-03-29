# Домашнее задание к занятию «Композиция и зависимость объектов. Mockito при создании автотестов»
## Задача №1 - "Менеджер Афиши"
### Легенда
Необходимо реализовать менеджер Афиши (все фильмы хранятся внутри самого менеджера в массиве, без всякого репозитория):

<img width="965" alt="afisha" src="https://user-images.githubusercontent.com/72652840/135437752-9187e956-800a-463a-821e-730c33d6c2ad.png">

Какие методы должны быть у менеджера:
1. Добавить фильм в ленту.
1. Выдать последние 10 добавленных фильмов* (фильмы выдаются в обратном порядке, т.е. первым в массиве результатов будет тот, который был добавлен последним).

Примечание*: если фильмов меньше 10, то выдавать столько, сколько есть.

Нужно сделать так, что по умолчанию выводились последние 10 добавленных фильмов, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 5 (а не 10). Т.е. у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 10, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

Напишите необходимые, с вашей точки зрения, автотесты на различные состояния менеджера (можно их делать не в одном файле).

Требования к проекту:
1. Подключить плагин Surefire так, чтобы сборка падала в случае отсутствия тестов.
1. Подключить плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно).
1. Реализовать нужные классы и методы.
1. Написать автотесты на методы, содержащие логику, добившись 100% покрытия по branch'ам.
1. Подключить CI на базе Github Actions и выложить всё на Github.

**Итого**: должен быть репозиторий на GitHub, в котором расположен ваш Java-код.

## Задача №2 - "Менеджер Афиши" (divide and conquer)*

### Легенда
В первой задаче создайте новую ветку `layers`, в которой разделите менеджера на менеджера и репозиторий.

В репозитории должны быть следующие методы:
1. `findAll` - возвращает массив всех хранящихся в массиве объектов
1. `save` - добавляет объект в массив
1. `findById` - возвращает объект по идентификатору (либо `null`, если такого объекта нет)
1. `removeById` - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение)
1. `removeAll`* - полностью вычищает репозиторий

Напишите автотесты на репозиторий (допускается, что на `removeById` может возникать исключение при удалении по несуществующему id).

Обеспечьте использование менеджером созданного вами репозитория (новых функций в менеджер по сравнению с первым заданием добавлять не нужно). Репозиторий должен быть зависимостью для менеджера (т.е. задаваться через конструктор и храниться в приватном поле).

Покройте менеджера автотестами, используя Mockito для организации моков репозитория.

**Итого должно быть**:
1. Ветка `layers`, в которой должны быть классы `AfishaManager` и `AfishaRepository`
1. Pull Request на Github (удостоверьтесь, что CI успешно проводит сборку*)

Примечание*: если вы реализовали тест на удаление по несуществующему id, то допускается, что сборка в CI будет failed.
