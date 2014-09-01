
package Principal;

import java.util.*;
public class java 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione una implementacion: "
                + "\nHS - HashSet"
                + "\nTS - TreeSet"
                + "\nLHS - LinkedHashSet");
        String a = entrada.nextLine();
        
        SetFactory<String> sFactory = new SetFactory<String>();
        
        //Set<String> conjuntoJava = new HashSet<String>();
        //Set<String> conjuntoWeb = new HashSet<String>();
        //Set<String> conjuntoCel = new HashSet<String>();
        
        //paso la implementacion que utilizara cada objeto
        Set<String> desarrolladorJava = sFactory.getSet(a);
        Set<String> desarrolladorWeb = sFactory.getSet(a);
        Set<String> desarrolladorCel = sFactory.getSet(a);
        
        do
        {
            System.out.println("Ingrese un nombre: ");
            a = entrada.nextLine();
            System.out.println("Selecione el conjunto a incluirlo: \n"
                    + "DS - desarrolladores java\n"
                    + "DW - desarrolladores web\n"
                    + "DC - desarrolladores celulares\n");
            String b = entrada.nextLine();
            
            if (b.equals("DS"))// para desarrollador java
            {
                if (desarrolladorJava.contains(a))
                {
                    System.out.println("El nombre "+a+" ya esta en el conjunto");
                }
                else
                {
                    desarrolladorJava.add(a);
                    System.out.println("El nombre "+a+" ha sido agregado");
                }
            }
            if (b.equals("DW"))// para desarrollador web
            {
                if (desarrolladorWeb.contains(a))
                {
                    System.out.println("El nombre "+a+" ya esta en el conjunto");
                }
                else
                {
                    desarrolladorWeb.add(a);
                    System.out.println("El nombre "+a+" ha sido agregado");
                }
            }
            if (b.equals("DC"))// para desarrollador celular
            {
                if (desarrolladorCel.contains(a))
                    System.out.println("El nombre "+a+" ya esta en el conjunto");
                else
                {
                    desarrolladorCel.add(a);
                    System.out.println("El nombre "+a+" ha sido agregado");
                }
            }
            
            System.out.println("Desea ingresar otro nombre: \nsi - no");
            a = entrada.nextLine();
        }
        while (a.equals("si"));
        System.out.println("NO SE INGRESARAN MAS NOMBRES");
        
        
        
    }
    
}
