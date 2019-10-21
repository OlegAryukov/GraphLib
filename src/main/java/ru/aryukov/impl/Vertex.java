package ru.aryukov.impl;

public class Vertex<T, D> {
    private D label;
    private boolean wasVisited;
    private T data;

    public Vertex(D label) {
        this.label = label;
        this.wasVisited = false;
    }

    public D getLabel() {
        return label;
    }

    public void setLabel(D label) {
        this.label = label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
