package task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task2.bean.Employee;
import task2.configuration.BeanConfiguration;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        context.registerShutdownHook();

        Employee employee = (Employee) context.getBean("Employee");
        System.out.println(employee.toString());
    }
}
