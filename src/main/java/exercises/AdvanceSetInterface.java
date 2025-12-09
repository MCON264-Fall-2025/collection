package exercises;

import edu.touro.mcon264.apps.collections.CollectionInterface;

/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvanceSetInterface <T> extends CollectionInterface<T> {
/*
 Starter code the exercise 6
 Design signatures for the following methods:

    union()
    intersection()
    difference()b

   note: gotta include 2 sets in the signature
 */
    /**
     * Creates a new set that contains all elements from this set
     * and from the parameter set (no duplicates).
     *
     * @param other another set
     * @return a new set containing the union of both sets
     */
    AdvanceSetInterface<T> union(AdvanceSetInterface<T> other);

    /**
     * Creates a new set containing only elements found
     * in both this set and the parameter set.
     *
     * @param other another set
     * @return a new set containing the intersection of the sets
     */
    AdvanceSetInterface<T> intersection(AdvanceSetInterface<T> other);


    /**
     * Creates a new set containing elements in this set
     * that are NOT in the parameter set.
     *
     * @param other another set
     * @return a new set representing the difference (this - other)
     */
    AdvanceSetInterface<T> difference(AdvanceSetInterface<T> other);


}
