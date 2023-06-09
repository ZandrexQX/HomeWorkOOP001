import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Tea tea1 = new Tea("Bruc", 100, 50);
        Tea tea2 = new Tea("Gold", 100, 55, 80);
        Tea tea3 = new Tea("Gold", 80,40, 50);
        Coffe coffe1 = new Coffe("Nesc", 100,70, 90);
        Coffe coffe2 = new Coffe("Nesc",80, 90);
        Coffe coffe3 = new Coffe("Mac", 60, 85);
        ArrayList<HotDrink> listDrink = new ArrayList<>(Arrays.asList
                                            (tea1,tea2,tea3,coffe1,coffe2,coffe3));

        HotDrinkMachine hdm = new HotDrinkMachine(listDrink);

        //System.out.println(hdm.getListDrink());
//        printProduct(hdm.getProduct("Gold"));
//        System.out.println("-----------------");
//        printProduct(hdm.getProduct("Gold",80));
//        System.out.println("-----------------");
//        printProduct(hdm.getProduct("Nesc",80));
//        System.out.println("-----------------");
//        printProduct(hdm.getProduct("Nesc"));
        printProduct(listDrink);
        System.out.println("Sorted:");
        printProduct(hdm.sortPriceDrink());

    }
    public static void printProduct(ArrayList<HotDrink> listDrink){
        System.out.println("Found: " + listDrink.size() + " hot drink");
        for (HotDrink hd:listDrink) {
            System.out.println(hd);
        }
    }
}
