package service;
import common.ProductEnum;
import common.Utils;
import domain.Coupon;
import domain.DisCount;
import domain.Product;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateBean {

    List<DisCount> disCountList = new ArrayList<DisCount>();
    List<Product> productList = new ArrayList<Product>();
    Coupon coupon = null;
    String date = null;


    public Integer createBean(int step,String str){
        Integer newStep  = step;
        try{
            switch (newStep){
                case 0:
                    String[] discountArr = str.split("\\|");
                    disCountList.add(new DisCount(discountArr[0],Double.parseDouble(discountArr[1]),discountArr[2]));
                    break;
                case 1:
                    String[] productArr = str.split("[\\*\\:\\：]");
                    productList.add(new Product(Integer.parseInt(productArr[0]),productArr[1],Double.parseDouble(productArr[2])));
                    break;
                case 2:
                    date = str;
                    newStep = 3;
                    break;
                case 3:
                    String[] couponarr = str.split("\\s");
                    coupon  = new Coupon(couponarr[0],Double.parseDouble(couponarr[1]),Double.parseDouble(couponarr[2]));
                    break;
                default:
                    if("输出".equals(str)){
                        newStep = 4;
                    }
                    System.out.print(Double.parseDouble(new DecimalFormat("#.00").format(getMoney( disCountList,productList, coupon,date))));
                    break;
            }
        }catch (Exception e){
            newStep =5;
            disCountList.clear();
            productList.clear();
            coupon = null;
            date = null;
        }
        return  newStep;
    }

    public double  getMoney(List<DisCount> disCountList,List<Product> productList,Coupon coupon,String date){
        ProductEnum productEnum = new ProductEnum();
        Double countMoney = 0.00;
        Map<String,Double> map = new HashMap<String,Double>();
        if(disCountList.size()>0){//说明有折扣
            for(DisCount disCount :disCountList){
                map.put(disCount.getProductType(),disCount.getRatio());
            }
        }
        if(productList.size() > 0){
            for (Product product:productList){
                Double ratio =map.get(productEnum.getType(product.getProductName()));
                if(Utils.isNotEmpty(ratio)){
                    countMoney += product.getPrice()*product.getNum()*ratio;
                }else{
                    countMoney += product.getPrice()*product.getNum();
                }
            }
        }
        if(coupon != null && Utils.isNotEmpty(coupon.getCouponDate())){
            if(Utils.compareDate(date,coupon.getCouponDate())<=-1&&coupon.getTotal()<=countMoney){
                countMoney  -= coupon.getDiscount();
            }
        }
        return countMoney;
    }

}
