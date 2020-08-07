package com.atguigu.springcloud.payment.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.atguigu.springcloud.payment.entity.CommonResult;
import com.atguigu.springcloud.payment.entity.Payment;
import com.atguigu.springcloud.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 支付表 前端控制器
 * </p>
 *
 * @author kier1111111
 * @since 2020-07-23
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    IPaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        boolean result = paymentService.save(payment);
        log.info("save结果："+ result);
        return new CommonResult(200, "success", result);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {
        log.info("参数：{}", id);
        Payment payment = paymentService.getById(id);
        log.info("Save结果：{}", JSON.toJSONString(payment));
        return new CommonResult(200, "success", payment);
    }
}
