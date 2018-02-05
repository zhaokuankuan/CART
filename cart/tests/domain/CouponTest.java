package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CouponTest
{
    Coupon coupon = new Coupon("2017.01.01",35.00,28.00);
    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    //get时间测试
    public void getCouponDate() throws Exception
    {
        String str = coupon.getCouponDate();
        Assert.assertEquals("2017.01.01",str);
    }

    @Test
    //get总金额的测试
    public void getTotal() throws Exception
    {
        Double aDouble = coupon.getTotal();
        Assert.assertEquals(35.00,aDouble,0.00);
    }

    @Test
    //get优惠金额的测试
    public void getDiscount() throws Exception
    {
        Double aDouble = coupon.getDiscount();
        Assert.assertEquals(28.00,aDouble,0.00);
    }

}