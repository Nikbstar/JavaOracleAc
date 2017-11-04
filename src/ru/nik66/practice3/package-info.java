package ru.nik66.practice3;
/**
 Сделать систему расчета заработной платы на предприятии.
 Сделать базовый класс Employee. Производные классы от
 базового класса Employee являются:
   класс Boss - начисляется еженедельный фиксированный оклад
     независимо от числа отработанных часов;
   класс HourlyWorker - служащим начисляется почасовая з/п за
     часы, отработанныу в основное время, и повышенная плата за
     часы, отработанные сверхурочно;
   класс PieceWorker - служащим начисляется сдельная плата по
     количеству изготовленных изделий;
   класс CommissionWorker - служащиь начисляется базовая з/п
     плюс комиссионный процент от продаж.
 В базовом классе определить два метода: расчет з/п сотрудника
 и вывод на экран имени и фамилии рабочего, должность и зарплату.
 В главной программе показать обработку информации всех типов
 служащих.
 Можно создать массив или ArrayList типа Employee и добавить
 туда разные объекты.
 Сделайте подсчет сколько денег нужно выплатить в месяц всем
 рабочим.
 Комментарий:
    Класс Employee абстрактный. Содержит поля имя и фамилия. Методы:
 toString (вывод имени и фамилии, должности (getClass.getSimpleName)
 и зарплаты (результат метода calculateSalary)) и расчет зарплаты
 (абстрактный double calculateSalary без аргументов). Конструктор с
 именем и фамилией.
    Класс Boss потомок Employee, есть поле weekSalary, конструктор с
 тремя аргуметнами (имя, фамилия (которые через супер уйдут в Employee)
 и недельная зарплата (уйдет в поле weekSalary)). И переопределение
 метода calculateSalary.
    Класс HourlyWorker имеет поля:
   ставка за час (зарплата)
   сколько он отработал
   коэффициент за сверхурочные (берется из файла (читается при старте
     приложения) или на данном этапе лучше сделать константа)
   нормачасы (40 часов в неделю, берется из файла или константа)
 конструктор принимает имя, фамилию ставку за час и сколько отработал)
 calculateSalary ставку умножаем на нормачасы + сверхчасы с коэффициентом.
    Классы PieceWorker и CommissionWorker аналогичные.
    Добавить класс Firm содержащий приватный ArrayList с работниками и
 методами для добавления, удаления и поиска сотрудника. И добавить метод
 totalSalary (выводит должность, имя, фамилия, зарплата по каждому
 сотруднику отсортированный по алфавиту и в конце итог) расчет зарплаты
 (перебераем ArrayList сотрудников, расчитываем зарплату, накапливаем и
 выводим на экран).
    Майн класс App (psvm) создание Firm, создание сотрудников,
 добавление сотрудников в фирму и вызов на фирме метода totalSalary.
 */