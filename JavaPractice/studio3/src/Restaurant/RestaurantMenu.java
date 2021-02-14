package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class RestaurantMenu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated = new Date();

    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated() { this.lastUpdated = lastUpdated; }

    public void printLastUpdate(){ System.out.print("Last updated: " + lastUpdated); }

    //public void add menu item to array
    public void addItemToMenu(MenuItem newItem){
        this.menuItems.add(newItem);
    }


    //public void remove menu item from array


}
