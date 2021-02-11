package game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameBoard extends JFrame {

    /**
     *  Visualises a window with 800 by 800 pixels
     */

    public GameBoard() {
        this.setSize(800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    // Paints every tile
    public void paint(Graphics g){

        super.paint(g);

        for(int row = 0; row < 8; row++){
            for(int col = 0; col < 8; col++){

                BoardTile tile = new BoardTile(row, col);
                tile.setTiles(g);
            }
        }
    }

}
