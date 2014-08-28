/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojti carné: 12697
Luis Tello carne:13161

sFactory.java
-----------------------------------------------------------------------------*/

package Principal;

class sFactory<E> 
{

    public Stack<E> getStack(String entry) 
    {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("Java"))
		return new StackArrayList<E>(); //regresa ArrayList
	if (entry.equals("Web"))
		return new StackVector<E>(); //regresa Vector*/
	else
		return new StackVector<E>(); //regresa Vector
	}
}

