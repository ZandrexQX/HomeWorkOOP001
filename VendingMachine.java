import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<HotDrink> getProduct(String name);
    ArrayList<HotDrink> getProduct(String name, int volume);
    ArrayList<HotDrink> getProduct(String name, int volume, int temperature);
}
