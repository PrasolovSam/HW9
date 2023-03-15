import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkNumber();
    }
    public static int printNUmber() {
        System.out.println("Введите число:");
        return new Scanner(System.in).nextInt();
    }
    public static void checkNumber(){
        System.out.println(printNUmber() % 2 == 0);
    }
}
