package ide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class ide2 extends KeyAdapter 
{

static JFrame f;
static JTextArea ta;

ide2()
{

String s1="C:\\Wndows\\System32\\cmd.exe"; 

f=new JFrame(s1);
ta=new JTextArea();
f.add(ta);

String s2="Microsoft Windows [Version 10.0.18363.778]\n(c) 2019 Microsoft Corporation. All rights reserved.\n\n";
//ta.setText(s2);
ta.insert(s2,ta.getSelectionStart());

ta.setBounds(0,0,1200,700);
f.setSize(1200,700);
f.setLayout(null);

f.setVisible(true);

ta.setBackground(Color.black);
ta.setForeground(Color.white);

ta.addKeyListener(this);

}

public void keyReleased(KeyEvent e)
{

if(e.getKeyCode()==13)
{
ta.insert("Some Message to be shown to user!",ta.getSelectionStart());
}

}

public static void main(String ar[])
{
ide2 aa=new ide2();
}

}