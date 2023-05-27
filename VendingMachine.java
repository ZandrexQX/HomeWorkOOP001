import java.util.ArrayList;

public interface VendingMachine {
    ArrayList<HotDrink> listDrink = null;
    default ArrayList<HotDrink> getProduct(String name) {
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }
    default ArrayList<HotDrink> getProduct(String name, int volume){
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name && hd.getVolume()==volume){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }
    default ArrayList<HotDrink> getProduct(String name, int volume, int t){
        ArrayList<HotDrink> outDrink = new ArrayList<>();
        for (HotDrink hd: listDrink) {
            if (hd.getName()==name && hd.getVolume()==volume && hd.getT() == t){
                outDrink.add(hd);
            }
        }
        return outDrink;
    }
}
