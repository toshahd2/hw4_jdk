package handbook;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Book {
    private final List<Employee> employeeList;

    public Book(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee findById(int id) {
        return employeeList.stream().filter(p -> p.getId() == id).findAny().orElse(null);
    }

    public List<Employee> findByExperience(int experience) {
        return employeeList.stream().filter(p -> p.getExperience() == experience).collect(Collectors.toList());
    }

    public List<String> getPhoneByName(String name) {
        return employeeList.stream().filter(p -> Objects.equals(p.getName(), name)) .map(Employee::getPhone).toList();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Employee p : employeeList)
            result.append(p.getId()).append(" ").append(p.getName()).append(" ").append(p.getPhone()).append(" ").append(p.getExperience()).append("\n");
        return result.toString();
    }
}
