package main.java.by.rymtsov.lesson11;

import main.java.by.rymtsov.lesson11.operations.StringHandler;

/**
 * This is the application runner class.
 * There are the answers to the task.
 */

public class MainApplication {
    public static void main(String[] args) {
        String str = "5123-ABc-7590-KrA-1a2B";
        System.out.println("Your string: " + str);
        System.out.println(StringHandler.outputTwoFirstBlocksOfDigits(str));
        System.out.println(StringHandler.replaceBlocksOfThreeLettersWithStar(str));
        System.out.println(StringHandler.outputOnlyLetters(str));
        System.out.println(StringHandler.outputOnlyLettersUsingStringBuilder(str));
        StringHandler.isStrContainsAbc(str);
        StringHandler.isStringStartWith555(str);
        StringHandler.isStringEndWith1a2b(str);
    }
}
