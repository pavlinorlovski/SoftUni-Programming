import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//100/100
public class Task1_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)";
        List<String> furniture = new ArrayList<>();

        double cost = 0;

        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(name);
                cost += (price*quantity);

            }
            input = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        furniture.forEach(f-> System.out.println(f));
        System.out.printf("Total money spend: %.2f", cost);
    }
}
