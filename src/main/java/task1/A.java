package task1;

public class A {
    private String name;
    private int number;

    public A() {

    }

    public A(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (number != a.number) return false;
        return name.equals(a.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
