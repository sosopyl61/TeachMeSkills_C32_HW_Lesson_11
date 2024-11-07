package main.java.by.rymtsov.lesson11.operations;

/**
 * This class contains static methods
 * with the solutions to the task.
 */

public class StringHandler {

    public static String outputTwoFirstBlocksOfDigits(String str) {
        return str.substring(0, 4) + str.substring(9, 13);
    }

    public static String replaceBlocksOfThreeLettersWithStar(String str) {
        str = str.replaceAll(str.substring(5, 8), "***");
        return str.replaceAll(str.substring(14, 17), "***");
    }

    public static String outputOnlyLetters(String str) {
        String[] blocks = str.split("-");
        blocks[4] = blocks[4].replaceAll(blocks[4].substring(0, 1), "/");
        blocks[4] = blocks[4].replaceAll(blocks[4].substring(2, 3), "/");
        return (blocks[1].concat("/") + blocks[3] + blocks[4]).toLowerCase();
    }

    public static String outputOnlyLettersUsingStringBuilder(String str) {
        str = str.replace("-", "/");
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 5);
        sb.delete(4, 9);
        sb.replace(7, 9, "/");
        sb.replace(9, 10, "/");
        return "Letters:" + sb.toString().toUpperCase();
    }

    public static void isStrContainsAbc(String str) {
        str = str.toLowerCase();
        if (str.contains("abc")) {
            System.out.println("Yes, your string contains \"abc\".");
        }
        else {
            System.out.println("No, your string does not contain \"abc\".");
        }
    }

    public static void isStringStartWith555(String str) {
        if (str.startsWith("555")) {
            System.out.println("Yes, your string starts with \"555\".");
        }
        else {
            System.out.println("No, your string does not start with \"555\".");
        }
    }

    public static void isStringEndWith1a2b(String str) {
        if (str.endsWith("1a2b")) {
            System.out.println("Yes, your string ends with \"1a2b\".");
        }
        else {
            System.out.println("No, your string does not end with \"1a2b\".");
        }
    }
}
