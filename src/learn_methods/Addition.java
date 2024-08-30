package learn_methods;

public class Addition {

    // java method that return addition of two integer
    public int add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        int x = addition.add(4,7);
        System.out.println(x);
        System.out.println(addition.add(12,78));
    }
}
