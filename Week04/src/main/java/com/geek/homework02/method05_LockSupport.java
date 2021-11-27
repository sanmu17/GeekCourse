package com.geek.homework02;

import java.util.concurrent.locks.LockSupport;

/**
 * 类描述：
 *
 * @ClassName method05
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:11
 * @Version 1.0
 */
public class method05_LockSupport {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();

        sumThread.setThread(Thread.currentThread());
        sumThread.start();
        LockSupport.park();

        System.out.println("异步执行结果:"+sumThread.getResult());
        System.out.println("花费时间：" + (System.currentTimeMillis() - start) + "ms");
    }

    static class SumThread extends Thread {
        private Integer result;
        private Thread thread;

        public Thread getThread() {
            return thread;
        }

        public void setThread(Thread thread) {
            this.thread = thread;
        }

        public Integer getResult() {
            return result;
        }

        @Override
        public void run() {
            result = CalculateUtils.getSum(10);
            LockSupport.unpark(getThread());
        }
    }
}
