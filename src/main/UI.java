package main;

import java.awt.*;

public class UI {
    GamePanel gp;
    Graphics2D g2;
    Font arial_40;
    public int commandNum = 0;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;

    public UI(GamePanel gp)
    {
        this.gp = gp;
        arial_40 = new Font("Serif",Font.PLAIN,40);
    }

    public void showMessage(String text) {
        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2)
    {
        this.g2 = g2;
        g2.setFont(arial_40);
        g2.setColor(Color.white);

        if (gp.gameState == gp.titleState)
        {
            drawTitleScreen();
        }

      if (gp.gameState == gp.pauseState)
        {
            drawPauseScreen();
        }

      if (messageOn) {
          g2.drawString(message, gp.tileSize/2, gp.tileSize);

          messageCounter++;
          if (messageCounter > 50) {
              messageCounter = 0;
              messageOn=false;
          }
      }
    }

    public void drawTitleScreen()
    {
        String text;
        g2.setFont((g2.getFont().deriveFont(Font.ITALIC | Font.BOLD,50F)));   //Italic și Bold în același timp

        int x;
        int y;

        g2.setColor(Color.black);
        text = "FUTURE ENGINEER";
        x = 10;
        y = 50;
        g2.drawString(text,x,y);


        //MENU
        y=9*32;
        g2.setColor(Color.white);
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,40F));

        text = "NEW GAME";
        x = 25*32;
        y += gp.tileSize*4;
        g2.drawString(text,x,y);
        if (commandNum == 0) {
            g2.drawString(">",x- gp.tileSize, y);
        }

        text = "LOAD GAME";
        y += gp.tileSize*2;
        g2.drawString(text,x,y);
        if (commandNum == 1) {
            g2.drawString(">",x- gp.tileSize, y);
        }

        text = "QUIT";
        y += gp.tileSize*2;
        g2.drawString(text,x,y);
        if (commandNum == 2) {
            g2.drawString(">",x- gp.tileSize, y);
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
