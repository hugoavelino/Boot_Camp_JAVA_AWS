import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        var option = -1;

        do{
            System.out.println("Welcome to the Pet Washing Machine!");
            System.out.print("Please select an option: ");
            System.out.println("================================");
            System.out.println("1. Bathe your pet");
            System.out.println("2. Add Water");
            System.out.println("3. Add Shampoo");
            System.out.println("4. Cheking water levels");
            System.out.println("5. Cheking shampoo levels");
            System.out.println("6. Check if machine has a pet");
            System.out.println("7. Put pet in the machine");
            System.out.println("8. put out pet from the machine");
            System.out.println("9. Cleaning the machine");
            System.out.println("0. Exit");
            option = scanner.nextInt();

        }while(option != 0);
        scanner.close();
    }
}
