import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JButton addBtn = new JButton("+");
        JLabel result = new JLabel("Результат:");

        field1.setBounds(50, 50, 100, 30);
        field2.setBounds(200, 50, 100, 30);
        addBtn.setBounds(150, 100, 50, 30);
        result.setBounds(100, 150, 200, 30);

        addBtn.addActionListener(e -> {
            double a = Double.parseDouble(field1.getText());
            double b = Double.parseDouble(field2.getText());
            result.setText("Результат: " + (a + b));
        });

        frame.add(field1);
        frame.add(field2);
        frame.add(addBtn);
        frame.add(result);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}