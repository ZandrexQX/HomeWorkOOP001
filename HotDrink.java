public class HotDrink implements Comparable <HotDrink> {
    private int temperature = 50;
    private int volume;
    private String name;

    private long price;

    public HotDrink(String name, int volume, long price){
        this.name = name;
        this.volume = volume;
        this.price = price;
    }
    public HotDrink(String name, int volume,long price, int temperature){
        this(name,volume, price);
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public int getTemperature() {
        return temperature;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nVolume: " + volume +
                "\ntemperature: " + temperature +
                "\nprice: " + price;
    }
    @Override
    public int compareTo(HotDrink o) {
        if (this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;
    }
}
