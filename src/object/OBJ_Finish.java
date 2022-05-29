package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Finish extends SuperObject{
    public OBJ_Finish() {
        name = "Finish";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
