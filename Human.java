class HumanChar{
    int age;
    String name;
    static long population;  /* Static is used for those who are commonn to all the objects of the class or we can say they are independent to all the objects , like here population will be same for all the humans.*/
    /* Static varible are class variables and should be written using classes , and should not go with Instance variables like this.population , it will work fine but is not a good practice. */
    HumanChar(int age,String name) {
        this.age = age;
        this.name = name;
        HumanChar.population += 1;
    }
}
public class Human {

    static int a = 4;
    static int b;
    
    // runs only once when the first object of the class is instantiated.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        // HumanChar hum1= new HumanChar(12, "Alice");
        // HumanChar hum2= new HumanChar(14, "Bob");
        // System.out.println(HumanChar.population); // Correct way to do it.
        Human obj = new Human();

        System.out.println(Human.a+" "+Human.b);;
    }
}
