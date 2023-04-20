package com.board.controller;

import java.util.List;
import java.util.Map;

import com.board.model.dto.Board;
import com.board.model.service.BoardService;
import com.board.view.MainView;

public class BoardController {

	private BoardService service=new BoardService();
	private MainView view=new MainView();
	
	public void mainMenu() {
		view.mainMenu();
	}
	
	public void selectBoardAll() {
		List<Board> boards=service.selectBoardAll();
		
		view.printBoard(boards);
	}
	
	public void selectSearchBoard() {
		// 검색할 항목(컬럼명), 검색어
		Map param=view.inputSearch();
		List<Board> boards=service.searchBoard(param);
		
		view.printBoard(boards);
		
	}



}
