class MobilePhone{
    String brand;
    String modle;
    int price;

    MobilePhone (String brand, String modle, int price){
        this.brand = brand;
        this.modle = modle;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Brand of the Mobile Phone is " + brand);
        System.out.printf("Price of the Moblie Phone is %d",price);
        System.out.printf("\nModle of the Mobile Phone is %s",modle);
    }
}

public class MobilePhoneDetails {

    public static void main(String[] args) {
        String brand = "Samsung";
        String modle = "f-62";
        int price = 30000;
        
        MobilePhone mobile = new MobilePhone(brand,modle,price);
        mobile.displayDetails();
    }
}