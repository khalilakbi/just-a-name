package learn_methods;

public class LearnMethod {

    public void printNumber(int n) {
        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        LearnMethod learnMethod = new LearnMethod();
        learnMethod.printNumber(5);
        learnMethod.printNumber(7);
//        for (int i = 0; i <= 10; i++) {// 0
//            System.out.println(i);
//        }
    }
}
