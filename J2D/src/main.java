import javax.swing.JFrame;

public class main 
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setResizable(true);
        window.setTitle("2D Java");

        Panel panel = new Panel();

        window.add(panel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
