package handbook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>(Arrays.asList(
                new Employee(1, "89991112233", "Yuriy", 2),
                new Employee(2, "89991112244", "Dmitriy", 3),
                new Employee(3, "89991112255", "Maxim", 4),
                new Employee(4, "89991112266", "Vitaliy", 8),
                new Employee(5, "89991112277", "Natalia", 2)
        ));
        Book book = new Book(staff);

        // Добавить метод, который ищет сотрудника по стажу (может быть список)
        System.out.println(book.findByExperience(2));

        // Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
        System.out.println(book.getPhoneByName("Maxim"));

        // Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println(book.findById(4));

        // Добавить метод добавление нового сотрудника в справочник сотрудников
        book.add(new Employee(6, "89991112288", "Oleg", 4));
        System.out.println(book.findById(6));

    }
}