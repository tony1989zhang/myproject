package net.xgf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbNewsExample {
	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbNewsExample() {
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

        public Criteria andNewstitleIsNull() {
            addCriterion("newsTitle is null");
            return (Criteria) this;
        }

        public Criteria andNewstitleIsNotNull() {
            addCriterion("newsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andNewstitleEqualTo(String value) {
            addCriterion("newsTitle =", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotEqualTo(String value) {
            addCriterion("newsTitle <>", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThan(String value) {
            addCriterion("newsTitle >", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleGreaterThanOrEqualTo(String value) {
            addCriterion("newsTitle >=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThan(String value) {
            addCriterion("newsTitle <", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLessThanOrEqualTo(String value) {
            addCriterion("newsTitle <=", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleLike(String value) {
            addCriterion("newsTitle like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotLike(String value) {
            addCriterion("newsTitle not like", value, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleIn(List<String> values) {
            addCriterion("newsTitle in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotIn(List<String> values) {
            addCriterion("newsTitle not in", values, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleBetween(String value1, String value2) {
            addCriterion("newsTitle between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andNewstitleNotBetween(String value1, String value2) {
            addCriterion("newsTitle not between", value1, value2, "newstitle");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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