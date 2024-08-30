package learn_methods;

public class Variables {

    String name = "soraya";



    public static void main(String[] args) {
        int i ;

        for( i = 0; i < 6; i++){
            System.out.println(i + "hello student");
        }
        Variables variables = new Variables();
        String nameTest = variables.name;
        System.out.println(nameTest);
    }
}
