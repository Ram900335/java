package roseindia.net;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FullAddress extends ShortAddress{	

	String houseNumber;
	String add1;
	String add2;
	String cityName;
	int pincode;	
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void display(FullAddress f)
	   {		
		JFrame frame;
		frame = new JFrame("Full Address");
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel fNameLabel = new JLabel("First Name ");
        JLabel sNameLabel = new JLabel("Second Name "); 
        JLabel label = new JLabel("Address Detail");   
        JLabel hNumLabel = new JLabel("House Number ");         
        JLabel addLine1Label = new JLabel("Add Line 1 ");
        JLabel addLine2Label = new JLabel("Add Line 2 ");
        JLabel cityLabel = new JLabel("City ");
        JLabel pinCodeLabel = new JLabel("PIN Code ");
        JLabel phNumLabel = new JLabel("Phone Number ");
        
        String firstName = f.getFirstName();
        JLabel fName = new JLabel(firstName);
        
        String secondName = f.getSecondName();
        JLabel sName = new JLabel(secondName);
        
        String houseNumber = f.getHouseNumber();
        JLabel hNum = new JLabel(houseNumber);
        
        String addLine1 = f.getAdd1();
        JLabel street1 = new JLabel(addLine1);
        
        String addLine2 = f.getAdd2();
        JLabel street2 = new JLabel(addLine2);
        
        String cityName = f.getCityName();
        JLabel city = new JLabel(cityName);
        
        int pCode = f.getPincode();
        JLabel pinCode = new JLabel(""+pCode);
        
        int phNumber = f.getPhoneNumber();
        JLabel phNum = new JLabel(""+phNumber);
        
        fNameLabel.setBounds(10,30,100,20);
        fName.setBounds(300,30,120,30);   

        sNameLabel.setBounds(10,60,150,20);
        sName.setBounds(300,60,120,30);        

        label.setBounds(10,90,150,20);
        
        hNumLabel.setBounds(10,120,150,20);
        hNum.setBounds(300,120,120,30);
        
        
        addLine1Label.setBounds(10,150,150,20);
        street1.setBounds(300,150,120,30);
        

        addLine2Label.setBounds(10,180,150,20);
        street2.setBounds(300,180,120,30);
                
        cityLabel.setBounds(10,210,150,20);
        city.setBounds(300,210,120,30);
       
        pinCodeLabel.setBounds(10,240,150,20);
        pinCode.setBounds(300,240,120,30);
        
        phNumLabel.setBounds(10,270,150,20);
        phNum.setBounds(300,270,120,30);
                
        frame.add(fNameLabel);        
        frame.add(fName);

        frame.add(sNameLabel);        
        frame.add(sName);

        frame.add(label);
        
        frame.add(hNumLabel);
        frame.add(hNum);

        frame.add(addLine1Label);        
        frame.add(street1);
        
        frame.add(addLine2Label);        
        frame.add(street2);
        
        frame.add(cityLabel);        
        frame.add(city);
        
        frame.add(pinCodeLabel);        
        frame.add(pinCode);
        
        frame.add(phNumLabel);        
        frame.add(phNum);       
	    
	   }
}