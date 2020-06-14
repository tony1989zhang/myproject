package net.xgf.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TbDumps {
    private Integer id;

    private String dumpname;

    private String shortname;

    private String dumpbrief;

    private String authlevel;

    private String certificationprovider;

    private String examname;

    private Date createtime;

    private Date updatetime;

    private String examcode;

    private BigDecimal goldpackageoriginalprice;

    private BigDecimal goldpackagepresentprice;

    private BigDecimal silverpackageoriginalprice;

    private BigDecimal silverpackagepresentprice;

    private Integer bannerid;

    private String ishot;

    private Integer navid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDumpname() {
        return dumpname;
    }

    public void setDumpname(String dumpname) {
        this.dumpname = dumpname == null ? null : dumpname.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getDumpbrief() {
        return dumpbrief;
    }

    public void setDumpbrief(String dumpbrief) {
        this.dumpbrief = dumpbrief == null ? null : dumpbrief.trim();
    }

    public String getAuthlevel() {
        return authlevel;
    }

    public void setAuthlevel(String authlevel) {
        this.authlevel = authlevel == null ? null : authlevel.trim();
    }

    public String getCertificationprovider() {
        return certificationprovider;
    }

    public void setCertificationprovider(String certificationprovider) {
        this.certificationprovider = certificationprovider == null ? null : certificationprovider.trim();
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname == null ? null : examname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getExamcode() {
        return examcode;
    }

    public void setExamcode(String examcode) {
        this.examcode = examcode == null ? null : examcode.trim();
    }

    public BigDecimal getGoldpackageoriginalprice() {
        return goldpackageoriginalprice;
    }

    public void setGoldpackageoriginalprice(BigDecimal goldpackageoriginalprice) {
        this.goldpackageoriginalprice = goldpackageoriginalprice;
    }

    public BigDecimal getGoldpackagepresentprice() {
        return goldpackagepresentprice;
    }

    public void setGoldpackagepresentprice(BigDecimal goldpackagepresentprice) {
        this.goldpackagepresentprice = goldpackagepresentprice;
    }

    public BigDecimal getSilverpackageoriginalprice() {
        return silverpackageoriginalprice;
    }

    public void setSilverpackageoriginalprice(BigDecimal silverpackageoriginalprice) {
        this.silverpackageoriginalprice = silverpackageoriginalprice;
    }

    public BigDecimal getSilverpackagepresentprice() {
        return silverpackagepresentprice;
    }

    public void setSilverpackagepresentprice(BigDecimal silverpackagepresentprice) {
        this.silverpackagepresentprice = silverpackagepresentprice;
    }

    public Integer getBannerid() {
        return bannerid;
    }

    public void setBannerid(Integer bannerid) {
        this.bannerid = bannerid;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot == null ? null : ishot.trim();
    }

    public Integer getNavid() {
        return navid;
    }

    public void setNavid(Integer navid) {
        this.navid = navid;
    }
}