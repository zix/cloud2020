import com.atguigu.springcloud.PaymentMain8001;
import com.atguigu.springcloud.payment.entity.Payment;
import com.atguigu.springcloud.payment.mapper.PaymentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaymentMain8001.class)
public class SampleTest {

    @Autowired
    private PaymentMapper paymentMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Payment> userList = paymentMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}