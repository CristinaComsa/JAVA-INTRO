
/*
Operatori:
aritmetici: +, -, *, /, %
de comparare: <>, ==, !=, >=, <=
logici: &&, || , ! (not)
Flow control - if else
evalueaza conditii si bifurca codul in functie de rezultat
 */


public class Operatori {
    public static void main(String[]arg) {
        int a = 3;
        int b = 5;
        a = b;

        System.out.println(a != b); // 5 diferit de 5? => false
        System.out.println(7>b  && 3> b); ; // 7>5 si 3 >5 ?
        System.out.println(7>b && (8>b || 3> b)); // true && true
        System.out.println(!(7>b)); // 7>5 !true=>false



    }

}
