import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int n = numsInput[0]; //to offer
        int s = numsInput[1]; //to poll
        int x = numsInput[2]; //to check if is contained


        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(numbers[i]);
        }

        for (int i = 0; i < s ; i++) {
            if (!queue.isEmpty()){
                queue.poll();
            }
        }
        if (queue.isEmpty()) {
            System.out.println("0");

        } else if (queue.contains(x)){
            System.out.println("true");
        } else {
            System.out.println(Collections.min((queue)));
        }

    }
    }

