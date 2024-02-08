package com.CHB.StartFlow.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CHB.StartFlow.dao.PlayerDao;
import com.CHB.StartFlow.vo.Player;

@Service
public class PlayerService {

	private PlayerDao playerDao;

	public PlayerService(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	public void add(String name, String wetight, String height, String birth, String country) {
		playerDao.add(name, wetight, height, birth, country);
	}

	public Player getPlayerById(int id) {
		return playerDao.getPlayerById(id);
	}

	public void deletePlayer(int id) {
		playerDao.deletePlayer(id);
	}

	public void updatePlayer(int id, String name, String wetight, String height, String birth, String country) {
		playerDao.updatePlayer(id, name, wetight, height, birth, country);
	}

	public List<Player> list() {
		return playerDao.list();
	}	
		public int getLastInsertId() {
			return playerDao.getLastInsertId();
			
	}

}
