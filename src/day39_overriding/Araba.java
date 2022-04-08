package day39_overriding;

public class Araba {

    String hareket="Arabalar teker ile hareket eder.";
    String hiz="Arabalar motor gücüne göre hız yaparlar";
    String yakit="Arabalar farklı yakıtlar kulanabilir";
    String marka="Arabalar uretildikleri markaya sahiptir.";

    public void motor() {
        System.out.println("Arabalar farklı markalarda motor kullanırlar");

    }
    public void yakitTüketimi(){
        System.out.println("arabalar motor gucu ve yakıt turune göre yakıt tüketirler");
    }

}
