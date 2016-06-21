package pl.wiktordolecki;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static pl.wiktordolecki.Excercise03.fibonnaci;
import static pl.wiktordolecki.Excercise03.fibonnaci2;
import static pl.wiktordolecki.Excercise03.fibonnaci3;

import java.math.BigInteger;

import org.junit.Test;

public class Exercise03Test {
	
	@Test
	public void fibonnaciTest() throws Exception {

		BigInteger result = fibonnaci(11);
		assertThat(result, is(new BigInteger("89")));
	}
	
	
	@Test
	public void fibonnaci2Test() throws Exception {

		BigInteger result = fibonnaci2(11);
		assertThat(result, is(new BigInteger("89")));
	}
	
	@Test
	public void fibonnaci3Test() throws Exception {

		BigInteger result = fibonnaci3(11);
		assertThat(result, is(new BigInteger("89")));
	}

}
