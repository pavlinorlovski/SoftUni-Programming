import java.util.Scanner;

public class Ex01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        //  пресмята сумарното им време във формат "минути:секунди".
        //  Секундите да се изведат с водеща нула (2  "02", 7  "07", 35  "35").

        int totalTime = timeFirst + timeSecond + timeThird;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else System.out.printf("%d:%d", minutes,seconds);
    }
}