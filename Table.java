import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Table here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Table
{
    private ArrayList<String> foods;
    
    private ArrayList<Double> prices;
    
    public Table()
    {
        foods = new ArrayList<String>();
        prices = new ArrayList<Double>();
    }
    
    public void placeOrder(String food, Double price)
    {
        foods.add(food);
        prices.add(price);
    }
    
    public ArrayList<String> getFoods()
    {
        return foods;
    }
    
    public ArrayList<Double> getPrices()
    {
        return prices;
    }
    
    public String toString() 
    {
        return foods + " " + prices;
    }
}


