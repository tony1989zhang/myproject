package net.xgf.pojo;

import java.util.Date;

public class TbNavboard {
    private Integer id;

    private String boardname;

    private String isenable;

    private Date createtime;

    private Integer sort;

    private String boarddesc;

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
        this.boardname = boardname == null ? null : boardname.trim();
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getBoarddesc() {
        return boarddesc;
    }

    public void setBoarddesc(String boarddesc) {
        this.boarddesc = boarddesc == null ? null : boarddesc.trim();
    }
}