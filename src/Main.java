//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // переменные
        var x = 1;
        var y = 0.5;
        var rovno1 = x + y;
        var rovno2 = x - y;
        var rovno3 = x * y;
        var rovno4 = x / y;
        //byte (-128-127) short (-32 768-32 767) int (-2 147 483 648-2 147 483 647) long (-9 223 372 036 854 775 808-9 223 372 036 854 775 807)
        //float (0.0000001) double (0.0000000000000001)
        // действия
        System.out.println("сложение = " + rovno1 + "       " + "вычитание = " + rovno2 + "       " + "умножение = " + rovno3 + "       " + "деление = " + rovno4);
    }
}