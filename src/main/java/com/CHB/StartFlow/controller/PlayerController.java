package com.CHB.StartFlow.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CHB.StartFlow.service.PlayerService;
import com.CHB.StartFlow.vo.Player;

@Controller
public class PlayerController {

	private PlayerService playerService;

	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	// 액션메서드
	@RequestMapping("/sf/player/add")
	@ResponseBody
	public Player add(String name, String wetight, String height, String birth, String country) {

		playerService.add(name, wetight, height, birth, country);

		// LAST_INSERT_ID(), 마지막 id(pk) 를 가져옴
		int id = playerService.getLastInsertId();

		Player player = playerService.getPlayerById(id);

		return player;

	}

	@RequestMapping("/sf/player/list")
	@ResponseBody
	public List<Player> List() {
		return playerService.list();
	}

	@RequestMapping("/sf/player/delete")
	@ResponseBody
	public String delete(int id) {

		Player player = playerService.getPlayerById(id);

		if (player == null) {
			return id + "번 해당 게시글은 존재하지 않습니다";
		}

		playerService.deletePlayer(id);
		return id + "번 해당 게시물을 삭제했습니다";
	}

	@RequestMapping("/sf/player/update")
	@ResponseBody
	public String update(int id, String name, String wetight, String height, String birth, String country) {

		Player player = playerService.getPlayerById(id);

		if (player == null) {
			return id + "번 해당 게시글은 존재하지 않습니다";
		}

		playerService.updatePlayer(id, name, wetight, height, birth, country);
		return id + "번 해당 게시물을 수정했습니다";
	}

	@RequestMapping("/sf/player/detail")
	@ResponseBody
	public Object detail(int id) {

		Player player = playerService.getPlayerById(id);

		if (player == null) {
			return id + "번 게시물은 존재하지 않습니다.";
		}

		return player;
	}

}
