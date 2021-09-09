package ide;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.StringTokenizer;
import java.util.*; //ArrayList;
import java.io.*;
import javax.swing.tree.*;
import javax.swing.event.*;     //TreeSelectionListener;

class ide1 extends DefaultTreeCellRenderer implements ActionListener , TreeSelectionListener
{
Frame f;
java.awt.List l1;
static JPanel p,p1,p2;
JLabel l;
JButton b1,b2,b3,b4,b5,b6,b7;
static JTree t;
static String image="",n="",ar="",z="",az="",abc="",azb="",a="",b="",c="",bac="",d="";      //ab="D:\\MY IDE",ac="MY IDE"
static DefaultMutableTreeNode ad=null,ad1=null;
static DefaultTreeCellRenderer renderer;
static JScrollPane jsp;

ide1()
{

f=new Frame("Choose a file to delete");

/*
DataInputStream d=new DataInputStream(in);
BufferedReader g=new BufferedReader(new InputStreamReader(in));
String s=br.readLine();
*/

l1=new java.awt.List();
p=new JPanel();
p1=new JPanel();
p2=new JPanel();
l=new JLabel("MY IDE");
ImageIcon ic1=new ImageIcon("C:\\Users\\archit\\Downloads\\NEW_FILE.jpg");
ImageIcon ic2=new ImageIcon("C:\\Users\\archit\\Downloads\\DELETE_ICON.jpg");
ImageIcon ic3=new ImageIcon("C:\\Users\\archit\\Downloads\\SAVE_ICON.jpg");
ImageIcon ic4=new ImageIcon("C:\\Users\\archit\\Downloads\\REFRESH.jpg");
ImageIcon ic5=new ImageIcon("C:\\Users\\archit\\Downloads\\OPEN_FOLDER.jpg");
b1=new JButton(ic1);
b1.setToolTipText("CREATE A NEW FILE");
b2=new JButton(ic2);
b2.setToolTipText("DELETE A FILE");
b3=new JButton(ic3);
b3.setToolTipText("SAVE THE FILE");
b4=new JButton("CONFIRM");
b5=new JButton("CANCEL");
b6=new JButton(ic4);
b6.setToolTipText("REFRESH");
b7=new JButton(ic5);
b7.setToolTipText("CREATE A NEW FOLDER");

f.setLayout(null);
p.setLayout(new BorderLayout());

l.setBounds(20,40,50,30);
l1.setBounds(20,40,260,400);
b1.setBounds(70,40,20,20);
b2.setBounds(150,40,20,20);
b3.setBounds(190,40,20,20);
b4.setBounds(40,460,100,20);
b5.setBounds(160,460,100,20);
b6.setBounds(230,40,20,20);
b7.setBounds(110,40,20,20);

p1.add(l);
p1.add(b1);
p1.add(b7);
p1.add(b2);
p1.add(b3);
p1.add(b6);

f.add(b4);
f.add(b5);
f.add(l1);
f.setSize(300,500);

path();

   String q="";
   try
   {
   FileInputStream fi=new FileInputStream(abc);
   int i=0;
   note.f.setTitle(azb);
   while((i=fi.read())!=-1)
    {
    q=q+String.valueOf((char)i);
    }
   }catch(IOException f)
   {
   }
   note.ta.setText(q); 

t=new JTree();

abc(az,bac);

/*
ImageIcon closed=new ImageIcon("C:\\Users\\archit\\Downloads\\FOLDER.jpg");
ImageIcon open=new ImageIcon("C:\\Users\\archit\\Downloads\\OPEN_FOLDER.jpg");

renderer.setClosedIcon(closed);
renderer.setOpenIcon(open);

t.setCellRenderer(renderer);
*/
//UIManager.put("t.closedIcon",closed);
//UIManager.put("t.openIcon",open);

p.add(p1,BorderLayout.NORTH);
p.add(p2);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
t.addTreeSelectionListener(this);

System.out.print("\n"+"hello"+az);
System.out.print("\n"+"hiii"+abc);

}

public static void path()
{

/*

It helps to only select the directories from JFileChooser
JFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

It helps to select both file and directories from JFileChooser
JFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

It helps to get the current directory
JFileChooser.getCurrentDirectory();

It helps to get the current selected file
JFileChooser.getSelectedFile();
*/

JFileChooser jc=new JFileChooser();
jc.setDialogTitle("Choose a file");
jc.showOpenDialog(note.f);
az=jc.getCurrentDirectory().toString();
abc=jc.getSelectedFile().toString();
azb=(jc.getSelectedFile()).getName();
bac=(jc.getCurrentDirectory()).getName();

storeValue(az,abc,azb,bac);

System.out.print("\n"+"hello"+az);
System.out.print("\n"+"tushar"+bac);
System.out.print("\n"+"hiii"+azb);

}

public static void storeValue(String az,String abc,String azb,String bac)
{

 a=az;
b=abc;
 c=azb;
d=bac;
}

public static void abc(String az,String bac)
{

renderer=(DefaultTreeCellRenderer) t.getCellRenderer();

ad=new DefaultMutableTreeNode(bac);

File folder=new File(az);
File[] listOfFiles=folder.listFiles();

for(int i=0;i<listOfFiles.length;i++)
{
if(listOfFiles[i].isFile())
{
//System.out.println("File "+listOfFiles[i].getName());
DefaultMutableTreeNode ae=new DefaultMutableTreeNode(listOfFiles[i].getName());

ar=listOfFiles[i].getName();
System.out.print("\n"+"my file name "+ar+"\n");
extension(ar);

ImageIcon leaf=new ImageIcon(image);
renderer.setLeafIcon(leaf);
//UIManager.put("t.leafIcon",leaf);
t.setCellRenderer(renderer);

ad.add(ae);

}
else if(listOfFiles[i].isDirectory())
{
//System.out.println("Directory "+listOfFiles[i].getName());
//DefaultMutableTreeNode am=new DefaultMutableTreeNode(listOfFiles[i].getName());
ad1=new DefaultMutableTreeNode(listOfFiles[i].getName());
//ad.add(new DefaultMutableTreeNode(listOfFiles[i].getName()));
bac=listOfFiles[i].getName();
az=az+"\\"+bac;
abc1(az,bac,ad1);
ad.add(ad1);
}
}
t=new JTree(ad);
jsp=new JScrollPane(t);
p2.add(jsp);

ImageIcon closed=new ImageIcon("C:\\Users\\archit\\Downloads\\FOLDER.jpg");
ImageIcon open=new ImageIcon("C:\\Users\\archit\\Downloads\\OPEN_FOLDER.jpg");

renderer.setClosedIcon(closed);
renderer.setOpenIcon(open);

t.setCellRenderer(renderer);
}

public static void abc1(String az,String bac,DefaultMutableTreeNode ad1)
{

File folder=new File(az);
File[] listOfFiles=folder.listFiles();

for(int j=0;j<listOfFiles.length;j++)
{
if(listOfFiles[j].isFile())
{
//System.out.println("File "+listOfFiles[j].getName());
DefaultMutableTreeNode ae=new DefaultMutableTreeNode(listOfFiles[j].getName());

ar=listOfFiles[j].getName();
extension(ar);

ImageIcon leaf=new ImageIcon(image);
renderer.setLeafIcon(leaf);
//UIManager.put("t.leafIcon",leaf);
t.setCellRenderer(renderer);

ad1.add(ae);

}
else if(listOfFiles[j].isDirectory())
{
System.out.println("Directory "+listOfFiles[j].getName());
//DefaultMutableTreeNode am=new DefaultMutableTreeNode(listOfFiles[j].getName());
bac=listOfFiles[j].getName();
DefaultMutableTreeNode am=new DefaultMutableTreeNode(bac);
//ad1.add(new DefaultMutableTreeNode(listOfFiles[j].getName()));
az=az+"\\"+azb;
abc1(az,bac,am);
ad1.add(am);
}
}

}

public static void extension(String ar)
{

try{

StringTokenizer st=new StringTokenizer(ar,".");

while(st.hasMoreTokens())
{

n=st.nextToken();
z=st.nextToken();
if(z.equals("java"))
{
image="C:\\Users\\archit\\Downloads\\Java.jpg";
}

else if(z.equals("py"))
{
image="C:\\Users\\archit\\Downloads\\PYTHON.jpg";
}

else if(z.equals("html") || z.equals("htm"))
{
image="C:\\Users\\archit\\Downloads\\HTML.jpg";
}

else if(z.equals("c"))
{
image="C:\\Users\\archit\\Downloads\\C.jpg";
}

else if(z.equals("cpp"))
{
image="C:\\Users\\archit\\Downloads\\CPP.jpg";
}

else if(z.equals("js"))
{
image="C:\\Users\\archit\\Downloads\\JAVASCRIPT.jpg";
}

else if(z.equals("txt") || z.equals("class"))
{
image="C:\\Users\\archit\\Downloads\\TXT.jpg";
}

else if(z.equals("docx"))
{
image="C:\\Users\\archit\\Downloads\\DOCX.png";
}

else if(z.equals("pdf"))
{
image="C:\\Users\\archit\\Downloads\\PDF.png";
}

else if(z.equals("css"))
{
image="C:\\Users\\archit\\Downloads\\CSS.jpg";
}

else if(z.equals("dbf"))
{
image="C:\\Users\\archit\\Downloads\\ORACLE.jpg";
}

else if(z.equals("sql"))
{
image="C:\\Users\\archit\\Downloads\\MYSQL.jpg";
}

else if(z.equals("kt") || z.equals("kts") || z.equals("ktm"))
{
image="C:\\Users\\archit\\Downloads\\KOTLIN.jpg";
}

else if(z.equals("gradle"))
{
image="C:\\Users\\archit\\Downloads\\ANDROID_STUDIO.jpg";
}

else if(z.equals("JSON"))
{
image="C:\\Users\\archit\\Downloads\\NODE.jpg";
}

}
System.out.print("n="+n+" z="+z);
}catch(Exception ee)
{
z="txt";
System.out.print(ee);
image="C:\\Users\\archit\\Downloads\\TXT.jpg";
}

}

public static void refresh()
{

p1.revalidate();
p1.repaint();

p2.revalidate();
p2.repaint();

}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{

String jcb=note.f.getTitle();

if(jcb.charAt(0)=='*')
{
JOptionPane.showMessageDialog(note.f,"Please save the file first!","Information Box",JOptionPane.INFORMATION_MESSAGE);
}

else
{

//	n="",ar="";

z=JOptionPane.showInputDialog("ENTER FILE NAME");

ArrayList<String> results=new ArrayList<String>();

storeValue(az,abc,azb,bac);

File[] files=new File(a).listFiles();

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
JOptionPane.showMessageDialog(note.f,"File with this name already exists!","Information Box",JOptionPane.INFORMATION_MESSAGE);
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
note.ta.setText(h);
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
note.f.setTitle(z);
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
note.f.setTitle(z);
}

p2.remove(jsp);
abc(az,bac);
refresh();
}

}
}


