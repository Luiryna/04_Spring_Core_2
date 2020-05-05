package task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task2.bean.Employee;
import task2.configuration.BeanConfiguration;
import task2.service.EmployeeService;
import task2.service.PositionService;
import task2.service.SalaryService;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        context.registerShutdownHook();

        Employee employee = (Employee) context.getBean("Employee");

        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        PositionService positionService = (PositionService) context.getBean("positionService");
        SalaryService salaryService = (SalaryService) context.getBean("salaryService");

        employeeService.hire(employee);


    }
}
