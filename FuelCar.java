/**
 * @author (21039881 Kaman Diwash Shrestha)
 * @version (1.0.0)
 */
//FuelCar is child class that extends Car parent class
public class FuelCar extends Car
{
    //attributes
    private String distributorName;
    private String fuelType;
    private int numberOfSeats;
    private String bookedDate;
    private String purchaseDate;
    private int mileage;
    private String transmissionType;
    private boolean isPurchased;

    //constructor
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int numberOfSeats, int mileage){
        //calling superclass constructor
        super(carId, carName, carBrand, carPrice);

        //initializing attributes to empty string
        this.distributorName = "";
        this.bookedDate = "";
        this.purchaseDate = "";
        this.transmissionType = "";
        //initializing attribute to false
        this.isPurchased = false;
        //initializing attributes
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
        this.fuelType = fuelType;

    }

    //accessor methods
    public String getDistributorName(){
        return this.distributorName;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public String getBookedDate(){
        return this.bookedDate;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public int getMileage(){
        return this.mileage;
    }

    public String getTransmissionType(){
        return this.transmissionType;
    }

    public boolean getIsPurchased(){
        return this.isPurchased;
    }

    //mutator methods
    public void setDistributorName(String newDistributorName){
        //assigning value to distributorName attribute
        this.distributorName = newDistributorName;
    }

    public void setTransmissionType(String transmissionType){
        //assigning value to transmissionType attribute
        this.transmissionType = transmissionType;
    }

    //purchase method
    public void purchase(String purchaseDate, String bookingDate){
        if(isPurchased == true){
            //setting color by calling setCarColor method of parent class
            super.setCarColor("Red");

            //assigning values to variables using accessor methods
            int carId = getCarId();
            String carName = getCarName();
            String carBrand = getCarBrand();
            String carColor = getCarColor();
            String carPrice = getCarPrice();

            //displaying the details of the car
            System.out.println("Identification of the car: " + carId);
            System.out.println("Name of the car: " + carName);
            System.out.println("Brand of the car: " + carBrand);
            System.out.println("Color of the car: " + carColor);
            System.out.println("Price of the car: " + carPrice);
            System.out.println("Distributor Name of the car: " + this.distributorName);
        } else{
            //assigning values to attributes
            this.setDistributorName("Toyota Limited");
            this.setTransmissionType("Automatic");
            this.purchaseDate = purchaseDate;
            this.bookedDate = bookingDate;
            this.isPurchased = true;
        }
    }

    // overriding display method
    @Override
    public void display(){
        //calling superclass method
        super.display();
        if(isPurchased == true){
            //printing the details of the car
            System.out.println("Distributor Name: " + this.distributorName);
            System.out.println("Fuel Type: " + this.fuelType);
            System.out.println("Purchase Date: " + this.purchaseDate);
            System.out.println("Booked Date: " + this.bookedDate);
            System.out.println("Mileage: " + this.mileage + " kmpl");
            System.out.println("Number of Seats: " + this.numberOfSeats);
            System.out.println("Transmission Type: " + this.transmissionType);
        }
    }
}

