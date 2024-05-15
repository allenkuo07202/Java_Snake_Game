import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static final int CELLSIZE = 20;
    private static int width = 400;
    private static int height = 400;
    public static int row = height / CELLSIZE;
    public static int column = width / CELLSIZE;
    private Snake snake;
    private Fruit fruit;

    public Main() {
        snake = new Snake();
        fruit = new Fruit();
    }

    @Override
    public void paintComponent(Graphics g) {
        // draw a black background
        g.fillRect(0, 0, width, height);
        snake.drawSnake(g);
        fruit.drawFruit(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false); // 設定為false，使用者就無法調整大小
    }
}
