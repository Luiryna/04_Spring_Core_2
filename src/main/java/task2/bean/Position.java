package task2.bean;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class Position {
    @NotNull
    private String name;
    @NotNull
    private Salary salary;
    private Set<Skill> skills = new HashSet<>();

    public Position() {

    }

    public Position(String name) {
        this.name = name;
    }

    public Position(String name, Salary salary, Skill skill) {
        this.name = name;
        this.salary = salary;
        skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public void setSkill(Skill skill) {
        skills.add(skill);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (!name.equals(position.name)) return false;
        return salary.equals(position.salary);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + salary.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
