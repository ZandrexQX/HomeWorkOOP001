import java.util.ArrayList;

public interface VendingMachine {
    default ArrayList<HotDrink> getProduct(String name) {
        return null;
    }
    default ArrayList<HotDrink> getProduct(String name, int volume){
        return null;
    }
    default ArrayList<HotDrink> getProduct(String name, int volume, int t){
        return null;
    }
}
