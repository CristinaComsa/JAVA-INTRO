import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala ALT + ENTER pentru a importa liste
        List<String> fructe = new ArrayList<>();
        //au o dimensiune dinamica

        //adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele
        System.out.println(fructe.get(0));

        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));

        // este lista goala?
        System.out.println(fructe.isEmpty());
//        eliminam toate elementele din lista
//        fructe.clear();
        //scoatem un element

        fructe.remove("mar");

        //aflam dimeniunea listei
        System.out.println(fructe.size());

        //listam element
        System.out.println(Arrays.toString(fructe.toArray()));


        if (!fructe.isEmpty()){ // daca NU este goala
            System.out.println("avem ce manca");
                    }else{
            System.out.println("nu avem ce manca");
        }

           //declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));

        //declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", " Poppy", "Catmint"};
        List<String> flowersList = new ArrayList<>(Arrays.asList(flowers));
        flowersList.add("Rose");
        System.out.println(Arrays.toString(flowersList.toArray()));
//
//        //aflam unde este Poopy
//        int poppy_index = flowersList.indexOf("Poppy");
//        //stergem ce este in acea pozitie
//        flowersList.remove(poppy_index);
//
//        //scoatem in f de valoare
//
//        flowersList.remove(o:"Catmint");
//        System.out.println(Arrays.toString(flowersList.toArray()));


    }
}
