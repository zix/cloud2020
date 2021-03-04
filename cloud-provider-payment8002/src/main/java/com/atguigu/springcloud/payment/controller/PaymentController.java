package com.atguigu.springcloud.payment.controller;

import com.alibaba.fastjson.JSON;
import com.atguigu.springcloud.payment.entity.CommonResult;
import com.atguigu.springcloud.payment.entity.Payment;
import com.atguigu.springcloud.payment.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

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
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        boolean result = paymentService.save(payment);
        log.info("save结果："+ result);
        return new CommonResult(200, "success,serverPort:"+serverPort, result);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {
        log.info("参数：{}", id);
        Payment payment = paymentService.getById(id);
        log.info("Save结果：{}", JSON.toJSONString(payment));
        return new CommonResult(200, "success,serverPort:"+serverPort, payment);
    }

    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return serverPort;
    }

    @GetMapping("lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
