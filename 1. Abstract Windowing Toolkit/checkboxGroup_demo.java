import java.awt.*;
import java.applet.*;

public class checkboxGroup_demo extends Applet {
    public void init() {
        
        CheckboxGroup chg = new CheckboxGroup();
        
        Checkbox chb1 = new Checkbox("Pizza", false, chg);
        Checkbox chb2 = new Checkbox("Hot - Dog", true, chg);
        Checkbox chb3 = new Checkbox("Burger", false, chg);
        Checkbox chb4 = new Checkbox("Pastry", false, chg);
        
        add(chb1);
        add(chb2);
        add(chb3);
        add(chb4);
        
    }
    
}
