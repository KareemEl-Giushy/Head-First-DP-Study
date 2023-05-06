import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

class Main {
    JFrame frame;
    public static void main(String[] args) {
     Main m = new Main();
     m.go();   
    }

    public void go() {
        frame = new JFrame("What Should I Do ?");
        
        JButton button = new JButton("Should I Do It ?!");

        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        button.addActionListener(event -> System.out.println("This is a lambda Expression"));

        button.setBounds(0, 0, 500, 500);

        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}

class AngleListener implements ActionListener{

    public void actionPerformed(ActionEvent arg) {
        System.out.println("Don't Do it :(");
    }

}

class DevilListener implements ActionListener {
    

    public void actionPerformed(ActionEvent arg) {
        System.out.println("Do it >)");
    }

}