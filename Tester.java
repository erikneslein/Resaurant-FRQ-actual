import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args )
    {
        double[] prices1 = {19.25, 7.50, 8.43, 9.26, 10.72, 3.37, 8.27};
        String[] foods1 = {"steak", "fish", "chicken", "pork", "shrimp", "crab", "deer"};
        
        RestaurantTables eriksBBQ = new RestaurantTables();
        
        eriksBBQ.placeTableOrders(0, foods1, prices1);
        System.out.println("Bill: " + eriksBBQ.totalBill(0));
        System.out.println("Tip: " + eriksBBQ.computeTip(0));
        System.out.println();
        
        double[] prices2 = {9.38, 6.63, 19.83, 17.37};
        String[] foods2 = {"steak", "fish", "chicken", "pork"};
        
        eriksBBQ.placeTableOrders(1, foods2, prices2);
        System.out.println("Bill: " + eriksBBQ.totalBill(1));
        System.out.println("Tip: " + eriksBBQ.computeTip(1));
    }
}
