import java.util.*;
class Data {
    int rollNo;
    String name;
    double marks;
    Data(int rollNo,String name,double marks) {
       this.rollNo = rollNo;
       this.name = name;
       this.marks = marks;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        //  int[] nums = new int[5];

        //  String[] names = new String[5];
         Scanner sc = new Scanner(System.in);

         Data[] studentsdata = new Data[3];
        //  System.out.println(Arrays.toString(studentsdata)); // Prints Null
         for(int i = 0;i < 3; i++) {
            String name = sc.next();
            double marks = sc.nextDouble();
            int rollNo = sc.nextInt();
            studentsdata[i] = new Data(rollNo,name,marks);
         }

         for(int i = 0;i < 3;i++) {
            System.out.println(studentsdata[i].name);
         }
    }
}