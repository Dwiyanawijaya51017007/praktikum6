package javaapplication1;

import javax.swing.*;
public class aplikasi1 {
    
public static void main (String[] args) {


Jframe f = new Jframe ("title");
    JPanel p = new JPanel();
    JButton  b = new JButton ("press me");

    p.add(b);
    f.setContetPane(p);

    f.show();
}
}