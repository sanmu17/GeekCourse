package com.geek.homework02;

import java.util.concurrent.Semaphore;

/**
 * 类描述：
 *
 * @ClassName method06
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:16
 * @Version 1.0
 */
public class method08_Semaphore {
    private static final Semaphore semaphore = new Semaphore(0);

   public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        semaphore.acquire();
        System.out.println("异步执行结果:"+sumThread.getResult());
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
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
