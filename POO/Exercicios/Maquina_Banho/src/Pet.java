public class Pet {
    
    private final String name;
    private boolean clean;



    //Contrutor
    public Pet(String name) {
        this.name = name;
        this.clean = false; // Pets don't clean by default
    }

    //getter para name
    public String getName() {
        return name;
    }
    //getter para clean
    public boolean isClean() {
        return clean;
    }

    //setter para clean
    public void setClean(boolean clean) {
        this.clean = clean;
    }


}
