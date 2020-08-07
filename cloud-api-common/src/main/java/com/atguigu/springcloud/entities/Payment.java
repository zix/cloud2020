package com.atguigu.springcloud.entities;

import java.io.Serializable;

/**
 * <p>
 * 支付表
 * </p>
 *
 * @author kier
 * @since 2020-07-23
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 支付流水号
     */
    private String serial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Payment{" +
            "serial=" + serial +
        "}";
    }
}
