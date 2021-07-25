package com.jizhong.test;

/**
 * 1. 继承Thread类
 */
public class MyThread extends Thread{
	
	/**
	 * 2. 重写Thread类中的run方法（开启线程后要做的事情）
	 */
	@Override
    public void run() {
      for(int i = 0;i < 100;i++){
    	  System.out.println("MyThread：" + i);
      }
    }
}
