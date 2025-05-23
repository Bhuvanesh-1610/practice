package org.Stream.Practice;

import java.util.Objects;

public class obj {
    String name;
    static int count;

    public obj(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        obj obj = (obj) o;
        return count == obj.count && Objects.equals(name, obj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
