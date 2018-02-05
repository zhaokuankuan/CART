package domain;

//产品实体类
public class Product {
    //产品数量
    private int num;
    //产品名称
    private String productName;
    //单价
    private double price;

    public Product(int num,String productName,double price){
        this.num = num;
        this.productName = productName;
        this.price = price;
    }


    public int getNum()
    {
        return num;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }
}
