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

class Car {
    private String brand;
    private String model;
    private int year;

    void setBrand(String brand) {
        this.brand = brand;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setYear(int year) {
        this.year = year;
    }
    String getBrand() {
        return brand;
    }
    String getModel() {
        return model;
    }
    int getYear() {
        return year;
    }

    void startEngine() {
        System.out.println("Двигатель запущен");
    }
    void stopEngine() {
        System.out.println("Двигатель остановлен");
    }
}
class test_1_car extends Exception {
    public test_1_car(String message) {
        super(message);
    }
}
class ElectricCar extends Car {
    public int batery;
    private String Cachestvo;

    public void test() throws test_1_car {
        if ((getBrand() == null) && (getModel() == null) && (getYear() == 0) && (getBatery() == 0) && (getCachestvo() == null)) {
            throw new test_1_car("Вы не заполнили информацию о машине");
        }
    }

    void setCachestvo(String Cachestvo) {
        this.Cachestvo = Cachestvo;
    }
    void setBatery(int batery) {
        this.batery = batery;
    }
    String getCachestvo() {
        return Cachestvo;
    }
    int getBatery() {
        return batery;
    }
    @Override
    void startEngine() {
        System.out.println("Электродвигатель запущен");
    }
    @Override
    void stopEngine() {
        System.out.println("Электродвигатель остановлен");
    }

    boolean testBatery() {
        boolean tr = false;
        if (batery < 20) {
            System.out.println("Батарея разряжена , зарядите");
            tr = true;
        }
        return tr;
    }
}

class CarData {
    private String brand1;
    private String model1;
    private int year1;

    void setBrand1(String brand) {
        this.brand1 = brand;
    }
    void setModel1(String model) {
        this.model1 = model;
    }
    void setYear1(int year) {
        this.year1 = year;
    }
    String getBrand1() {
        return brand1;
    }
    String getModel1() {
        return model1;
    }
    int getYear1() {
        return year1;
    }
}
class CarServise extends CarData{
    void print_all_info() {
        System.out.println("Бренд : " + getBrand1());
        System.out.println("Модель : " + getModel1());
        System.out.println("Год выпуска : " + getYear1());
    }
}

class FunctionalCar {
    private String brand2;
    private String model2;
    private int year2;
    void startAndPrintInfo() {
        System.out.println("Start motor car");
        System.out.println("Бренд : " + brand2);
        System.out.println("Модель : " + model2);
        System.out.println("Год выпуска : " + year2);

    }
}

public class Main {
    //глобальные переменные
    public static class Example {
        public static int a = 0;
    }

    public static void main(String[] args) {
        // переменные
        //задачи 1-5
        ElectricCar newCar = new ElectricCar();
        newCar.setBrand("AUDI");
        newCar.setModel("IDK");
        newCar.setYear(2015);
        newCar.setBatery(25);
        //задача 6

        // действия
        //задачи 1-5
        try {
            System.out.println("Информация о машине:");
            newCar.test();
        } catch (test_1_car e) {
            System.out.println("ОШИБКА!!! " + e.getMessage());
        } finally {
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getModel());
            System.out.println(newCar.getYear());
            System.out.println(newCar.getBatery());

        }
        //задача 6
        System.out.println("Я не знаю как сделать пункт 6.4 , но для меня удобнее разделять по классам переменные с геттерами и ссетарами чем объеденённый класс");
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


