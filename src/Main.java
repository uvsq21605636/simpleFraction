import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Please enter a number for the numerator : ");
        Scanner scanner = new Scanner(System.in);
        String numerator = scanner.nextLine();

        System.out.print("Please enter a number for the denuminator : ");
        Scanner scanner2 = new Scanner(System.in);
        String denum = scanner.nextLine();
        Fraction fac = new Fraction(Double.parseDouble(numerator), Double.parseDouble(denum));
        fac.toString();
        System.out.print(fac + "=");
        double res = fac.cal();
        System.out.println(res);
    }
}
