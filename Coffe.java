public class Coffe extends HotDrink{
    private int temperature = 80;
    public Coffe(String name, int volume, long price) {
        super(name, volume, price);
    }
    public Coffe(String name, int volume, long price, int temperature) {
        super(name, volume, price, temperature);
    }

    @Override
    public String toString() {
        return "Coffe" + super.toString();
    }
}
