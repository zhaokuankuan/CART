package controller;
import common.Utils;
import service.CreateBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainController {



    public static  void main(String args []){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CreateBean createBean = new CreateBean();
        System.out.println("请输入：");
        int step = 0;//当前输入的数据的类型：默认是0促销信息，1产品信息，2时间，3优惠券的信息，4输出,5是错误标记位
        try {
            while (step< 6){
                if(step == 5 ){ //用来检测输入的数据错误
                    step = 0;
                    System.out.println("请重新输入：");
                }
                String read = "";
                read  = reader.readLine();
                if(Utils.isNotEmpty(read)){
                    step = createBean.createBean(step,read);
                }else{
                    step++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
