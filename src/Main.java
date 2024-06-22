//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(4, 8);
        System.out.println(fraction);
        fraction.truncate();
        System.out.println(fraction);
        Fraction fraction2 = new Fraction(6, 2);
        System.out.println(fraction2);
        fraction2.truncate();
        System.out.println(fraction2);
        Fraction fraction3 = fraction.addFraction(fraction2);
        System.out.println(fraction3);
    }
}