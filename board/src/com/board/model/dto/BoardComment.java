package com.board.model.dto;

import java.sql.Date;
import java.util.Objects;

public class BoardComment {
	private int commentNo;
	private String boardContent;
	private String commentWriter; //원래는 Member여야 함...
	private Date commentDate;
//	private Board b; 원래는 있어야함 -> comment는 board에 속해있으므로.
	
	public BoardComment() {
		// TODO Auto-generated constructor stub
	}
	

	public BoardComment(int commentNo, String boardContent, String commentWriter, Date commentDate) {
		super();
		this.commentNo = commentNo;
		this.boardContent = boardContent;
		this.commentWriter = commentWriter;
		this.commentDate = commentDate;
	}


	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}


	@Override
	public String toString() {
		return "BoardComment [commentNo=" + commentNo + ", boardContent=" + boardContent + ", commentWriter="
				+ commentWriter + ", commentDate=" + commentDate + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(boardContent, commentDate, commentNo, commentWriter);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardComment other = (BoardComment) obj;
		return Objects.equals(boardContent, other.boardContent) && Objects.equals(commentDate, other.commentDate)
				&& commentNo == other.commentNo && Objects.equals(commentWriter, other.commentWriter);
	}

	
}
