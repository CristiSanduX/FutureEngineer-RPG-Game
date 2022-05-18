package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Time extends SuperObject{
    public OBJ_Time() {
        name = "Time";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/time.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
