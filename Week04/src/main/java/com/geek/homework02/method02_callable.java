package com.geek.homework02;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 类描述：
 *
 * @ClassName callable实现异步调用
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 13:18
 * @Version 1.0
 */
public class method02_callable {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(sumThread);
        new Thread(futureTask).start();
        System.out.println("异步执行结果:"+futureTask.get());
        System.out.println("花费时间："+(System.currentTimeMillis()-start)+"ms");
    }
    static class SumThread implements Callable{

        @Override
        public Object call() throws Exception {
            return CalculateUtils.getSum(10);
        }
    }
}
