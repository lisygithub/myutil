package com.lisy.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * <pre>
 * TODO 报销单据
 * </pre>
 * @author lisy
 * @version 1.0, 2017年6月26日
 */
public class ExpenseAccount {
    /**  */
    private Long id;

    /** 费用类型 */
    private Long costTypeId;

    /** (YES 是 NO 否) */
    private String isBudget;

    /** 开票月份 */
    private Date createMonth;

    /** （个人汇款 PRIVATE 对公汇款 PUBLIC） */
    private String payModel;

    /** 所属公司 */
    private Long companyId;

    /** 出差起始日期 */
    private Date beginDate;

    /** 出差结束日期 */
    private Date endDate;

    /** 出差天数 */
    private Integer dayCount;

    /** 报销总额 */
    private BigDecimal totalMoney;

    /** 备注 */
    private String memo;

    /** 审批人 */
    private Long approverId;

    /** 报销类型(差旅费 TRVEL，会议费 MEETING，日常费 DAILY) */
    private String expenseType;

    /** 审批状态(通过PASS,不通过FAIL,申请REQUEST,调整ADJUST) */
    private String status;

    /** 报销人 */
    private Long ownerId;

    /**  */
    private Date requestTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCostTypeId() {
        return costTypeId;
    }

    public void setCostTypeId(Long costTypeId) {
        this.costTypeId = costTypeId;
    }

    public String getIsBudget() {
        return isBudget;
    }

    public void setIsBudget(String isBudget) {
        this.isBudget = isBudget == null ? null : isBudget.trim();
    }

    public Date getCreateMonth() {
        return createMonth;
    }

    public void setCreateMonth(Date createMonth) {
        this.createMonth = createMonth;
    }

    public String getPayModel() {
        return payModel;
    }

    public void setPayModel(String payModel) {
        this.payModel = payModel == null ? null : payModel.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getApproverId() {
        return approverId;
    }

    public void setApproverId(Long approverId) {
        this.approverId = approverId;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType == null ? null : expenseType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }
}