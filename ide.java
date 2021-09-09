package ide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class note extends KeyAdapter implements ActionListener
{
JPanel p;
String s;
static JFrame f;
static JTextArea ta;
JScrollPane jsp;
JMenuBar mb;
JMenu file,edit,format,font,color,style,size,r_c;
JMenuItem new1,new2,open,save,saveas,exit,cut,copy,paste,bold,italic,plain,te,tw,th,back,fore,run,compile;          //te=10,tw=20,th=30
note()
{
f=new JFrame("UNTITLED");
ta=new JTextArea();
jsp=new JScrollPane(ta);
mb=new JMenuBar();
file=new JMenu("FILE");
edit=new JMenu("EDIT");
format=new JMenu("FORMAT");
font=new JMenu("FONT");
color=new JMenu("COLOR");
style=new JMenu("STYLE");
size=new JMenu("SIZE");
r_c=new JMenu("R&C");
new1=new JMenuItem("NEW");
new2=new JMenuItem("OPEN ANOTHER FOLDER");
open=new JMenuItem("OPEN");
save=new JMenuItem("SAVE");
saveas=new JMenuItem("SAVEAS");
exit=new JMenuItem("EXIT");
cut=new JMenuItem("CUT");
copy=new JMenuItem("COPY");
paste=new JMenuItem("PASTE");
bold=new JMenuItem("BOLD");
italic=new JMenuItem("ITALIC");
plain=new JMenuItem("PLAIN");
te=new JMenuItem("10");
tw=new JMenuItem("20");
th=new JMenuItem("30");
back=new JMenuItem("BACK");
fore=new JMenuItem("FORE");
run=new JMenuItem("RUN");
compile=new JMenuItem("COMPILE");
p=new JPanel();

ide1 abcd1=new ide1();

f.setLayout(new BorderLayout());
p.setLayout(new BorderLayout());

file.add(new1);
file.add(new2);
file.add(open);
file.add(save);
file.add(saveas);
file.add(exit);
edit.add(cut);
edit.add(copy);
edit.add(paste);
color.add(back);
color.add(fore);
size.add(te);
size.add(tw);
size.add(th);
style.add(bold);
style.add(italic);
style.add(plain);
font.add(size);
font.add(style);
format.add(color);
format.add(font);
r_c.add(run);
r_c.add(compile);
mb.add(file);
mb.add(edit);
mb.add(format);
mb.add(r_c);

//f.setMenuBar(mb);
p.add(mb,BorderLayout.NORTH);
p.add(jsp);

f.add(ide1.p,BorderLayout.WEST);

f.add(p);

new1.addActionListener(this);
new2.addActionListener(this);
open.addActionListener(this);
save.addActionListener(this);
saveas.addActionListener(this);
exit.addActionListener(this);
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
bold.addActionListener(this);
italic.addActionListener(this);
plain.addActionListener(this);
te.addActionListener(this);
tw.addActionListener(this);
th.addActionListener(this);
back.addActionListener(this);
fore.addActionListener(this);
r_c.addActionListener(this);
run.addActionListener(this);
compile.addActionListener(this);
ta.addKeyListener(this);
f.setSize(1000,700);
f.setVisible(true);

}

public void keyReleased(KeyEvent e)
{

String j=f.getTitle();


if(e.getKeyChar()=='{')
{

if(j.charAt(0)=='*')
{
f.setTitle(j);
}

else
{
String c="*"+j;
f.setTitle(c);
}

ta.insert("\n\n}",ta.getSelectionStart());
}

else if(e.getKeyChar()=='[')
{

if(j.charAt(0)=='*')
{
f.setTitle(j);
}

else
{
String c="*"+j;
f.setTitle(c);
}

ta.insert("]",ta.getSelectionStart());
}

else if(e.getKeyChar()=='(')
{

if(j.charAt(0)=='*')
{
f.setTitle(j);
}

else
{
String c="*"+j;
f.setTitle(c);
}

ta.insert(")",ta.getSelectionStart());
}

}

public void keyPressed(KeyEvent e)
{

String j=f.getTitle();


if(e.getKeyCode()==17 || e.getKeyCode()==20 || e.getKeyCode()==16 || e.getKeyCode()==18 || e.getKeyCode()==33 || e.getKeyCode()==34 || e.getKeyCode()==37 || e.getKeyCode()==38 || e.getKeyCode()==39 || e.getKeyCode()==40 || e.getKeyCode()==44 || e.getKeyCode()==45 || e.getKeyCode()==92 || e.getKeyCode()==91 || e.getKeyCode()==93 || e.getKeyCode()==144 || e.getKeyCode()==145 || e.getKeyCode()==112 || e.getKeyCode()==113 || e.getKeyCode()==114 || e.getKeyCode()==115 || e.getKeyCode()==116 || e.getKeyCode()==117 || e.getKeyCode()==118 || e.getKeyCode()==119 || e.getKeyCode()==120 || e.getKeyCode()==121 || e.getKeyCode()==122 || e.getKeyCode()==123 || e.getKeyCode()==190 || e.getKeyCode()==27)
{
}

else if(e.isControlDown() && e.getKeyChar() != 'a' && e.getKeyCode()==65 || e.isControlDown() && e.getKeyChar() != 'c' && e.getKeyCode()==67)
{

}

else if(e.isControlDown() && e.getKeyChar() != 's' && e.getKeyCode()==83)
{
if(j.charAt(0)=='*')
{
j=j.substring(1);
}

try{
FileOutputStream f=new FileOutputStream(j);
String h=ta.getText();
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
}
f.close();
}
catch(IOException x)
{}
f.setTitle(j);

}

else if(e.isControlDown() && e.getKeyChar() != 'f' && e.getKeyCode()==70)
{
System.out.print("SELECT ALL2");


}

else
{

if(j.charAt(0)=='*')
{
f.setTitle(j);
}

else
{
String c="*"+j;
f.setTitle(c);
}
}

}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==new1)
{


String jcb=f.getTitle();

if(jcb.charAt(0)=='*')
{
JOptionPane.showMessageDialog(f,"Please save the file first!","Information Box",JOptionPane.INFORMATION_MESSAGE);
}

else
{

String z="",n="",ar="";

z=JOptionPane.showInputDialog("ENTER FILE NAME");

ArrayList<String> results=new ArrayList<String>();

ide1.storeValue(ide1.az,ide1.abc,ide1.azb,ide1.bac);

File[] files=new File(ide1.a).listFiles();

for(File file : files)
{
if(file.isFile())
{
results.add(file.getName());
}
}

//the below method is for string type array
//boolean contains=Arrays.stream(results).anyMatch(z);

if(results.contains(z))
{
JOptionPane.showMessageDialog(f,"File with this name already exists!","Information Box",JOptionPane.INFORMATION_MESSAGE);
}

else
{

try{

StringTokenizer st=new StringTokenizer(z,".");

while(st.hasMoreTokens())
{

n=st.nextToken();
ar=st.nextToken();
}
}catch(Exception ee)
{
ar="txt";
}

if(ar.equals("java"))
{
String h="public class "+n+"\n{\n public static void main(String ar[])\n{\n"+n+" ab=new "+n+"();\n}\n}";
ta.setText(h);
try{
FileOutputStream f=new FileOutputStream(z);
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
f.close();
}}
catch(IOException x)
{}
f.setTitle(z);
}

else
{
String h="";
try{
FileOutputStream f=new FileOutputStream(z);
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
}
f.close();
}
catch(IOException x)
{}
f.setTitle(z);
}

ide1.p2.remove(ide1.jsp);
ide1.abc(ide1.a,ide1.d);
ide1.refresh();
}

}

}

