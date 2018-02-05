package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DisCountTest
{
    DisCount disCount = new DisCount("2017.11.11",0.7,"电子");
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    //get类型的测试
    public void getProductType() throws Exception
    {
        String type = disCount.getProductType();
        Assert.assertEquals("电子",type);
    }

    @Test
    //get折扣的测试
    public void getRatio() throws Exception
    {
        Double aDouble = disCount.getRatio();
        Assert.assertEquals(0.7,aDouble,0.00);

    }

}