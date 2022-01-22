public class Car implements Comparable{

    private String make, model, color, year, VIN;
    private int noOfDoors, noOfSeats, noOfSuitcases, noOfBags;
    private Boolean rented;

    /**
     * Constructor that will set the make, model, color and year to their respective
     * param and set rented to false
     * @param make The brand of car
     * @param model The specific car product
     * @param color The color of the car
     * @param year The year the car was produced
     */
    public Car(String make, String model, String color, String year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.rented = false;
    }

    /**
     * Sets the VIN of the car
     * @param vin The car's vehicle id number
     */
    public void setVIN(String vin){
        this.VIN = vin;
    }

    /**
     * Sets the car's number of doors and seats
     * @param door number of doors
     * @param seat number of seats
     */
    public void setSize(int door, int seat){
        this.noOfDoors = door;
        this.noOfSeats = seat;
    }

    /**
     * Sets the number of suitcases and bags in the car
     * @param suitcase number of suitcases
     * @param bag number of bags
     */
    public void setLuggage(int suitcase, int bag){
        this.noOfSuitcases = suitcase;
        this.noOfBags = bag;
    }

    /**
     * Sets the rental status of the car
     * @param status Is the car rented or not
     */
    public void setRented(Boolean status){
        this.rented = status;
    }

    /**
     * Creates a string with the car's make, model year-color
     * @return A string with the car's info
     */
    public String getCarInfo(){
        return String.format("%s, %s %s-%s", this.make, this.model, this.year, this.color);
    }

    /**
     * Checks if 2 cars are the same using their VIN
     * @param car Another Car type object that is being checked
     * @return true if the 2 cars are the same or false if different
     */
    @Override
    public Boolean isSameCar(Car car) {
        if (this.VIN == car.VIN){
            return true;
        }

        return false;
    }

    /**
     * Gets the category type of the car in terms of its size and luggage
     * @return The car category type
     */
    @Override
    public String getCategory() {
        if (this.noOfDoors == 4 && this.noOfSeats == 5 && this.noOfSuitcases == 1 && this.noOfBags == 1){
            return "Economy";
        }

        else if (this.noOfDoors == 4 && this.noOfSeats == 5 && this.noOfSuitcases == 1 && this.noOfBags == 2){
            return "Compact";
        }

        else if (this.noOfDoors == 4 && this.noOfSeats == 5 && this.noOfSuitcases == 2 && this.noOfBags == 1){
            return "Mio-size(Standard)";
        }

        else if (this.noOfDoors == 4 && this.noOfSeats == 5 && this.noOfSuitcases == 2 && this.noOfBags == 2){
            return "Full-size(Premium)";
        }

        else if (this.noOfDoors == 2 && this.noOfSeats == 4 && this.noOfSuitcases == 1 && this.noOfBags == 1){
            return "Convertible";
        }

        return "Category not available";
    }

    /**
     * Checks if the car is rented
     * @return the rental status of the car
     */
    @Override
    public Boolean isRented() {
        return this.rented;
    }

    /**
     * Creates a string, with the appropriate formatting, of the car's info, VIM and category
     * @return
     */
    @Override
    public String toString() {
        String makeModel = String.format("%s, %s", this.make, this.model);
        String yearColor = String.format("%s-%s", this.year, this.color);
        return String.format("%-18s %-11s %-17s %s", makeModel,yearColor, this.VIN, this.getCategory());
    }
}
