public class Functii {
    //functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    //nu putem defini o f in alta f (nupot instala firefox in chrome)


    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }
    //o f simpla care saluta clientul in f de numele lui
    //nu ne da nici un raspuns (nu are return)
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    //o f simpla care calculeaza media a 3 numere
    // ne da nici un raspuns (-suma numerelor va avea return
    //ce tip de date va avea raspunsul ? 3+6 / 2 = 4.5 (double)
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c){
        double media = (a + b + c) / 3 ;
        return media;
    }
    //o f scare ne da valoarea lui pi
    // ne da nici un raspuns ? da
    //rasp va fi double
    // are nevoie de parametri? nu
    public static double piValue() {
        //constanta -variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static int lungimeNume(String nume, String prenume){
        int nume_complet = nume.length() + prenume.length();
        return nume_complet;

    }

    public static void main(String[] args) { //desktop
          //intra clientul 1
        printGreeting(); // se apeleaza f

        //intra cleintul 2
        printGreeting(); // CTRL + CLICK pe f => ne duce la corpul ei

        //apelam o functie cu parametri, oferind argumente
        printGreetingByName("Sinpetrean", "Andy");
        printGreetingByName("Sinpetrean", "Crina");
        printGreetingByName("Sinpetrean", "Ares");

        System.out.println(mediaNr(3, 3, 4));
        double media1 = mediaNr(3122, 5454,454);
        double media2 = mediaNr(45, 452,41);
        double media3 = mediaNr(456, 421,5);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());




        //tema: aria unui dreptunghi
        //aria cercului
        //suma a 2 numere
        //o f care returneaza cate caractere are nume + prenumele
        System.out.println("lungimea numelui este " + lungimeNume("Comsa", "Cristina"));
        String nume = "Cristina";
        System.out.println(nume.length());
    }
}
