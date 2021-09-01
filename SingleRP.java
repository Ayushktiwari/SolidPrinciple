class Book {
    String name;
    String authorName;
    int price;

    public Book(String name, String authorName, int price) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
    }
}
  class Invoice {

     Book book;
     int quantity;
     double discountRate;
     double taxRate;
     double total;

    public Invoice(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = (book.price  * this.quantity);

        return price;
    }
}
   class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Qty of book is: "+invoice.quantity + "  Name of book is: " + invoice.book.name + "  Price is:  " + invoice.book.price );
        System.out.println("Total: " + invoice.total );
    }
}
 class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename) {

        System.out.println("Saved");
    }
}

class SingleRP{
    public static void main(String[] args) {
        Book b = new Book("ABC", "Ayush", 56);
        Invoice invoice = new Invoice(b, 5);
        InvoicePrinter ip = new InvoicePrinter(invoice);
                ip.print();

    }
}