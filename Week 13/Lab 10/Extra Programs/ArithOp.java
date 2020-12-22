import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ArithOp extends Frame implements ActionListener{
    String msg="";
    TextField n1,n2,res,a;
    Label ln1,ln2,lres,la;
    Button b;
    public ArithOp(){
        setLayout(new FlowLayout());
        Label ln1=new Label("NUMBER 1",Label.RIGHT);
        Label ln2=new Label("NUMBER 2",Label.RIGHT);
        Label lres=new Label("RESULT",Label.RIGHT);
        Label la=new Label("ARITHMETIC OPERATOR",Label.RIGHT);
        n1=new TextField(12);
        n2=new TextField(8);
        res=new TextField(10);
        a=new TextField(10);
        b=new Button("CALCULATE");
        add(ln1);
        add(n1);
        add(la);
        add(a);
        add(ln2);
        add(n2);
        add(b);
        add(lres);
        add(res);      
        b.addActionListener(this);
   addWindowListener(new WindowAdapter1());
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b)
    {
        try{
        int num1=Integer.parseInt(n1.getText());
        int num2=Integer.parseInt(n2.getText());
        char c=a.getText().charAt(0);
        int num3;
        switch(c)
        {
           case '+':
                     num3=num1+num2;
                     res.setText(String.valueOf(num3));
                     msg="ADDITION";
                     repaint();
                     break;
           case '-':
                     num3=num1-num2;
                     res.setText(String.valueOf(num3));
                     msg="SUBTRACTION";
                     repaint();
                     break;
            case '/':
                     num3=num1/num2;
                     res.setText(String.valueOf(num3));
                     msg="DIVISION";
                     repaint();
                     break;
            case '*':
                     num3=num1*num2;
                     res.setText(String.valueOf(num3));
                     msg="MULTIPLICATION";
                     repaint();
                     break;
            default:
                    num3=0;
                    res.setText(String.valueOf(num3));
        }
    }catch(Exception e ){
        JOptionPane.showMessageDialog(this,e,"ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
}
public void paint(Graphics g)
{
    g.drawString(msg,600,400);
}
public static void main(String args[])
{
    ArithOp i=new ArithOp();
    i.setSize(new Dimension(300,300));
    i.setTitle("ARITHMETIC OPERATIONS");
    i.setVisible(true);
}

 class WindowAdapter1 extends WindowAdapter{
     public void windowClosing(WindowEvent we)
     {
         System.exit(0);
     }
 }
}
