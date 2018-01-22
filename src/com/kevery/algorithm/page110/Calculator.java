package com.kevery.algorithm.page110;


import java.util.regex.Pattern;

public class Calculator {


    public static String convertBehind(String front) {
        StringBuilder behindStr = new StringBuilder();

        ArrayStack<Character> arrayStack = new ArrayStack<>();

        char[] chars = front.toCharArray();
        for (char aChar : chars) {
            if (isNum(aChar)) {
                behindStr.append(aChar);
            }

            if (!isNum(aChar)) {
                if (arrayStack.isEmpty()) {
                    arrayStack.push(aChar);
                } else {
                    if (isRight(aChar)) {
                        while (!isLeft(arrayStack.peek())) {
                            Character pop = arrayStack.pop();
                            behindStr.append(pop);
                        }
                        arrayStack.pop();
                    } else if (isLeft(aChar)) {
                        arrayStack.push(aChar);

                    } else {
                        while (!arrayStack.isEmpty() && isneedPOP(aChar, arrayStack.peek())) {
                            Character pop = arrayStack.pop();
                            behindStr.append(pop);
                        }
                        arrayStack.push(aChar);
                    }

                }
            }

        }
        while (!arrayStack.isEmpty()) {
            Character pop = arrayStack.pop();
            behindStr.append(pop);
        }

        return behindStr.toString();

    }


    public static boolean isNum(char s) {
        Pattern compile = Pattern.compile("[0-9]*");
        String valueOfStr = String.valueOf(s);
        return compile.matcher(valueOfStr).matches();
    }

    public static boolean isLeft(char s) {
        return s == '(';
    }

    public static boolean isRight(char s) {
        return s == ')';
    }

    public static boolean isneedPOP(char s1, char s2) {

        if (s2 == '(' || s2 == ')') {
            return false;
        }

        if (s1 == '+' || s1 == '-') {
            return true;
        }

        return (s1 == '*' || s1 == '/') && (s2 == '*' || s2 == '/');

    }

}
