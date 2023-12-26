package jiin.chapter08_template_method.example;


import javax.swing.JFrame;
import java.awt.Graphics;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "Hello World!";
        graphics.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
