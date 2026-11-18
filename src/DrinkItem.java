import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrinkItem extends JPanel {
    private String nama;
    private String harga;
    private ImageIcon gambar;

    public DrinkItem(String nama, String harga, String pathGambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = new ImageIcon(pathGambar);

        setLayout(new BorderLayout(5, 5));

        JLabel labelNama = new JLabel(nama, SwingConstants.CENTER);
        labelNama.setFont(new Font("Arial", Font.BOLD, 20));

        Image img = gambar.getImage();
        Image scaledImg = img.getScaledInstance(200, 180, Image.SCALE_SMOOTH);
        JLabel labelGambar = new JLabel(new ImageIcon(scaledImg));
        labelGambar.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelHarga = new JLabel(harga, SwingConstants.CENTER);
        labelHarga.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton buttonDetail = new JButton("DETAIL");
        buttonDetail.setPreferredSize(new Dimension(100, 30));
        buttonDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(
                        DrinkItem.this,
                        "Nama : " + nama + "\nHarga : " + harga,
                        "Detail Produk",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1, 5, 5));

        bottomPanel.add(labelHarga);
        bottomPanel.add(buttonDetail);

        add(labelNama, BorderLayout.NORTH);
        add(labelGambar, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}