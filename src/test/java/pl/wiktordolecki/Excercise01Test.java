package pl.wiktordolecki;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static pl.wiktordolecki.Excercise01.divisibleBy3OR5;
import static pl.wiktordolecki.Excercise01.divisibleBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Examples of expected behavior
 */
public class Excercise01Test
{
    @Test
    public void emptyList() {
        List<Integer> integers = divisibleBy3OR5(1);
        assertThat(integers, is(Collections.<Integer>emptyList()));
    }

    @Test
    public void listForN3() {
        List<Integer> integers = divisibleBy3OR5(3);
        assertThat(integers, contains(3));
    }

    @Test
    public void listForN5() {
        List<Integer> integers = divisibleBy3OR5(5);
        assertThat(integers, contains(3,5));
    }


    @Test
    public void listForN6() {
        List<Integer> integers = divisibleBy3OR5(6);
        assertThat(integers, contains(3,5,6));
    }
    
    @Test
    public void listForN3ListDivisor() {
    	List<Integer> divisors = new ArrayList<Integer>();
    	divisors.add(3);
    	divisors.add(5);
        List<Integer> integers =  divisibleBy(3,divisors);
        assertThat(integers, contains(3));
    }
    
    @Test
    public void listForN5ListDivisor() {
    	List<Integer> divisors = new ArrayList<Integer>();
    	divisors.add(3);
    	divisors.add(5);
        List<Integer> integers =  divisibleBy(5,divisors);
        assertThat(integers, contains(3,5));
    }
    
    @Test
    public void listForN6ListDivisor() {
    	List<Integer> divisors = new ArrayList<Integer>();
    	divisors.add(3);
    	divisors.add(5);
        List<Integer> integers =  divisibleBy(6,divisors);
        assertThat(integers, contains(3,5,6));
    }


}
