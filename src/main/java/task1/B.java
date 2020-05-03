package task1;

public class B {
    private A a;
    private int number;

    public B() {

    }

    public B(A a, int number) {
        this.a = a;
        this.number = number;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
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

        B b = (B) o;

        if (number != b.number) return false;
        return a.equals(b.a);

    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "B{" +
                "a=" + a +
                ", number=" + number +
                '}';
    }
}
