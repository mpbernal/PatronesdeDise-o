/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partroniterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author diego
 */
public class MyCollection<T> {
    private List<T> elements;

    public MyCollection() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    public IteratorInterface<T> createIterator() {
        return new ListIterator<>(elements);
    }
}