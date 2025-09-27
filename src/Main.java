//byte (-128-127) short (-32 768-32 767) int (-2 147 483 648-2 147 483 647) long (-9 223 372 036 854 775 808-9 223 372 036 854 775 807)
//float (0.0000001) double (0.0000000000000001) + && = and и || = or
// switch (age) {case 18: default:} + if + String()?...:...;
// for(i=1,i>=0,i++) {}
//while (?<=5) []
//do {
//} while ()
// int[] score = {5,4,2,5}; массив
//String[] sience = {"Математика","Русский","История","География"}; массив
public class Main {
    //глобальные переменные
    public static class Example {
        public static int a = 0;
    }

    public static void main(String[] args) {
        // переменные
        // действия
        PR();
        qw();
        print_all();
    }
    // методы
    private static void print_all() {
        //переменные метода
        var nol = Example.a + 1;
        //действия метода
        System.out.println("проверка методов  " + nol);
    }

    private static void PR() {
        //переменные метода

        //действия метода
        System.out.println("________________________________________________________________________________________________________________________________________________________");

    }

    private static void qw() {
        //переменные метода

        //действия метода
        System.out.println("        ");

    }
}


