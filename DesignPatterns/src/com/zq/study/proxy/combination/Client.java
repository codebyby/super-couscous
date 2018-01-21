package com.zq.study.proxy.combination;

public class Client {

	/**
	 * 测试类
	 */
	public static void main(String[] args) {
		Car car = new Car();
		CarLogProxy clp = new CarLogProxy(car);
		CarTimeProxy ctp = new CarTimeProxy(clp);
		ctp.move();
	}

}
