package learn_methods;

public class PrintNumber {

    // java method to print n natural number

    public void print(int n){
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.print(5);
    }
}
