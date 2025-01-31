public class InnerClasses {
    static class Test {
         static String name ;
         Test(String name) {
            Test.name = name;
         }
    }
    public static void main(String[] args) {
        Test a = new Test("Aman");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(a.name);
    }   
}
