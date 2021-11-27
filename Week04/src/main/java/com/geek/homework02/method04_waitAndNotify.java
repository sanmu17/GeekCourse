package com.geek.homework02;

/**
 * 类描述：
 *
 * @ClassName method04
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 15:06
 * @Version 1.0
 */
public class method04_waitAndNotify {
    private static final Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        synchronized (lock){
            lock.wait();
        }
        System.out.println("异步执行结果:"+sumThread.getResult());
        System.out.println("花费时间："+(System.currentTimeMillis()-start)+"ms");
    }
    static class SumThread extends Thread{
	    private Integer result;

		public Integer getResult() {
			return result;
		}

		@Override
		public void run() {
		    synchronized (lock){
		        result = CalculateUtils.getSum(10);
			    lock.notifyAll();
            }
		}
    }
}
