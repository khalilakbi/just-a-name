package learn_methods;

public class Largest {
     // java methods that return largest between two number
    public int getLargest(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        Largest largest = new Largest();
        //int max = largest.getLargest(5,8);
        System.out.println(largest.getLargest(5,8));
    }
}
