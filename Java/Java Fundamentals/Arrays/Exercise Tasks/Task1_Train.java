import java.util.Scanner;
// 100/100
public class Task1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int wagons = Integer.parseInt(scanner.nextLine());

int[] train = new int[wagons];
int people = 0;
        for (int i = 0; i < wagons  ; i++) {
train[i] = Integer.parseInt(scanner.nextLine());
people += train[i];
        }
        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i] + " ");

        }
        System.out.println();
        System.out.println(people);

    }
}