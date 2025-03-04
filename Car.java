public class Car extends Vehicule {
    
    //constructor
    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String doStuff(){
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}
