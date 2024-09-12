package example;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee("001", "79990001122", "Иван", 15));
        directory.addEmployee(new Employee("002", "79993334455", "Мария", 10));
        directory.addEmployee(new Employee("003", "79997778800", "Петр", 6));
        directory.addEmployee(new Employee("002", "79996668888", "Мария", 10));
        directory.addEmployee(new Employee("004", "79994444455", "Михаил", 15));


        List<Employee> experiencedEmployees = directory.findEmployeesByExperience(15);
        for (Employee e : experiencedEmployees) {
            System.out.printf("Сотрудник со стажем %s лет - %s \n",e.getExperience(), e.getName());
        }

        List<String> employeePhoneNumbers = directory.getPhoneByName("Мария");
        for (String phone : employeePhoneNumbers) {
            System.out.printf("Телефон сотрудника с именем Мария - %s\n", phone);
        }

        String employeeName = directory.findEmployeeById("003");
        System.out.printf("Сотрудник с табельным номером 003 - %s\n", employeeName);
    }
}
