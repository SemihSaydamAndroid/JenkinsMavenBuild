package org.example;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * @author Semih Saydam
 * @version 0.0.1
 */
public class AppTest 
{
    @Test
    public void AddTest() {
        App app = new App();
        int number1 = 3;
        int number2 = 5;
        int addResult = app.Add(number1,number2);
        assertEquals
                ("This is not equal!",
                        10,addResult);
    }

    @Test
    public void mainTest(){
        App app = new App();
        app.main(new String[] {"arg1","arg2"});
    }
}
