package ru.aryukov.interfaces;


import ru.aryukov.impl.Vertex;

public interface Edge<T,D> {
    Vertex<T, D> getStartVertex();
    Vertex<T, D> getEndVertex();
}
