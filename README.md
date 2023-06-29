Намалювати діаграму класів, які будуть використані для виконання курсової роботи та вказати зв’язки між ними
написати відповідні класи, використовувати бібліотеку lombok для зменшення кількості коду 
Реалізувати REST сервіси для всіх сутностей з використанням Spring Boot. Слід реалізувати операції: GET/POST/PUT/DELETE операція GET/2 - повертає сутність з ід рівним 2. Операція  /GET - повертає всі сутності, які присутні в системі
Розділити код на контролери, сервіси та рівень доступу до даних
Зв’язування контролерів, сервісів та рівня доступу до даних слід зробити з використанням інверсії залежностей
Реалізувати зберігання даних та вичитку їх з csv-файлу. Важливо: кожна сутність зберігається в окремому файлі.
якщо файл для сутності не існує - то його слід створити, назва файлу має містити дату створення, наприклад: fish-2022-05-27.csv
Кожен файл має містити заголовки (співпадають з назвами атрибутів спроектованих класів) лише у першому рядку. 
при запуску аплікації відбувається вичитка всіх сутностей з файлу та їх збереження у хеш-мапі. При вичитці даних слід здійснити пошук всіх файлів для сутності, які створені в поточному місяці (наприклад, всі файли, створені у червні, якщо програма запускається в червні) 
Код курсової роботи має бути доступним як ПР на github
Проект має містити README.md з описом завдання та покроковою інструкцією запуску програми
Проект має використовувати мейвен для збірки проекту
Код слід перевірити з використанням Spotbugs та checkstyle
Код має містити юніт-тести для перевірки логіки запису та пошуку файлів на файловій системі
Створити набір (колекцію) REST запитів, які перевіряють працездатність розроблених сервісів

Створіть апі, який дозволяє отримувати і передавати інформацію про автобуси (власні та орендовані) - вік, місткість, пробіг, виробник і т.д, які працюють на маршрутах. Інформація про маршрути має включати, але не обмежена: адреса відправлення, кінцева адреса, зупинки, ціну проїзду між двома сусідніми зупинками на маршруті, ціна квитка на весь маршрут, відстань між зупинками, загальна відстань маршруту.
