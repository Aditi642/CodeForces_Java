import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance: ");
        int x = sc.nextInt();

        int moves = 0;

        while (x > 0) {
            if (x >= 5)
                x -= 5;
            else
                x = 0;

            moves++;
        }

        System.out.println(moves);

        sc.close();
    }
}