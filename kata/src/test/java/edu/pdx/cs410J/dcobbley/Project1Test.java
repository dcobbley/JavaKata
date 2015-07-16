package edu.pdx.cs410J.dcobbley;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import edu.pdx.cs410J.InvokeMainTestCase;
import static junit.framework.Assert.assertEquals;

/**
 * Tests the functionality in the {@link Project1} main class.
 */
public class Project1Test extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link Project1} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( Project1.class, args );
    }

  /**
   * Tests that invoking the main method with no arguments issues an error
   */
  /*@Test
  public void testNoCommandLineArguments() {
    MainMethodResult result = invokeMain();
    assertEquals(new Integer(1), result.getExitCode());
    assertTrue(result.getErr().contains( "Missing command line arguments" ));
  }*/

    @Test
    public void TestForInversion(){
        MainMethodResult result = invokeMain();
        StringBuilder str = new StringBuilder("12345");
        StringBuilder rts =new StringBuilder(str.reverse());
        assertEquals(str.toString(), rts.toString());
    }

    @Test
    public void testForOne() {
        MainMethodResult result = invokeMain("1");
        assertEquals(result.getOut().trim(), "one");
    }

    @Test
    public void testForTen() {
        MainMethodResult result = invokeMain("10");
        assertEquals(result.getOut().trim(), "ten");
    }


}