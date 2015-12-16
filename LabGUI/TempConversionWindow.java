import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
   
    private Container pane;
    private JLabel convTemp;
    private JTextField inputTemp;
    private JButton Celcius;
    private JButton Fahrenheit;
    
    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	Celcius = new JButton("toC");
	Celcius.addActionListener(this);
	Celcius.setActionCommand("FtoC");
	Fahrenheit = new JButton("toF");
	Fahrenheit.addActionListener(this);
	Fahrenheit.setActionCommand("CtoF");
	
	inputTemp = new JTextField(10);
	
	convTemp = new JLabel("");

	pane.add(inputTemp);
	pane.add(Celcius);
	pane.add(Fahrenheit);
	pane.add(convTemp);

    }
    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	try{
	    int temp = Integer.parseInt(inputTemp.getText());
	    if(event.equals("FtoC")){
		convTemp.setText("" + TempConv.FtoC(temp));
	    }
	    if(event.equals("CtoF")){
		convTemp.setText("" + TempConv.CtoF(temp));
	    }
	}
	catch(NumberFormatException a){
	    convTemp.setText("Invalid Temperature Found");
	}
	
    }
    
}
