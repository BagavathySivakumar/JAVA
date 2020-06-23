import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.regex.*;
public class count extends Frame implements ActionListener
{
	int v=0;
	Panel p=new Panel();
    TextArea ta=new TextArea(20,50);
	TextField t1=new TextField(30);
	Button t2=new Button();
	public count()
	{
		p.setLayout(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label("enter your text:"));
		p.add(t1);
		add(p,BorderLayout.NORTH);
		add(t2,BorderLayout.SOUTH);
		add(ta,BorderLayout.CENTER);
		t2.addActionListener(this);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});}
	public void actionPerformed(ActionEvent ae)
	{
		
		ta.setText("");
		String str=t1.getText().toLowerCase();
		int k=str.length();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				v++;
			}
		}
	Pattern pa=Pattern.compile("[^a e i o u]");
	Matcher m1=pa.matcher(str);
	int count=0;
	while(m1.find())
	{
		count++;
	}
	ta.append(v+"\n");
	ta.append(count+"\n");
	ta.append((k-v+count)+"\n");
	}
	public static void main(String args[])
	{
		count co=new count();
		co.setTitle("count");
		co.setVisible(true);
		co.setSize(400,400);
	}
	}
