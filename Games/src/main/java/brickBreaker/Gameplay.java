package brickBreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private Timer timer;
    private int delay = 5;
    private int playerX = 310;
    private int playerY = 550;
    private int ballPositionX = 120;
    private int ballPositionY = 350;
    private int ballXDirection = -1;
    private int ballYDirection = -2;
    private int ballDiameter = 20;
    private int paddleHeight = 8;
    private int paddleWidth = 100;
    private int playAreaHeight = 592;
    private int playAreaWidth = 692;
    private BrickGridGenerator brickGridGenerator;

    Gameplay() {
        brickGridGenerator = new BrickGridGenerator(3, 7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
        repaint();
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(1, 1, playAreaWidth, playAreaHeight);

        brickGridGenerator.draw((Graphics2D) graphics);

        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, playAreaWidth, 3);
        graphics.fillRect(playAreaWidth - 1, 0, 3, playAreaHeight);

        graphics.setColor(Color.ORANGE);
        graphics.setFont(new Font("serif", Font.BOLD, 25));
        graphics.drawString("Score: " + score, playAreaHeight - 30, 30);

        graphics.setColor(Color.GREEN);
        graphics.fillRect(playerX, playerY, paddleWidth, paddleHeight);

        graphics.setColor(Color.ORANGE);
        graphics.fillOval(ballPositionX, ballPositionY, ballDiameter, ballDiameter);

        if (ballPositionY > playAreaHeight - ballDiameter || totalBricks == 0) {
            gameOverMessage(graphics);
        }

        graphics.dispose();
    }

    private void gameOverMessage(Graphics graphics) {
        play = false;
        ballXDirection = 0;
        ballYDirection = 0;
        graphics.setColor(Color.RED);

        if (totalBricks == 0) {
            graphics.setFont(new Font("serif", Font.BOLD, 40));
            graphics.drawString("Congratulations", 190, 300);
            graphics.drawString("You killed all the bricks!", 190, 350);
            graphics.drawString("Press enter to play again", 190, 400);
        } else {
            graphics.setFont(new Font("serif", Font.BOLD, 40));
            graphics.drawString("Game over, score: " + score, 190, 300);
            graphics.drawString("Press enter to play again", 190, 350);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {

            if (new Rectangle(ballPositionX, ballPositionY, ballDiameter, ballDiameter).intersects(new Rectangle(playerX, playerY, paddleWidth, paddleHeight))) {
                ballYDirection = -ballYDirection;
            }

            calculateBrickCollision();
            calculateBallDirection();
            repaint();
        }
    }

    private void calculateBallDirection() {
        ballPositionX += ballXDirection;
        ballPositionY += ballYDirection;
        if (ballPositionX < 0) {
            ballXDirection = -ballXDirection;
        }
        if (ballPositionY < 0) {
            ballYDirection = -ballYDirection;
        }
        if (ballPositionX > playAreaWidth - ballDiameter) {
            ballXDirection = -ballXDirection;
        }
    }

    private void calculateBrickCollision() {
        for (int i = 0; i < brickGridGenerator.getBrickGrid().length; i++) {
            for (int j = 0; j < brickGridGenerator.getBrickGrid()[0].length; j++) {
                if (brickGridGenerator.getBrickGrid()[i][j] > 0) {
                    int brickX = j * brickGridGenerator.getBrickWidth() + 80;
                    int brickY = i * brickGridGenerator.getBrickHeight() + 50;
                    int brickWidth = brickGridGenerator.getBrickWidth();
                    int brickHeight = brickGridGenerator.getBrickHeight();

                    Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                    Rectangle ballRect = new Rectangle(ballPositionX, ballPositionY, ballDiameter, ballDiameter);

                    if (ballRect.intersects(brickRect)) {
                        brickGridGenerator.killBrick(i, j);
                        totalBricks--;
                        score += 5;
                        if (ballPositionX + 19 <= brickRect.x || ballPositionX + 1 >= brickRect.x + brickRect.width) {
                            ballXDirection = -ballXDirection;
                        } else {
                            ballYDirection = -ballYDirection;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER && !play) {
            resetGame();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                movePaddle("right");
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                movePaddle("left");
            }
        }
    }

    private void movePaddle(String direction) {
        play = true;
        if ("left".equals(direction)) {
            playerX -= 50;
        } else if ("right".equals(direction)) {
            playerX += 50;
        }
    }

    private void resetGame() {
        play = true;
        ballPositionX = 120;
        ballPositionY = 350;
        ballXDirection = -1;
        ballYDirection = -2;
        playerX = 310;
        score = 0;
        totalBricks = 21;
        brickGridGenerator = new BrickGridGenerator(3, 7);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}