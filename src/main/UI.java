package main;

import java.awt.*;

public class UI {
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    public UI(GamePanel gp)
    {
        this.gp = gp;
        arial_40 = new Font("Arial",Font.PLAIN,40);
    }

    public void draw(Graphics2D g2)
    {
        this.g2 = g2;
        g2.setFont(arial_40);
        g2.setColor(Color.white);

      if (gp.gameState == gp.pauseState)
        {
            drawPauseScreen();
        }
    }
    public void drawPauseScreen()
    {
        int x,y;
        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,80F));
        String text = "PAUSED";
        x = getXFORCenteredText(text);
        y = gp.screenHeight/2;
        g2.drawString(text,x,y);
    }
    public int getXFORCenteredText(String text)
    {
        int x;
        int length = (int) g2.getFontMetrics().getStringBounds(text,g2).getWidth();
        x = gp.screenWidth/2 - length/2;
       return x;
    }
}
