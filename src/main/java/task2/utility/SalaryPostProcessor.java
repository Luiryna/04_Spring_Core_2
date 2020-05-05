package task2.utility;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import task2.service.SalaryService;

public class SalaryPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof SalaryService) {
            System.out.println("Start postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SalaryService) {
            System.out.println("Start postProcessAfterInitialization");
        }
        return bean;
    }
}
