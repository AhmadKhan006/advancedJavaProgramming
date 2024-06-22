import java.awt.*;
import java.applet.*;

public class Button_Demo extends Applet {
    public void init() {
        
        Button bt1 = new Button();
        Button bt2 = new Button("Click me");
        
        add(bt1);
        add(bt2);
                
    }
}
