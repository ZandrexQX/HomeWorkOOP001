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

    public ArrayList<HotDrink> sortPriceDrink() {
        listDrink.sort(new PriceComparator());
        return listDrink;
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name) {
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name, int volume) {
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name && hd.getVolume()==volume){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }

    @Override
    public ArrayList<HotDrink> getProduct(String name, int volume, int temperature) {
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name && hd.getVolume()==volume && hd.getTemperature() == temperature){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }
}
