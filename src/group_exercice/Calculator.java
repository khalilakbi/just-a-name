package group_exercice;

public class Calculator {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 0; i <= 5; i++){   // 0 ; 1; 3; 6;10;15;
            sum = sum + i; // sum += i;;
        }
        System.out.println(sum);
    }
}
