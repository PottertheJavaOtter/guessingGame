package io.minlee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by minlee on 4/28/16.
 */
public class GuessingGameTest {

    @Test
    public void getComparisonOfValuesTest(){
        Game game = new Game();
        boolean expectedBool = true;
        boolean actualBool = game.checkIfConsecutiveInputsAreSame(1,1);
        Assert.assertEquals("The expected value should be "+actualBool, expectedBool, actualBool);

    }

    @Test
    public void getSecretNumberTest(){
        Game game = new Game();
        int testValue = -1;
        int actualNumber = game.getSecretNumber();
        Assert.assertTrue("The secret number should be great than "+testValue, actualNumber > testValue);
    }

    @Test
    public void checkIfConsecutiveInputsAreSameTest(){
        Game game = new Game();
        boolean expectedBool = true;
        boolean actualBool = game.checkIfConsecutiveInputsAreSame(1,1);
        Assert.assertEquals("The expected value should be "+actualBool, expectedBool, actualBool);
    }

}
