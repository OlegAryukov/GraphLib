package ru.aryukov.impl;


import ru.aryukov.interfaces.Edge;

public class EdgeImpl<T,D> implements Edge<T,D> {
    private Vertex<T, D> start;
    private Vertex<T,D> end;

    public EdgeImpl(Vertex<T, D> start, Vertex<T,D> end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Vertex<T,D> getStartVertex() {
        return start;
    }

    @Override
    public Vertex<T,D> getEndVertex() {
        return end;
    }
}
