import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        setTitle("COFFE KENANGAN");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel header = new JPanel();
        header.setLayout(new GridLayout(2, 1));

        JLabel title = new JLabel("COFFE KENANGAN",SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel subtitle = new JLabel("DRINK ITEM",SwingConstants.CENTER);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 22));

        header.add(title);
        header.add(subtitle);

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(1, 3, 15, 15));

        DrinkItem coffee = new DrinkItem("COFFEE","Rp 20.000","images/coffee.jpg");
        DrinkItem tea = new DrinkItem("TEA","Rp 15.000","images/tea.jpg");
        DrinkItem matcha = new DrinkItem("MATCHA","Rp 18.000","images/matcha.jpg");

        productPanel.add(coffee);
        productPanel.add(tea);
        productPanel.add(matcha);

        add(header, BorderLayout.NORTH);
        add(productPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}