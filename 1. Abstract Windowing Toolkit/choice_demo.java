import java.applet.*;
import java.awt.*;

public class choice_demo extends Applet {
    public void init() {
        
        Choice ch1 = new Choice();
        Choice ch2 = new Choice();
        
        ch1.add("Pizza");
        ch1.add("Hot - Dog");
        ch1.add("Burger");
        ch1.add("Pastry");
        
        ch2.add("Breakfast");
        ch2.add("Lunch");
        ch2.add("Dinner");
        
        add(ch1);
        add(ch2);
        
    }
    
}
