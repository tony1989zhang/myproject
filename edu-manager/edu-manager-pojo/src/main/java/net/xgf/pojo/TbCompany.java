package net.xgf.pojo;

import java.util.Date;

public class TbCompany {
    private Integer id;

    private String companyname;

    private String logourl;

    private String companydesc;

    private String superiority;

    private String feature;

    private String telephone;

    private String email;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl == null ? null : logourl.trim();
    }

    public String getCompanydesc() {
        return companydesc;
    }

    public void setCompanydesc(String companydesc) {
        this.companydesc = companydesc == null ? null : companydesc.trim();
    }

    public String getSuperiority() {
        return superiority;
    }

    public void setSuperiority(String superiority) {
        this.superiority = superiority == null ? null : superiority.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}