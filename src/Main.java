//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //глобальные переменные
    public static class Example {
        public static int a = 0;
    }

    public static void main(String[] args) {
        // переменные
        var x = 1;
        var y = 0.5;
        var rovno1 = x + y;
        var rovno2 = x - y;
        var rovno3 = x * y;
        var rovno4 = x / y;
        int age = 13;
        //byte (-128-127) short (-32 768-32 767) int (-2 147 483 648-2 147 483 647) long (-9 223 372 036 854 775 808-9 223 372 036 854 775 807)
        //float (0.0000001) double (0.0000000000000001) + && = and
        // действия
        if (age >= 18) {
            qw();
            System.out.println("Ты совершенолетний");
            qw();
            PR();
        } else if (age < 18) {
            qw();
            System.out.println("Ты не совершенолетний");
            qw();
            if (age >= 7) {
                var clases = age -= 6;
                System.out.println("ты ходишь в " + clases + " класс");
                PR();
                qw();

            } else if (age < 7 && age > 3) {
                System.out.println("Ты ходишь в садик");
                PR();
            } else {
                System.out.println("ты младенец");
                PR();
            }
        }
        print_all();
        qw();
        PR();
        System.out.println("проверка мат. действий  :  " + "1 + 0.5 = " + rovno1 +"       1 - 0.5 = " + rovno2 + "       1 * 0.5 = " + rovno3 + "       1 / 0.5 = " + rovno4);
        PR();
        System.out.println("конец");

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
        System.out.println("_______________________________________________");

    }

    private static void qw() {
        //переменные метода

        //действия метода
        System.out.println("        ");

    }
}


