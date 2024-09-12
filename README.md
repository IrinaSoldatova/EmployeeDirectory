# Employee directory

## Класс Employee: 

Содержит атрибуты всех сотрудников:
- `id` - табельный номер
- `phone` - номер телефа
- `name` - имя
- `experience` - стаж работы

и соответствующие методы доступа: `getId`, `getPhone`, `getName`, `getExperience`

## Класс EmployeeDirectory: 

Содержит список сотрудников и методы:
    
- `addEmployee()`: Добавляет нового сотрудника.
- `findEmployeesByExperience()`: Возвращает список сотрудников по стажу.
- `getPhoneByName()`: Возвращает номера телефонов сотрудников по имени.
- `findEmployeeById()`: Ищет сотрудника по табельному номеру.
