package ru.aryukov.interfaces;


import ru.aryukov.impl.Vertex;

import java.util.List;

public interface Graph<T, D> {
    void addVertex(Vertex<T, D> vertex);

    void addEdge(Vertex<T, D> start, Vertex<T, D> end);

    List<Edge<T,D>> getPathTo(Vertex<T, D> start, Vertex<T, D> end);
}
