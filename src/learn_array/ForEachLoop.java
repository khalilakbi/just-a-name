package learn_array;

public class ForEachLoop {
    public static void main(String[] args) {
        int a [] = {3,5,67,8,90};
        // for each element in array
        for(int element : a){
            if(element % 2 == 0){
                System.out.println(element+ " is even");
            }else {
                System.out.println(element +" is odd");
            }
        }

    }
}
