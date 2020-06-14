package net.xgf.pojo;

public class TbNewsWithBLOBs extends TbNews {
    private String newsContent;
     
	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent == null ? null : newsContent.trim();
	}

	@Override
	public String toString() {
		return "TbNewsWithBLOBs [newsContent=" + newsContent + "]";
	}

}