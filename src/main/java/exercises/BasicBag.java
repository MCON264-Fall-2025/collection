package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;

import java.util.Iterator;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {
    /**
     * Returns a random element from the bag WITHOUT removing it.
     * If empty, returns null.
     */
    @Override
    public T grab() {
        if (isEmpty())
            return null;

        int r = (int)(Math.random() * numElements);
        numElements --;
        return elements[r];
    }


    /**
     * Counts how many times the target appears in the bag.
     */
    @Override
    public int count(T target) {
        int count = 0;

        for (int i = 0; i < numElements; i++) {
            if (elements[i].equals(target))
                count++;
        }

        return count;
    }

    /**
     * Removes ALL occurrences of the target.
     * Returns how many were removed.
     */
    @Override
    public int removeAll(T target) {
        int removed = 0;

        int i = 0;
        while (i < numElements) {
            if (elements[i].equals(target)) {
                // use inherited remove() (swaps last element into this spot)
                remove(target);
                removed++;
            } else {
                i++;
            }
        }
        return removed;
    }

    /**
     * Removes all elements from the bag.
     */
    @Override
    public void clear() {
        while (!isEmpty()) {
            remove(elements[numElements - 1]);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.

    // Which SOLID principles is being applied here?
    // LSP bc BasicBag cna be used anywhere ArrayCollection can
    // OCP bc were are extending usage without modification

}
