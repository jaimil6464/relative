abstract class shape {
 abstract void pi();
  
}
class rectangle extends shape() {


    void pi(){
        System.out.println(" rectangle pi");

}


}

class circle extends shape(){
    void pi(){
        System.out.println(" circle pi");
           
}
    
   
   
   }

public class abs {
    public static void main(String[] args) {
        
        rectangle obj = new rectangle();
        circle obj2 =new circle();
       
        obj.pi();
        obj2.pi();
    }
}
