import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Task2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().
                split(" "))
                .collect(Collectors.toList());

        Consumer<List<String>> printer = e -> e.forEach(a ->
                System.out.println("Sir " + a));

        printer.accept(names);
    }
}
