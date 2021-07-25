package com.jizhong.test;

/**
 * java程序属于抢占式调度，那个线程优先级高，哪个线程优先执行；同一优先级，随机选择一个执行
 */
public class TestMain {
	public static void main(String[] args) {
		//3. 实例化线程子类
		MyThread mt = new MyThread();
		//4. 调用Thread类中的start方法，开启新的线程，执行run方法
		mt.start();
		for(int i = 0;i < 100;i++){
			System.out.println("main线程：" + i);
		}
		
	}
}
