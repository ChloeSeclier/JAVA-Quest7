public class Hangar {

    public static void main(String[] args) {
        Car clio = new Car("Clio",17000);
        Boat titanic = new Boat("titanic",450000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
