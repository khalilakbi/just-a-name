package lean_control_statement;

public class LearnSwitch {
    public static void main(String[] args) {
        int day = 3;

//       if(day == 1){
//           System.out.println("Monday");
//       } else if (day == 2) {
//           System.out.println("Tuesday");
//       }else if (day == 3){
//           System.out.println("wednesday");
//       }else {
//           System.out.println("invalid day");
//       }
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("invalid day");
        }

    }
}
