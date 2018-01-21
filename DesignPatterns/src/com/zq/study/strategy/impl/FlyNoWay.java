package com.zq.study.strategy.impl;

import com.zq.study.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	public void performFly() {
		System.out.println("我不会飞行！");
	}

}
