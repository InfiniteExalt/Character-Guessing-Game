public class Main {
    public static void main(String[] args) {
        LaunchPage launchPage = new LaunchPage();
    }
}


//LaunchPage.Java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("Start Game");
    LaunchPage(){

        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton){
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }

    }
}


//NewWindow.Java
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class NewWindow {
    JLabel label = new JLabel ("Hello");

    NewWindow(){
        JFrame frame= new JFrame();
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
