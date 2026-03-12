// Файл: Graphic.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s) {
        super(s);

        setLayout(null);
        setSize(400, 300);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Button sin = new Button("Sin");
        sin.setBounds(5, 20, 100, 25);
        add(sin);

        Button cos = new Button("Cos");
        cos.setBounds(5, 70, 100, 25);
        add(cos);

        Button x2 = new Button("y = 3x²");
        x2.setBounds(5, 120, 100, 25);
        add(x2);

        Button linear = new Button("y = kx");
        linear.setBounds(5, 170, 100, 25);
        add(linear);

        sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new Sinus("График синуса");
            }
        });

        cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new Cosinus("График косинуса");
            }
        });

        x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new X2("График 3x²");
            }
        });

        linear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new Linear("Линейная функция");
            }
        });
    }

    public static void main(String[] args) {
        new Graphic("Построитель графиков");
    }
}