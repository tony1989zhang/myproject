package net.xgf.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDumpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDumpsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDumpnameIsNull() {
            addCriterion("dumpName is null");
            return (Criteria) this;
        }

        public Criteria andDumpnameIsNotNull() {
            addCriterion("dumpName is not null");
            return (Criteria) this;
        }

        public Criteria andDumpnameEqualTo(String value) {
            addCriterion("dumpName =", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameNotEqualTo(String value) {
            addCriterion("dumpName <>", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameGreaterThan(String value) {
            addCriterion("dumpName >", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameGreaterThanOrEqualTo(String value) {
            addCriterion("dumpName >=", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameLessThan(String value) {
            addCriterion("dumpName <", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameLessThanOrEqualTo(String value) {
            addCriterion("dumpName <=", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameLike(String value) {
            addCriterion("dumpName like", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameNotLike(String value) {
            addCriterion("dumpName not like", value, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameIn(List<String> values) {
            addCriterion("dumpName in", values, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameNotIn(List<String> values) {
            addCriterion("dumpName not in", values, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameBetween(String value1, String value2) {
            addCriterion("dumpName between", value1, value2, "dumpname");
            return (Criteria) this;
        }

        public Criteria andDumpnameNotBetween(String value1, String value2) {
            addCriterion("dumpName not between", value1, value2, "dumpname");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNull() {
            addCriterion("shortName is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("shortName is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("shortName =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("shortName <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("shortName >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("shortName >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("shortName <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("shortName <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("shortName like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("shortName not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("shortName in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("shortName not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("shortName between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("shortName not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andDumpbriefIsNull() {
            addCriterion("dumpBrief is null");
            return (Criteria) this;
        }

        public Criteria andDumpbriefIsNotNull() {
            addCriterion("dumpBrief is not null");
            return (Criteria) this;
        }

        public Criteria andDumpbriefEqualTo(String value) {
            addCriterion("dumpBrief =", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefNotEqualTo(String value) {
            addCriterion("dumpBrief <>", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefGreaterThan(String value) {
            addCriterion("dumpBrief >", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefGreaterThanOrEqualTo(String value) {
            addCriterion("dumpBrief >=", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefLessThan(String value) {
            addCriterion("dumpBrief <", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefLessThanOrEqualTo(String value) {
            addCriterion("dumpBrief <=", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefLike(String value) {
            addCriterion("dumpBrief like", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefNotLike(String value) {
            addCriterion("dumpBrief not like", value, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefIn(List<String> values) {
            addCriterion("dumpBrief in", values, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefNotIn(List<String> values) {
            addCriterion("dumpBrief not in", values, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefBetween(String value1, String value2) {
            addCriterion("dumpBrief between", value1, value2, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andDumpbriefNotBetween(String value1, String value2) {
            addCriterion("dumpBrief not between", value1, value2, "dumpbrief");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIsNull() {
            addCriterion("authLevel is null");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIsNotNull() {
            addCriterion("authLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAuthlevelEqualTo(String value) {
            addCriterion("authLevel =", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotEqualTo(String value) {
            addCriterion("authLevel <>", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelGreaterThan(String value) {
            addCriterion("authLevel >", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelGreaterThanOrEqualTo(String value) {
            addCriterion("authLevel >=", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelLessThan(String value) {
            addCriterion("authLevel <", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelLessThanOrEqualTo(String value) {
            addCriterion("authLevel <=", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelLike(String value) {
            addCriterion("authLevel like", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotLike(String value) {
            addCriterion("authLevel not like", value, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelIn(List<String> values) {
            addCriterion("authLevel in", values, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotIn(List<String> values) {
            addCriterion("authLevel not in", values, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelBetween(String value1, String value2) {
            addCriterion("authLevel between", value1, value2, "authlevel");
            return (Criteria) this;
        }

        public Criteria andAuthlevelNotBetween(String value1, String value2) {
            addCriterion("authLevel not between", value1, value2, "authlevel");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderIsNull() {
            addCriterion("certificationProvider is null");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderIsNotNull() {
            addCriterion("certificationProvider is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderEqualTo(String value) {
            addCriterion("certificationProvider =", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderNotEqualTo(String value) {
            addCriterion("certificationProvider <>", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderGreaterThan(String value) {
            addCriterion("certificationProvider >", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderGreaterThanOrEqualTo(String value) {
            addCriterion("certificationProvider >=", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderLessThan(String value) {
            addCriterion("certificationProvider <", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderLessThanOrEqualTo(String value) {
            addCriterion("certificationProvider <=", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderLike(String value) {
            addCriterion("certificationProvider like", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderNotLike(String value) {
            addCriterion("certificationProvider not like", value, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderIn(List<String> values) {
            addCriterion("certificationProvider in", values, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderNotIn(List<String> values) {
            addCriterion("certificationProvider not in", values, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderBetween(String value1, String value2) {
            addCriterion("certificationProvider between", value1, value2, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andCertificationproviderNotBetween(String value1, String value2) {
            addCriterion("certificationProvider not between", value1, value2, "certificationprovider");
            return (Criteria) this;
        }

        public Criteria andExamnameIsNull() {
            addCriterion("examName is null");
            return (Criteria) this;
        }

        public Criteria andExamnameIsNotNull() {
            addCriterion("examName is not null");
            return (Criteria) this;
        }

        public Criteria andExamnameEqualTo(String value) {
            addCriterion("examName =", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotEqualTo(String value) {
            addCriterion("examName <>", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameGreaterThan(String value) {
            addCriterion("examName >", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameGreaterThanOrEqualTo(String value) {
            addCriterion("examName >=", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLessThan(String value) {
            addCriterion("examName <", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLessThanOrEqualTo(String value) {
            addCriterion("examName <=", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameLike(String value) {
            addCriterion("examName like", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotLike(String value) {
            addCriterion("examName not like", value, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameIn(List<String> values) {
            addCriterion("examName in", values, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotIn(List<String> values) {
            addCriterion("examName not in", values, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameBetween(String value1, String value2) {
            addCriterion("examName between", value1, value2, "examname");
            return (Criteria) this;
        }

        public Criteria andExamnameNotBetween(String value1, String value2) {
            addCriterion("examName not between", value1, value2, "examname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andExamcodeIsNull() {
            addCriterion("examCode is null");
            return (Criteria) this;
        }

        public Criteria andExamcodeIsNotNull() {
            addCriterion("examCode is not null");
            return (Criteria) this;
        }

        public Criteria andExamcodeEqualTo(String value) {
            addCriterion("examCode =", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeNotEqualTo(String value) {
            addCriterion("examCode <>", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeGreaterThan(String value) {
            addCriterion("examCode >", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeGreaterThanOrEqualTo(String value) {
            addCriterion("examCode >=", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeLessThan(String value) {
            addCriterion("examCode <", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeLessThanOrEqualTo(String value) {
            addCriterion("examCode <=", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeLike(String value) {
            addCriterion("examCode like", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeNotLike(String value) {
            addCriterion("examCode not like", value, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeIn(List<String> values) {
            addCriterion("examCode in", values, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeNotIn(List<String> values) {
            addCriterion("examCode not in", values, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeBetween(String value1, String value2) {
            addCriterion("examCode between", value1, value2, "examcode");
            return (Criteria) this;
        }

        public Criteria andExamcodeNotBetween(String value1, String value2) {
            addCriterion("examCode not between", value1, value2, "examcode");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceIsNull() {
            addCriterion("goldPackageOriginalPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceIsNotNull() {
            addCriterion("goldPackageOriginalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceEqualTo(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice =", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice <>", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice >", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice >=", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceLessThan(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice <", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goldPackageOriginalPrice <=", value, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceIn(List<BigDecimal> values) {
            addCriterion("goldPackageOriginalPrice in", values, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("goldPackageOriginalPrice not in", values, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goldPackageOriginalPrice between", value1, value2, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackageoriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goldPackageOriginalPrice not between", value1, value2, "goldpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceIsNull() {
            addCriterion("goldPackagePresentPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceIsNotNull() {
            addCriterion("goldPackagePresentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceEqualTo(BigDecimal value) {
            addCriterion("goldPackagePresentPrice =", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceNotEqualTo(BigDecimal value) {
            addCriterion("goldPackagePresentPrice <>", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceGreaterThan(BigDecimal value) {
            addCriterion("goldPackagePresentPrice >", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goldPackagePresentPrice >=", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceLessThan(BigDecimal value) {
            addCriterion("goldPackagePresentPrice <", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goldPackagePresentPrice <=", value, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceIn(List<BigDecimal> values) {
            addCriterion("goldPackagePresentPrice in", values, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceNotIn(List<BigDecimal> values) {
            addCriterion("goldPackagePresentPrice not in", values, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goldPackagePresentPrice between", value1, value2, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andGoldpackagepresentpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goldPackagePresentPrice not between", value1, value2, "goldpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceIsNull() {
            addCriterion("silverPackageOriginalPrice is null");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceIsNotNull() {
            addCriterion("silverPackageOriginalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceEqualTo(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice =", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice <>", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice >", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice >=", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceLessThan(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice <", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("silverPackageOriginalPrice <=", value, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceIn(List<BigDecimal> values) {
            addCriterion("silverPackageOriginalPrice in", values, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("silverPackageOriginalPrice not in", values, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("silverPackageOriginalPrice between", value1, value2, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackageoriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("silverPackageOriginalPrice not between", value1, value2, "silverpackageoriginalprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceIsNull() {
            addCriterion("silverPackagePresentPrice is null");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceIsNotNull() {
            addCriterion("silverPackagePresentPrice is not null");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceEqualTo(BigDecimal value) {
            addCriterion("silverPackagePresentPrice =", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceNotEqualTo(BigDecimal value) {
            addCriterion("silverPackagePresentPrice <>", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceGreaterThan(BigDecimal value) {
            addCriterion("silverPackagePresentPrice >", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("silverPackagePresentPrice >=", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceLessThan(BigDecimal value) {
            addCriterion("silverPackagePresentPrice <", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("silverPackagePresentPrice <=", value, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceIn(List<BigDecimal> values) {
            addCriterion("silverPackagePresentPrice in", values, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceNotIn(List<BigDecimal> values) {
            addCriterion("silverPackagePresentPrice not in", values, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("silverPackagePresentPrice between", value1, value2, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andSilverpackagepresentpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("silverPackagePresentPrice not between", value1, value2, "silverpackagepresentprice");
            return (Criteria) this;
        }

        public Criteria andBanneridIsNull() {
            addCriterion("bannerID is null");
            return (Criteria) this;
        }

        public Criteria andBanneridIsNotNull() {
            addCriterion("bannerID is not null");
            return (Criteria) this;
        }

        public Criteria andBanneridEqualTo(Integer value) {
            addCriterion("bannerID =", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotEqualTo(Integer value) {
            addCriterion("bannerID <>", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridGreaterThan(Integer value) {
            addCriterion("bannerID >", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("bannerID >=", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridLessThan(Integer value) {
            addCriterion("bannerID <", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridLessThanOrEqualTo(Integer value) {
            addCriterion("bannerID <=", value, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridIn(List<Integer> values) {
            addCriterion("bannerID in", values, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotIn(List<Integer> values) {
            addCriterion("bannerID not in", values, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridBetween(Integer value1, Integer value2) {
            addCriterion("bannerID between", value1, value2, "bannerid");
            return (Criteria) this;
        }

        public Criteria andBanneridNotBetween(Integer value1, Integer value2) {
            addCriterion("bannerID not between", value1, value2, "bannerid");
            return (Criteria) this;
        }

        public Criteria andIshotIsNull() {
            addCriterion("isHot is null");
            return (Criteria) this;
        }

        public Criteria andIshotIsNotNull() {
            addCriterion("isHot is not null");
            return (Criteria) this;
        }

        public Criteria andIshotEqualTo(String value) {
            addCriterion("isHot =", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotEqualTo(String value) {
            addCriterion("isHot <>", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThan(String value) {
            addCriterion("isHot >", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotGreaterThanOrEqualTo(String value) {
            addCriterion("isHot >=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThan(String value) {
            addCriterion("isHot <", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLessThanOrEqualTo(String value) {
            addCriterion("isHot <=", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotLike(String value) {
            addCriterion("isHot like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotLike(String value) {
            addCriterion("isHot not like", value, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotIn(List<String> values) {
            addCriterion("isHot in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotIn(List<String> values) {
            addCriterion("isHot not in", values, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotBetween(String value1, String value2) {
            addCriterion("isHot between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andIshotNotBetween(String value1, String value2) {
            addCriterion("isHot not between", value1, value2, "ishot");
            return (Criteria) this;
        }

        public Criteria andNavidIsNull() {
            addCriterion("navID is null");
            return (Criteria) this;
        }

        public Criteria andNavidIsNotNull() {
            addCriterion("navID is not null");
            return (Criteria) this;
        }

        public Criteria andNavidEqualTo(Integer value) {
            addCriterion("navID =", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidNotEqualTo(Integer value) {
            addCriterion("navID <>", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidGreaterThan(Integer value) {
            addCriterion("navID >", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidGreaterThanOrEqualTo(Integer value) {
            addCriterion("navID >=", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidLessThan(Integer value) {
            addCriterion("navID <", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidLessThanOrEqualTo(Integer value) {
            addCriterion("navID <=", value, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidIn(List<Integer> values) {
            addCriterion("navID in", values, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidNotIn(List<Integer> values) {
            addCriterion("navID not in", values, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidBetween(Integer value1, Integer value2) {
            addCriterion("navID between", value1, value2, "navid");
            return (Criteria) this;
        }

        public Criteria andNavidNotBetween(Integer value1, Integer value2) {
            addCriterion("navID not between", value1, value2, "navid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}