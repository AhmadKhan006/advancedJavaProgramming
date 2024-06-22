import java.awt.*;
import java.applet.*;

public class CheckboxButton extends Applet {
    public void init() {
        
        Checkbox ch1 = new Checkbox("Pizza");
        Checkbox ch2 = new Checkbox("Burger");
        
        Button btn = new Button("Submit");
        
        add(ch1);
        add(ch2);
        add(btn);
        
    }
}
