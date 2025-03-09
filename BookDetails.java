class Book{
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Title of the book is " + title);
        System.out.printf("Price of the book %s is %d",title,price);
        System.out.printf("\nAuthor of the book %s is %s",title,author);
    }
}
public class BookDetails{
    public static void main(String[] args) {
        String title = "Coding with Ishaan";
        String author = "Ishaan";
        int price = 1000;
        
        Book book = new Book(title,author,price);
        book.displayDetails();
    }
}

