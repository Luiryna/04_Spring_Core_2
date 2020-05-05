package task2.bean;

public class Skill {
    private String name;
    private int level;

    public Skill() {

    }

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (level != skill.level) return false;
        return name.equals(skill.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
