package com.lisy.entity;
/**
 * 
 * <pre>
 * TODO 发票图片路径
 * </pre>
 * @author lisy
 * @version 1.0, 2017年6月26日
 */
public class InvoicePic {
    /**  */
    private Long id;

    /** 发票路径 */
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}