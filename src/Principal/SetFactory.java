/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojti carné: 12697
Luis Tello carne:13161

sFactory.java
-----------------------------------------------------------------------------*/

package Principal;
import java.util.*;
class SetFactory<E> 
{

    public Set<E> getSet(String entry) 
    {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("HS"))
		return new HashSet<E>(); //regresa HashSet
	if (entry.equals("TS"))
		return new TreeSet<E>(); //regresa TreeSet
	else
		return new LinkedHashSet<E>(); //regresa LinkedHashSet
	}
}

