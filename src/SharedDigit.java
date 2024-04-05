public class SharedDigit {

    public static void main(String[] args) {
        System.out.println("Result: " + hasSharedDigit(9,99)); //Expected Outcome ==> false
        System.out.println("Result: " + hasSharedDigit(12,23)); //Expected Outcome ==> true
        System.out.println("Result: " + hasSharedDigit(15,55)); //Expected Outcome ==> true

    }

    public static boolean hasSharedDigit(int first, int second) {
        boolean inRange = first >= 10 && first <= 99;
        boolean inRangeSecond = second >= 10 && second <= 99;

        if(!inRange || !inRangeSecond) {
            return false;
        }

        int leftFirstDigit = first / 10;
        int rightFirstDigit = first % 10;

        int leftSecondDigit = second / 10;
        int rightSecondDigit = second % 10;

        boolean firstShared = leftFirstDigit == leftSecondDigit || leftFirstDigit == rightSecondDigit;
        boolean secondShared = rightFirstDigit == leftSecondDigit || rightFirstDigit == rightSecondDigit;

        return firstShared || secondShared;
    }

}
