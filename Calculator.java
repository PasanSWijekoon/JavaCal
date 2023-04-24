/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author pasan
 */

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class calmain implements ActionListener{
    
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    TextField t1;
    
    String fv, sv, op , ng ,bc,m;

    double fdv, sdv, tot;
    
  
    
   Font fontl = new Font("Arial", Font.BOLD, 15);
   Font font2 = new Font("Gill Sans Ultra Bold", Font.BOLD, 20);
   
   Cursor  cur1 = new Cursor(Cursor.HAND_CURSOR);
   
   MenuItem mi3,mi7;
           
    
    calmain(){
        
       
       Frame f1 = new Frame();
       
       f1.setBackground(new Color(37, 54, 80));
       f1.addWindowListener(new close());
       f1.setBounds(100, 100, 300, 400);
       f1.setTitle("Smart Cal 2.0 ");
       
    
       
       MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("Standard");
        MenuItem mi2 = new MenuItem("Scientific");
        mi7 = new MenuItem("New Window");

         mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");

        MenuItem mi5 = new MenuItem("Help");
        MenuItem mi6 = new MenuItem("About");

        Menu m11 = new Menu("View");
        m11.add(mi1);
        m11.add(mi2);
        m11.add(mi7);
        

        m11.add(mi5);
        m11.add(mi6);

        Menu ml2 = new Menu("Edit");
        ml2.add(mi3);
        ml2.add(mi4);

        Menu ml3 = new Menu("About");
        ml3.add(mi5);
        ml3.add(mi6);

        mbar.add(m11);
        mbar.add(ml2);
        mbar.add(ml3);

        f1.setMenuBar(mbar);
        
        
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        
        
        b11 = new Button("<--");
        b12 = new Button("CE");
        b13 = new Button("C");
        b14 = new Button("+/-");
        b15 = new Button("√");
        b16 = new Button("/");
        b17 = new Button("%");
        b18 = new Button("*");
        b19 = new Button("1/X");
        b20 = new Button("-");
        b21 = new Button("=");
        b22 = new Button("+");
        b23 = new Button(".");
        b24 = new Button(" ");
        b25 = new Button(" ");
        
        b1.setBackground(new Color(37, 54, 80));
        b1.setForeground(Color.white);
        
        
        b2.setBackground(new Color(37, 54, 80));
        b2.setForeground(Color.white);
        
        b3.setBackground(new Color(37, 54, 80));
        b3.setForeground(Color.white);
        
        b4.setBackground(new Color(37, 54, 80));
        b4.setForeground(Color.white);
        
        b5.setBackground(new Color(37, 54, 80));
        b5.setForeground(Color.white);
        
        b6.setBackground(new Color(37, 54, 80));
        b6.setForeground(Color.white);
        
        b7.setBackground(new Color(37, 54, 80));
        b7.setForeground(Color.white);
        
        
        b8.setBackground(new Color(37, 54, 80));
        b8.setForeground(Color.white);
        
        
        b9.setBackground(new Color(37, 54, 80));
        b9.setForeground(Color.white);
        
        
        b10.setBackground(new Color(37, 54, 80));
        b10.setForeground(Color.white);
        
        
        b11.setBackground(new Color(31,127,151));
        b11.setForeground(Color.white);
        
        
        b12.setBackground(new Color(31,127,151));
        b12.setForeground(Color.white);
        
        
        b13.setBackground(new Color(31,127,151));
        b13.setForeground(Color.white);
        
        
        b14.setBackground(new Color(31,127,151));
        b14.setForeground(Color.white);
        
        
        b15.setBackground(new Color(31,127,151));
        b15.setForeground(Color.white);
        
        
        b16.setBackground(new Color(31,127,151));
        b16.setForeground(Color.white);
        
        b17.setBackground(new Color(31,127,151));
        b17.setForeground(Color.white);
        
         b18.setBackground(new Color(31,127,151));
        b18.setForeground(Color.white);
        
         b19.setBackground(new Color(31,127,151));
        b19.setForeground(Color.white);
        
         b20.setBackground(new Color(31,127,151));
        b20.setForeground(Color.white);
        
        
         b21.setBackground(new Color(228,126,33));
        b21.setForeground(Color.white);
        
         b22.setBackground(new Color(31,127,151));
        b22.setForeground(Color.white);
        
         b23.setBackground(new Color(37, 54, 80));
        b23.setForeground(Color.white);
        
         b24.setBackground(new Color(37, 54, 80));
        b24.setForeground(Color.white);
        
        
         b25.setBackground(new Color(31,127,151));
        b25.setForeground(Color.white);
        
        b1.setCursor(cur1);
        b2.setCursor(cur1);
        b3.setCursor(cur1);
        b4.setCursor(cur1);
        b5.setCursor(cur1);
        b6.setCursor(cur1);
        b7.setCursor(cur1);
        b8.setCursor(cur1);
        b9.setCursor(cur1);
        b10.setCursor(cur1);
        b11.setCursor(cur1);
        b12.setCursor(cur1);
        b13.setCursor(cur1);
        b14.setCursor(cur1);
        b15.setCursor(cur1);
        b16.setCursor(cur1);
        b17.setCursor(cur1);
        b18.setCursor(cur1);
        b19.setCursor(cur1);
        b20.setCursor(cur1);
        b21.setCursor(cur1);
        b22.setCursor(cur1);
        b23.setCursor(cur1);
       
        
        
        
     
        
       
        
        
        
        b1.setFont(fontl);
        b2.setFont(fontl);
        b3.setFont(fontl);
        b4.setFont(fontl);
        b5.setFont(fontl);
        b6.setFont(fontl);
        b7.setFont(fontl);
        b8.setFont(fontl);
        b9.setFont(fontl);
        b10.setFont(fontl);
        b11.setFont(fontl);
        b12.setFont(fontl);
        b13.setFont(fontl);
        b14.setFont(fontl);
        b15.setFont(fontl);
        b16.setFont(fontl);
        b17.setFont(fontl);
        b18.setFont(fontl);
        b19.setFont(fontl);
        b20.setFont(fontl);
        b21.setFont(fontl);
        b22.setFont(fontl);
        b23.setFont(fontl);
        b24.setFont(fontl);
        b25.setFont(fontl);
        
        
        t1 = new TextField(22);
        t1.setFont(font2);
        t1.setEditable(false);

        t1.setForeground(Color.black);
        t1.setBackground(Color.WHITE);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        
        GridLayout gl = new GridLayout(6, 5, 3, 3); 
        
        p1.add(t1);
        
        p2.setLayout(gl);
        p2.setBackground(new Color(37, 54, 80));

        
        
        
        
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b16);
        p2.add(b17);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b18);
        p2.add(b19);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b20);
        p2.add(b21);
        p2.add(b10);
        p2.add(b23);
        p2.add(b24);
        p2.add(b22);
        p2.add(b25);
        
        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        mi3.addActionListener(this);
        mi7.addActionListener(this);
       
        
        

        

        
         f1.setVisible(true);
    }
    
    
    
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent d ) {
        
        Object o = d.getSource();
        
        
        if (o.equals(b1)) {
            t1.setText(t1.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            t1.setText(t1.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            t1.setText(t1.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            t1.setText(t1.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            t1.setText(t1.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            t1.setText(t1.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            t1.setText(t1.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            t1.setText(t1.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            t1.setText(t1.getText() + b9.getLabel());
        } else if (o.equals(b23)) {
            t1.setText(t1.getText() + b23.getLabel());
            
        } else if (o.equals(b10)) {
            t1.setText(t1.getText() + b10.getLabel());
            
        }    else if (o.equals(b22)) {
            
            fv = t1.getText();
            t1.setText("");
            op = b22.getLabel();
        }
        
          else if (o.equals(b20)) {
            
            fv = t1.getText();
            t1.setText("");
            op = b20.getLabel();
        }
        
            else if (o.equals(b18)) {
            
            fv = t1.getText();
            t1.setText("");
            op = b18.getLabel();
        }
        
           else if (o.equals(b16)) {
            
            fv = t1.getText();
            t1.setText("");
            op = b16.getLabel();
        }
           
           else if (o.equals(b17)) {
            
            fv = t1.getText();
            t1.setText("");
            op = b17.getLabel();
        }
           
           else if (o.equals(b15)) {
            
            fv = t1.getText();
            double i = Double.parseDouble(fv);
            double squareRoot = Math.sqrt(i);
             t1.setText(Double.toString(squareRoot));
        }
           
           else if (o.equals(b19)) {
            
            fv = t1.getText();
            double i = Double.parseDouble(fv);
            double reciprocal  = 1/i;
             t1.setText(Double.toString(reciprocal ));
        }
        
           else if (o.equals(b14)) {
            
            ng = t1.getText();
            double i = Double.parseDouble(ng);
            double negatedNumber   = -i;
             t1.setText(Double.toString(negatedNumber ));
        }
        else if (o.equals(b21)) {
            
            
            
            sv = t1.getText();
            
            
                
            double i = Double.parseDouble(fv);
            double j = Double.parseDouble(sv);
            
         
           if (op.equals("+")) {
                
                 double Addition = i+j;
                 t1.setText(Double.toString(Addition));
                
            }else if(op.equals("-")){
                
                 double Subtract  = i-j;
                 t1.setText(Double.toString(Subtract));
                
               
            }else if(op.equals("*")){
                
                 double Multiply = i*j;
                 t1.setText(Double.toString(Multiply));
                 
               
            }else if(op.equals("/")){
                
                 double Division = i/j;
                 t1.setText(Double.toString(Division));
               
               
            }else if(op.equals("%")){
                
                double Percentage = i*j/100;
                 t1.setText(Double.toString(Percentage));
               
               
            }
           
            
            
        }
        
        if (o.equals(b13)) {
                
                 sv="";
                 fv="";
                 op="";
                 t1.setText("");
            
            }
        
         if (o.equals(b11)) {
                
                 bc=t1.getText();
                  try{
                      m=bc.substring(0, bc.length()-1);
                      }catch(StringIndexOutOfBoundsException f){return;}
                      t1.setText(m);
            
            }
         
          if (o.equals(mi3)) {
                
                 String text = t1.getText();
                 StringSelection selection = new StringSelection(text);
                 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                 clipboard.setContents(selection, null);
            
            }
          
          if (o.equals(mi7)) {
                
                  new calmain();
            
            }


        
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
    
}


public class Calculator {
    
    public static void main(String[] args) {
        
        
           new calmain();
        
    }
    
}
