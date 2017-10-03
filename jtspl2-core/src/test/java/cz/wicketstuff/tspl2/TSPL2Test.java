/**
 * 
 */
package cz.wicketstuff.tspl2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author strma17
 *
 */
public class TSPL2Test {

    /**
     * Test method for {@link cz.wicketstuff.tspl2.TSPL2#block(int, int, int, int, java.lang.String, int, int, int, int, int, java.lang.String)}.
     */
    @Test
    public void testBlock() {
        assertEquals(
        "BLOCK 15,15,790,90,\"0\",0,8,8,20,2,\"We stand behind our products with one of the most comprehensive support programs in the Auto-ID industry.\"",
        TSPL2.block(15, 15, 790, 90, "0", 0, 8, 8, 20, 2, "We stand behind our products with one of the most comprehensive support programs in the Auto-ID industry.")
                );
        
        
        
    }

}
