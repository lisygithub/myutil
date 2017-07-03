package com.lisy.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * <pre>
 * TODO 差旅报销明细
 * </pre>
 * @author lisy
 * @version 1.0, 2017年6月26日
 */
public class TravelExpenseDetail {
    /**  */
    private Long id;

    /** 所属报销单 */
    private Long expenseAcctID;

    /** 费用科目 */
    private Long subjectId;

    /** 乘车时间 住宿时间 用餐时间 */
    private Date rideTime;

    /** 起点 */
    private String rideBegin;

    /** 终点 */
    private String rideEnd;

    /** 金额 */
    private BigDecimal money;

    /** 天数 */
    private Integer dayCount;

    /** 城市 */
    private String city;

    /** 交通工具 */
    private String vehicle;

    /** 饭店名称 酒店名称 */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExpenseAcctID() {
        return expenseAcctID;
    }

    public void setExpenseAcctID(Long expenseAcctID) {
        this.expenseAcctID = expenseAcctID;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Date getRideTime() {
        return rideTime;
    }

    public void setRideTime(Date rideTime) {
        this.rideTime = rideTime;
    }

    public String getRideBegin() {
        return rideBegin;
    }

    public void setRideBegin(String rideBegin) {
        this.rideBegin = rideBegin == null ? null : rideBegin.trim();
    }

    public String getRideEnd() {
        return rideEnd;
    }

    public void setRideEnd(String rideEnd) {
        this.rideEnd = rideEnd == null ? null : rideEnd.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}