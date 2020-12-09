package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    
    
    // add more tests
    
    @After 
    public void afterTest(){
      // some steps to perform after tests are run
    }
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.count7(717),2);

    }
    @Test
    public void Test2(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.count7(7),1);
    
    }
    @Test
    public void Test3(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.count7(123),0);
    
    }
    @Test
    public void Test4(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.pairStar("hello"),"hel*lo");
    
    }
    @Test
    public void Test5(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.pairStar("xxyy"),"x*xy*y");
       }
       @Test
    public void Test6(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.pairStar("aaaa"),"a*a*a*a");
    
    }
     @Test
    public void Test7(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.stringClean("yyzzza"),"yza");
    
    }
     @Test
    public void Test8(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.stringClean("ssttaa"),"sta");
    
    }
     @Test
    public void Test9(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(Recursion.stringClean("yyyyyyeer"),"yer");
    
    }
}
