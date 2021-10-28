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
String s2,s3;

ide2()
{

String s1="C:\\Windows\\System32\\cmd.exe"; 

f=new JFrame(s1);
ta=new JTextArea();
f.add(ta);
ta.setCaretColor(Color.red);
//UIManager.put("ta.caretForeground",new ColorUIResource(Color.red));

Font f0=new Font("Normal",Font.PLAIN,20);
ta.setFont(f0);

s2="Lunatics [Version 1.0.00000.001]\n(c) 2021 Lunatics Corporation. All rights reserved.\n\n";
ide1.storeValue(ide1.az,ide1.abc,ide1.azb,ide1.bac);
s2=s2+ide1.a+">";
s3=ide1.a+">";
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
try{


String s1=ta.getText();
int a=s2.length();
s1=s1.substring(a);
Runtime rt=Runtime.getRuntime();
Process p=rt.exec(s1);
InputStream ir=p.getErrorStream();
int i=0,c=0;
String s="";
while((i=ir.read())!=-1)
{
c=c+1;
s=s+String.valueOf((char)i);
}
if(c!=0)
	JOptionPane.showMessageDialog(f,s,"EXCEPTION OR ERROR OCCURED",JOptionPane.ERROR_MESSAGE);
else
{
InputStream iir=p.getInputStream();
int ii=0;
String ss="";
while( (ii=iir.read())!=-1)
{
ss=ss+String.valueOf((char)i);
}
}

ta.insert(s,ta.getSelectionStart());
ta.insert(s3,ta.getSelectionStart());

}catch(Exception ee)
{
System.out.print(ee);
}

}

}

public static void main(String ar[])
{
ide2 aa=new ide2();
}

}