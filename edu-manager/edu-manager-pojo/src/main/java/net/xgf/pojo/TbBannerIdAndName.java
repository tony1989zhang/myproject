package net.xgf.pojo;

public class TbBannerIdAndName {
	private Integer id;
	private String bannername;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBannername() {
		return bannername;
	}
	public void setBannername(String bannername) {
		this.bannername = bannername;
	}
	@Override
	public String toString() {
		return "TbBannerIdAndName [id=" + id + ", bannername=" + bannername + "]";
	}
	
}
