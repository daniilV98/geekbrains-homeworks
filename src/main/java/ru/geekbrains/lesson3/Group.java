package ru.geekbrains.lesson3;

public class Group {

    public static void main(String[] args) {
        Employee[] developer = new Employee[10];
        Group group = new Group();
        developer[0] = new Employee("Маша", "m@mail.ru", 26, "developer");
        developer[1] = new Employee("Витя", "vi@mail.ru", 27, "developer");
        developer[4] = new Employee("Борис", "b@mail.ru", 21, "developer");
        developer[5] = new Employee("Кристина", "k@mail.ru", 23, "developer");
        developer[6] = new Employee("Миша", "mi@mail.ru", 24, "developer");
        developer[7] = new Employee("Саша", "s@mail.ru", 26, "developer");
        developer[9] = new Employee("Лёша", "l@mail.ru", 29, "developer");
        group.showDev(developer);
        System.out.println();
        developer = group.removeEmployeeByIndex(1, developer);
        System.out.println();
        group.showDev(developer);
        System.out.println();
        developer = group.removeAllEmployees(developer);
        System.out.println();
        group.showDev(developer);
    }

    /**
     * Метод для удаления сотрудника по индексу
     * @param i
     * @param developer
     * @return Employee[]
     */
    public Employee[] removeEmployeeByIndex(int i, Employee[] developer) {
        System.out.println("Сотрудник ");
        System.out.println(developer[i].getName() + " с индексом " + i);
        System.out.println("Будет удален");
        developer[i] = null;
        return developer;
    }

    /**
     * Метод для удаления всех сотрудников
     * @param developer
     * @return Employee[]
     */
    public Employee[] removeAllEmployees(Employee[] developer) {
        for (int i = 0; i < developer.length; i++) {
            developer[i] = null;
        }
        System.out.println("Все сотрудники успешно удалены!");
        return developer;
    }

    /**
     * Метод для отображения всех сотрудников в группе
     * @param developer
     */
    public void showDev(Employee[] developer) {
        int countDev = 0;
        for (int i = 0; i < developer.length; i++) {
            if (developer[i] != null) {
                countDev++;
            }
        }
        System.out.println("Количество работников: " + countDev);
        System.out.println("Всего рабочих мест: " + developer.length);
        for (int i = 0; i < developer.length; i++) {
            System.out.println(developer[i]);
        }
    }
}

