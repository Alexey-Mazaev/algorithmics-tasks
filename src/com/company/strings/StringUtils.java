package com.company.strings;

public class StringUtils {

    public static String lastSurvivors(String input) {
        if (input.length() <= 1) {
            return input;
        } else if (input.length() == 2) {
            return swapper(input);
        } else {
            String result = input;

            while (containsRepeatedSymbols(result)) {

                String leftPart = result.substring(0, result.length() / 2);
                String rightPart = result.substring(result.length() / 2);

                if (containsRepeatedSymbols(leftPart) && containsRepeatedSymbols(rightPart)) {
                    result = swapper(leftPart) + swapper(rightPart);
                } else if (containsRepeatedSymbols(leftPart) && !containsRepeatedSymbols(rightPart)) {
                    result = swapper(leftPart) + rightPart;
                } else if (!containsRepeatedSymbols(leftPart) && containsRepeatedSymbols(rightPart)) {
                    result = leftPart + swapper(rightPart);
                } else if (containsRepeatedSymbols(result)) {
                    result = swapper(result);
                }
            }
            return result;
        }
    }

    private static String swapper(String input) {
        if (input.length() <= 1) {
            return input;
        } else if (input.length() == 2 && input.charAt(0) == input.charAt(1)) {
            return Character.toString(increaseToNextSymbol(input.charAt(0)));
        } else if (input.length() == 2 && input.charAt(0) != input.charAt(1)) {
            return input;
        } else {
            String leftPart = input.substring(0, input.length() / 2);
            String rightPart = input.substring(input.length() / 2);

            if (containsRepeatedSymbols(leftPart) && containsRepeatedSymbols(rightPart)) {
                return swapper(leftPart) + swapper(rightPart);
            } else if (containsRepeatedSymbols(leftPart) && !containsRepeatedSymbols(rightPart)) {
                return swapper(leftPart) + rightPart;
            } else if (!containsRepeatedSymbols(leftPart) && containsRepeatedSymbols(rightPart)) {
                return leftPart + swapper(rightPart);
            } else if (containsRepeatedSymbols(input)) {
                int i = 0;
                char currentSymbol = input.charAt(i);

                // find index for next letter
                while (!Character.isLetter(currentSymbol) && i < input.length() - 1) {
                    i++;
                    currentSymbol = input.charAt(i);
                }

                int repeatedSymbolIndex = firstRepeatIndex(input, currentSymbol, i + 1);
                // searching repeated symbols
                while (i < input.length() && repeatedSymbolIndex == -1) {
                    currentSymbol = input.charAt(i);
                    repeatedSymbolIndex = firstRepeatIndex(input, currentSymbol, i + 1);
                    i++;
                }

                if (repeatedSymbolIndex != -1) {
                    String partWithDubs = input.substring(i, repeatedSymbolIndex);
                    partWithDubs = increaseToNextSymbol(partWithDubs.charAt(0)) +
                            partWithDubs.substring(1);

                    return input.substring(0, i) + partWithDubs + input.substring(repeatedSymbolIndex + 1);
                } else {
                    return input;
                }
            } else {
                return input;
            }
        }
    }

    private static char increaseToNextSymbol(char symbol) {
        char nextSymbol;

        if (symbol == 'z') {
            nextSymbol = 'a';
        } else {
            symbol++;
            nextSymbol = symbol;
        }

        return nextSymbol;
    }

    private static int firstRepeatIndex(String input, char symbol, int startIndex) {
        for (int i = startIndex; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                return i;
            }
        }
        return -1;
    }

    private static boolean containsRepeatedSymbols(String text) {
        for (int i = 0; i < text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            for (int j = 1; j < text.length(); j++) {
                char nextSymbol = text.charAt(j);
                boolean containsRepeatedSymbols = Character.isLetter(currentSymbol) &&
                        Character.isLetter(nextSymbol) &&
                        currentSymbol == nextSymbol;

                if (containsRepeatedSymbols) {
                    return true;
                }
            }
        }

        return false;
    }
}
