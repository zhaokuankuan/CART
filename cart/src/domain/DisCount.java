package domain;

import java.sql.Date;

//折扣的实体
public class DisCount {

    public DisCount(String disCountDate,double ratio,String productType){
        this.disCountDate = disCountDate;
        this.ratio = ratio;
        this.productType = productType;
    }
    //折扣日期
    private String disCountDate;
    //折扣类型
    private double ratio;
    //产品品类
    private String productType;



    public String getProductType()
    {
        return productType;
    }

    public double getRatio()
    {
        return ratio;
    }
}
