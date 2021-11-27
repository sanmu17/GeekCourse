package com.geek.homework02;

/**
 * 类描述：
 *
 * @ClassName method03----使用join方法
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/11/27 14:54
 * @Version 1.0
 */
public class method03_join {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        SumThread sumThread = new SumThread();
        sumThread.start();
        sumThread.join();
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
			result = CalculateUtils.getSum(10);
		}
    }
}
