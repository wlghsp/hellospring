package tobyspring.hellospring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 구성정보 (Configuration): 빈 클래스, 의존 관계
 */
@Configuration
@ComponentScan
public class ObjectFactory {

    /*@Bean
    public PaymentService paymentService() {
        return new PaymentService(exRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new SimpleExRateProvider();
    }*/
}
