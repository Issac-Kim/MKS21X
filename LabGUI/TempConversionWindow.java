import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    Action Listener{
	private container pane;
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
	    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_Axis));

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
	    pane.add(tempConv);
	}

	public void actionPerformed(ActionEvent e){
	    String event = e.getActionCommand();
	    try{
		int temp = Integer.parseint(inputTemp.getText());
		if(event.equals("FtoC")){
		    tempConv.setText(TempConv.FtoC(temp))
		}
		if(event.equals("CtoF")){
		    tempConv.setText(TempConv.CtoF(temp))
		}
	    }
	    catch(NumberFormatException){
		tempConv.setText("Invalid Temperature Found");
	    }
		
	}
    }
}