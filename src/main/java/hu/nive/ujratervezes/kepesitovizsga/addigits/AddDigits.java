package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {
    public long addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        long sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}
