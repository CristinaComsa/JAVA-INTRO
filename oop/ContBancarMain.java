package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        //desktop

        // initializam obiecte de tip Contbancar
        //instante ale clasei ConBancar

        ContBancar cont1 = new ContBancar("Andy S", "RO001");
        ContBancar cont2 = new ContBancar("Crina S", "RO002");
        System.out.println("Titular " + cont1.titularCont);

//        //apelam metoda descriere
//        cont1.descriere();
//        cont2.descriere();

        //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        //negative testing, cheltuim mai mult decat avem
        cont1.plataCardt(500); //corect nu, 300.5 = pass

        //positive cu suma exacta
        cont1.plataCardt(300.5); //da, 0 ==> pass

        //positive de 2x
        cont2.plataCardt(100);
        cont2.plataCardt(200);

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
