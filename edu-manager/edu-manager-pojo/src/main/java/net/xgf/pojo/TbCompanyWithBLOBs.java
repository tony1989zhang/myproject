package net.xgf.pojo;

public class TbCompanyWithBLOBs extends TbCompany {
    private String companydesc;

    private String superiority;

    private String feature;

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
}