package secondproject;

class Book{
    private String title;
    private double price;

    public Book(){
        System.out.println("无参数的构造方法");
    }

    public Book(String t){
        setTitle(t);
        System.out.println("有一个参数的构造方法");
    }

    public Book(String t,double p){
        setTitle(t);
        setPrice(p);
        System.out.println("有两个参数的构造方法");
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
        Book book=new Book("Java的实战开发");
        book.getInfo();
    }
}