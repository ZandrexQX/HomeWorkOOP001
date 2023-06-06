public class Tea extends HotDrink{
    private int temperature = 70;

    public Tea(String name, int volume, long price) {
        super(name, volume, price);
    }
    public Tea(String name, int volume, long price, int temperature) {
        super(name, volume, price, temperature);
    }

    @Override
    public String toString() {
        return "Tea" + super.toString();
    }
}
