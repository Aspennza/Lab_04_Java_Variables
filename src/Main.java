public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 7;
        int intOperandB = 4;
        int intSum = 3;
        int intProduct = 17;
        int intDifference = 15;
        int intQuotient = 20;
        int intModulo = 23;
        double doubleOperandA = 4.32;
        double doubleOperandB = 7.20;
        double doubleSum = 6.30;
        double doubleProduct = 20.51;
        double doubleDifference = 13.30;
        double doubleQuotient = 9.25;
        double doubleModulo = 50.25;
        int kidsInFamily = 1;
        boolean isRaining = false;
        double gallonGasPrice = 3.10;
        int favNumber = 9;
        double myShoeSize = 8.5;
        int myBirthMonth = 9;
        String myFullName = "Zoe Aspenns";

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using integers of " + intOperandA + " and " + intOperandB + " is " + intSum + ".");

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using integers of " + intOperandA + " and " + intOperandB + " is " + intProduct + ".");

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using integers of " + intOperandA + " and " + intOperandB + " is " + intDifference + ".");

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using integers of " + intOperandA + " and " + intOperandB + " is " + intQuotient + ".");

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using integers of " + intOperandA + " and " + intOperandB + " is " + intModulo + ".");

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum + ".");

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct + ".");

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference + ".");

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient + ".");

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo + ".");


        System.out.println("The number of kids in my family is: " + kidsInFamily);

        System.out.println("It is raining today: " + isRaining);

        System.out.println("The price of a gallon of gas is: $" + gallonGasPrice);

        System.out.println("My favorite number is: " + favNumber);

        System.out.println("My shoe size is: " + myShoeSize);

        System.out.println("My birth month is: " + myBirthMonth);

        System.out.println("My full name is: " + myFullName);
    }
}