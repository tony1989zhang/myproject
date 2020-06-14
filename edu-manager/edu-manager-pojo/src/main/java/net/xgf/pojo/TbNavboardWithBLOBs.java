package net.xgf.pojo;

public class TbNavboardWithBLOBs extends TbNavboard {
    private String boardDesc;
     
    
    public String getBoardDesc() {
		return boardDesc;
	}

	public void setBoardDesc(String boardDesc) {
		this.boardDesc =  boardDesc == null ? null : boardDesc.trim();;
	}

  
	@Override
	public String toString() {
		return "TbNavboardWithBLOBs [boardDesc=" + boardDesc + "]";
	}
    
}