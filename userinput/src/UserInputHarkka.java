import java.util.Scanner;

public class UserInputHarkka {
    public static void main(String[] args) throws Exception {


        Scanner in = new Scanner(System.in);
        String input = "";
        String input2 = "";
        String input3 = "";

        int check;
        int add = 0;
        int minus = 0;
        int div = 0;


 
        System.out.println("Please type something");
        input = in.nextLine();
        System.out.println("You typed " + input);


        System.out.println("Write a number");
        input = in.nextLine();
        

        System.out.println("Write a second number");
        input2 = in.nextLine();
        System.out.println("You typed " + input2);

        System.out.println("Do you want to \033[3madd\033[3m or \033[3mminus\033[3m or \033[3mdivide\033[3m the numbers?");
        input3 = in.nextLine();

        
        add = Integer.parseInt(input) + Integer.parseInt(input2);
        minus = Integer.parseInt(input) - Integer.parseInt(input2);
        div = Integer.parseInt(input) / Integer.parseInt(input2);
        
        if (input3.equals("add")) {
            System.out.println("Sum of the numbres are " + add);
        }

        else if (input3.equals("minus")) {
            System.out.println("1. number minus 2. number is " + minus);
        }

        else if (input3.equals("divide")) {
            System.out.println("1. number divided by 2. number is " + div);
        }

        else {
            System.out.println("error");
        }

    }
}
