package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductTest
{
    Product product = new Product(12,"ipad",2399.00);
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    //get数量的测试
    public void getNum() throws Exception
    {
        int flag = product.getNum();
        Assert.assertEquals(12,flag);
    }

    @Test
    //get产品名称的测试
    public void getProductName() throws Exception
    {
        String s = product.getProductName();
        Assert.assertEquals("ipad",s);

    }

    @Test
    //get单价的测试
    public void getPrice() throws Exception
    {
        Double aDouble = product.getPrice();
        Assert.assertEquals(2399.00,aDouble,0.00);
    }

}