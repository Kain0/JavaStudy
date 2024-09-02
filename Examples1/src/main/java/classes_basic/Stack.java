package classes_basic;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;

public class Stack<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public Stack() {
    }

    public Stack(Collection<? extends T> data) {
        list.addAll(data);
    }

    public Stack(@NotNull Stack<T> s) {
        list.addAll(s.list);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(T o) {
        return list.contains(o);
    }

    public boolean push(T t) {
        return list.add(t);
    }

    public T pop() {
        if (!list.isEmpty()) {
            return list.removeLast();
        }
        return null;
    }

    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack<T> that = (Stack<T>) o;
        return list.equals(that.list);

    }
}
