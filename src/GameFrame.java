import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.add(new SnakeGame());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
