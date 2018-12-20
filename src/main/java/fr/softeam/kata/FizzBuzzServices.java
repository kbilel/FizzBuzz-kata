package fr.softeam.kata;

import java.util.Optional;


public class FizzBuzzServices {

  
  
    public static String fizzBuzz(int num) {
        String result = Optional.of(num)
                .map(n -> (n % 3 == 0 ? "Fizz" : "") + (n % 5 == 0 ? "Buzz" : ""))
                .get();
        return result.isEmpty() ? Integer.toString(num) : result;
    }



}



