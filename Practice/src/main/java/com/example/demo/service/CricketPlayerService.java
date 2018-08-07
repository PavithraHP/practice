package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CricketBean;
import com.example.demo.repository.PlayerRepository;

@Service
public class CricketPlayerService implements CricketService {
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public List<CricketBean> getAllCricketPlayers(){
		
		List<CricketBean> cricket = (List<CricketBean>) playerRepository.findAll();
		
		return cricket;
		 
		
	}
	
	

}
