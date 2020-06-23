import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class excercise extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4,l5,l6,l7;
	Button b1,b2;
	CheckboxGroup cbg;
	List li1;
	TextArea ta;
	Choice cc1;
	public excercise()
	{
		
		
	    Label l=new Label("HELLO WELCOME TO REGISTERATION OF SUBJECTS");
	    TextField t1=new TextField(10);
		TextField t2=new TextField(10);
		TextField t3=new TextField(10);
		Label l1=new Label("NAME:");
		Label l2=new Label("PASSWORD:");
		Label l3=new Label("RE-ENTERPASSWORD:");
		Label l4=new Label("SUBJECTS:");
		Label l5=new Label("GENDER:");
		Label l6=new Label("YEAR:");
		Label l7=new Label("RESULT:");
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox c1=new Checkbox("MALE",cbg,false);
		Checkbox c2=new Checkbox("FEMALE",cbg,false);
		List li1=new List(4,true);
		TextArea ta=new TextArea(7,50);
		Choice cc1=new Choice();
		Button b1=new Button("validate");
		Button b2=new Button("clear");
		setLayout(new FlowLayout());
			add(l);
			add(l1);add(t1);
			add(l2);
			t2.setEchoChar('.');
			add(t2);
			add(l3);
			t3.setEchoChar('.');
			add(t3);
			add(l4);
			li1.addItem("OOPS");
			li1.addItem("JAVA");
			li1.addItem("C");
			li1.addItem("C++");
			add(li1);
			add(l5);
			add(c1);
			add(c2);
			cc1.add("1st year");
			cc1.add("2st year");
			cc1.add("3st year");
			cc1.add("4st year");
			add(cc1);
			add(b1);
			add(b2);
			add(l7);
			add(ta);
			b1.addActionListener(this);
			b2.addActionListener(this);
			addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){System.exit(0);}});

	}
		public void actionPerformed(ActionEvent ae)
		{
			String trap=ae.getActionCommand();
			if(trap.equals("validate"))
			{
				if(t1.getText().equals("")||t1.getText().equals(" "))
				{
					ta.append("enter your name\n");
				}
				else
				{
					ta.append("Name:\t\t"+t1.getText()+"\n");
				}
				if(t2.getText().equals(""))
				{
					ta.append("enter your password\n");
				}
				else if(t2.getText().equals(t3.getText()))
				{
					ta.append("Password:\t\t"+t2.getText()+"\n");
				}
				else
				{
					ta.append("Password mismatched\n");
				}
				String h=""+cbg.getSelectedCheckbox();
				if(h.equals("null"))
				{
					ta.append("choice your gender\n");
				}
				else
				{
					ta.append("Gender:\t\t"+cbg.getSelectedCheckbox().getLabel()+"\n");
				}
				String l[]=li1.getSelectedItems();
				if(l.length==0)
				{
					ta.append("enter your subjects\n");
				}
				else
				{
					ta.append("selected subjects names are:");
                    for(int i=0;i<l.length;i++)
					{
						ta.append("\t\t"+l[i]+"\n");
                    }
				}
				if(cc1.getSelectedItem().equals("null"))
				{
					ta.append("year of study choose");
				}
				else
				{
					ta.append("year of study:\t\t"+cc1.getSelectedItem());
				}
					
					
			}
			else
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				ta.setText("");
			}
			
		}
   
		public static void main(String args[])
		{
			excercise e=new excercise();
			e.setTitle("course");
	    e.setVisible(true);
		e.setSize(400,400);
				
		}

}
