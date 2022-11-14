package Lambda;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

    JButton myButton1 = new JButton("My Button");
    JButton myButton2 = new JButton("My Button");

    MyFrame() {
        myButton1.setBounds(100, 100, 200, 100);
        myButton2.setBounds(100, 200, 200, 100);
        this.add(myButton1);
        this.add(myButton2);

        // //regular annonymous class approch
        // myButton.addActionListener(new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println("You clicked a button.");
        //     }
        // });

        //lambda approch
        myButton1.addActionListener(
                                    (e) -> System.out.println("This is first button.")
        );

        myButton2.addActionListener(
                                    (e) -> System.out.println("This is second button.")
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
