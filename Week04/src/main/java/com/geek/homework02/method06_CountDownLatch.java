package com.geek.homework02;

import java.util.concurrent.CountDownLatch;

/**
 * 类描述：
 *
 * @ClassName method06
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:16
 * @Version 1.0
 */
public class method06_CountDownLatch {
    private static final CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        countDownLatch.await();
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
            result = CalculateUtils.getSum(10);
            countDownLatch.countDown();
        }
    }

}
