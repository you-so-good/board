package com.board.model.dto;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter; //원래는 Member여야 함...
	private Date boardDate;
	private List<BoardComment> comments;
	// 한개 게시글에 다수를 가질 수 있으므로.
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, Date boardDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
	}

	public List<BoardComment> getComments() {
		return comments;
	}

	public void setComments(List<BoardComment> comments) {
		this.comments = comments;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}



	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", boardDate=" + boardDate + ", comments=" + comments + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(boardContent, boardDate, boardNo, boardTitle, boardWriter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		return Objects.equals(boardContent, other.boardContent) && Objects.equals(boardDate, other.boardDate)
				&& boardNo == other.boardNo && Objects.equals(boardTitle, other.boardTitle)
				&& Objects.equals(boardWriter, other.boardWriter);
	}
	

}
