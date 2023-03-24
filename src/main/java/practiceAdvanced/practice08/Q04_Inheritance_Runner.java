package practiceAdvanced.practice08;

public class Q04_Inheritance_Runner {


    public static void main(String[] args) {

        B obj1 = new B();
        System.out.println(obj1.i); // 1

        obj1.i = 0;
        System.out.println(obj1.i); // 0

        // A obj = new B();
        // System.out.println(obj.j); CTE verir.

        A obj2 = new A();
        System.out.println(obj2.i); // 1

        A objA = new A();
        objA.yazdir(); // 1

        A obj3 = new B();
        System.out.println(obj3.j); // 3
        obj3.yazdir(); // 5




    }

}
