
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame99 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Titled Name  Application  ");
	private JLabel l1 = new JLabel("Name ");
	private JTextField t1=new JTextField(" ",8);

	private JButton b1=new JButton("Update First");private JTextField t3=new JTextField("",8);
	private JButton b2=new JButton("Update Surname");private JTextField t4=new JTextField("",8);
	private JTextField t5=new JTextField("",8);
	private JPanel p1=new JPanel();
	private JButton b5=new JButton("Update Title");
	private JButton b6=new JButton("Print Full Name");
	private TitledName n=new TitledName("Mr","John","Smith");
	
	public MyFrame99(String s){
		super(s);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(b1); p1.add(t3);
		p1.add(b2); p1.add(t4);

		p1.add(b5); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
        content.add(b6);   b5.addActionListener(this);  
        b6.addActionListener(this); 
		refresh();
		setSize(290,270);    setVisible(true);}
	
	public void  refresh(){
	     t1.setText(""+n.readFullName());
	}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	 	if (target==b1){

	 		n.updateFirst(t3.getText());
	 		refresh();
         }
	 	if (target==b2){

	 		n.updateSurname(t4.getText());
	 		refresh();
         }
	 	if (target==b6){

	 		n.printFullName();
         }
	 	if (target==b5){

	 		n.updateTitle(t5.getText());
	 		refresh();
	 		                   
         }
	 }

}