else if(e.getSource()==new2)
{
ide1 ide1111=new ide1();
ide1.refresh();
}

else if(e.getSource()==open)
{

String jcb=f.getTitle();

if(jcb.charAt(0)=='*')
{
JOptionPane.showMessageDialog(f,"Please save the file first!","Information Box",JOptionPane.INFORMATION_MESSAGE);
}

else
{

/*
ArrayList<String> results=new ArrayList<String>();

File[] files=new File(ab).listFiles();

for(File file : files)
{
if(file.isFile())
{
results.add(file.getName());
}
}
*/

JFileChooser jc=new JFileChooser();
jc.showOpenDialog(f);
   String a="";
   String b="";
   String c="";
   a=f.getTitle();
   try{
   FileInputStream fi=new FileInputStream(a);
   int j=0;
   while((j=fi.read())!=-1)
   {
   c=c+String.valueOf((char)j);
   }  
   }
   catch(IOException x)
    {
    }
   b=ta.getText();
  
   if(b.equals(c))
    {
   String s=(jc.getSelectedFile()).getName();
   String q="";
   try
   {
   FileInputStream fi=new FileInputStream(s);
   int i=0;
   f.setTitle(s);
   while((i=fi.read())!=-1)
    {
    q=q+String.valueOf((char)i);
    }
   }catch(IOException f)
   {
   }
   ta.setText(q); 
   }
  }  
}


