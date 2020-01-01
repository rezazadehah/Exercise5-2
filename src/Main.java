import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CarsFactory ss = new CarsFactory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("car name :");
        String name  = scanner.nextLine();

        System.out.println(ss.getCar(name));

    }
}
