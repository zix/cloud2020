package com.atguigu.springcloud.payment.service.impl;

import com.atguigu.springcloud.payment.entity.Payment;
import com.atguigu.springcloud.payment.mapper.PaymentMapper;
import com.atguigu.springcloud.payment.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付表 服务实现类
 * </p>
 *
 * @author kier
 * @since 2020-07-23
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
