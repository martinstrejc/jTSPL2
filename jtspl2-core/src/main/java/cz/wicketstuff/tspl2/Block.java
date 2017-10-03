/**
 * 
 */
package cz.wicketstuff.tspl2;

/**
 * BLOCK x,y,width,height,"font",rotation,x-multiplication,y-multiplication,[space,]alignment,]"content"
 * 
 * @author strma17
 *
 */
public class Block implements IPrintableString {

    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final String font;
    private final int rotation;
    private final int multX;
    private final int multY;
    private final int space;
    private final int alignment;
    private final IEvaluable text;
    
    public Block(int x, int y, int width, int height, String font, int rotation, int multX, int multY, int space,
            int alignment, IEvaluable text) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.font = font;
        this.rotation = rotation;
        this.multX = multX;
        this.multY = multY;
        this.space = space;
        this.alignment = alignment;
        this.text = text;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public String getFont() {
        return font;
    }
    
    public int getRotation() {
        return rotation;
    }
    
    public int getMultX() {
        return multX;
    }
    
    public int getMultY() {
        return multY;
    }
    
    public int getSpace() {
        return space;
    }
    
    public int getAlignment() {
        return alignment;
    }
    
    public IEvaluable getText() {
        return text;
    }


    
    @Override
    public String toPrintString() {
        StringBuilder sb = new StringBuilder("BLOCK ");
        sb.append(x);
        sb.append(",");
        sb.append(y);
        sb.append(",");
        sb.append(width);
        sb.append(",");
        sb.append(height);
        sb.append(",");
        sb.append("\"");
        sb.append(font);
        sb.append("\"");
        sb.append(",");
        sb.append(rotation);
        sb.append(",");
        sb.append(multX);
        sb.append(",");
        sb.append(multY);
        sb.append(",");
        sb.append(space);
        sb.append(",");
        sb.append(alignment);
        sb.append(",");
        sb.append("\"");
        sb.append(text.toPrintString());
        sb.append("\"");
        return sb.toString();
    }
    
}
