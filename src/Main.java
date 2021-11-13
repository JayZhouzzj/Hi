import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/***
 * A hello world program!
 * It will try to use letters you typed in
 * and print as many times of "Hello World" as possible!
 *
 * @author Zhengjie Zhou (Jay)
 */
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello World? Hello World!");
        System.out.println("I will use the letters you give me to produce " +
                "as many Hello World as possible, because I'm a crazy programmer!");
        System.out.println("Remember: case matters!");
        System.out.print("Please type some stuff: ");
        String input = kb.nextLine();

        HashMap<Character, Integer> storage = new HashMap<>();
        // repeat time in Hello World: 1
        storage.put('H', 0);
        // repeat time in Hello World: 1
        storage.put('e', 0);
        // repeat time in Hello World: 3
        storage.put('l', 0);
        // repeat time in Hello World: 2
        storage.put('o', 0);
        // repeat time in Hello World: 1
        storage.put('W', 0);
        // repeat time in Hello World: 1
        storage.put('r', 0);
        // repeat time in Hello World: 1
        storage.put('d', 0);
        // repeat time in Hello World: 1
        storage.put(' ', 0);

        // loop through input to count appearance
        for (int i = 0; i < input.length(); i++) {
            Character currentChar = input.charAt(i);
            if (storage.containsKey(currentChar)) {
                storage.put(currentChar, storage.get(currentChar) + 1);
            }
        }

        storage.put('l', storage.get('l') / 3);
        storage.put('o', storage.get('o') / 2);

        System.out.println("Here we go!");
        System.out.println();
        int minValue = Collections.min(storage.values());
        for (int i = 0; i < minValue; i++) {
            System.out.println("Hello World");
        }
        System.out.println();
        System.out.println("Bye Bye!");
    }
}
