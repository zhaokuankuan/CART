package domain;
//优惠券的实体类
public class Coupon {
    //优惠券到期日期
    private String couponDate;
    //优惠券可使用总金额
    private double total;
    //优惠额度
    private double discount;

    public Coupon(String couponDate, double total, double discount)
    {
        this.couponDate = couponDate;
        this.total = total;
        this.discount = discount;
    }


    public String getCouponDate()
    {
        return couponDate;
    }

    public double getTotal()
    {
        return total;
    }

    public double getDiscount()
    {
        return discount;
    }
}
