package ide;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

class FirstIde implements ActionListener
{

//Initializing variables for objects
JFrame f;
JButton bopen_folder,learn_more;
JMenuBar mb;
JMenu file,edit,format,font,color,style,size,run_compile_cmd;
JMenuItem new_file,open_folder,open_file,save,saveas,exit,cut,copy,paste,bold,italic,plain,font_10,font_20,font_30,background,foreground,run,compile,Open_Cmd;
JLabel name_directory,no_directory,about_us;
Connection co;
PreparedStatement st;
ResultSet rs;

//constructor
FirstIde()
{

//Creating the connection with database
try{

Class.forName("com.mysql.jdbc.Driver");
co=DriverManager.getConnection("jdbc:mysql://localhost:3306/ide","root",null);

}catch(Exception e)
{
System.out.print("Connection "+e);
}

f=new JFrame("UNTITLED");

mb=new JMenuBar();

//Left Side Work
name_directory=new JLabel("NO FOLDER OPENDED");
no_directory=new JLabel("You have not opened any folder");
about_us=new JLabel("To learn about how to use our IDE");
learn_more=new JButton("Learn more");
bopen_folder=new JButton("OPEN FOLDER");
bopen_folder.setToolTipText("A folder will be open which you will select");

//Providing memory to JMenu
file=new JMenu("FILE");
edit=new JMenu("EDIT");
format=new JMenu("FORMAT");
font=new JMenu("FONT");
color=new JMenu("COLOR");
style=new JMenu("STYLE");
size=new JMenu("SIZE");
run_compile_cmd=new JMenu("R&C");

//Providing memory to JMenuItem
new_file=new JMenuItem("NEW FILE");
open_folder=new JMenuItem("OPEN FOLDER");
open_file=new JMenuItem("OPEN FILE");
save=new JMenuItem("SAVE");
saveas=new JMenuItem("SAVEAS");
exit=new JMenuItem("EXIT");
cut=new JMenuItem("CUT");
copy=new JMenuItem("COPY");
paste=new JMenuItem("PASTE");
bold=new JMenuItem("BOLD");
italic=new JMenuItem("ITALIC");
plain=new JMenuItem("PLAIN");
font_10=new JMenuItem("10");
font_20=new JMenuItem("20");
font_30=new JMenuItem("30");
background=new JMenuItem("BACKGROUND COLOR");
foreground=new JMenuItem("FOREGROUND COLOR");
run=new JMenuItem("RUN");
compile=new JMenuItem("COMPILE");
Open_Cmd=new JMenuItem("OPEN_CMD");

f.setLayout(null);

//Setting the menubar
file.add(new_file);
file.add(open_folder);
file.add(open_file);
file.add(save);
file.add(saveas);
file.add(exit);
edit.add(cut);
edit.add(copy);
edit.add(paste);
color.add(background);
color.add(foreground);
size.add(font_10);
size.add(font_20);
size.add(font_30);
style.add(bold);
style.add(italic);
style.add(plain);
font.add(size);
font.add(style);
format.add(color);
format.add(font);
run_compile_cmd.add(run);
run_compile_cmd.add(compile);
run_compile_cmd.add(Open_Cmd);
mb.add(file);
mb.add(edit);
mb.add(format);
mb.add(run_compile_cmd);

//Adding Action Listeners
new_file.addActionListener(this);
open_folder.addActionListener(this);
open_file.addActionListener(this);
save.addActionListener(this);
saveas.addActionListener(this);
exit.addActionListener(this);
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
bold.addActionListener(this);
italic.addActionListener(this);
plain.addActionListener(this);
font_10.addActionListener(this);
font_20.addActionListener(this);
font_30.addActionListener(this);
background.addActionListener(this);
foreground.addActionListener(this);
run_compile_cmd.addActionListener(this);
run.addActionListener(this);
compile.addActionListener(this);
Open_Cmd.addActionListener(this);
bopen_folder.addActionListener(this);
learn_more.addActionListener(this);

//Adding left side work in the frame
f.add(name_directory);
f.add(no_directory);
f.add(about_us);
f.add(bopen_folder);
f.add(learn_more);

f.setJMenuBar(mb);


//To get the full screen display
Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
int width=(int)size.getWidth();
int height=(int)size.getHeight();
System.out.println("\n\nWidth :- "+width+"\nHeight :- "+height+"\n\n");

f.setSize(width,height);
f.setVisible(true);


//Giving the position to the elements
name_directory.setBounds(20,40,190,40);
no_directory.setBounds(20,100,190,30);
bopen_folder.setBounds(30,140,130,30);
about_us.setBounds(20,180,200,10);
learn_more.setBounds(30,220,100,20);

}

//Giving code to the left side buttons
public void actionPerformed(ActionEvent e)
{

}

//Main function
public static void main(String []ar)
{
FirstIde f1=new FirstIde();
}
}