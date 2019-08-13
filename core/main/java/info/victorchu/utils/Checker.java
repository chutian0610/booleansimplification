package info.victorchu.utils;

/**
 * @Author victor
 * @Email victorchu0610@outlook.com
 * @Data 2019/5/23
 * @Version 1.0
 * @Description 工具类
 */
public class Checker {
    public static void checkNotNull(Object object,String message){
        if(object == null){
            throw new IllegalArgumentException(message);
        }
    }

}
