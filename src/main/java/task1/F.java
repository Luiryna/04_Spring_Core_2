package task1;

public class F {
    private String name;

    public F() {

    }

    public F(String name) {
        this.name = name;
    }

    public void initF() {
        System.out.println("Bean was initialized");
    }

    public void destroyF() {
        System.out.println("Bean was destroyed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        F f = (F) o;

        return name.equals(f.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "F{" +
                "name='" + name + '\'' +
                '}';
    }
}
