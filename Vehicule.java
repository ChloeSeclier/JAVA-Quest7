public abstract class Vehicule {

    //attributs
    private String brand;
    private int kilometers;

    //constructeur
    public Vehicule(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //getter et setter
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    //method abstract
    public abstract String doStuff();
}