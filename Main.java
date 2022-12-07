public class Main {
    public static void main(String[] args) {
        LaunchPage launchPage = new LaunchPage();
    }
}
//-----------------------------
  import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;



public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLayeredPane layeredPane = new JLayeredPane();
    JButton myButton = new JButton("Start Game");



    LaunchPage() {


//image
        ImageIcon image = new ImageIcon("FinalVersion.png");
        label.setIcon(image);
        label.setBounds(100, 100,500,500); //set x,y position within frame as well as dimensions
//button
        myButton.setBounds(5000, 2500, 1500, 1500);
        myButton.setFocusable(false);
        myButton.addActionListener(this);
        myButton.setOpaque(true);
//layers
        layeredPane.setBounds(0,0,1500,1080);
        layeredPane.add(label, Integer.valueOf(0));
        layeredPane.add(myButton, Integer.valueOf(1));

        frame.add(layeredPane);
        frame.add(myButton);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1080);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setVisible(true);
        frame.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
//----------------------------------------------
  import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton1 = new JButton("Yes");
    JButton myButton2 = new JButton("No");
    JButton myButton3 = new JButton("Maybe");
    JButton myButton4 = new JButton("Don't Know");

    NewWindow(){

        myButton1.setBounds(100,160,200,40);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);

        frame.add(myButton1);

        myButton2.setBounds(300,160,200,40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);

        frame.add(myButton2);

        myButton3.setBounds(500,160,200,40);
        myButton3.setFocusable(false);
        myButton3.addActionListener(this);

        frame.add(myButton3);

        myButton4.setBounds(700,160,200,40);
        myButton4.setFocusable(false);
        myButton4.addActionListener(this);

        frame.add(myButton4);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton1){
            frame.dispose();
            new NewWindowTwo();
        }
        if(e.getSource()==myButton2){
            frame.dispose();
            new NewWindow();
        }
        if(e.getSource()==myButton3){
            frame.dispose();
            new NewWindow();
        }
        if(e.getSource()==myButton4){
            frame.dispose();
            new NewWindow();
        }

    }
}
//-------------------------------------------------
  import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowTwo implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton1 = new JButton("Yes");
    JButton myButton2 = new JButton("No");

    NewWindowTwo(){

        myButton1.setBounds(100,160,200,40);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);

        frame.add(myButton1);

        myButton2.setBounds(300,160,200,40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);

        frame.add(myButton2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== myButton1){
            frame.dispose();
            new NewWindowThree();
        }

        if(e.getSource()== myButton2){
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}
//----------------------------------------
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindowThree implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton1 = new JButton("Start Over");
    JButton myButton2 = new JButton("Exit");
    NewWindowThree(){

        myButton1.setBounds(100,160,200,40);
        myButton1.setFocusable(false);
        myButton1.addActionListener(this);

        frame.add(myButton1);

        myButton2.setBounds(300,160,200,40);
        myButton2.setFocusable(false);
        myButton2.addActionListener(this);

        frame.add(myButton2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton1){
            frame.dispose();
            LaunchPage launchPage = new LaunchPage();
        }
        if(e.getSource()==myButton2){
            frame.dispose();
           Exit();
        }

    }

    private void Exit() {
    }
}
