package example;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private List<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().equalsIgnoreCase(name)) {
                result.add(employee.getPhone());
            }
        }
        return result;
    }

    public String findEmployeeById(String id) {
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)) {
                return employee.getName();
            }
        }
        return "Сотрудник не найден";
    }
}
