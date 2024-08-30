package learn_methods;

public class Positive {
    // java methods that return if number is positive

    public boolean isPositive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Positive positive = new Positive();
        boolean isNumberPositive = positive.isPositive(5);
        System.out.println(isNumberPositive);
    }
}
