//byte (-128-127) short (-32 768-32 767) int (-2 147 483 648-2 147 483 647) long (-9 223 372 036 854 775 808-9 223 372 036 854 775 807)
//float (0.0000001) double (0.0000000000000001) + && = and и || = or
// switch (age) {case 18: default:} + if + String()?...:...;
// for(i=1,i>=0,i++) {}
//while (?<=5) []
//do {
//} while ()
// int[] score = {5,4,2,5}; массив
//String[] sience = {"Математика","Русский","История","География"}; массив
//как узнавать , что я написал
//import java.util.Scanner;
//Scanner scanner = new Scanner(System.in);
//var d = scanner.nextInt();
//String[] goroda = {"Москва","Санкт-питербург","Минск","Уфа"};
//for (String i: goroda) {}
//Patern patren = Patren.complete("")
//String str = "Java world";
//char a = str.charAt(0);
//String subster_2 = str.substring(0, 8);
//int index1 = str.indexOf('l');
//int index2 = str.lastIndexOf('v');
//System.out.println(str.toLowerCase());
//System.out.println(str.toUpperCase());
//String formated = String.format("Привет, %s! Тебе %d лет," , "Иван", 17);
//double price = 123.111;
//String message = String.format("Цена: %.2f руб." , price);
//System.out.println(message);//Цена: 123,11 руб. 2f = 2 знака после запятой

class Employee {
    private String name;
    private int id;
    private int department;
    private static int counter = 1;
    private double salary;

    public Employee(String name, int department , double salary) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int  department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeInfo() {
        return "Сотрудник " + getId() + "\n" +
                "Имя" + getName() + "\n" +
                "Отдел: отдел №" + getDepartment() + "\n" +
                "Зарплата : " + getSalary() + "\n";
    }
    public String getAllNames() {
        return "Имя сотрудника " + getName() + "\n";
    }
}


public class Main {
    private static Employee[] employees = new Employee[10];
    //глобальные переменные
    public static class Example {
        public static int a = 0;
    }

    public static void printEmployeesInfo() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(
                        "Сотрудник " + employee.getId() + "\n" +
                        "Имя" + employee.getName() + "\n" +
                        "Отдел: отдел №" + employee.getDepartment() + "\n" +
                        "Зарплата : " + employee.getSalary() + "\n"
                );

            }

        }
    }
    public static void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(
                        "Имя сотрудника = " + employee.getName() + "\n"
                );
            }
        }
    }

    public static double getSumSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeWithMinSalary() {
        Employee minEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minEmployee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee getEmployeWithMaxSalary() {
        Employee maxEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxEmployee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double getAverageSalary() {
        double CP = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                CP++;
            }
        }
        return getSumSalary() / CP;
    }

    public static void main(String[] args) {
        // переменные
        employees[0] = new Employee("Test Test Test", 1 , 10000);
        employees[1] = new Employee("Start Start Start", 2 , 15500);
        employees[2] = new Employee("Reset Reset Reset", 5 , 13500);
        employees[3] = new Employee("Stop Stop Stop", 3 , 20000);
        employees[4] = new Employee("Reget Reget Reget", 5 , 13500);
        employees[5] = new Employee("Set Set Set", 1 , 23500);
        employees[6] = new Employee("Get Get Get", 3 , 14500);
        employees[7] = new Employee("Starer Starer Starer", 2 , 13000);
        employees[8] = new Employee("Stoper Stoper Stoper", 4 , 17500);
        employees[9] = new Employee("Retest Retest Retest", 1 , 19500);

        // действия
        System.out.println("Сумма всех зарплат : ");
        System.out.println(getSumSalary());
        System.out.println();
        printEmployeesInfo();
        System.out.println(getEmployeWithMinSalary().getEmployeeInfo());
        System.out.println(getEmployeWithMaxSalary().getEmployeeInfo());
        System.out.println(getAverageSalary());
        printAllNames();
        bigPropusk();
        metod_1();
    }
    // методы
    private static void metod_1() {
        //переменные метода
        var nol = Example.a + 1;
        //действия метода
        System.out.println("проверка методов  " + nol);
    }

    private static void bigPropusk() {
        //переменные метода

        //действия метода
        System.out.println("________________________________________________________________________________________________________________________________________________________");
        propusk();
    }

    private static void propusk() {
        //переменные метода

        //действия метода
        System.out.println("        ");

    }
}


