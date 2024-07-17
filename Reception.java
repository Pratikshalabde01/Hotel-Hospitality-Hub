package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reception extends JFrame implements ActionListener{
    JButton newCustomer, rooms, Department, allEmployee, managerInfo, Customers,SearchRoom,update, roomStatus,pickup, Checkout, logout;
    Reception(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        newCustomer = new JButton("new Customer Form");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        newCustomer.addActionListener(this);
        add(newCustomer);
        
        rooms = new JButton("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        rooms.addActionListener(this);
        add(rooms);
  
        
        Department = new JButton("Department");
        Department.setBounds(10,110,200,30);
        Department.setBackground(Color.BLACK);
        Department.setForeground(Color.WHITE);
        Department.addActionListener(this);
        add(Department);
    
        
        allEmployee = new JButton("All Employee");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        allEmployee.addActionListener(this);
        add(allEmployee);
     
        Customers = new JButton("Customer Info");
        Customers.setBounds(10,190,200,30);
        Customers.setBackground(Color.BLACK);
        Customers.setForeground(Color.WHITE);
        Customers.addActionListener(this);
        add(Customers);
     
        
        managerInfo = new JButton("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        managerInfo.addActionListener(this);
        add(managerInfo);
        
         
        Checkout = new JButton("CheckOut");
        Checkout.setBounds(10,270,200,30);
        Checkout.setBackground(Color.BLACK);
        Checkout.setForeground(Color.WHITE);
        Checkout.addActionListener(this);
        add(Checkout);
        
        update = new JButton("Update Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        roomStatus = new JButton("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        roomStatus.addActionListener(this);
        add(roomStatus);
        
           
        pickup = new JButton("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        pickup.addActionListener(this);
        add(pickup);
        
        SearchRoom = new JButton("Search Rooms");
        SearchRoom.setBounds(10,430,200,30);
        SearchRoom.setBackground(Color.BLACK);
        SearchRoom.setForeground(Color.WHITE);
        SearchRoom.addActionListener(this);
        add(SearchRoom);
        
        logout = new JButton("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(250, 30, 500,470);
        add(image);
        
        setBounds(350, 200, 800, 570);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == newCustomer){
            setVisible(false);
           new AddCustomer();
        }else if(ae.getSource() == rooms){
            setVisible(false);
            new Room();
        }else if(ae.getSource() == Department){
            setVisible(false);
            new Department();
        }else if(ae.getSource() == allEmployee){
            setVisible(false);
            new EmployeeInfo();
        }else if(ae.getSource() == managerInfo ){
            setVisible(false);
            new ManagerInfo();
        }else if(ae.getSource() == Customers){
            setVisible(false);
            new CustomerInfo();
        }else if(ae.getSource() == SearchRoom){
            setVisible(false);
            new SearchRoom();
        }else if(ae.getSource() == update){
            setVisible(false);
            new UpdateCheck();
        }else if(ae.getSource() == roomStatus){
            setVisible(false);
            new UpdateRoom();
        }else if(ae.getSource() == pickup ){
            setVisible(false);
            new Pickup();
        }else if(ae.getSource() == Checkout ){
            setVisible(false);
            new Checkout();
        }else if(ae.getSource() == logout){
            setVisible(false);
            System.exit(0);
        }
    }
    public static void main(String[] args){
        new Reception();
    }
}