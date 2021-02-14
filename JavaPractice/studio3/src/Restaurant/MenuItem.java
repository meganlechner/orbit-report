package Restaurant;

public class MenuItem {
    private String description;
    private float price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, float price){
        this.description = description;
        this.price = price;
        this.category = "not categorized";
        this.isNew = true;
    }

    public MenuItem(String name, String description, float price, String category, boolean isNew){
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getDescription() { return this.description; }
    public void setDescription (String description) { this.description = description; }
    public float getPrice() { return this.price; }
    public void setPrice (float price) { this.price = price; }
    public String getCategory() { return this.category; }
    public void setCategory (String category) { this.category = category; }
    public boolean getIsNew() { return this.isNew; }
    public void setIsNew (boolean isNew) { this.isNew = isNew; }

    public void printIsNew(){
        if (isNew) {System.out.println("NEW!");}
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        else return false;

    }
}


