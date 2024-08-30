package learn_array;

public class ArrayParameter {


    // return the min from an array of integers
    public int getMin(int a[]){
        int min = a[0];// 3   56  79  89
        for(int i = 0; i < a.length; i++){// 0 1 2 3 4
            if(a[i] < min ){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int a [] = {45,56,4};
        ArrayParameter arrayParameter = new ArrayParameter();
        int min = arrayParameter.getMin(a);
        System.out.println(min);

    }
}
