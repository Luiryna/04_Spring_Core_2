package task2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task2.bean.Employee;
import task2.bean.Position;
import task2.bean.Salary;
import task2.bean.Skill;
import task2.factory.EmployeeFactory;

@Configuration
public class BeanConfiguration {
    @Bean(name = "juniorSalary")
    public Salary getJuniorSalary() {
        return new Salary(100);
    }

    @Bean(name = "juniorPosition")
    public Position getJuniorPosition() {
        return new Position("Developer", getJuniorSalary(), getJuniorSkill());
    }

    @Bean(name = "juniorSkill")
    public Skill getJuniorSkill() {
        return new Skill("Java", 1);
    }

    @Bean(name = "Employee")
    public EmployeeFactory getEmployee() {
        EmployeeFactory factory = new EmployeeFactory();
        factory.setName("Ann");
        factory.setPosition(getJuniorPosition());
        return factory;
    }

    @Bean
    public Employee employee() throws Exception {
        return getEmployee().getObject();
    }
}
