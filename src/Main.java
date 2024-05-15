import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static final int CELLSIZE = 20;
    private static int width = 400;
    private static int height = 400;

    public Main(){

    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(width,height);
    }

    public static void main(String[] args){
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false); // 設定為false，使用者就無法調整大小
    }
}
