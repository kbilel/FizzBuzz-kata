package fr.softeam.fizzBuzzTest;
import org.junit.Assert;
import org.junit.Test;

import fr.softeam.kata.FizzBuzzServices;


public class FizzBuzzTest {
	
	
	  @Test
	    public void should_return_Buzz_when_number_is_dividable_by_5() {
	        Assert.assertEquals("Buzz", FizzBuzzServices.fizzBuzz(5));
	     
	    }

    @Test
    public void should_return_Fizz_when_number_is_dividable_by_3() {
        Assert.assertEquals("Fizz", FizzBuzzServices.fizzBuzz(3));
      
    }



    @Test
    public void should_return_FizzBuzz_when_number_is_dividable_by_3_and_15() {
        Assert.assertEquals("FizzBuzz", FizzBuzzServices.fizzBuzz(15));
  
  
    }

    @Test
    public void should_return_the_same_number_when_number_is_neither_divadable_by_3_5_or_15() {
        Assert.assertEquals("1", FizzBuzzServices.fizzBuzz(1));     
        Assert.assertEquals("7", FizzBuzzServices.fizzBuzz(7));
     
    }
}