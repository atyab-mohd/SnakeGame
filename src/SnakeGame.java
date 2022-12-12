import javax.swing.*;

public class SnakeGame extends JFrame {
    private GameBoard board;
    public SnakeGame(){
        board = new GameBoard();
        add(board);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
//        setBounds(100, 100, 800, 500);
        setVisible(true);
    }
    public static void main(String[] args){
        SnakeGame snakegame = new SnakeGame();
    }

}
