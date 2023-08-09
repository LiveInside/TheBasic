package org.example;

public class TheBasics {

        public static void main(String [] args){
            //fizzBuzz(11, 20);
            //System.out.println(isBalanced("())(()"));
            //System.out.println(fib(2));
            //System.out.println(isPowerOfThree(0));
            //System.out.println(diff(300,45));
            System.out.println(dnaToRna(""));
            System.out.println(addDigits(38));
        }

    public static void fizzBuzz(int begin, int end) {
        while (begin <= end) {
            if (begin % 3 == 0 && begin % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (begin % 3 == 0) {
                System.out.println("Fizz");
            } else if (begin % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(begin);
            }
            begin++;
        }
    }

    public static boolean isBalanced(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else {
                counter--;
                if (counter < 0) {
                    return false;
                }
            }
        }
        return counter == 0;
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int f = 0;

        for (int i = 3; i <= n; i++) {
            f = prev1 + prev2;
            prev2 = prev1;
            prev1 = f;
        }
        return f;
    }

    public static boolean isPowerOfThree(int number) {
        if (number == 0) {
            return false;
        }
        while (number != 1) {
            if (number % 3 == 0) {
                number /= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int diff(int angle1, int angle2) {
        int diff = Math.abs(angle1 - angle2);
        if (diff > 180) {
            return 360 - diff;
        }
        return diff;
    }

    public static String dnaToRna(String dna) {
        String rna = "";
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A':
                    rna += 'U';
                    break;
                case 'C':
                    rna += 'G';
                    break;
                case 'G':
                    rna += 'C';
                    break;
                case 'T':
                    rna += 'A';
                    break;
                default:
                    return null;
            }
        }
        return rna;
    }

    public static int addDigits(int number) {
        String nStr = Integer.toString(number);

        while (nStr.length() != 1) {
            number = 0;
            for (int i = 0; i < nStr.length(); i++) {
                int n = CharacterToInt.characterToInt(nStr.charAt(i));
                number += n;
            }
            nStr = Integer.toString(number);
        }
        return number;
    }
}

