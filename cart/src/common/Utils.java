package common;

public class Utils {

    public static boolean isEmpty(Object object) {
        if (object == null || object.equals("") || object.equals("null"))
            return true;
        return false;
    }

    public static boolean isNotEmpty(Object object) {
        return !isEmpty(object);
    }


    public static boolean isNotEmpty(String str) {
        return !isEmpty((Object) str);
    }




    //前者比后者大返回1，相等返回0，小于返回-1
    public static int compareDate(String sourceDate, String targetTate) {
        String [] intSourDateArr  = sourceDate.split("\\.");
        String [] intTargetTateArr =targetTate.split("\\.");
        if(stringToInt(intSourDateArr[0])>stringToInt(intTargetTateArr[0])){
            return  1;
        }else if(stringToInt(intSourDateArr[0])<stringToInt(intTargetTateArr[0])){
            return  -1;
        }else{
            if(stringToInt(intSourDateArr[1])>stringToInt(intTargetTateArr[1])){
                return  1;
            }else if(stringToInt(intSourDateArr[1])<stringToInt(intTargetTateArr[1])){
                return -1;
            }else{
                if(stringToInt(intSourDateArr[2])>stringToInt(intTargetTateArr[2])){
                    return  1;
                }else if(stringToInt(intSourDateArr[2])<stringToInt(intTargetTateArr[2])){
                    return  -1;
                }else{
                    return 0;
                }
            }
        }
    }

    //将string转int的方法
    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }


}
