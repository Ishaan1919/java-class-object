class Item{
    String itemName;
    int itemCode;
    int price;

    Item(String itemName, int itemCode, int price){
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Name of the Item is " + itemName);
        System.out.printf("Price of %s is %d",itemName,price);
        System.out.printf("\nItemCode of %s is %d",itemName,itemCode);
    }
}

public class TrackInventory {
    public static void main(String[] args) {
        String itemName = "Football";
        int itemCode = 1;
        int price = 25000;
        
        Item item = new Item(itemName,itemCode,price);
        item.displayDetails();
    }
    
}



