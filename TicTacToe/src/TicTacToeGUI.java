

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.*;

public class TicTacToeGUI extends JFrame {
    
    

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.10.2022
 * @author 
 */


  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  
  public ArrayList<JButton> buttonarray=new ArrayList<JButton>();
  public int[][] a=new int[3][3];
  public boolean buttondisabled=false;
  public boolean winner=false;
  public int zuege=0;

  public int spielzug=0;
  // Ende Attribute
  
  public TicTacToeGUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 286; 
    int frameHeight = 309;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("TicTacToe");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(0, 0, 90, 90);
    jButton1.setText("");
    
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);

    jButton2.setBounds(90, 0, 90, 90);
    jButton2.setText("");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(180, 0, 90, 90);
    jButton3.setText("");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(0, 90, 90, 90);
    jButton4.setText("");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(90, 90, 90, 90);
    jButton5.setText("");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(180, 90, 90, 90);
    jButton6.setText("");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(0, 180, 90, 90);
    jButton7.setText("");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(90, 180, 90, 90);
    jButton8.setText("");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(180, 180, 90, 90);
    jButton9.setText("");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton9_ActionPerformed(evt);
      }
    });
    cp.add(jButton9);

    // Ende Komponenten
    
    setVisible(true);

    
    buttonarray.add(jButton1);
    buttonarray.add(jButton2);
    buttonarray.add(jButton3);
    buttonarray.add(jButton4);
    buttonarray.add(jButton5);
    buttonarray.add(jButton6);
    buttonarray.add(jButton7);
    buttonarray.add(jButton8);
    buttonarray.add(jButton9);

    randomize();
  } // end of public foof
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new TicTacToeGUI();
  } // end of main

  public void jButton1_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton1);
    
  } // end of jButton2_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton2);
    
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton3);
    
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton4);
    
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    if(winner==true){
      restart();
    }else{
      buttonclick(jButton5);
    } 
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton6);
    
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton7);
    
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton8);
    
  } // end of jButton8_ActionPerformed

  public void jButton9_ActionPerformed(ActionEvent evt) {
    buttonclick(jButton9);
  } // end of jButton9_ActionPerformed

  public void restart(){
    randomize();
    setall("");
    toggledisable();
    winner=false;
    zuege=0;
  }

  public void setall(String p){
    jButton1.setText(p);
    jButton2.setText(p);
    jButton3.setText(p);
    jButton4.setText(p);
    jButton5.setText(p);
    jButton6.setText(p);
    jButton7.setText(p);
    jButton8.setText(p);
    jButton9.setText(p);
  }

  public void toggledisable(){
    jButton1.setEnabled(buttondisabled);
    jButton2.setEnabled(buttondisabled);
    jButton3.setEnabled(buttondisabled);
    jButton4.setEnabled(buttondisabled);
    jButton5.setEnabled(buttondisabled);
    jButton6.setEnabled(buttondisabled);
    jButton7.setEnabled(buttondisabled);
    jButton8.setEnabled(buttondisabled);
    jButton9.setEnabled(buttondisabled);
    if(buttondisabled==true){
      buttondisabled=false;
    }else{
      buttondisabled=true;
    }
  }
    

  public void randomize(){
    a[0][0]=60;
    a[0][1]=61;
    a[0][2]=62;
    a[1][0]=69;
    a[1][1]=63;
    a[1][2]=64;
    a[2][0]=65;
    a[2][1]=66;
    a[2][2]=67;
  }

  public void buttonclick(JButton button){
    button.setEnabled(false);
    if(zuege==8){
      winner("---");
    }else{
      if(spielzug==0){
        spielzug=1;
        button.setText("X");
        addArray(buttonarray.indexOf(button), 'X');
        if(prüfe()){
          winner("X");
        }
      }else{
        spielzug=0;
        button.setText("O");
        addArray(buttonarray.indexOf(button), 'O');
        if(prüfe()){
          winner("O");
        }
      }
    }
    ++zuege;
  } 

  public void winner(String winners){
    setall(winners);
    toggledisable();
    jButton5.setEnabled(true);
    jButton5.setText("restart?");
    winner=true;
  }

  public boolean prüfe(){
    boolean richtig=false;

    for(int i=0;i<3;i++){
      if(a[i][0]==a[i][1]&&a[i][1]==a[i][2]){
        richtig=true;
      }
    }

    for(int i=0;i<3;i++){
      if(a[0][i]==a[1][i]&&a[1][i]==a[2][i]){
        richtig=true;
      }
    }

    if(a[0][0]==a[1][1]&&a[2][2]==a[1][1]){
      richtig=true;
    }

    if(a[0][2]==a[1][1]&&a[1][1]==a[2][0]){
      richtig=true;
    }
    
    
    return richtig;
  }

  public void addArray(int button, char zeichen){
    int i=-1;
    if(zeichen=='X'){
      i=0;
    }else if(zeichen=='O'){
      i=1;
    }

    switch (button) {
      case 0:
        a[0][2]=i;
      break;
      case 1:
        a[1][2]=i;
      break;
      case 2:
        a[2][2]=i;
      break;
      case 3:
        a[0][1]=i;
      break;
      case 4:
        a[1][1]=i;
      break;
      case 5:
        a[2][1]=i;
      break;
      case 6:
        a[0][0]=i;
      break;
      case 7:
        a[1][0]=i;
      break;
      case 8:
        a[2][0]=i;
      break;
    }
  }
  // Ende Methoden
 // end of class foof

}
