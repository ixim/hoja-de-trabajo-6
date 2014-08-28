
package Principal;

import java.util.Scanner;
public class java {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nombre con una identificacion: ");
        String a = entrada.nextLine();
        
        StackFactory<String> sFactory = new StackFactory<String>();
    }
    
}
