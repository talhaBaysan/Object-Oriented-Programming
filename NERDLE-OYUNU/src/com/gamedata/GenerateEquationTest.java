package com.gamedata;

class GenerateEquationTest {

    private final int testCount = 1000;

    boolean checkOperatorValidity(String equation) {
        for (int i = 0; i < equation.length() - 1; i++) {
            if (
                    !Character.isDigit(equation.charAt(i))  // Find an operator
                            && (( // Detect double operator
                            !(Character.isDigit(equation.charAt(i + 1))  // Check if its next to another one
                                    || equation.charAt(i + 1) == '-')) // Exclude negative number after equals sign

                    )
            ) {
                return false;
            }
        }

        return true;
    }

    boolean checkLeadingZero(String equation) {
        for (int i = 0; i < equation.length() - 1; i++) {
            if (
                // Detect integer with leading 0
                    i < equation.length() - 2 // Avoid index error
                            && !Character.isDigit(equation.charAt(i)) // Check for non digit trailing character
                            && equation.charAt(i + 1) == '0'    // Check for leading 0
                            && Character.isDigit(equation.charAt(i + 2))  // Find a trailing digit

            ) {
                return false;
            }
        }

        return true;
    }

    

}