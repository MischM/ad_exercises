package ch.hslu.AD.SW04.CollisionHashTable;

/**
 * Übung: Hashbasierte Datenstrukturen, Performance, Thirdparty-Datenstrukturen (D3)
 * Aufgabe: Hashtabelle mit Kollisionen
 *
 * @author Fabian Gröger
 * @version 14.03.2018
 */
public interface HashTableInterface<T> {

    /**
     * Adds a new item to the hashtable
     *
     * @param item item with the hashcode
     * @return if it worked
     */
    boolean add(T item);

    /**
     * Removes a item the hashtable
     *
     * @param item item with the hashcode
     * @return if it worked
     */
    boolean remove(T item);

    /**
     * Searches if a item exists in the hashtable
     *
     * @param item the item with the hashcode that will be searched
     * @return if the hashcode exists
     */
    boolean contains(T item);

    /**
     * Searches if a item exists in the hashtable
     *
     * @param item the item with the hashcode that will be searched
     * @return index where the item is located
     */
    int search(T item);

    /**
     * Searches a item and returns its index
     *
     * @param item the item to search
     * @return the index of the item
     */
    int getIndex(T item);

    /**
     * Returns the size of the hashtable
     *
     * @return size of the hashtable
     */
    int size();

    /**
     * Checks if the hashtable is full with elements
     *
     * @return if the hashtable is full
     */
    boolean isFull();

    /**
     * Prints all the items in the hashtable
     */
    void print();
}
