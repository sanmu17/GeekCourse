package com.geek.homework02;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 类描述：
 *
 * @ClassName method06
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:16
 * @Version 1.0
 */
public class method07_CyclicBarrier {
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
   public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        cyclicBarrier.await();
        System.out.println("异步执行结果:" + sumThread.getResult());
        System.out.println("花费时间：" + (System.currentTimeMillis() - start) + "ms");
    }

    static class SumThread extends Thread {
        private Integer result;

        public Integer getResult() {
            return result;
        }

        @Override
        public void run() {
            try {
                result = CalculateUtils.getSum(10);
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}
