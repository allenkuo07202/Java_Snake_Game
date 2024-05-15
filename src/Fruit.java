import java.awt.*;

public class Fruit {
    private int x;
    private int y;

    public Fruit() {
        this.x = (int) (Math.floor(Math.random() * Main.column) * Main.CELLSIZE);
        this.y = (int) (Math.floor(Math.random() * Main.row) * Main.CELLSIZE);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void drawFruit(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(this.x, this.y, Main.CELLSIZE, Main.CELLSIZE);
    }
}
