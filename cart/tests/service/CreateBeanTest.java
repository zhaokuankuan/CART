package service;

import domain.Coupon;
import domain.DisCount;
import domain.Product;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CreateBeanTest
{
    CreateBean createBean =new CreateBean();
    List<DisCount> disCountList = new ArrayList<DisCount>();
    List<Product> productList = new ArrayList<Product>();
    Coupon coupon = null;
    String date = null;

    String strdiscount = "2017.11.11|0.7|电子";
    String strproduct = "12*面包：5.00";
    String strcoupon = "2017.1.1 1000 200";
    String strdate = "2016.09.09";
    @Before
    public void setUp() throws Exception
    {
        disCountList.add(new DisCount("2017.11.11",0.7,"电子"));
        productList.add(new Product(12,"面包",5.00));
        coupon = new Coupon("2017.1.1",1000,200);
        date = "2016.09.09";
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    //接收数据的测试
    public void createBean() throws Exception
    {
        int step = 0;
        int flag = createBean.createBean(step,strdiscount);
        Assert.assertEquals(0,flag);

         step = 1;
         flag = createBean.createBean(step,strproduct);
        Assert.assertEquals(1,flag);

        step = 2;
        flag = createBean.createBean(step,strdate);
        Assert.assertEquals(3,flag);

        step = 3;
        flag = createBean.createBean(step,strcoupon);
        Assert.assertEquals(3,flag);

        step = 4;
        flag = createBean.createBean(step,"输出");
        Assert.assertEquals(4,flag);

        step = 1;
        flag = createBean.createBean(step,"输出");
        Assert.assertEquals(5,flag);

    }

    @Test
    //获取总金额的测试
    public void getMoney() throws Exception
    {
        Double aDouble = createBean.getMoney(disCountList,productList,coupon,date);
        Assert.assertEquals(60.00,aDouble,0.00);
    }

}