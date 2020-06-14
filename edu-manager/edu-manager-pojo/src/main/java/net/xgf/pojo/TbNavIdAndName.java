package net.xgf.pojo;

public class TbNavIdAndName {
	private Integer id;
	private String boardname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBoardname() {
		return boardname;
	}
	public void setBoardname(String boardname) {
		this.boardname = boardname;
	}
	@Override
	public String toString() {
		return "TbNavIdAndName [id=" + id + ", boardname=" + boardname + "]";
	}
	
	
}
