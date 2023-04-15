/**
 * @author (21039881 Kaman Diwash Shrestha)
 * @version (1.0.0)
 */
public class Car
{
    //attributes
    private int carId;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;

    //constructor 
    public Car(int carId, String carName, String carBrand, String carPrice){
        //initializing the attributes
        this.carId = carId;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        //car color is initialized to empty string
        this.carColor = "";
    } 

    //accessor methods
    public int getCarId(){
        return this.carId;
    }

    public String getCarName(){
        return this.carName;
    }

    public String getCarBrand(){
        return this.carBrand;
    }

    public String getCarPrice(){
        return this.carPrice;
    }

    public String getCarColor(){
        return this.carColor;
    }

    //mutator methods
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }

    //displaying car details
    public void display(){
        //printing the attributes
        System.out.println("Car ID: " + this.carId);
        System.out.println("Car Name: " + this.carName);
        System.out.println("Car Brand: " + this.carBrand);
        System.out.println("Car Price: " + this.carPrice);

        //checking value of carColor
        if(this.carColor.equals("")){
            System.out.println("The car's color cannot be identified.");
        } else{
            System.out.println("Car Color: " + this.carColor);
        }
    }
}
