import java.util.Scanner;

public class Main {

     private final static Scanner scanner = new Scanner(System.in);

     private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args){
       
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

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo(); 
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("invalid option. Please try again.");
                    
            }

        }while(option != 0);
   
    }
    public static void setWater(){
        System.out.println("Trying add water to the machine...");
        petMachine.addWater();
    }
    public static void setShampoo(){
        System.out.println("Trying add shampoo to the machine...");
        petMachine.addShampoo();
    }
    public static void verifyWater(){
        var amount = petMachine.getWater();
        System.out.println("The machine has " +amount + " liters of water.");
    }

    public static void verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("The machine has " +amount + " liters of shampoo.");
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "The machine has a pet." : "The machine does not have a pet");

    }

    public static void setPetInMachine(){
        var petName = "";
        while(petName.isBlank() || petName == null){
            System.out.print("Enter the name of your pet: ");
            petName = scanner.next();
        }
        var pet = new Pet(petName);
        petMachine.setPet(pet);
        System.out.println("The pet " + pet.getName() + " is now in the machine.");

    }
    
}
