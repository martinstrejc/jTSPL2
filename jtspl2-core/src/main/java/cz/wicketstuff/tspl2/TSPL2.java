/**
 * 
 */
package cz.wicketstuff.tspl2;

/**
 * @author strma17
 *
 */
public class TSPL2 {

    // BLOCK x,y,width,height,"font",rotation,x-multiplication,y-multiplication,[space,]alignment,]"content"
    public static String block(int x, int y, int width, int height, String font, int rotation, int multX, int multY, int space,
            int alignment, String text) {
        return new Block(x, y, width, height, font, rotation, multX, multY, space, alignment, text).toPrintString();
    }

}
