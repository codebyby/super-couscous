package com.zq.study;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Map<Integer,Object> map = new HashMap<Integer,Object>();
		long start= System.currentTimeMillis();
		System.out.println("开始时间：" + start);
		for (int i = 0; i < 10000000; i++) {
			map.put(i, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("结束时间："+end);
		System.out.println("花费时间："+(end -start));
	}

}
