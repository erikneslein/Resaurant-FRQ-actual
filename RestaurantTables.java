import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class RestaurantTables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RestaurantTables
{
    private Table[] allTables;
    
    public void placeTableOrders(int tableNum, String[] foods, double prices[])
    {
        for (int i=0; i<foods.length; i++)
        {
            allTables[tableNum].placeOrder(foods[i], prices[i]);
        }
    }
    
    public double totalBill(int tableNum)
    {
        double bill = 0.0;
        ArrayList<Double> prices = allTables[tableNum].getPrices();
        for (double p : prices)
        {
            bill += p;
        }
        return bill;
    }
    
    public double computeTip(int tableNum)
    {
        double tip = 0.0;
        ArrayList<String> foods = allTables[tableNum].getFoods();
        if (foods.size() > 5)
            tip += totalBill(tableNum)*0.15;
        else
            return tip;
        return tip;
    }
    
     public String toString()
    {
        String answer = "";
        for (int i=0; i<allTables.size(); i++) {
            for (Table p : prices)
                answer += p+"\n";
            }
        return answer;
    }
}
