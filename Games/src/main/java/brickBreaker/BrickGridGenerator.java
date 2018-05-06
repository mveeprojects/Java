package brickBreaker;

import java.awt.*;

class BrickGridGenerator {

    private int[][] brickGrid;
    private int brickWidth;
    private int brickHeight;

    BrickGridGenerator(int rows, int columns) {
        brickGrid = new int[rows][columns];
        for (int i = 0; i < brickGrid.length; i++) {
            for (int j = 0; j < brickGrid[i].length; j++) {
                brickGrid[i][j] = 1;
            }
        }
        brickWidth = 540 / columns;
        brickHeight = 150 / rows;
    }

    void draw(Graphics2D graphics2D) {
        for (int i = 0; i < brickGrid.length; i++) {
            for (int j = 0; j < brickGrid[0].length; j++) {
                if(brickGrid[i][j] != 0){
                    graphics2D.setColor(Color.WHITE);
                    graphics2D.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    graphics2D.setStroke(new BasicStroke(3));
                    graphics2D.setColor(Color.BLACK);
                    graphics2D.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    void killBrick(int row, int column){
        brickGrid[row][column] = 0;
    }

    int[][] getBrickGrid() {
        return brickGrid;
    }

    int getBrickWidth() {
        return brickWidth;
    }

    int getBrickHeight() {
        return brickHeight;
    }
}