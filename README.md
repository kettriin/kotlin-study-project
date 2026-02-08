# kotlin-study-project
## lesson_2:
### Команды для запуска
-  ./gradlew clean test //запуск всех тестов
-  ./gradlew clean test -DTAG=NUMBERS //тесты для проверки числовых операций
-  ./gradlew clean test -DTAG=WORDS  //тесты для проверки строковых операций
  
<img width="580" height="350" alt="Снимок экрана 2026-01-28 в 23 25 25" src="https://github.com/user-attachments/assets/19a78f2a-4603-4831-b43b-d31489d86c3f" />

## lesson_3:
> Добавлены тесты:
> - Массив пустой
> - Массив не пустой
> - Первый элемент массива содержит ожидаемое значение
### Команда для запуска
./gradlew clean test -DTAG=BASICARRAY

<img width="580" height="370" alt="Снимок экрана 2026-01-31 в 23 29 18" src="https://github.com/user-attachments/assets/a0eff39b-1976-4fd3-a3a9-a91e2d496856" />

## lesson_4:
> Добавлены тесты:
> - Проверка _не null_ значения полей с использованием Let (scope)
> - Проверка null значения полей с использованием Let (scope)
> - Проверка не null значения полей с использованием Apply (scope)
> - Проверка показателя (грейда) по косвенному признаку (найденным багам за месяц) с использованием Run (scope)
### Команда для запуска
./gradlew clean test -DTAG=SCOPE

<img width="580" height="370" alt="Снимок экрана 2026-02-04 в 21 05 39" src="https://github.com/user-attachments/assets/6bf74f4b-1301-4e7c-8c08-d3415d81eacc" />

## lesson_5:
> Добавлены тесты:
> - Строка непустая c extension
> - Строка непустая c infix
> - Строка не в верхнем регистре c extension
> - Строка не в верхнем регистре c infix
### Команда для запуска
./gradlew clean test -DTAG=EXTENSION

<img width="580" height="370" alt="Снимок экрана 2026-02-08 в 12 50 09" src="https://github.com/user-attachments/assets/0a6b7490-3ffb-4b42-bd39-ed92f3127356" />

