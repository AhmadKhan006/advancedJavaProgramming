import java.awt.*;
import java.applet.*;

public class checkbox_demo extends Applet {
    public void init() {
        
        Checkbox chb1 = new Checkbox("Pizza");
        Checkbox chb2 = new Checkbox("Hot - Dog");
        Checkbox chb3 = new Checkbox("Burger");
        Checkbox chb4 = new Checkbox("Pastry");
        
        add(chb1);
        add(chb2);
        add(chb3);
        add(chb4);
        
    }
    
}
