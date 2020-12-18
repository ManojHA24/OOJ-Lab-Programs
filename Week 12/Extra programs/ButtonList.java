import java.awt.*;
import java.awt.event.*;

public class ButtonList extends Frame implements ActionListener{
	String msg="";
	Button bList[]=new Button[3];
	public ButtonList(){
		setLayout(new FlowLayout());
		Button yes=new Button("Yes");
		Button no=new Button("No");
		Button maybe=new Button("Undecided");

		bList[0]=(Button) add(yes);
		bList[1]=(Button) add(no);
		bList[2]=(Button) add(maybe);
		for(int i=0;i<3;i++){
			bList[i].addActionListener(this);
		}
		addWindowListener(new WindowAdapter1());
	}
   
	public void actionPerformed(ActionEvent ae){
		for(int i=0;i<3;i++){
			if(ae.getSource()==bList[i]){
				msg="you pressed "+bList[i].getLabel();
			}
		}
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,20,100);
	}
	public static void main(String args[]){
		ButtonList aa=new ButtonList();
		aa.setSize(new Dimension(230,150));
		aa.setTitle("ButtonList");
		aa.setVisible(true);
	}

 class WindowAdapter1 extends WindowAdapter{
	public void WindowClosing(WindowEvent we){
		System.exit(0);
	    }
    }
}    
