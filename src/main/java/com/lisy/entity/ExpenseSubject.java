package com.lisy.entity;

import java.math.BigDecimal;
/**
 * 
 * <pre>
 * TODO 报销单科目报销金额
 * </pre>
 * @author lisy
 * @version 1.0, 2017年6月26日
 */
public class ExpenseSubject {
    /**  */
    private Long id;

    /** 所属报销单 */
    private Long expenseAcctId;

    /** 费用科目 */
    private Long subjectId;

    /** 报销金额 */
    private BigDecimal expenseMoney;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExpenseAcctId() {
        return expenseAcctId;
    }

    public void setExpenseAcctId(Long expenseAcctId) {
        this.expenseAcctId = expenseAcctId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public BigDecimal getExpenseMoney() {
        return expenseMoney;
    }

    public void setExpenseMoney(BigDecimal expenseMoney) {
        this.expenseMoney = expenseMoney;
    }
}