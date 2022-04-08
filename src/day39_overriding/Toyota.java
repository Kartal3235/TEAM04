package day39_overriding;

public class Toyota extends Araba{
     String hareket="Toyota araçlar max 220 km hız yaparlar.";

     String marka="Toyota";
     String sirketMerkezi="Japonya";


    public void motor() {
        System.out.println("Toyota arabalar toyota marka motor kullanır");

    }
    public void garanti(){
        System.out.println("Toyota araçlar 10 yıl garantilidir.");
    }
}
