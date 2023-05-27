import java.util.ArrayList;

public class HotDrinkMachine implements VendingMachine {
    private ArrayList<HotDrink> listDrink;

    public HotDrinkMachine(ArrayList<HotDrink> listDrink){
        this.listDrink = listDrink;
    }

    public ArrayList<HotDrink> getListDrink() {
        return listDrink;
    }

    public void setListDrink(ArrayList<HotDrink> listDrink) {
        this.listDrink = listDrink;
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name) {
        return VendingMachine.super.getProduct(name);
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name, int volume) {
        return VendingMachine.super.getProduct(name, volume);
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name, int volume, int t) {
        return VendingMachine.super.getProduct(name, volume, t);
    }
}
