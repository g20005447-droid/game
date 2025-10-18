import java.util.Arrays;
import java.util.List;

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
import java.util.Scanner;
public class Main {
    //глобальные переменные
    public static class Example {
        public static int a = 0;
    }

    public static void main(String[] args) {
        // переменные
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
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
        // действия


        propusk();
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


