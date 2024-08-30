package lean_control_statement;

public class LearnIf {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;//it will skip 4
            }
            System.out.println(i);
        }
    }
}
