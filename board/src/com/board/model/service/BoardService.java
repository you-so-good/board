package com.board.model.service;

import static com.board.common.JDBCTemplate.close;
import static com.board.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.board.model.dao.BoardDao;
import com.board.model.dto.Board;

public class BoardService {
	
	private BoardDao dao=new BoardDao();
	
	public List<Board> selectBoardAll(){
		Connection conn=getConnection();
		List<Board> boards=dao.selectBoardAll(conn);
		
//		for(Board b : boards) {
//			b.setComments(dao.selectBoardComment(conn, b.getBoardNo()));
//		}
		
		
		close(conn);
		return boards;
	}

	public List<Board> searchBoard(Map param){
		Connection conn=getConnection(); 
		List<Board> boards=dao.searchBoard(conn,param);
		close(conn);
		return boards;
	}
}
