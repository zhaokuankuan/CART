package common;

import java.util.*;
public class ProductEnum {

    public enum TypeNnum{
        ELE("电子"),FOOD("食品"),NECESSARY("日用品"),WINE("酒类");

        //私有的构造方法
        private TypeNnum(String value){
            this.setValue(value);
        }
        private String value;

        public void setValue(String value)
        {
            this.value = value;
        }

    }

    public  static List<String> eleList = new ArrayList<String>(Arrays.asList("ipad","iphone","显示器","笔记本电脑","键盘"));
    public  static List<String> foodList  = new ArrayList<String>(Arrays.asList("面包","饼干","蛋糕","牛肉","鱼","蔬菜"));
    public  static List<String> necessarylist = new ArrayList<String>(Arrays.asList("餐巾纸","收纳箱","咖啡杯","雨伞"));
    public  static List<String> wineList = new ArrayList<String>(Arrays.asList("啤酒","白酒","加伏特"));
    public static  EnumMap<TypeNnum,List<String>> itemEnum = new EnumMap<TypeNnum, List<String>>(TypeNnum.class);
    static {
        itemEnum.put(TypeNnum.ELE,eleList);
        itemEnum.put(TypeNnum.FOOD,foodList);
        itemEnum.put(TypeNnum.NECESSARY,necessarylist);
        itemEnum.put(TypeNnum.WINE,wineList);
    }

    public  String getType(String name){
        for (EnumMap.Entry<TypeNnum ,List<String>> entry:itemEnum.entrySet()){
            for (String s :entry.getValue()){
                if(s.contains(name)){
                    return  entry.getKey().value;
                }
            }
        }
        return null;
    }
}
