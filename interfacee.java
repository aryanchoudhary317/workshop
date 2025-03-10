interface A {
    public void show();
}
interface B {
    public void show();
}
class C implements A, B {
 
   public void show(){
         System.out.println("Hello");
   }
}
public class interfacee {
    public static void main(String[] args) {
        C ob=new C();
        ob.show();
     
    }
}