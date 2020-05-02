package l.a.a.a.o.c;

import java.util.Collection;

/* compiled from: Dependency */
public interface b<T> {
    void addDependency(T t);

    boolean areDependenciesMet();

    Collection<T> getDependencies();
}
