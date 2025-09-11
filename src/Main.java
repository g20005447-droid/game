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
        var MZ = 67_760;
        var DZ = 83_690;
        var KZ = 76_230;
        var MZP = MZ + (MZ / 10);
        var DZP = DZ + (DZ / 10);
        var KZP = KZ + (KZ / 10);
        var MZRG = (MZP * 12) - (MZ * 12);
        var DZRG = (DZP * 12) - (DZ * 12);
        var KZRG = (KZP * 12) - (KZ * 12);

        //byte (-128-127) short (-32 768-32 767) int (-2 147 483 648-2 147 483 647) long (-9 223 372 036 854 775 808-9 223 372 036 854 775 807)
        //float (0.0000001) double (0.0000000000000001)
        // действия
        //print_all();
        //System.out.println("          ");
        //System.out.println("проверка мат. действий  :  " + "1 + 0.5 = " + rovno1 + "       " + "1 - 0.5 = " + rovno2 + "       " + "1 * 0.5 = " + rovno3 + "       " + "1 / 0.5 = " + rovno4);
        System.out.println("Маша теперь получает " + MZP + " рублей. Годовой доход вырос на " + MZRG + " рублей");
        System.out.println("             ");
        System.out.println("Денис теперь получает " + DZP + " рублей. Годовой доход вырос на " + DZRG + " рублей");
        System.out.println("             ");
        System.out.println("Кристина теперь получает " + KZP + " рублей. Годовой доход вырос на " + KZRG + " рублей");

    }
    // методы
    private static void print_all() {
        //переменные метода
        var nol = 0 + Example.a;
        byte q = -12;
        short w = 32_000;
        int e = -200_000_0;
        long r = 32_000_000_000L;
        float t = -0.000_000_1f;
        double y = 0.000_000_000_000_000_1;
        //действие метода
        System.out.println("проверка методов  " + nol);
        System.out.println("имя переменной - тип переменной - значение:  "
        + "q - byte - " + q + " / " + "w - short - " + w + " / " + "e - int - " + e + " / " + "r - long - " + r + " / " + "t - float - " + t + " / " + "y - double - " + y);
    }
}


