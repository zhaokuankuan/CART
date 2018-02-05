package common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductEnumTest
{
    ProductEnum productEnum = new ProductEnum();
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    //根据物品名称得到种类
    public void getType() throws Exception
    {
        String message = productEnum.getType("ipad");
        Assert.assertEquals("电子",message);
    }

}