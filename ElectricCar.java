
/**
 * @author (21039881 Kaman Diwash Shrestha)
 * @version (1.0.0)
 */
//ElectricCar is child class that extends Car parent class
public class ElectricCar extends Car
{
    //instance variables
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;

    //constructor
    public ElectricCar(int carId, String carName, String carBrand, String carPrice, int batteryCapacity){
        // calling superclass constructor
        super(carId, carName, carBrand, carPrice);

        //initializing attributes
        this.batteryCapacity = batteryCapacity;
        this.customerName = "";
        //initializing attribute to zero
        this.batteryWarranty = 0;
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime = 0;
        //initializing attributes to false
        this.isBought = false;
        this.isSold = false;
    }

    //accessor methods
    public String getCustomerName(){
        return this.customerName;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public String getRange(){
        return this.range;
    }

    public int getRechargeTime(){
        return this.rechargeTime;
    }

    public boolean getIsBought(){
        return this.isBought;
    }

    public boolean getIsSold(){
        return this.isSold;
    }

    //mutator methods
    public void setCustomerName(String newCustomerName){
        //using if-else conditional statements
        if(isBought == false){
            //initializing value to customerName
            this.customerName = newCustomerName;
        } else{
            System.out.println("As the customer's name has already been set, changes can not be made.");
        }
    }

    //buy method
    public void buy(String customerName, int batteryWarranty, String purchaseDate, String range, int rechargeTime){
        //using if-else conditional statements
        if(isBought == false){
            //initializing attributes
            this.setCustomerName(customerName);
            this.purchaseDate = purchaseDate;
            this.batteryWarranty = batteryWarranty;
            this.range = range;
            this.rechargeTime = rechargeTime;
            this.isBought = true;
        } else{
            System.out.println("The car has already been bought. Please check out other cars.");
        }
    }

    //sell method
    public void sell(String newCustomerName){
        //initializing customerName 
        this.customerName = newCustomerName;
        if(isSold == false){
            //initializing values to attributes
            this.batteryCapacity = 0;
            this.batteryWarranty = 0;
            this.purchaseDate = "";
            this.range = "";
            this.rechargeTime = 0;
            this.isSold = true;
            this.isBought = false;
        } else{
            System.out.println("The car has already been sold. Please check out other cars.");
        }
    }

    // overriding display method
    @Override
    //display method
    public void display(){
        //calling display method of parent class
        super.display();
        if(isBought == true){
            //printing attributes 
            System.out.println("Customer's name: " + this.customerName);
            System.out.println("Battery capacity: " + this.batteryCapacity + " kWh");
            System.out.println("Battery warranty: " + this.batteryWarranty + " years");
            System.out.println("Purchase Date: " + this.purchaseDate);
            System.out.println("Range: " + this.range);
            System.out.println("Recharge time: " + this.rechargeTime + " hours");
        }

    }
}

