public class Find_noOfDigits_inTheBinaryRepresentation_ofANumber {
    public static void main(String[] args) {
        int num = 10;
        int base = 2;
        int numberOfDigitsInBinaryRepresentation = ((int) (Math.log(num) / Math.log(base))) + 1;
        System.out.println("Number of digits in Binary Representation of " + num + " are: " + numberOfDigitsInBinaryRepresentation);
    }
}
