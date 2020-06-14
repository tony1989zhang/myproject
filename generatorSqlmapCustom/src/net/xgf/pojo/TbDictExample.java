package net.xgf.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDictExample() {
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

        public Criteria andDeparmentIsNull() {
            addCriterion("deparment is null");
            return (Criteria) this;
        }

        public Criteria andDeparmentIsNotNull() {
            addCriterion("deparment is not null");
            return (Criteria) this;
        }

        public Criteria andDeparmentEqualTo(String value) {
            addCriterion("deparment =", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentNotEqualTo(String value) {
            addCriterion("deparment <>", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentGreaterThan(String value) {
            addCriterion("deparment >", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentGreaterThanOrEqualTo(String value) {
            addCriterion("deparment >=", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentLessThan(String value) {
            addCriterion("deparment <", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentLessThanOrEqualTo(String value) {
            addCriterion("deparment <=", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentLike(String value) {
            addCriterion("deparment like", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentNotLike(String value) {
            addCriterion("deparment not like", value, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentIn(List<String> values) {
            addCriterion("deparment in", values, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentNotIn(List<String> values) {
            addCriterion("deparment not in", values, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentBetween(String value1, String value2) {
            addCriterion("deparment between", value1, value2, "deparment");
            return (Criteria) this;
        }

        public Criteria andDeparmentNotBetween(String value1, String value2) {
            addCriterion("deparment not between", value1, value2, "deparment");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIsNull() {
            addCriterion("seatNumber is null");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIsNotNull() {
            addCriterion("seatNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSeatnumberEqualTo(Integer value) {
            addCriterion("seatNumber =", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotEqualTo(Integer value) {
            addCriterion("seatNumber <>", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberGreaterThan(Integer value) {
            addCriterion("seatNumber >", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatNumber >=", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberLessThan(Integer value) {
            addCriterion("seatNumber <", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberLessThanOrEqualTo(Integer value) {
            addCriterion("seatNumber <=", value, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberIn(List<Integer> values) {
            addCriterion("seatNumber in", values, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotIn(List<Integer> values) {
            addCriterion("seatNumber not in", values, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberBetween(Integer value1, Integer value2) {
            addCriterion("seatNumber between", value1, value2, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andSeatnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seatNumber not between", value1, value2, "seatnumber");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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