package task1;

public class D {
    private String name;

    public D() {

    }

    public D(String name) {
        this.name = name;
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

        D d = (D) o;

        return name.equals(d.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "D{" +
                "name='" + name + '\'' +
                '}';
    }
}
