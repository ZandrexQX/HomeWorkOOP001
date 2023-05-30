public class Tea extends HotDrink{
    private int t = 70;

    public Tea(String name, int volume) {
        super(name, volume);
    }
    public Tea(String name, int volume, int t) {
        super(name, volume, t);
    }

    @Override
    public String toString() {
        return "Tea" + super.toString();
    }
}
