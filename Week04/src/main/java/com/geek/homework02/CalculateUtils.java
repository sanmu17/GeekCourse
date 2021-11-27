package com.geek.homework02;

/**
 * 类描述：
 *
 * @ClassName CalculateUtils
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 13:17
 * @Version 1.0
 */
public class CalculateUtils {
    public static int getSum(int n){
        int res = 0;
        for (int j = 0; j <= n; j++) {
            res += j;
        }
        return res;
    }
}
