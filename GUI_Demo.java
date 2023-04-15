
/**
 * @author (21039881 Kaman Diwash Shrestha)
 * @version (1.0.0)
 */
import java.util.ArrayList;
import java.awt.*; //for importing and implementing JFrame 
import javax.swing.*; //for importing and implementing different components
import java.awt.event.*; //For implementing event handling
import javax.swing.BorderFactory; //for implemeting border with title

public class GUI_Demo
{
    private ArrayList<Car> cars;
    private JFrame myFrame;
    
    //--------------------------------------------Car-------------------------------------//
    //declaring panels, labels and textfields for carDetails panels
    private JPanel carDetails;
    private JLabel carID, carName, carBrand, carColor, carPrice;
    private JTextField carIDText, carNameText, carBrandText, carColorText, carPriceText;
    private JPanel carIDPanel, carNamePanel, carBrandPanel, carPricePanel, carColorPanel;
    private JPanel aboutCar;
    
    //------------------------------------------Fuel Car----------------------------------//
    //declaring panels, labels and textfields for purchasingFuel panel
    private JPanel purchasingFuel;
    private JLabel distributorName, fuelType, numberOfSeats, mileage, transmissionType;
    private JTextField distributorNameText, fuelTypeText, numberOfSeatsText, mileageText, transmissionTypeText;
    private JPanel distributorNamePanel, fuelTypePanel, numberOfSeatsPanel, mileagePanel, transmissionTypePanel;
    
    
    
    //-----------------------------------------Electric Car--------------------------------//
    //declaring panels, labels and textfields for buyingElectric panel
    private JPanel buyingElectric;
    private JLabel customerName, batteryWarranty, batteryCapacity, range, rechargeTime;
    private JPanel customerNamePanel, batteryWarrantyPanel, batteryCapacityPanel, rangePanel, rechargeTimePanel;
    private JTextField customerNameText, batteryWarrantyText, batteryCapacityText, rangeText, rechargeTimeText;
    
    //------------------------------------------ComboBoxes---------------------------------//
    //declaring panels, labels and comboboxes for comboBoxes panel
    private JPanel comboBoxes;
    private JPanel purchaseComboPanel, bookedComboPanel;
    private JLabel purchaseCombo, bookedCombo;
    private JComboBox purchaseDateDayCombo, purchaseDateYearCombo, purchaseDateMonthCombo, bookedDateDayCombo, bookedDateYearCombo, bookedDateMonthCombo;

    //------------------------------------------Buttons------------------------------------//
    //declaring panels and buttons for different panels
    private JPanel fuelButtons, electricButtons, carButtons;
    private JPanel onlyBtnPanel, buySellBtnPanel, addFuelBtnPanel, purchaseFuelBtnPanel, addElectricBtnPanel; 
    private JButton addFuelBtn, addElectricBtn, purchaseFuelBtn, buyElectricBtn, sellElectricBtn, displayBtn, clearBtn;
    
    //constructor of the class invoking makeGUI method
    public GUI_Demo(){
        makeGUI();
    
    }
    
