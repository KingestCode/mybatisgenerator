package com.quanyou.entity.common;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallDefinitionPageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallDefinitionPageInfoExample() {
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

        public Criteria andDifinitionPageIdIsNull() {
            addCriterion("difinition_page_id is null");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdIsNotNull() {
            addCriterion("difinition_page_id is not null");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdEqualTo(Integer value) {
            addCriterion("difinition_page_id =", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdNotEqualTo(Integer value) {
            addCriterion("difinition_page_id <>", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdGreaterThan(Integer value) {
            addCriterion("difinition_page_id >", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("difinition_page_id >=", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdLessThan(Integer value) {
            addCriterion("difinition_page_id <", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdLessThanOrEqualTo(Integer value) {
            addCriterion("difinition_page_id <=", value, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdIn(List<Integer> values) {
            addCriterion("difinition_page_id in", values, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdNotIn(List<Integer> values) {
            addCriterion("difinition_page_id not in", values, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdBetween(Integer value1, Integer value2) {
            addCriterion("difinition_page_id between", value1, value2, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andDifinitionPageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("difinition_page_id not between", value1, value2, "difinitionPageId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andPageInfoIsNull() {
            addCriterion("page_info is null");
            return (Criteria) this;
        }

        public Criteria andPageInfoIsNotNull() {
            addCriterion("page_info is not null");
            return (Criteria) this;
        }

        public Criteria andPageInfoEqualTo(String value) {
            addCriterion("page_info =", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoNotEqualTo(String value) {
            addCriterion("page_info <>", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoGreaterThan(String value) {
            addCriterion("page_info >", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoGreaterThanOrEqualTo(String value) {
            addCriterion("page_info >=", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoLessThan(String value) {
            addCriterion("page_info <", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoLessThanOrEqualTo(String value) {
            addCriterion("page_info <=", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoLike(String value) {
            addCriterion("page_info like", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoNotLike(String value) {
            addCriterion("page_info not like", value, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoIn(List<String> values) {
            addCriterion("page_info in", values, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoNotIn(List<String> values) {
            addCriterion("page_info not in", values, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoBetween(String value1, String value2) {
            addCriterion("page_info between", value1, value2, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoNotBetween(String value1, String value2) {
            addCriterion("page_info not between", value1, value2, "pageInfo");
            return (Criteria) this;
        }

        public Criteria andPageInfoLikeInsensitive(String value) {
            addCriterion("upper(page_info) like", value.toUpperCase(), "pageInfo");
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