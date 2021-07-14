package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sentences = sc.nextLine().split("[.|!?]");
        long total = 0;
        for (String sentence : sentences) {
            String[] words = sentence.trim().split("\\s+");
            total += words.length;
        }
        double average = (double) total / sentences.length;
        if (average > 10) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}
