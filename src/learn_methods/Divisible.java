package learn_methods;

public class Divisible {
    // write a java methods that return if number is divisible by 5
    public boolean isDivisibleBy5(int num){
        if(num % 5 == 0){  //13 / 5 = 2 13 % 5 = 3
            return true;
        }else {
           return false;
        }
    }
;
    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        boolean isDiv = divisible.isDivisibleBy5(56);
        System.out.println(isDiv);


    }
}
