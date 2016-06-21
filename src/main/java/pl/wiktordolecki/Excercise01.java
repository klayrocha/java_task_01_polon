package pl.wiktordolecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a function that for an argument int n
 * returns a list of positive numbers lesser or equal to n which are divisible by 3 or 5.
 * List should be sorted in ascending order without repetitions.
 * For value 0 and all negative values of n return empty list.
 */
public class Excercise01
{
    /**
     * Your solution should be implemented in this method.
     * Corresponding test class contains few examples of correct input, output pairs.
     *
     * @param n Nonegative integer for inclusive upper bound of list contents
     * @return List object containing positive integers lesser or equal to n
     *         that are divisible by 3 or 5
     */
    public static List<Integer> divisibleBy3OR5(int n) {
    	if(n == 0 || n < 0) return Collections.emptyList();
    	// TODO I used Set to avoid repeat numbers, but I do not see the need, because there will be no repeated numbers
    	Set<Integer> listAdd = new HashSet<Integer>();
    	for (int i = 1; i <= n ; i++){
    		if((i % 3 == 0) ||  (i % 5 == 0)){
    			listAdd.add(i);
        	}	
    	}
    	List<Integer> listReturn = new ArrayList<Integer>(listAdd);
    	return listReturn;
    }

    /**
     * BONUS: List of divisors can be passed as additional parameter.
     */
    public static List<Integer> divisibleBy(int n, List<Integer> divisors) {
    	if((n == 0 || n < 0) || divisors == null) return Collections.emptyList();
    	// TODO I used Set to avoid repeat numbers, but I do not see the need, because there will be no repeated numbers
    	Set<Integer> listAdd = new HashSet<Integer>();
    	for (int i = 1; i <= n ; i++){
    		for (Integer div : divisors) {
    			if(div > 0 && (i % div == 0)){
        			listAdd.add(i);
        			break;
            	}
			}
    	}
    	List<Integer> listReturn = new ArrayList<Integer>(listAdd);
    	return listReturn;
    }
}
