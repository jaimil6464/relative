interface Bank{
    public float get_Rate_Of_Interest();
}
class SBI implements Bank{
    public float get_Rate_Of_Interest(){
        return 7.2;


    }
}
class BOB implements Bank{
    public float get_Rate_Of_Interest(){
         return 6.0;

    }
}
public class Inter {
    public static void main(String[] args) {
        Bank obj1 = new SBI();
        Bank obj2 = new BOB();


        System.out.println("SBI :-"+obj1.get_Rate_Of_Interest());
        System.out.println("BOB :-"+obj2.get_Rate_Of_Interest());

            
        }
    }
    

