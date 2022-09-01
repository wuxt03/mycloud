package payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: wxt
 * @createDate: 2022-08-31 14:41
 * @version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    //Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Value("${server.port}")
    private String port;

        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + port + string;
        }
}
