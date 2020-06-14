package net.xgf.pojo;

public class TbDumpsWithBLOBs extends TbDumps {
    private String dumpdesc;

    private String superiority;

    private String faqs;

    public String getDumpdesc() {
        return dumpdesc;
    }

    public void setDumpdesc(String dumpdesc) {
        this.dumpdesc = dumpdesc == null ? null : dumpdesc.trim();
    }

    public String getSuperiority() {
        return superiority;
    }

    public void setSuperiority(String superiority) {
        this.superiority = superiority == null ? null : superiority.trim();
    }

    public String getFaqs() {
        return faqs;
    }

    public void setFaqs(String faqs) {
        this.faqs = faqs == null ? null : faqs.trim();
    }
}