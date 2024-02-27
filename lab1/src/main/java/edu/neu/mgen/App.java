package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Lab 1 part 1 - Array

        // Initiate two integer arrays, x, and y, each containing 5 numbers.

        int[] x = { 1, 2, 3, 4, 5 };
        int[] y = { 6, 7, 8, 9, 10 };

        // Create another array z of length 5, the elements of which are the max of the
        // respective numbers of the two arrays x and y.

        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Organize a nice-looking output to the terminal that looks like the following:
        // Array x = { array x values here separated by coma }

        // Array y = { array y values here separated by coma }

        // Array z = x + y = { array z values here separated by coma }

        System.out.print("Array x = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(y[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        // Lab 1 part 2 - ArrayList

        // Initiate an ArrayList that contain 5 names

        ArrayList<String> names = new ArrayList<String>();
        names.add("Wang");
        names.add("Zhang");
        names.add("Li");
        names.add("Zhao");
        names.add("Liu");
        // Switch the first and last letters in each name in the ArrayList. Do not
        // forget that each name begins with a capital letter, but the other letters are
        // lowercase. The names with switched letters should follow the same rule as
        // there are new names.

        ArrayList<String> switchedNames = new ArrayList<String>();

        for (String name : names) {
            char[] nameArray = name.toCharArray();
            char temp = nameArray[0];
            nameArray[0] = nameArray[nameArray.length - 1];
            nameArray[nameArray.length - 1] = temp;
            String switchedName = new String(nameArray);
            switchedName = switchedName.substring(0, 1).toUpperCase() + switchedName.substring(1).toLowerCase();
            switchedNames.add(switchedName);
        }

        // Organize a nice-looking output to the terminal that looks like the following:
        // Names = { list of names here separated by coma }

        // Names (switched) = { list of names with switched first and last letters here
        // separated by coma }

        System.out.print("Names = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(names.get(i));
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Names (switched) = { ");
        for (int i = 0; i < 5; i++) {
            System.out.print(switchedNames.get(i));
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

    }
}
