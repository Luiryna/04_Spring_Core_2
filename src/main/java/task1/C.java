package task1;

import java.util.Objects;

public class C {
    private int number;

    public D returnNewD(){
        return new D();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public C() {
    }

    public C(int number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return getNumber() == c.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }

    @Override
    public String toString() {
        return "C{" +
                "number=" + number +
                '}';
    }
}
