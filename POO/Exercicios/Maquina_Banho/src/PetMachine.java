public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;



    //metodos
    public void takeAShower(){
        if(this.pet == null){
            System.out.println("No pet in the machine.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("The pet " + pet.getName() + " is now clean!");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("Water tank is alredy full.");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("Shampoo tank is alredy full.");
            return;
        }
        shampoo += 2;     
    }

    //Getters
    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("The machine is dirty. Please clean it before adding a new pet.");
            return;
        }
        if(hasPet()){
            System.out.println("The pet" + this.pet.getName() + " is now in the machine.");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        
        System.out.println("The pet " + this.pet.getName() + " has been removed from the machine.");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("The machine has been cleaned.");
    }

}