else if(e.getSource()==save)
{

String j=f.getTitle();

if(j.charAt(0)=='*')
{
j=j.substring(1);
}

try{
FileOutputStream f=new FileOutputStream(j);
String h=ta.getText();
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
}
f.close();
}
catch(IOException x)
{}
f.setTitle(j);
}


else if(e.getSource()==saveas)
{
JFileChooser jc=new JFileChooser();
jc.showSaveDialog(f);
String j=(jc.getSelectedFile()).getName();
try{
FileOutputStream f=new FileOutputStream(j);
String h=ta.getText();
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
}
f.close();
}
catch(IOException x)
{}
f.setTitle(j);
}


else if(e.getSource()==exit)
{
System.exit(0);
}


else if(e.getSource()==cut)
{
s=ta.getSelectedText();
int i=ta.getSelectionStart();
int j=ta.getSelectionEnd();
ta.replaceRange("",i,j);
}
else if(e.getSource()==copy)
{
s=ta.getSelectedText();
}
else if(e.getSource()==paste)
{
ta.insert(s,ta.getSelectionStart());
}
else if(e.getSource()==bold)
{
Font f0=new Font("Arial",Font.BOLD,20);
ta.setFont(f0);
}
else if(e.getSource()==italic)
{
Font f0=new Font("Arabic",Font.ITALIC,20);
ta.setFont(f0);
}
else if(e.getSource()==plain)
{
Font f0=new Font("Normal",Font.PLAIN,20);
ta.setFont(f0);
}
else if(e.getSource()==te)
{
Font f0=new Font("Normal",Font.PLAIN,10);
ta.setFont(f0);
}
else if(e.getSource()==tw)
{
Font f0=new Font("Normal",Font.PLAIN,20);
ta.setFont(f0);
}
else if(e.getSource()==th)
{
Font f0=new Font("Normal",Font.PLAIN,30);
ta.setFont(f0);
}
else if(e.getSource()==back)
{
JColorChooser jc=new JColorChooser();
Color c=jc.showDialog(f,"BackColor",Color.RED);
ta.setBackground(c);
}
else if(e.getSource()==fore)
{
JColorChooser jc=new JColorChooser();
Color c=jc.showDialog(f,"ForeColor",Color.RED);
ta.setForeground(c);
}
else if(e.getSource()==run)
{
try
{
String z=f.getTitle();
StringTokenizer st=new StringTokenizer(z,".");
String n="";
while(st.hasMoreTokens())
{
n=st.nextToken();
String ar=st.nextToken();
}
Runtime rt=Runtime.getRuntime();
Process p=rt.exec("java "+n);
InputStream ir=p.getErrorStream();
int i=0,c=0;
String s="";
while((i=ir.read())!=-1)
{
c=c+1;
s=s+String.valueOf((char)i);
}
if(c!=0)
JOptionPane.showMessageDialog(f,s,"EXCEPTION OCCURED",JOptionPane.ERROR_MESSAGE);
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
}catch(Exception ee)
{
System.out.print("b2"+ee);
}
}
else if(e.getSource()==compile)
{
try
{
Runtime rt=Runtime.getRuntime();
Process p=rt.exec("javac "+f.getTitle());
InputStream ir=p.getErrorStream();
int i=0,c=0;
String s="";
while((i=ir.read())!=-1)
{
s=s+String.valueOf((char)i);
}
if(c==0)
ta.setText("SUCCESSFULLY COMPILED");
else
JOptionPane.showMessageDialog(f,s,"ERROR OCCURED",JOptionPane.ERROR_MESSAGE);
}catch(Exception ee)
{
System.out.print("b1"+ee);
}
}
}
public static void main(String ar[])
{
note n=new note();
}
}