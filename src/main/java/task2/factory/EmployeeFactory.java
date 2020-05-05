package task2.factory;

import org.springframework.beans.factory.FactoryBean;
import task2.bean.Employee;
import task2.bean.Position;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeeFactory implements FactoryBean<Employee> {
    private String name;
    private Position position;

    @Override
    public Employee getObject() throws Exception {
        return new Employee(name, position);
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @PostConstruct
    public void myPostConstruct() {
        System.out.println("myPostConstruct is here");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("cleanUp method is here");
    }
}
