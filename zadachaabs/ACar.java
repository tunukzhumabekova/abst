package zadachaabs;

public class ACar extends Car {

    public ACar(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("works with petrol");

    }

    @Override
    public void brake() {
        System.out.println("middle");

    }
}
