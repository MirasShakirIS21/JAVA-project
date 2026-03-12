// Файл: Sinus.java
import java.awt.*;
import javax.swing.*;

public class Sinus extends JFrame {

    Sinus(String s) {
        super(s);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void paint(Graphics g) {z
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);

        // Рисуем координатную сетку
        for (int i = 0; i < 400; i += 20) {
            g.drawLine(i, 0, i, 400);
            g.drawLine(0, i, 400, i);
        }

        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 400);  // Ось Y
        g.drawLine(0, 200, 400, 200);  // Ось X

        g.setColor(Color.RED);
        for (int i = -180; i < 180; i++) {
            int x1 = 200 + i;
            int y1 = 200 - (int) (80 * Math.sin(Math.toRadians(i)));
            int x2 = 200 + i + 1;
            int y2 = 200 - (int) (80 * Math.sin(Math.toRadians(i + 1)));
            g.drawLine(x1, y1, x2, y2);
        }
    }
}