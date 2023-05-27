public class HotDrink {
    private int t = 50;
    private int volume;
    private String name;

    public HotDrink(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public int getT() {
        return t;
    }
}
