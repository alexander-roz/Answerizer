import java.awt.*;

public class Main{

    public static void main(String[] args) {
        AnswerizerForm answerizerform = new AnswerizerForm();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int sizeWidth = 450;
        int sizeHeight = 650;
        int locationX = (screenSize.width - sizeWidth) / 2;
        int locationY = (screenSize.height - sizeHeight) / 2;
        answerizerform.setBounds(locationX, locationY, sizeWidth, sizeHeight);
        answerizerform.setVisible(true);

    }
}
