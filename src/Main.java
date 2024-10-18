import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        int day = scanner.nextInt();


        for (int i = 1; i<=day; i++) {
            int temperature = scanner.nextInt();
            if(temperature < 0) {
                count++;
            }
        }

        System.out.println("количество дней ниже 0:" + count );
    }
}