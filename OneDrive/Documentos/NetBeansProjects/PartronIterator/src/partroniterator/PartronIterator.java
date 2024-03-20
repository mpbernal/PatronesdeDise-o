/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partroniterator;

/**
 *
 * @author diego
 */
public class PartronIterator {

  public static void main(String[] args) {
        // Creamos una colección y agregamos algunos elementos
        MyCollection<Integer> collection = new MyCollection<>();
        collection.addElement(1);
        collection.addElement(2);
        collection.addElement(3);

        // Creamos un iterador y lo usamos para recorrer la colección
        IteratorInterface<Integer> iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
