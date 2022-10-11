import hu.petrik.autooop.Auto;
import hu.petrik.autooop.Porsche;
import hu.petrik.autooop.Tesla;

import javax.xml.transform.Templates;
import java.util.ArrayList;

public class Main {
    static ArrayList<Auto> autok = new ArrayList<>();
    public static void main(String[] args) {
        Porsche p1 = new Porsche(100);
        Tesla t1 = new Tesla();

        autok.add(p1);
        autok.add(t1);

        System.out.println(p1.toString());
        System.out.println(t1.toString());
    }
}