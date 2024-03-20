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
public class ListIterator<T> implements IteratorInterface<T> {
    private List<T> list;
    private int position;

    public ListIterator(List<T> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(position++);
        }
        return null;
    }
}