else if(e.getSource()==b3)
{

String j=note.f.getTitle();

if(j.charAt(0)=='*')
{
j=j.substring(1);
}

try{
FileOutputStream f=new FileOutputStream(j);
String h=note.ta.getText();
byte b[]=h.getBytes();
for(int i=0;i<b.length;i++)
{
f.write(b[i]);
}
f.close();
}
catch(IOException x)
{}
note.f.setTitle(j);

}

else if(e.getSource()==b2)
{

storeValue(az,abc,azb,bac);

File folder=new File(a);
File[] listOfFiles=folder.listFiles();

//DefaultListModel<String> nnn=new DefaultListModel<String>();

for(int j=0;j<listOfFiles.length;j++)
{
if(listOfFiles[j].isFile())
{
//nnn.addElement(listOfFiles[j].getName());

l1.add(listOfFiles[j].getName());

}
}
//l1=new List(nnn);
f.setVisible(true);
}

else if(e.getSource()==b4)
{
try
{

storeValue(az,abc,azb,bac);

//n=a+"\\"+l1.getSelectedValues();

n=a+"\\"+l1.getSelectedItem();

File files=new File(n);
if(files.delete())
{
JOptionPane.showMessageDialog(f,"File has been successfully deleted!","Confirmation Box",JOptionPane.INFORMATION_MESSAGE);
p2.remove(jsp);
abc(az,bac);
refresh();
}

else
{
JOptionPane.showMessageDialog(f,"Something went wrong!","Information Box",JOptionPane.ERROR_MESSAGE);
}

}catch(Exception ee)
{
System.out.print(ee);
}
l1.removeAll();
f.setVisible(false);
}

