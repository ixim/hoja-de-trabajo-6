/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojti carné: 12697
Luis Tello carne:13161

-----------------------------------------------------------------------------*/
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
        
        Set<String> desarrolladorJava = new HashSet<String>();
        Set<String> desarrolladorWeb = new HashSet<String>();
        Set<String> desarrolladorCel = new HashSet<String>();
        
        //paso la implementacion que utilizara cada objeto
        desarrolladorJava = sFactory.getSet(a);
        desarrolladorWeb = sFactory.getSet(a);
        desarrolladorCel = sFactory.getSet(a);
        
        do
        {
            System.out.println("Ingrese un nombre: ");
            a = entrada.nextLine();
            System.out.println("Selecione el conjunto a incluirlo: \n"
                    + "DJ - desarrolladores java\n"
                    + "DW - desarrolladores web\n"
                    + "DC - desarrolladores celulares");
            System.out.println("Si desea ingresarlo en varios conjunto, ingrese el nombre otra vez pero en otro conjunto");
            System.out.println("Procurar que exista un conjunto con mayoria de datos");
            String b = entrada.nextLine();
            
            if (b.equals("DJ"))// para desarrollador java
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
        
        System.out.println("DATOS  IMPORTANTES");
        //--------------------------------------------------------------------------------------------------
        System.out.println("1. Desarroladores con experiencia en Java, web y celulares: ");
        //se obtiene el tamaño de los conjuntos para comparrar los datos del mayor y 
        //verificar si esta en los otros conjuntos
        int cantJava = desarrolladorJava.size();
        int cantWeb = desarrolladorWeb.size();
        int cantCel = desarrolladorCel.size();
        int cantMayor = 0;
        
        if ((cantJava>cantWeb)&&(cantJava>cantCel))
            cantMayor = 1;//1 es para indicar que cantJava es mayor
        if ((cantWeb>cantJava)&&(cantWeb>cantCel))
            cantMayor = 2;//2 es para indicar que cantWeb es mayor
        if ((cantCel>cantJava)&&(cantCel>cantWeb))
            cantMayor = 3;//3 es para indicar que cantCel es el mayor
        
        if (cantMayor == 1)//si desarrollador Java es mayor
        {
            for (String nombre : desarrolladorJava) 
            {
                if (desarrolladorWeb.contains(nombre) && desarrolladorCel.contains(nombre))//se busca si esta en web y cel
                {
                        System.out.println(nombre);
                }
            }
        }
        if (cantMayor == 2)//si desarrollador web es mayor
        {
            for (String nombre : desarrolladorWeb) 
            {
                if (desarrolladorJava.contains(nombre) && desarrolladorCel.contains(nombre))//se busca si esta en java y cel
                {
                        System.out.println(nombre);
                }
            }
        }
        if (cantMayor == 3)//si desarrollador celular es mayor
        {
            for (String nombre : desarrolladorCel) 
            {
                if (desarrolladorJava.contains(nombre) && desarrolladorWeb.contains(nombre))//se busca si esta en java y web
                {
                        System.out.println(nombre);
                }
            }
        }
        //--------------------------------------------------------------------------------------------------
        System.out.println("2. Desarrolladores con experiencia en Java pero que no tenga experiencia en web:");
        for (String nombre : desarrolladorJava) 
            {
                if (!desarrolladorWeb.contains(nombre))//se busca si no esta en web
                {
                        System.out.println(nombre);
                }
            }
        //--------------------------------------------------------------------------------------------------
        System.out.println("3. Desarrolladores con experiencia en web y celulares, pero que no tengan experiencia en java:");
        for (String nombre : desarrolladorWeb)
            {
                if (desarrolladorCel.contains(nombre))//se busca que este en cel tambien
                {
                    if (!desarrolladorJava.contains(nombre))//se busca que no este en java
                    {
                        System.out.println(nombre);
                    }
                }
            }
        //--------------------------------------------------------------------------------------------------
        System.out.println("4. Desarrolladores con experiencia en web o celulares, pero que no tengan experiencia en java:");
        for (String nombre : desarrolladorWeb)//que este en web
            {
                if (!desarrolladorJava.contains(nombre))//se busca si no esta en java
                {
                    System.out.println(nombre);
                }
            }
        for (String nombre : desarrolladorCel)//que este en cel
            {
                if (!desarrolladorJava.contains(nombre))//se busca si no esta en java
                {
                    System.out.println(nombre);
                }
            }
        //--------------------------------------------------------------------------------------------------
        System.out.println("5. El conjunto de desarrolladores Java es un subconjunto de desarrolladores web:");
        System.out.println("Si");
        //--------------------------------------------------------------------------------------------------
        System.out.println("6. El conjunto de desarrolladores con mayor numero de datos es:");
        if (cantMayor==1)//si cantidad de desarrolladores de java es mayor
            System.out.println("Desarrolladores Java con Datos totales: "+cantJava);
            for (String nombre : desarrolladorJava)//que este en cel
            {
                System.out.println(nombre);
            }
        if (cantMayor==2)//si cantidad de desarrolladores web es mayor 
            System.out.println("Desarrolladores Java con Datos totales: "+cantWeb);
            for (String nombre : desarrolladorWeb)//que este en cel
            {
                System.out.println(nombre);
            }
        if (cantMayor==3)//si cantidad de desarrolladores de celular es mayor
            System.out.println("Desarrolladores Java con Datos totales: "+cantCel);
            for (String nombre : desarrolladorCel)//que este en cel
            {
                System.out.println(nombre);
            }
        //--------------------------------------------------------------------------------------------------
        System.out.println("7. El conjunto de desarrolladores con mayor numero de datos ordenados es:");

        if (cantMayor==1)//si cantidad de desarrolladores de java es mayor
            System.out.println("El conjunto es Java");
            Object[] javaArray1 = desarrolladorJava.toArray();
            
            Arrays.sort(javaArray1);
            
            for(Object s : javaArray1)
                System.out.print(s + " ");                              
            System.out.print("\n");
 
        if (cantMayor==2)//si cantidad de desarrolladores web es mayor 
            System.out.println("El conjunto es WEB");
            Object[] javaArray2 = desarrolladorWeb.toArray();
            
            Arrays.sort(javaArray2);
            
            for(Object s : javaArray2)
                System.out.print(s + " "); 
            System.out.print("\n");
        if (cantMayor==3)//si cantidad de desarrolladores celular es mayor 
            System.out.println("El conjunto es WEB");
            Object[] javaArray3 = desarrolladorWeb.toArray();
            
            Arrays.sort(javaArray3);
            
            for(Object s : javaArray3)
                System.out.print(s + " "); 
            System.out.print("\n");  
          
    }    
}
