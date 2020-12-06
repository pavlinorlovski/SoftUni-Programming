import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//100/100
public class Task_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] words = scanner.nextLine().split(" ");


        List<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < words.length ; i++) {
            repeatedWords.add(repeat(words[i], words[i].length()));
        }

        System.out.println(String.join("", repeatedWords));
    }

    private static  String repeat(String word, int count) {//repeat method
        String[] repeatArr = new String[count];
        for (int i = 0; i < count ; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
