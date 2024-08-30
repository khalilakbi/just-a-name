package learn_methods;

public class EvenOdd {

    // java method that print even or odd number

    public void printEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");

        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        evenOdd.printEvenOdd(13);
    }

}
