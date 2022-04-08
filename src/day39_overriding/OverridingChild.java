package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*

        Bir obje oluşturulurken data turu ve Cons. aynı classdan seçilmişse
        Java direk o class a gider.
        hem variable hemde method için o class da varsa kullanır,
        yoksa o class in parentlerine bakar.

         */

        OverridingChild obj1= new OverridingChild();
        obj1.method1();// child class method1
        obj1.method2();// parent class method2

        /*
        Eğer data turu Parent, constructor Child class dan seçildiyse
        variablelarda yukarıdaki şekilde calışma devam eder.
        Ancak
        Methodlar için Data turunun olduğu class daki method Child class tarafından OVERRİDE
        edilmiş mi diye kontrol etmemiz gerelir.
         */

        OverridingParent obj2= new OverridingChild();
        obj2.method2();//parent class method2
        obj2.method1();//child class method1

        OverridingParent obj3= new OverridingParent();
        obj2.method2();//parent class method2
        obj2.method1();//Parent class method1

    }

}
