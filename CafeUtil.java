import java.util.Arrays;
import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] total){
        double sum = 0.0;
        for(int i = 0; i<total.length; i++) {
            sum = sum + total[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++){ 
            // String item = menuItems.get(i);
            System.out.println(i + " " + menuItems.get(i));
            // System.out.println(item);

        } 
    }

    public void addCustomer(ArrayList<String> cstmr){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!", userName);
        // ArrayList = size() and primitive array = length
        System.out.printf("There are %s people in front of you",cstmr.size());
        cstmr.add(userName);
    }
}