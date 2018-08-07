package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CricketBean;
import com.example.demo.service.CricketPlayerService;

@RestController
@RequestMapping("/api")
public class CricketPlayersController {
    
	@Autowired
	CricketPlayerService cricketPlayerService;
	@GetMapping(value = "/players", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CricketBean> getAllPlayersInfo() {
		System.out.println("hello");
		
	List<CricketBean> cricket =cricketPlayerService.getAllCricketPlayers();
	
		return cricket;
	}

}
