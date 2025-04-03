import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        HashMap<String, Integer> characters = new HashMap<>();

        System.out.println("Enter character names and their strengths (name strength):");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String name = parts[0];
            int strength = Integer.parseInt(parts[1]); // Assume valid input for simplicity
            characters.put(name, strength);
        }

        String winner = findWinner(characters);
        System.out.println("The winner is: " + winner);
        sc.close();
    }

    private static String findWinner(HashMap<String, Integer> characters) {
        String winner = null;
        int maxStrength = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : characters.entrySet()) {
            if (entry.getValue() > maxStrength) {
                maxStrength = entry.getValue();
                winner = entry.getKey();
            }
        }
        return winner;
    }
}