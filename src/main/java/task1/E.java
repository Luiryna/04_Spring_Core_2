package task1;

public class E {
    private String name;

    public E() {

    }

    public E(String name) {
        this.name = name;
    }

    public void scream() {
        System.out.println("For the Horde!");
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

        E e = (E) o;

        return name.equals(e.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "E{" +
                "name='" + name + '\'' +
                '}';
    }
}
