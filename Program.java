import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Tea tea1 = new Tea(Bruc, 100);
        Tea tea2 = new Tea(Gold, 100, 80);
        Tea tea3 = new Tea(Gold, 80, 50);
        Coffe coffe1 = new Coffe(Nesc, 100, 90);
        Coffe coffe2 = new Coffe(Nesc, 80);
        Coffe coffe3 = new Coffe(Mac, 60);
        ArrayList<HotDrink> listDrink = new ArrayList<>(Arrays.asList
                                            (tea1,tea2,tea3,coffe1,coffe2,coffe3));

        HotDrinkMachine hdm = new HotDrinkMachine(listDrink);

        System.out.println(hdm.getListDrink());
    }
}
