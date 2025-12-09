package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;

import java.util.Iterator;


public class ExtendedLinkedCollection<T> extends LinkedCollection<T> {
    /**
     * Builds a textual representation of the collection by iterating through
     * each stored element. The format is:
     * [elem1, elem2, elem3]
     *
     * @return A string containing all elements in order, separated by commas.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Counts how many times a target element appears in the collection.
     *
     * @param target The element to look for.
     * @return The number of occurrences of {@code target} in the collection.
     */
    public int count(T target) {
      //ТОDO: implement this method. Count the number of times target appears in the collection. Create Javadoc.
        int occurrences = 0;
        Iterator<T> it = iterator();

        while (it.hasNext()) {
            T element = it.next();
            if ((target == null && element == null) ||
                    (target != null && target.equals(element))) {
                occurrences++;
            }
        }

        return occurrences;
    }
    /**
     * Removes all occurrences of {@code target} from the collection.
     *
     * @param target The element to remove.
     * @return The number of elements removed.
     */
    @Override
    public int removeAll(T target) {
        int removedCount = 0;

        // Keep removing target while it exists in the collection
        while (contains(target)) {
            remove(target);  // uses LinkedCollection's remove method
            removedCount++;
        }

        return removedCount;
    }

}
