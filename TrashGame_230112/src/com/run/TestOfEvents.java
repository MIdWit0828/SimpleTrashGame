package com.run;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestOfEvents implements KeyListener {

    public TestOfEvents(){
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        Label l = new Label();
        l.setText("This is a demonstration");
        frame.add(l);
        frame.setVisible(true);
        frame.addKeyListener(this);

    }

    public static void main(String[] args) {
        TestOfEvents te = new TestOfEvents();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("키 누름 확인됨");
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
