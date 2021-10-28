package ide;
import javax.swing;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;

class FirstIde implements ActionListener
{
JPanel p;
String s;
static JTextArea ta;
static JFrame f;
JScrollPane jsp;
JMenuBar mb;
JMenu file,edit,format,font,color,style,size,r_c;
JMenuItem new1,new2,open,save,saveas,exit,cut,copy,paste,bold,italic,plain,te,tw,th,back,fore,run,compile,Open_Cmd;          //te=10,tw=20,th=30

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
Open_Cmd=new JMenuItem("OPEN_CMD");

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
r_c.add(Open_Cmd);
mb.add(file);
mb.add(edit);
mb.add(format);
mb.add(r_c);

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
Open_Cmd.addActionListener(this);

}

}