class CartItem{
    String itemName;
    int price;
    int quantity;

    CartItem(){
        this.price = 0;
        this.quantity = 0;
    }
    
    void addItem(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity += quantity;
    }

    void removeItem(int quantity){
        this.quantity -= quantity;
    }

    int getTotalCost(){
        return this.price*this.quantity;
    }
    void display(){
        System.out.println("Name of the item is " + itemName);
        System.out.println("Price of the item is " + price);
        System.out.println("Total number of items are " + quantity);
        System.out.println("Total cost is " + getTotalCost());
    }

}

public class ShoppingCart {

    public static void main(String[] args){
        CartItem item = new CartItem();
        item.addItem("football", 800, 2);
        item.removeItem(1);
        item.display();
    }
}