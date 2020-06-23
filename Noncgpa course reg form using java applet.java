import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<APPLET code="noncgpa" width=300 height=300></Applet>*/
public class noncgpa extends Applet implements ActionListener
{
	Label L1=new Label("NON CGPA COURSE REGISTRATION FORM");
	Label L2=new Label("NAME");
	Label L3=new Label("PASSWORD");
	Label L4=new Label("RE-ENTER PASSWORD");
	Label L5=new Label("GENDER");
	Label L6=new Label("NON-CGPA CATEGORY");
	Label L7=new Label("YEAR OF STUDY");
	TextField T1=new TextField(10);
	TextField T2=new TextField(10);
	TextField T3=new TextField(10);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox c1=new Checkbox("MALE",cbg,false);
	Checkbox c2=new Checkbox("FEMALE",cbg,false);
	List li=new List(4,true);
	TextArea TA=new TextArea(10,100);
	Choice cc=new Choice();
	Button B1=new Button("VALIDATE");
	Button B2=new Button("CLEAR");
	public void start()
	{
		add(L1);
		add(L2);
		add(T1);
		add(L3);
		T2.setEchoChar('*');
		add(T2);
		add(L4);
		T3.setEchoChar('*');
		add(T3);
		add(L5);
		add(c1);
		add(c2);
		add(L6);
		li.addItem("NCC"); 
		li.addItem("NSS"); 
		li.addItem("SPORTS"); 
		li.addItem("CLUB ACTIVITY"); 
		add(li);
		add(L7);
		cc.addItem("SECOND YEAR");
		cc.addItem("THIRD YEAR");
		cc.addItem("FINAL YEAR");
		add(cc);
		add(B1);
		add(B2);
		add(TA);
		B1.addActionListener(this);
		B2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();//which button is currrently clicked
		if(s.equals("VALIDATE"))
		{
			if(T1.getText().equals("")||T1.getText().equals(" "))
			{
				TA.append("name not entered");
			}
			else
			{
				TA.append("Name:\t\t"+T1.getText()+"\n");
			}
			if(T2.getText().equals("")||T3.getText().equals(" "))
			{
				TA.append("Password not entered\n");
     		}
			else if(T2.getText().equals(T3.getText()))
			{
				TA.append("Password:\t"+T2.getText()+"\n");
			}
			else
			{    
			    TA.append("Password Mismatch\n");
			}
			String t=""+cbg.getSelectedCheckbox();
			if(t.equals("null"))
			{
			    TA.append("Gender not selected\n");
			}
			else
			{
			    TA.append("Gender:\t\t"+cbg.getSelectedCheckbox().getLabel()+"\n");
			}
			String h[]=li.getSelectedItems();
			if(h.length==0)
			{
			    TA.append("noncgpa category not selected\n");
			}
			else			
			{
				TA.append("noncgpa categories are:\n");
				for(int i=0;i<h.length;i++)
				{
					TA.append("\t\t"+h[i]+"\n");
				}
			}
			if(cc.getSelectedItem().equals(""))
			{
				TA.append("year of study not selected\n");
			}
			else
			{
				TA.append("year of study:\t"+cc.getSelectedItem());
			}
				
				
		}	 
		
		else
		{
			T1.setText(" ");
			T2.setText(" ");
			T3.setText(" ");
			TA.setText(" ");
			
			
		}
		
		
		
	}
		
}
	