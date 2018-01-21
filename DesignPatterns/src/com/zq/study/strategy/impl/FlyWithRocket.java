package com.zq.study.strategy.impl;

import com.zq.study.strategy.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

	public void performFly() {
		System.out.println("用火箭在太空遨游");
	}

}
