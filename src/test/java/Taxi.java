import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Taxi extends Car implements Vehicle{
    public static List<Taxi> taxis = new ArrayList<>();
    private int decrement;
    private int increment;
    private int price;
    private double consumption;
    private int productionYear;
    int sum = 0;

    public Taxi(String manufacturer, int productionYear, int wheel, double consumption, int price, int maxSpeed){
        this.manufacturer=manufacturer;
        this.productionYear=productionYear;
        this.wheel=wheel;
        this.consumption=consumption;
        this.price=price;
        this.maxSpeed=maxSpeed;
    };


    @Override
    public void speedUp(int speed) {
        speed = speed + increment;
    }

    @Override
    public void slowDown(int slow) {
        speed = speed - decrement;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDecrement() {
        return decrement;
    }

    public void setDecrement(int decrement) {
        this.decrement = decrement;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

}
