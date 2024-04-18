package assignment_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment_5 {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String filepath = getFilepathFromUser();
        String fullText = getContentsOfFile(filepath);
        //System.out.println(fullText);
        String[] tics = getTicsFromUser();

        System.out.println("...............................Analyzing text.................................");
        int totalTics = 0;
        int[] occurrences = new int[tics.length];
        double[] percentages = new double[tics.length];

        for (int i = 0; i < tics.length; i++) {
            occurrences[i] = countOccurrences(tics[i], fullText);
            totalTics += occurrences[i];
        }

        for (int i = 0; i < tics.length; i++) {
            percentages[i] = calculatePercentage(occurrences[i], totalTics);
        }

        double ticDensity = calculateTicDensity(tics, fullText);

        System.out.println("\nTotal number of tics: " + totalTics);
        System.out.println("Density of tics: " + String.format("%.2f", ticDensity) + "\n");
        System.out.println("...............................Tic breakdown.................................\n");

        for (int i = 0; i < tics.length; i++) {
            System.out.printf("%-10s / %-20d / %-2.0f%% of all tics\n", tics[i], occurrences[i], percentages[i]);
        }
    }

    public static String getFilepathFromUser() {
        System.out.println("What file would you like to open?");
        return scn.nextLine();
    }

    public static String getContentsOfFile(String filepath) {
        String fullText = "";
        try {
            Scanner scn = new Scanner(new File(filepath));
            while (scn.hasNextLine()) {
                String line = scn.nextLine();
                fullText += line + "\n";
            }
            scn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oh no... can't find the file!");
        }
        return fullText;
    }

    public static String[] getTicsFromUser() {
        System.out.println("What words would you like to search for?");
        String input = scn.nextLine();
        return input.split("\\s*,\\s*");
    }

    public static int countOccurrences(String needle, String haystack) {
        int count = 0;
        String tic = needle.toLowerCase();
        String fullText = haystack.toLowerCase();
        int index = fullText.indexOf(tic);
        while (index != -1) {
            count++;
            index = fullText.indexOf(tic, index + 1); //after finding a tic, it starts on the next word and keeps searching
        }
        return count; //returns the number of times the tic appears in the fullText.
    }

    public static double calculatePercentage(int num1, int num2) {
        return ((double) num1 / num2) * 100;
    }

    public static double calculateTicDensity(String[] tics, String fullText) {
        String[] words = fullText.split("[ \\n\\t.,?!]+");
        double ticCount = 0;
        for (String word : words) {
            for (String tic : tics) {
                if (word.equalsIgnoreCase(tic)) {
                    ticCount++;
                    break;
                }
            }
        }
        return ticCount / words.length;
    }
}
