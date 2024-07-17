package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddDriver extends JFrame implements ActionListener{
    JButton add, cancel;
    JTextField tfname,tfage,tfmode,tfcompany,tfmodel,tflocation;
    JComboBox agecombo,Availablecombo,gendercombo;
    AddDriver(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //types 
        
       JLabel heading = new JLabel("Add Driver");
       heading.setFont(new Font("Tahoma",Font.BOLD, 16));
       heading.setBounds(150,10,200,20);
       add(heading);
       
       JLabel lblroomno = new JLabel("Name");
       lblroomno.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblroomno.setBounds(60,70,120,30);
       add(lblroomno);
       
       tfname = new JTextField();
       tfname.setBounds(200,70,150,30);
       add(tfname);
       
       JLabel lblage = new JLabel("Age");
       lblage.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblage.setBounds(60,110,120,30);
       add(lblage);
       
       tfage = new JTextField();
       tfage.setBounds(200,110,150,30);
       add(tfage);
       
       JLabel lblgender = new JLabel("Gender");
       lblgender.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblgender.setBounds(60,150,120,30);
       add(lblgender);
       
       String CleanOptions[] = {"Male", "Female"};
       gendercombo = new JComboBox(CleanOptions);
       gendercombo.setBounds(200, 150, 150, 30);
       gendercombo.setBackground(Color.WHITE);
       add(gendercombo);
       
          
       JLabel lblcompany = new JLabel("Car Company");
       lblcompany.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblcompany.setBounds(60,190,120,30);
       add(lblcompany);
       
       tfcompany = new JTextField();
       tfcompany.setFont(new Font("Tahoma",Font.PLAIN, 16));
       tfcompany.setBounds(200,190,150,30);
       add(tfcompany);
       
       JLabel lblModel = new JLabel("Car Model");
       lblModel.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblModel.setBounds(60,230,120,30);
       add(lblModel);
       
       tfmodel = new JTextField();
       tfmodel.setBounds(200,230,150,30);
       add(tfmodel);
       
       JLabel lblavailable = new JLabel("Available");
       lblavailable.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblavailable.setBounds(60,270,120,30);
       add(lblavailable);
       
       String DriverOptions[] = {"Available", "Busy"};
       Availablecombo = new JComboBox(DriverOptions);
       Availablecombo.setBounds(200, 270, 150, 30);
       Availablecombo.setBackground(Color.WHITE);
       add(Availablecombo);
       
         
       JLabel lblocation = new JLabel("Location");
       lblocation.setFont(new Font("Tahoma",Font.PLAIN, 16));
       lblocation.setBounds(60,310,120,30);
       add(lblocation);
       
       tflocation = new JTextField();
       tflocation.setBounds(200,310,150,30);
       add(tflocation);
       
       
       add = new JButton("Add Driver");
       add.setForeground(Color.WHITE);
       add.setBackground(Color.BLACK);
       add.setBounds(60,370,130,30);
       add.addActionListener(this);
       add(add);
       
        
       cancel = new JButton("Cancel Driver");
       cancel.setForeground(Color.WHITE);
       cancel.setBackground(Color.BLACK);
       cancel.setBounds(220,370,130,30);
       cancel.addActionListener(this);
       add(cancel);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
       Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(400,30,500,300);
       add(image);
       
        setBounds(300,200,980,470);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            String name = tfname.getText();
            String age =  tfage.getText();
            String gender = (String) gendercombo.getSelectedItem();
            String company = tfcompany.getText();
            String model =  tfmodel.getText();
            String available = (String) Availablecombo.getSelectedItem();
            String location =tflocation.getText();
            
            try{
                Conn conn = new Conn();
                String str = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"' ,'"+model+"', '"+available+"','"+location+"')";
                
                conn.s.executeUpdate(str);
                
                JOptionPane.showMessageDialog(null, "New Driver Added Successfully");
                
                setVisible(false);
                }catch(Exception e){               
                    e.printStackTrace();
                }
            
            
            }else{
                 setVisible(false);
        }
}
    
    public static void main(String[]args){
        new AddDriver();
    }
}
