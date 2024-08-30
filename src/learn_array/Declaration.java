package learn_array;

import java.lang.reflect.Array;

public class Declaration {
    public static void main(String[] args) {

        //declaration and initialization of arrays
//        int a [] = {2,5,7,56,78};
//
//        //int arrayLength = a.length;
//        System.out.println(a.length);
//        System.out.println(a[2]);
//        int lastElement = a[4];
//        System.out.println(lastElement);

//        String student[] = {"nassiba", "nora", "soraya", "rachida"};
//        for (int i = 0; i < student.length; i++){
//            System.out.println(student[i]);
//        }

        int a[] = {3, 56, 76, 89, 1};
        int min = a[0];// 3   56  79  89
        for(int i = 0; i < a.length; i++){// 0 1 2 3 4
           if(a[i] < min ){
              min = a[i];
           }
        }
        System.out.println(min);


    }
}
