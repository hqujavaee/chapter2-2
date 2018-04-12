package cn.edu.hqu.javaee.domain.cd.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
