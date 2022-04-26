import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame frame;

    public MainFrame(){
        initialize();
    }
    private void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");//tytuł okienka aplikacji
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//co ma się stać po kliknięciu na krzyżyk - DISPOSE zamyka całą aplikację
        this.frame.setSize(800,500);
        this.frame.setLocationRelativeTo(null);//okno wyświetli się na środku ekranu
        this.frame.setResizable(false);//okienko nie zmieni swojego rozmiaru

        JPanel panel = new JPanel();//panel to kontener dla innych kontenerów
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//layout menager, CENTER mówi o tym jak mają być wyśrodkowane elementy wewnątrz głownego kontenera JPanel
        panel.setBackground(Color.RED);
        Button button = new Button("Przycisk");
        panel.add(button);
        //panel.setPreferredSize(new Dimension(250,250));
        frame.add(panel,BorderLayout.CENTER);//gdzie dodać JPanel

        this.frame.setVisible(true);
    }
}
