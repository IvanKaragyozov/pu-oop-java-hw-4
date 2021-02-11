package game;

import javax.swing.*;
import java.awt.*;

public class BoardTile extends JFrame {

    private final int row;
    private final int col;
    private final int tileSize;
    private final int tileX;
    private final int tileY;

    String RED    = "RED";
    String BLUE   = "BLUE";
    String GREEN  = "GREEN";
    String YELLOW = "YELLOW";


    public BoardTile(int row, int col){

        this.row        = row;
        this.col        = col;
        this.tileSize   = 100;

        this.tileX = this.col * this.tileSize;
        this.tileY = this.row * this.tileSize;

    }
    /**
     *   Sets every row and col
     */
    public void renderFirstRowAndCol(Graphics g) {

             if (this.row == 0 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 0 && this.col == 6) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 0 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }
    public void renderSecondRowAndCol(Graphics g) {

             if (this.row == 1 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 1 && this.col == 1) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 1 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 1 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 1 && this.col == 4) setTileColor(tileX, tileY, g, BLUE);
        else if (this.row == 1 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 1 && this.col == 6) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 1 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }
    public void renderThirdRowAndCol(Graphics g) {

             if (this.row == 2 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 5) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 2 && this.col == 6) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 2 && this.col == 7) setTileColor(tileX, tileY, g, BLUE);

    }
    public void renderFourthRowAndCol(Graphics g) {

             if (this.row == 3 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 3 && this.col == 1) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 3 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 3 && this.col == 3) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 3 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 3 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 3 && this.col == 6) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 3 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }

    public void renderFifthRowAndCol(Graphics g) {

             if (this.row == 4 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 4 && this.col == 6) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 4 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }
    public void renderSixthRowAndCol(Graphics g){

             if (this.row == 5 && this.col == 0) setTileColor(tileX, tileY, g, BLUE);
        else if (this.row == 5 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 5 && this.col == 2) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 5 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 5 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 5 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 5 && this.col == 6) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 5 && this.col == 7) setTileColor(tileX, tileY, g, BLUE);

    }

    public void renderSeventhRowAndCol(Graphics g){

             if (this.row == 6 && this.col == 0) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 4) setTileColor(tileX, tileY, g, BLUE);
        else if (this.row == 6 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 6) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 6 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }

    public void renderEightRowAndCol(Graphics g){

             if (this.row == 7 && this.col == 0) setTileColor(tileX, tileY, g, YELLOW);
        else if (this.row == 7 && this.col == 1) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 7 && this.col == 2) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 7 && this.col == 3) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 7 && this.col == 4) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 7 && this.col == 5) setTileColor(tileX, tileY, g, RED);
        else if (this.row == 7 && this.col == 6) setTileColor(tileX, tileY, g, GREEN);
        else if (this.row == 7 && this.col == 7) setTileColor(tileX, tileY, g, RED);

    }

    public void setTiles(Graphics g){

        renderFirstRowAndCol(g);
        renderSecondRowAndCol(g);
        renderThirdRowAndCol(g);
        renderFourthRowAndCol(g);
        renderFifthRowAndCol(g);
        renderSixthRowAndCol(g);
        renderSeventhRowAndCol(g);
        renderEightRowAndCol(g);

    }
    
    // Sets a color on every tile
    void setTileColor (int x, int y , Graphics g, String color){
        switch (color){
            case "RED" : g.setColor(Color.RED);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "BLUE" : g.setColor(Color.BLUE);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "GREEN" : g.setColor(Color.GREEN);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
            case "YELLOW" : g.setColor(Color.YELLOW);
                g.fillRect(x,y,this.tileSize, this.tileSize);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, this.tileSize, this.tileSize);
                break;
        }
    }
}
