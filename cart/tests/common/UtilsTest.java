package common;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class UtilsTest {
    static  Object object;
    static  String str1;
    static String str2;
    static  String str3;
    @Before
    public void setUp() throws Exception
    {
        object = null;
        str1 = "2017.01.01";
        str2 = "2017.02.01";
        str3="001";
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    //测试对象为空
    public void isEmpty() throws Exception
    {
        boolean obj = Utils.isEmpty(object);
        Assert.assertEquals(true,obj);
    }

    @Test
    //测试对象是否非空
    public void isNotEmpty() throws Exception
    {
        boolean obj = Utils.isNotEmpty(object);
        Assert.assertEquals(false,obj);
    }

    @Test
    //判断是否非空
    public void isNotEmpty1() throws Exception
    {
        boolean testStr = Utils.isNotEmpty(str1);
        Assert.assertEquals(true,testStr);
    }

    @Test
    //比较两个时间的大小
    public void compareDate() throws Exception
    {
        int flag = Utils.compareDate(str1,str2);
        Assert.assertEquals(-1,flag);
    }

    @Test
    //将字符串转为数字
    public void stringToInt() throws Exception
    {
        int tetsInt = Utils.stringToInt(str3);
        Assert.assertEquals(1,tetsInt);
    }

}