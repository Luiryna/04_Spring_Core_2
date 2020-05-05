package task2.bean.factory;

import org.springframework.beans.factory.FactoryBean;
import task2.bean.Employee;

public class EmployeeFactory implements FactoryBean<Employee> {
    @Override
    public Employee getObject() throws Exception {
        return new Employee();
    }

    @Override
    public Class<?> getObjectType() {
        return Employee.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
