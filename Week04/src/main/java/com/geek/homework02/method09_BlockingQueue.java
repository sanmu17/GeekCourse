package com.geek.homework02;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 类描述：
 *
 * @ClassName method06
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:16
 * @Version 1.0
 */
public class method09_BlockingQueue {
    private static final ArrayBlockingQueue queue = new ArrayBlockingQueue(1);

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        int take = (int) queue.take();
        System.out.println("异步执行结果:" + take);
        System.out.println("花费时间：" + (System.currentTimeMillis() - start) + "ms");
    }

    static class SumThread extends Thread {
        @Override
        public void run() {
            try {
                int result = CalculateUtils.getSum(10);
                queue.add(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
