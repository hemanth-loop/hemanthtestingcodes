import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int data = scanner.nextInt();

       try {
           System.out.println(100/data);
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }


       finally {
           System.out.println("the  finally block is executed");
       }
        System.out.println("program is completed");
    }
}

