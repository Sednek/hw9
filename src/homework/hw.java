package homework;

public class hw {
    public static void task1(){
        System.out.println("Task 1:");

        var firstName  = "Ivan";
        var middleName = "Ivanovich";
        var lastName   = "Ivanov";

        var fullName   = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println(" ");
    }
    public static void task2(){
        System.out.println("Task 2:");

        var firstName  = "Ivan";
        var middleName = "Ivanovich";
        var lastName   = "Ivanov";

        var fullName   = lastName + " " + firstName + " " + middleName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println(" ");
    }
    public static void task3(){
        System.out.println("Task 3:");

        var fullName = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

        System.out.println(" ");
    }
}
