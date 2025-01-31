
public class Singleton {
   private int num;
    Singleton(int num) {
      this.num = 0;
      setters(num);
   }    
   public void setters(int num) {
    this.num = num;
   }
   public int getters() {
    return num;
   }
}
