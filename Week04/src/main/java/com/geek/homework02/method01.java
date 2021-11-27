package com.geek.homework02;

/**
 * 类描述：
 *
 * @ClassName method01
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 13:05
 * @Version 1.0
 */
public class method01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int res = sum();
        System.out.println("异步执行结果:"+res);
        System.out.println("花费时间："+(System.currentTimeMillis()-start)+"ms");
    }

    private static int sum() {
        return CalculateUtils.getSum(10);
    }
}
