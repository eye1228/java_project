package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start(); 神嫌害. 訊? Runnable引 Ex07,08,09拭 start五社球亜 蒸嬢辞.
		
		
		
		
		//Thread thread1 = new Thread();//戚叶精 start五社球 赤製. 展為戚 蒸生艦 戚 奄沙 持失切研 床走 省製.
		Thread thread1 = new Thread(t1);//展為戚 赤澗 t1
		
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		new Thread(new Runnable() {//斥誤 鎧採適掘什
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "けけけけけけけけけ");
				}
			}
		}).start();
		
	}
}
