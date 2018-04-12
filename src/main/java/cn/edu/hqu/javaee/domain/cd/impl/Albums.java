package cn.edu.hqu.javaee.domain.cd.impl;

import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;

@Component
public class Albums implements CompactDisc {

	private String title="跨时代";
	private String artist="周杰伦";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("正在播放"+artist+"的专辑《"+title+"》");
	}

}
