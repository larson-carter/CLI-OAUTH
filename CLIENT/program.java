import java.util.Scanner;

public class program {

  public static void main(String[] args) {

      System.out.println("What is your username?");
			
      Scanner input1 = new Scanner(System.in);

      String username = input1.nextLine();

      System.out.println("What is your password?");

      Scanner input2 = new Scanner(System.in);

      String password = input2.nextLine();

  }

}
