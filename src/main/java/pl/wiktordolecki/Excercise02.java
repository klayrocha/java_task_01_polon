package pl.wiktordolecki;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Using given bellow restricted list API write function that creates
 * NEW Reversed list from input list. Original list should not be altered.
 *
 * Limit used list operations only to given: head, tail, cons
 * and isEmpty() of java.util.List
 *
 * 1. using recursion
 * 2. without using recursion
 */
public class Excercise02<T> {

    /**
     * First element of a list
     */
    public static<T> T head(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return list.get(0);
        }
    }

    /**
     * All elements of a list except first
     */
    public static<T> List<T> tail(List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return list.subList(1, list.size());
        }
    }

    /**
     * Construct new list from element and given tail
     */
    @SuppressWarnings("unchecked")
	public static<T> List<T> cons(T elem, List<T> tail) {
    	// TODO I needed to change a line below, to avoid UnsupportedOperationException
        List<T> list =  new ArrayList<T>(asList(elem));
        list.addAll(tail);
        return list;
    }

    /**
     * Recursive implementation of list reversing
     *
     * @param list List to be reverted
     * @param <T> list type
     * @return Reverted contents of input list
     */
    public static<T> List<T> reverseRecursive(List<T> list) {
    	List<T> originalList = new ArrayList<T>(list);
        return methodRecursive(originalList,new ArrayList<T>());
    }
    
    private static <T> List<T> methodRecursive(List<T> originalList,List<T> revertedList){
    	T fisrt = head(originalList);
    	List<T> listaResultTail =  new ArrayList<T>(tail(originalList));
    	originalList = new ArrayList<T>(listaResultTail);
    	revertedList = cons(fisrt, revertedList);
    	if(listaResultTail.isEmpty()){
    		return revertedList;
    	}
    	return methodRecursive(originalList,revertedList);
    }

    /**
     * Non-Recursive implementation of list reversing
     *
     * @param list List to be reverted
     * @param <T> list type
     * @return Reverted contents of input list
     */
    public static<T> List<T> reverseNonRecursive(List<T> list) {
    	List<T> revertedList = new ArrayList<T>();
    	List<T> originalList = new ArrayList<T>(list);
    	List<T> listaResultTail = null;
    	do {
    		T fisrt = head(originalList);
			listaResultTail =  new ArrayList<T>(tail(originalList));
			originalList = new ArrayList<T>(listaResultTail);
			revertedList = cons(fisrt, revertedList);
		} while (!listaResultTail.isEmpty());
    	
        return revertedList;
    }
}
