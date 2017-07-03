package com.lisy.entity;
/**
 * 
 * <pre>
 * TODO 报销单品种组关联
 * </pre>
 * @author lisy
 * @version 1.0, 2017年6月26日
 */
public class ExpenseBreedGroup {
    /**  */
    private Long id;

    /** 品种组 */
    private Long breedGroupId;

    /** 报销单 */
    private Long expenseAcctId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBreedGroupId() {
        return breedGroupId;
    }

    public void setBreedGroupId(Long breedGroupId) {
        this.breedGroupId = breedGroupId;
    }

    public Long getExpenseAcctId() {
        return expenseAcctId;
    }

    public void setExpenseAcctId(Long expenseAcctId) {
        this.expenseAcctId = expenseAcctId;
    }
}