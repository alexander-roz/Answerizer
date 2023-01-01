import javax.swing.*;
import java.awt.event.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AnswerizerForm extends JDialog {
    private JPanel contentPane;
    private JTextArea TextArea;
    private JTextField inputTextField;
    private JTextArea outputTextArea;
    private JLabel animationLabel;
    private JButton button;

    public AnswerizerForm() {
        setContentPane(contentPane);
        setModal(true);
        contentPane.setVisible(true);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        button.addActionListener(e -> {
            try (Scanner scanner = new Scanner(inputTextField.getText())) {
                String output = scanner.nextLine();
                String answer = Prediction.getPrediction();
                String outputText = ("Мой ответ на вопрос \"" + output + "\" : \n" + answer);
                outputTextArea.setText(outputText);
            } catch (NoSuchElementException exception) {
                JOptionPane.showMessageDialog(contentPane, "Нет вопроса - нет ответа", "ОШИБКА", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