    //method making GUI
    public void makeGUI(){
        cars = new ArrayList<Car>();
        myFrame = new JFrame("GUI_Demo");
        
        //Panels for holding different components
        carDetails = new JPanel(); 
        aboutCar = new JPanel(new GridLayout(1, 2)); 
        purchasingFuel = new JPanel(); 
        buyingElectric = new JPanel(); 
        comboBoxes = new JPanel();
        onlyBtnPanel = new JPanel(new GridLayout(1, 3)); 
        fuelButtons = new JPanel();
        addFuelBtnPanel = new JPanel();
        purchaseFuelBtnPanel = new JPanel();
        electricButtons = new JPanel();
        carButtons = new JPanel(); 
        addElectricBtnPanel = new JPanel();
        buySellBtnPanel = new JPanel();
        
        //Panels for holding JLabel and JTextField
        carIDPanel = new JPanel();
        carNamePanel = new JPanel();
        carBrandPanel = new JPanel();
        carPricePanel = new JPanel();
        carColorPanel  = new JPanel();
        
        //Labels in carDetails panel
        carID = new JLabel("Car ID: ");
        carName = new JLabel("Car Name: "); 
        carBrand = new JLabel("Car Brand: ");
        carColor = new JLabel("Car Color: "); 
        carPrice = new JLabel("Car Price: ");
        
        //TextFields in carDetails panel
        carIDText = new JTextField(20);
        carNameText = new JTextField(20); 
        carBrandText = new JTextField(20);
        carColorText = new JTextField(20); 
        carPriceText = new JTextField(20);
        
        
        //adding labels and textfields in different panels
        carIDPanel.add(carID);
        carIDPanel.add(carIDText);
        carNamePanel.add(carName);
        carNamePanel.add(carNameText);
        carBrandPanel.add(carBrand);
        carBrandPanel.add(carBrandText);
        carPricePanel.add(carPrice);
        carPricePanel.add(carPriceText);
        carColorPanel.add(carColor);
        carColorPanel.add(carColorText);
        
        //adding into carDetails panel
        carDetails.add(carIDPanel);
        carDetails.add(carNamePanel);
        carDetails.add(carBrandPanel);
        carDetails.add(carPricePanel);
        carDetails.add(carColorPanel);
        
        //setting the border and layout of carDetails panel
        carDetails.setBorder(BorderFactory.createTitledBorder("Car Details"));
        carDetails.setLayout(new BoxLayout(carDetails, BoxLayout.Y_AXIS));
        
        
        
        //Labels in purchasingFuel panel
        distributorName = new JLabel("Distributor Name: ");
        fuelType = new JLabel("Fuel Type: ");
        numberOfSeats = new JLabel("Number Of Seats: "); 
        mileage = new JLabel("Mileage: ");
        transmissionType = new JLabel("Transmission Type: ");
        
        //TextFiels in purchasingFuel panel
        distributorNameText = new JTextField(20);
        fuelTypeText = new JTextField(20);
        numberOfSeatsText = new JTextField(20); 
        mileageText = new JTextField(20);
        transmissionTypeText = new JTextField(20);
        
        //Labels in buyingElectric panel
        customerName = new JLabel("Customer Name: "); 
        batteryWarranty = new JLabel("Battery Warranty: ");
        batteryCapacity = new JLabel("BatteryCapacity: ");
        range = new JLabel("Range: ");
        rechargeTime = new JLabel("RechargeTime: ");
        
        //TextFields in buyingElectric panel
        customerNameText = new JTextField(20); 
        batteryWarrantyText = new JTextField(20);
        batteryCapacityText = new JTextField(20);
        rangeText = new JTextField(20);
        rechargeTimeText = new JTextField(20);
        
        //Panels for holding JLabel and JTextField in a single row
        distributorNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 5));
        fuelTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 71, 5));
        numberOfSeatsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 5)); 
        mileagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 76, 5));
        transmissionTypePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 44, 5));
        
        //Panels for holding JLabel and JTextField in a single row
        customerNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 60, 5)); 
        batteryWarrantyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 58, 5));
        batteryCapacityPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 62, 5));
        rangePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 88, 5));
        rechargeTimePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 63, 5));
        
        
        
        //adding labels and text fields to different panels
        distributorNamePanel.add(distributorName);
        distributorNamePanel.add(distributorNameText);
        fuelTypePanel.add(fuelType);
        fuelTypePanel.add(fuelTypeText);
        numberOfSeatsPanel.add(numberOfSeats);
        numberOfSeatsPanel.add(numberOfSeatsText);
        mileagePanel.add(mileage);
        mileagePanel.add(mileageText);
        transmissionTypePanel.add(transmissionType);
        transmissionTypePanel.add(transmissionTypeText);
        
        //adding panels to purchasingFuel panel
        purchasingFuel.add(distributorNamePanel);
        purchasingFuel.add(fuelTypePanel);
        purchasingFuel.add(numberOfSeatsPanel);
        purchasingFuel.add(mileagePanel);
        purchasingFuel.add(transmissionTypePanel);
        
        //setting layout and border of purchasingFuel panel
        purchasingFuel.setBorder(BorderFactory.createTitledBorder("Purchasing a fuel car?"));
        purchasingFuel.setLayout(new BoxLayout(purchasingFuel, BoxLayout.Y_AXIS));
        
        //adding labels and textfields in different panels
        customerNamePanel.add(customerName);
        customerNamePanel.add(customerNameText);
        batteryWarrantyPanel.add(batteryWarranty);
        batteryWarrantyPanel.add(batteryWarrantyText);
        batteryCapacityPanel.add(batteryCapacity);
        batteryCapacityPanel.add(batteryCapacityText);
        rangePanel.add(range);
        rangePanel.add(rangeText);
        rechargeTimePanel.add(rechargeTime);
        rechargeTimePanel.add(rechargeTimeText);
        
        //adding panels to buyingElectric panel
        buyingElectric.add(customerNamePanel);
        buyingElectric.add(batteryWarrantyPanel);
        buyingElectric.add(batteryCapacityPanel);
        buyingElectric.add(rangePanel);
        buyingElectric.add(rechargeTimePanel);
        
        //setting layout and border of buyingElectric panel
        buyingElectric.setBorder(BorderFactory.createTitledBorder("Buying a electric car?"));
        buyingElectric.setLayout(new BoxLayout(buyingElectric, BoxLayout.Y_AXIS));
        
        //adding panels to aboutCar panel
        aboutCar.add(purchasingFuel);
        aboutCar.add(buyingElectric);      
        
        
        //Labels for comboBox panel
        purchaseCombo = new JLabel("Purchase Date: ");
        bookedCombo = new JLabel("Booked Date: ");  
        //panel for comboboxes
        purchaseComboPanel = new JPanel();
        bookedComboPanel = new JPanel();
        
        //arrays for storing days, months and years
        String[] year = { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
        
        //JComboBoxes in bookedComboBox panel
        bookedDateYearCombo = new JComboBox(year);
        bookedDateMonthCombo = new JComboBox(months);
        bookedDateDayCombo = new JComboBox(day);
        
        //adding labels and comboboxes in bookedComboBox panel
        bookedComboPanel.add(bookedCombo);
        bookedComboPanel.add(bookedDateYearCombo);
        bookedComboPanel.add(bookedDateMonthCombo);
        bookedComboPanel.add(bookedDateDayCombo);
        
        //JComboBoxes in purchaseComboPanel panel
        purchaseDateYearCombo = new JComboBox(year);
        purchaseDateMonthCombo = new JComboBox(months);
        purchaseDateDayCombo = new JComboBox(day);
        
        //adding labels and comboboxes in purchaseComboPanel
        purchaseComboPanel.add(purchaseCombo);
        purchaseComboPanel.add(purchaseDateYearCombo);
        purchaseComboPanel.add(purchaseDateMonthCombo);
        purchaseComboPanel.add(purchaseDateDayCombo);
        
        //setting the layout of comboBoxes panel and adding other panels to it
        comboBoxes.setLayout(new BoxLayout(comboBoxes, BoxLayout.Y_AXIS));
        comboBoxes.add(bookedComboPanel);
        comboBoxes.add(purchaseComboPanel);
        
        
        //buttons in fuelButtons panel
        addFuelBtn = new JButton("Add a new FuelCar");
        purchaseFuelBtn = new JButton("Purchase FuelCar");
        addFuelBtnPanel.add(addFuelBtn);
        purchaseFuelBtnPanel.add(purchaseFuelBtn);
        fuelButtons.setLayout(new BoxLayout(fuelButtons, BoxLayout.Y_AXIS));

        //setting the layout of fuelButtons panel and adding other panels to it
        fuelButtons.setBorder(BorderFactory.createTitledBorder("For Fuel car: "));
        fuelButtons.add(addFuelBtnPanel);
        fuelButtons.add(purchaseFuelBtnPanel);
        
        //event and exception handling for Add FuelCar button
        addFuelBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting values from various text fields
                int fuelCarID = 0;
                int fuelCarNumberOfSeats = 0;
                int fuelCarMileage = 0;
                String fuelCarName = carNameText.getText();
                String fuelCarBrand = carBrandText.getText();
                String fuelCarPrice = carPriceText.getText();
                String fuelCarType = fuelTypeText.getText();
                //setting boolean values for loops
                boolean continuing = true;
                boolean checking = true;
                
                //Exception handling for NumberFormatException
                while(continuing){
                    try{
                        //converting String into int
                        fuelCarID = Integer.parseInt(carIDText.getText());
                    } catch(NumberFormatException ex){
                        //Dialog box for showing exception
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    try{
                        fuelCarNumberOfSeats = Integer.parseInt(numberOfSeatsText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid number of seats.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    try{    
                        fuelCarMileage = Integer.parseInt(mileageText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid mileage.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //error handling 
                    if(fuelCarID <= 0 || fuelCarNumberOfSeats <= 0 || fuelCarMileage <= 0){
                            JOptionPane.showMessageDialog(myFrame, "Please enter valid input values.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                            continuing = false;
                            continue;
                        }
                    
                    //error handling with showing dialog box with message   
                    if(fuelCarName.equals("") || fuelCarBrand.equals("") || fuelCarPrice.equals("") || fuelCarType.equals("") || fuelCarID == 0 || fuelCarMileage == 0 || fuelCarNumberOfSeats == 0 ){
                        JOptionPane.showMessageDialog(myFrame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                    } else{
                        Car newFuelCar = new FuelCar(fuelCarID, fuelCarName, fuelCarBrand, fuelCarPrice, fuelCarType, fuelCarNumberOfSeats, fuelCarMileage);
                        if(cars.isEmpty()){
                            //adding FuelCar's object to ArrayList if cars is empty
                            cars.add(newFuelCar);
                            JOptionPane.showMessageDialog(myFrame, "This fuel car has successfully been added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                            continuing = false;
                            clearAll();
                        }else{
                            //iterating over ArrayList
                            for(Car fuelCar: cars){
                                if(fuelCar instanceof FuelCar){
                                    if(fuelCar.getCarId() == fuelCarID){
                                        //showing error dialog box if fuel car has already been added
                                        JOptionPane.showMessageDialog(myFrame, "This fuel car already exists.", "Error !", JOptionPane.ERROR_MESSAGE);
                                        continuing = false;
                                        checking = false;
                                        break;              
                                    }
                                }
                            }
                            
                            //adding fuel car to ArrayList if no fuel car is present in ArrayList
                            if(checking == true){
                                cars.add(newFuelCar);
                                JOptionPane.showMessageDialog(myFrame, "This fuel car has successfully been added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                continuing = false;
                                clearAll();
                            }
                        }
                    }
                }
            }                 
        });
        
        //event and exception handling for Purchase FuelCar button
        purchaseFuelBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting values from different textfields
                String fuelCarDistributorName = distributorNameText.getText();
                String fuelCarTransmissionType = transmissionTypeText.getText();
                int fuelCarID = 0;
                String fuelCarName = carNameText.getText();
                String fuelCarBrand = carBrandText.getText();
                String fuelCarColor = carColorText.getText();
                String purchaseyear = (String)purchaseDateYearCombo.getSelectedItem();
                String purchasemonth = (String)purchaseDateMonthCombo.getSelectedItem();
                String purchaseday = (String)purchaseDateDayCombo.getSelectedItem();
                String purchaseDate = purchaseday + " " + purchasemonth + " " + purchaseyear; 
                String bookedyear = (String)bookedDateYearCombo.getSelectedItem();
                String bookedmonth = (String)bookedDateMonthCombo.getSelectedItem();
                String bookedday = (String)bookedDateDayCombo.getSelectedItem();
                String bookedDate = bookedday + " " + bookedmonth + " " + bookedyear; 
                //initializing boolean values for looping
                boolean continuing = true;
                boolean checking = true;
                while(continuing){
                    //getting and converting into int values and catching exceptions
                    try{
                        fuelCarID = Integer.parseInt(carIDText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid car ID.", "Invalid entry.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //error handling by showing error dialog box message
                    if(fuelCarID <= 0){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid car ID", "Invalid entry.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    if(fuelCarName.equals("") || fuelCarBrand.equals("") || fuelCarDistributorName.equals("") || fuelCarTransmissionType.equals("") || fuelCarColor.equals("") || fuelCarID == 0){
                        JOptionPane.showMessageDialog(myFrame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                    }else{
                        //checking if cars ArrayList is empty
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(myFrame, "The ArrayList is empty. Please add before purchasing.", "Empty ArrayList", JOptionPane.ERROR_MESSAGE);
                            continuing = false;
                        }else{
                            //iterating over the cars ArrayList
                            for(Car fuelCar: cars){
                                //checking if iterated car object is instance of FuelCar class
                                if (fuelCar instanceof FuelCar){
                                    //checking if car ID from text field is equal to car ID of iterated car
                                    if(fuelCar.getCarId() == fuelCarID){
                                        //downcasting fuel car and checking if it has been purchased
                                        if(((FuelCar)fuelCar).getIsPurchased() == false){
                                            //downcasting fuel car and calling purchase method
                                            ((FuelCar)fuelCar).purchase(purchaseDate, bookedDate);
                                            JOptionPane.showMessageDialog(myFrame, "The preferred fuel car has been purchased.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            continuing = false;
                                            checking = false;
                                            clearAll();
                                            break;
                                        } else{
                                            //showing error dialog if car has already been purchased
                                            JOptionPane.showMessageDialog(myFrame, "The preferred fuel car has already been purchased. Please purchase another fuel car.", "Info", JOptionPane.ERROR_MESSAGE);
                                            continuing = false;
                                            checking = false;
                                        }
                                    }
                                }
                            }
                            //showing dialog box message if preferred car is not found
                            if(checking == true){
                                JOptionPane.showMessageDialog(myFrame, "The preferred fuel car is not found.", "Not found.", JOptionPane.ERROR_MESSAGE);
                                continuing = false;
                            }
                        }
                    }
                }
            }
        });
        
        
        
        //buttons in electricButtons
        addElectricBtn = new JButton("Add a new ElectricCar");
        buyElectricBtn = new JButton("Buy ElectricCar");
        sellElectricBtn = new JButton("Sell ElectricCar");
        
        //adding buttons to panels
        addElectricBtnPanel.add(addElectricBtn);
        electricButtons.add(addElectricBtnPanel);
        buySellBtnPanel.add(buyElectricBtn);
        buySellBtnPanel.add(sellElectricBtn);
        electricButtons.add(buySellBtnPanel);
        
        //setting the layout and border of electricButtons panel
        electricButtons.setLayout(new BoxLayout(electricButtons, BoxLayout.Y_AXIS));
        electricButtons.setBorder(BorderFactory.createTitledBorder("For Electric car: "));
        
        //event and exception handling for Add ElectricCar button
        addElectricBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting the values from the text fields
                int electricCarID = 0;
                String electricCarName = carNameText.getText();
                String electricCarBrand = carBrandText.getText();
                String electricCarPrice = carPriceText.getText();
                int electricBatteryCapacity = 0;
                
                //initializing boolean values for looping
                boolean checking = true;
                boolean continuing = true;
                
                while(continuing){
                    try{
                        //getting and converting into int values and checking for exception
                        electricCarID = Integer.parseInt(carIDText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    try{
                        electricBatteryCapacity = Integer.parseInt(batteryCapacityText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid battery capacity.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //error handling
                    if(electricCarID <= 0 || electricBatteryCapacity <= 0){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid input values.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    
                    //checking if text fields are filled
                    if(electricCarName.equals("") || electricCarBrand.equals("") || electricCarPrice.equals("") || electricBatteryCapacity == 0 || electricCarID == 0){
                        JOptionPane.showMessageDialog(myFrame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                    }else{
                        //upcasting FuelCar's object to Car class
                        Car newElectricCar = new ElectricCar(electricCarID, electricCarName, electricCarBrand, electricCarPrice, electricBatteryCapacity);
                        if(cars.isEmpty()){
                            //adding electric car to ArrayList cars if it is empty
                            cars.add(newElectricCar);
                            JOptionPane.showMessageDialog(myFrame, "This electric car has successfully been added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                            continuing = false;
                            clearAll();
                        }else{
                            //iterating over cars ArrayList
                            for(Car electricCar: cars){
                                //checking if iterated object is instance of ElectricCar class
                                if(electricCar instanceof ElectricCar){
                                    //checking if iterated object's car ID is equal to car ID obtained from textfields
                                    if(electricCar.getCarId() == electricCarID){
                                        //showing error message if electric car already exits
                                        JOptionPane.showMessageDialog(myFrame, "This electric car already exists.", "Error !", JOptionPane.ERROR_MESSAGE);
                                        continuing = false;
                                        checking = false;
                                        break;
                                    } 
                               
                                }
                            }
                            //adding if no electric car is present in ArrayList
                            if(checking == true){
                                cars.add(newElectricCar);
                                JOptionPane.showMessageDialog(myFrame, "This electric car has successfully been added.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                continuing = false;
                                clearAll();
                                    
                            }
                        }
                    }
                }
            }
        });
        
        //event handling for Buy ElectricCar button
        buyElectricBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting values from text fields
                int electricCarID = 0;
                String electricCarName = carNameText.getText();
                String electricCarBrand = carBrandText.getText();
                String electricCarPrice = carPriceText.getText();
                String electricCarColor = carColorText.getText();
                String customerName = customerNameText.getText();
                String range = rangeText.getText();
                int rechargeTime = 0;
                int electricBatteryWarranty = 0;
                String purchaseyear = (String)purchaseDateYearCombo.getSelectedItem();
                String purchasemonth = (String)purchaseDateMonthCombo.getSelectedItem();
                String purchaseday = (String)purchaseDateYearCombo.getSelectedItem();
                String purchaseDate = purchaseday + " " + purchasemonth + " " + purchaseyear;
                
                //initializing boolean values for looping
                boolean continuing = true;
                boolean checking = true;
                while(continuing){
                    //converting into int values and checking for exceptions
                    try{
                        electricCarID = Integer.parseInt(carIDText.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    try{
                        rechargeTime = Integer.parseInt(rechargeTimeText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid input.", "Invalid entry", JOptionPane.ERROR_MESSAGE);   
                        continuing = false;
                        continue;
                    }
                    try{
                        electricBatteryWarranty = Integer.parseInt(batteryWarrantyText.getText());
                    } catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid battery warranty.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //checking if valid input are filled in text fields
                    if(electricCarID <= 0 || electricBatteryWarranty <= 0 || rechargeTime <= 0){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid input values.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //checking if textfields are filled
                    if(electricCarID == 0 || electricBatteryWarranty == 0 || rechargeTime == 0 || electricCarName.equals("") || electricCarBrand.equals("") || electricCarPrice.equals("") || electricCarColor.equals("") || customerName.equals("") || range.equals("") ){
                        JOptionPane.showMessageDialog(myFrame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                    } else {
                        //showing message if cars ArrayList is empty
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(myFrame, "The ArrayList is empty. Please add before purchasing.", "Empty ArrayList", JOptionPane.ERROR_MESSAGE);
                            continuing = false;
                        }else{
                            //iterating over the ArrayList
                            for(Car electricCar: cars){
                                //checking if iterated object is instance of ElectricCar
                                if (electricCar instanceof ElectricCar){
                                    //comparing car ID values of iterated car object and from textfields
                                    if(electricCar.getCarId() == electricCarID){
                                        //downcasting the object to check if it has been bought
                                        if(((ElectricCar)electricCar).getIsBought() == false){
                                            //downcasting to ElectricCar and calling buy method
                                            ((ElectricCar)electricCar).buy(customerName, electricBatteryWarranty, purchaseDate, range, rechargeTime);
                                            JOptionPane.showMessageDialog(myFrame, "The preferred electric car has been bought.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            checking = false;
                                            continuing = false;
                                            clearAll();
                                            break;
                                        }else{
                                            //outputing dialog box with message if it has already been bought
                                            JOptionPane.showMessageDialog(myFrame, "The preferred electric car has already been bought. Please buy another electric car.", "Error !", JOptionPane.ERROR_MESSAGE);
                                            checking = false;
                                            continuing = false;
                                    
                                        }
                                    }
                                }
                            }
                            //outputing dialog box with message if car is not found
                            if(checking == true){
                                JOptionPane.showMessageDialog(myFrame, "The preferred electric car is not found.", "Not found.", JOptionPane.ERROR_MESSAGE);
                                continuing = false;
                            }   
                        }
                    }
                }
            }
        });
        
        //event handling for Sell ElectricCar button
        sellElectricBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //getting values from text fields
                int electricCarID = 0;
                String customerName = customerNameText.getText();
                //initializing boolean values for looping
                boolean checking = true;
                boolean continuing = true;
                while(continuing){
                    //checking for NumberFormat exception
                    try{
                        electricCarID = Integer.parseInt(carIDText.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid Car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    if(electricCarID <= 0){
                        JOptionPane.showMessageDialog(myFrame, "Please enter valid car ID.", "Invalid entry", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                        continue;
                    }
                    
                    //checking for empty text fields
                    if(customerName.equals("") || electricCarID == 0){
                        JOptionPane.showMessageDialog(myFrame, "The text fields need to be filled.", "Empty text fields.", JOptionPane.ERROR_MESSAGE);
                        continuing = false;
                    } else {
                        //adding if cars ArrayList is empty
                        if(cars.isEmpty()){
                            JOptionPane.showMessageDialog(myFrame, "The ArrayList is empty. Please add before selling.", "Empty ArrayList", JOptionPane.ERROR_MESSAGE);
                            continuing = false;
                        } else{
                            //iterating over cars ArrayList
                            for(Car electricCar: cars){
                                //checking if iterated car is instance of ElectricCar
                                if(electricCar instanceof ElectricCar){
                                    //checking if iteratied car's carID is equal to carID taken from text fields
                                    if(electricCar.getCarId() == electricCarID){
                                        //downcasting to check whether it has already been sold or not
                                        if(((ElectricCar)electricCar).getIsSold() == false){
                                            //downcasting and calling sell method
                                            ((ElectricCar)electricCar).sell(customerName);
                                            JOptionPane.showMessageDialog(myFrame, "The preferred electric car is sold.", "Info", JOptionPane.INFORMATION_MESSAGE);
                                            checking = false;
                                            continuing = false;
                                            clearAll();
                                            break;
                                            
                                        } else {
                                            //outputing message if car has already been sold
                                            JOptionPane.showMessageDialog(myFrame, "The preferred electric car has already been sold. Please sell another electric car.", "Error !", JOptionPane.ERROR_MESSAGE);
                                            checking = false;
                                            continuing = false;
                                        }
                                    }  
                                }    
                            }
                            //if no ElectricCar's instance is found
                            if(checking == true){
                                JOptionPane.showMessageDialog(myFrame, "The preferred electric car is not found.", "Not found", JOptionPane.ERROR_MESSAGE);
                                continuing = false;                            
                            }
                        }
                    }
                }   
            }
        });
        
        //buttons in carButtons
        displayBtn = new JButton("Display");
        clearBtn = new JButton("Clear");
        
        //adding buttons to carButtons panel
        carButtons.add(displayBtn);
        carButtons.add(clearBtn);
        
        //event handling for Clear button
        clearBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clearAll();
            }
        });
        
        //event handling for Display button
        displayBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //iterating over cars ArrayList 
                for(Car car: cars){
                    if(car instanceof FuelCar){ 
                        //downcasting iterated object to call display method after checking whether it is instance of FuelCar or ElectricCar
                        System.out.println("Details regarding fuel car: ");
                        ((FuelCar)car).display();
                        System.out.println("\n");
                    }
                    if(car instanceof ElectricCar){
                        System.out.println("Details regarding electric car: ");
                        ((ElectricCar)car).display();
                        System.out.println("\n");
                    }
                }
                
            }
        });
        
        
        
        //adding different panels to onlyBtnPanel
        onlyBtnPanel.add(fuelButtons);
        onlyBtnPanel.add(carButtons);
        onlyBtnPanel.add(electricButtons);
        
        //adding different panels to myFrame
        myFrame.add(carDetails);
        myFrame.add(aboutCar);
        myFrame.add(comboBoxes);
        myFrame.add(onlyBtnPanel);
        
        //setting size, layout, default close operation and visibility of myFrame
        myFrame.setSize(1600, 900); 
        myFrame.setLayout(new GridLayout(4, 1, 5, 5));
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        
        
    }
    
    //method for setting values in text fields to empty string and comboboxes to initial values
    public void clearAll(){
        carIDText.setText("");
        carNameText.setText("");
        carBrandText.setText("");
        carColorText.setText("");
        carPriceText.setText("");
        distributorNameText.setText("");
        fuelTypeText.setText("");
        numberOfSeatsText.setText("");
        mileageText.setText("");
        transmissionTypeText.setText("");
        customerNameText.setText("");
        batteryCapacityText.setText("");
        batteryWarrantyText.setText("");
        rangeText.setText("");
        rechargeTimeText.setText("");    
    }
    
    //main method
    public static void main(String[] args){
        new GUI_Demo();
    }
    
}

