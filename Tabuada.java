import java.util.Scanner;
public class Tabuada {
    
    public static void main (String[]Args) {
    
        Scanner entrada = new Scanner(System.in);
        
        int valor, i =1;
        
        valor= entrada.nextInt();
        
        while (i<=10) {
            
            System.out.println(valor* i);
            
            i++;
            
        }
    }
}    
        
        
        
        
        
    

