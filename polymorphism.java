abstract class A{
    public void goodNight() {
        System.out.println("Good night from A");
    }
    public abstract void greet();
}
class B extends A{
    public void morning(){
        System.out.println("Morning from B");
    }
     public void greet(){
        System.out.println("B is greeting");
     }
}
public class polymorphism {
     public static void main(String[] args) {
        A ob = new B();
        ob.greet(); 
    }    
}
