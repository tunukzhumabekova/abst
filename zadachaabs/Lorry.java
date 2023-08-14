package zadachaabs;

public class Lorry extends Car{
    public Lorry(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("this car works with gas");

    }

    @Override
    public void brake() {
        System.out.println("very high");

    }
}
