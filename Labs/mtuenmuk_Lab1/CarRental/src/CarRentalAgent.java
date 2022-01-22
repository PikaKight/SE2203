import java.util.ArrayList;

public class CarRentalAgent {
    private String companyName, address;
    private ArrayList<Car> CarInventory = new ArrayList<Car>();

    /**
     * Constructor that sets the company name and address with the
     * respective param
     * @param name The company name
     * @param address The company address
     */
    public CarRentalAgent(String name, String address){
        this.companyName = name;
        this.address = address;
    }

    /**
     * Checks if a given car is already in the car inventory arraylist
     * If it isn't then it will add it to the inventory
     * @param car A Car type object that will be checked before adding to the inventory
     * @return True if the car is not in the inventory and is now added to it
     *         False if the car is already in the inventory
     *
     */
    public Boolean addInventory(Car car){
        for (Car i:CarInventory){
            if ((i.isSameCar(car))){
                return false;
            }
        }

        CarInventory.add(car);
        return true;
    }

    /**
     * Prints out the inventory with the appropriate formatting with the company name and address
     */
    public void printInventory(){
        System.out.printf("Agent Name: %s\nAgent Address: %s\n", this.companyName, this.address);
        System.out.printf("\n%-18s %-11s %-17s %s\n", "Car Model and make", "Year-color", "VIN", "Category");
        System.out.println("------------------ ----------- ----------------- ------------------");
        for (Car i: CarInventory){
            System.out.println(i);
        }
    }

    /**
     * Checks if a car is already rented before renting it out
     * @param car A Car type object being rented out
     * @return True if the rental is successful
     *         False if the car is already rented
     */
    public Boolean rentCar(Car car){
        if (car.isRented()){
            return false;
        }

        //Sets the rental status to true to indicate it is rented
        car.setRented(true);
        return true;
    }

    /**
     * Checks if the car is rented before returning it
     * @param car A Car type object being returned
     * @return True if the car was rented and is now returned
     *         False if the car was not rented
     */
    public Boolean returnCar(Car car){
        //If the car is rented out, then change the rental status to false indicating it has been returned
        if (car.isRented()){
            car.setRented(false);
            return true;
        }

        return false;
    }
}
