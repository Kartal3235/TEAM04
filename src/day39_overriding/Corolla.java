package day39_overriding;

public class Corolla extends Toyota{

    String hiz="Corolla max 200 km hız yaparlar";
    String yakit="Corolla benzinli veya elektriklidir";
    String model="Corolla";



    public void motor() {
        System.out.println("Corrolla araçlar cevreci motor kullanır");

    }
    public void yakitTüketimi(){
        System.out.println("Corolla 5,6 litre yakıt tüketir.");
    }
    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir.");
    }

    public static void main(String[] args) {


        /*

        Data turu ve constructor farklı olduğunda
        constructor calıştığı için constructorın olduğu
        class özelliklerini taşır.
        Data turu parent class secildiği için
        variablelar data turunun secildiği class ve onun parent classlarından değer alabilir


        ***Methodlar için ise yine data turunun olduğu class a gideriz
        ancak direk methodu çalıştırmadan önce method
        override edilmiş mi diye kontrol ederiz

         */

        Corolla arb1 = new Corolla();
        System.out.println(arb1.hareket);//araba
        System.out.println(arb1.hiz);//corolla
        System.out.println(arb1.yakit);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//toyota
        System.out.println(arb1.model);//
        arb1.motor();

        Toyota arb2 = new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//corolla
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//toyota
        //System.out.println(arb2.model);//CTE
        arb2.motor();//Corolla
        arb2.garanti();//toyota
        arb2.yakitTüketimi();//corolla


        Araba arb3 = new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hiz);//araba
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
        //System.out.println(arb3.sirketMerkezi);CTE
        //System.out.println(arb3.model);//CTE

    }
}
