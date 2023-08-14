
public class PracticaContadorDigitos {    
    public static void main(String[] args) {
     
        int num = 100;
        
        if (num > 0 && num <= 9999) {
        
        if (num < 10) {
           System.out.println(" El numero tiene 1 digito");
        }
        if (num >= 10 && num <= 99){
           System.out.println(" El numero tiene 2 digitos"); 
        }
        if (num >= 100 && num <= 999){
           System.out.println(" El numero tiene 3 digitos");
        }
        if (num >= 1000 && num <= 9999){
           System.out.println(" El numero tiene 4 digitos");
        }
        else {
           System.out.println("Introduce un numero positivo");
        }
    }
    
    }
}