else if(e.getSource()==b5)
{
l1.removeAll();
f.setVisible(false);
}

else if(e.getSource()==b6)
{

refresh();

}

else if(e.getSource()==b7)
{

String s=JOptionPane.showInputDialog("ENTER FILE NAME");

storeValue(az,abc,azb,bac);

//Files.createDirectories(Paths.get(az+"\\"+s));

new File(az+"\\"+s).mkdirs();

}

}

public void valueChanged(TreeSelectionEvent e)
{

DefaultMutableTreeNode aaa= (DefaultMutableTreeNode) t.getLastSelectedPathComponent();
if(aaa== null)
{
return;
}

Object nodeInfo=aaa.getUserObject();
if(aaa.isLeaf())
{

String node= e.getNewLeadSelectionPath().getLastPathComponent().toString();

try
{

StringTokenizer st=new StringTokenizer(node,".");

while(st.hasMoreTokens())
{

n=st.nextToken();
ar=st.nextToken();
}
}catch(Exception ee)
{
ar="txt";
}
System.out.print(ar);
String[] check=new String[] {"java","txt","py","htm","html","css","js","JSON","sql","kt","kts","ktm","gradle","c","cpp","docx","dbf"};
ArrayList<String> ok=new ArrayList<String>(Arrays.asList(check));
if(ok.contains(ar))
{

storeValue(az,abc,azb,bac);

String jcb=note.f.getTitle();

if(jcb.charAt(0)=='*')
{
JOptionPane.showMessageDialog(note.f,"Please save the file first!","Information Box",JOptionPane.INFORMATION_MESSAGE);
}

else
{
   String q="";
   try
   {
   FileInputStream fi=new FileInputStream(az+"//"+node);
   int i=0;
   note.f.setTitle(node);
   while((i=fi.read())!=-1)
    {
    q=q+String.valueOf((char)i);
    }
   }catch(Exception f)
   {
       System.out.print(f);
   }
   note.ta.setText(q); 
  }  
}
else
{

JOptionPane.showMessageDialog(note.f,"The file format is not supported!","Error Box",JOptionPane.ERROR_MESSAGE);

}
}

else
{

}

/*
if(node.equals("abc.java"))
{

note.ta.setText("Hello");

}
*/

}

}