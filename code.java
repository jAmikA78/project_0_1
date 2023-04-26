//don't forjet to change path of backgrounds

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main extends JFrame implements ActionListener {
    JFrame boy_frame = new JFrame();
    JFrame girl_frame = new JFrame();
    JButton boy = new JButton("ولد ");
    JButton girl = new JButton("بنت");
    JButton doos_boy_button = new JButton("دوس ياخايب");
    JButton doos_girl_button = new JButton("دوس ياقمر ");
    JButton back_boy_button = new JButton(" ارجع يخايب");
    JButton back_girl_button = new JButton(" ارجعي يا قمر");
    JLabel boy_label = new JLabel();
    JLabel girl_label = new JLabel();
    JTextField boy_textfield = new JTextField();
    JTextField girl_textfield = new JTextField();
    Font f = new Font("Arial", Font.BOLD, 32);

    Main() {
        //first frame\\
        setSize(1080, 720);
        boy.setBounds(250, 500, 200, 100);
        boy.setFont(f);
        add(boy);
        boy.addActionListener(this);
        girl.setBounds(650, 500, 200, 100);
        girl.setFont(f);
        add(girl);
        girl.addActionListener(this);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JLabel background;
        ImageIcon obj_II = new ImageIcon(
                "C:\\Users\\ASUS\\IdeaProjects\\F_trend\\src\\monkey-man-pointing-front_1.jpg"
        );
        background = new JLabel("", obj_II, JLabel.CENTER);
        background.setBounds(0, 0, 1080, 720);
        add(background);
        //boy slide
        boy_frame.setSize(1080, 720);
        boy_frame.setLayout(null);
        boy_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        boy_label.setBounds(15, 300, 300, 75);
        boy_label.setFont(f);
        boy_frame.add(boy_label);
        back_boy_button.setBounds(865, 593, 175, 75);
        back_boy_button.setFont(f);
        back_boy_button.addActionListener(this);
        boy_textfield.setBounds(15, 100, 300, 75);
        boy_textfield.setFont(f);
        boy_frame.add(boy_textfield);
        doos_boy_button.setBounds(65, 200, 200, 50);
        doos_boy_button.setFont(f);
        doos_boy_button.addActionListener(this);
        boy_frame.add(doos_boy_button);
        boy_frame.add(back_boy_button);
        JLabel background1;
        ImageIcon i1 = new ImageIcon(
                "C:\\Users\\ASUS\\IdeaProjects\\F_trend\\src\\monkey-man-pointing-front.jpg"
        );
        background1 = new JLabel("", i1, JLabel.CENTER);
        background1.setBounds(0, 0, 1080, 720);
        boy_frame.add(background1);
        boy_frame.setVisible(false);
        //girl slide
        JLabel background3;
        ImageIcon i3;
        i3 = new ImageIcon(
                "C:\\Users\\ASUS\\IdeaProjects\\F_trend\\src\\monkey-man-making-heart-with-his-hands.jpg"
        );
        background3 = new JLabel("", i3, JLabel.CENTER);
        background3.setBounds(0, 0, 1080, 720);
        girl_frame.setSize(1080, 720);
        girl_frame.setLayout(null);
        girl_frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        back_girl_button.setBounds(865, 593, 200, 75);
        back_girl_button.setFont(f);
        girl_frame.add(doos_girl_button);
        doos_girl_button.setBounds(65, 200, 200, 50);
        doos_girl_button.setFont(f);
        doos_girl_button.addActionListener(this);
        girl_frame.add(girl_textfield);
        girl_textfield.setBounds(15, 100, 300, 75);
        girl_textfield.setFont(f);
        girl_label.setBounds(15, 300, 300, 75);
        girl_label.setFont(f);
        girl_frame.add(girl_label);
        girl_frame.add(back_girl_button);
        back_girl_button.addActionListener(this);
        girl_frame.add(background3);
        girl_frame.setVisible(false);
    }
    static String fun(StringBuilder s) {
        s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
        int x = s.charAt(0) + 836;

        return x + "";
    }
    public static void main(String[] args) {
        Main obj = new Main();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boy) {
            setVisible(false);
            boy_frame.setVisible(true);
        } else if (e.getSource() == girl) {
            setVisible(false);
            girl_frame.setVisible(true);
        }
        if (e.getSource() == back_boy_button) {
            setVisible(true);
            boy_frame.setVisible(false);
        }
        if (e.getSource() == doos_boy_button) {
            String s = boy_textfield.getText();
            StringBuilder sb = new StringBuilder(s);
            String l = fun(sb);
            boy_label.setText("خد ياعم الرقم " + l);
            boy_textfield.setText("");
        }
        if (e.getSource() == back_girl_button) {
            setVisible(true);
            girl_frame.setVisible(false);
        }
        if (e.getSource() == doos_girl_button) {
            String k = girl_textfield.getText();
            StringBuilder sb = new StringBuilder(k);
            String w = fun(sb);
            girl_label.setText("خدي ياقمر " + w);
            girl_textfield.setText("");
        }
    }
}
