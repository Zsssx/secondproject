package secondproject;

class Book{
    private String title;
    private double price;

    public Book(String t,double p){
        setTitle(t);
        setPrice(p);
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice(){
        return price;
    }

    public void getInfo(){
        System.out.println("图书名称："+title+"，价格："+price);
    }
}

public class TestDemo {
    public static  void main(String args[]){
        Book book=new Book("Windows 程序设计第五版",499.5);
        book.getInfo();
    }
}