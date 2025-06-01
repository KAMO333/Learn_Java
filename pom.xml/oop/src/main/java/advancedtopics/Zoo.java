package advancedtopics;

import java.util.Objects;

public class Zoo {
    String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(name, zoo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    Zoo(String n) {
        name = n;
    }
}


