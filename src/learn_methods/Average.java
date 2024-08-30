package learn_methods;

import java.lang.reflect.Array;

public class Average {
    //java method to count avg of 3 number
    public int countAVG(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return avg;
    }

    public static void main(String[] args) {
        Average average = new Average();
        int a = average.countAVG(2,6,8);
        System.out.println(a);

    }
}

