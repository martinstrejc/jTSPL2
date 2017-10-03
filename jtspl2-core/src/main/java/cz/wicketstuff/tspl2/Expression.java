/**
 * 
 */
package cz.wicketstuff.tspl2;

/**
 * @author strma17
 *
 */
public class Expression implements IEvaluable {
    
    private final String value;

    public Expression(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public String toPrintString() {
        return value;
    }
    

}
