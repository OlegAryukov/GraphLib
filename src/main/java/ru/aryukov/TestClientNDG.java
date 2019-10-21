package ru.aryukov;

import ru.aryukov.impl.UnDirectionalGraphImpl;
import ru.aryukov.impl.Vertex;
import ru.aryukov.interfaces.Edge;

public class TestClientNDG {
    public static void main(String[] args) {
        UnDirectionalGraphImpl<String, String> graph = new UnDirectionalGraphImpl<>();
        Vertex<String, String> a = new Vertex<>("A");
        Vertex<String, String> b = new Vertex<>("B");
        Vertex<String, String> c = new Vertex<>("C");
        Vertex<String, String> d = new Vertex<>("D");
        Vertex<String, String> e = new Vertex<>("E");
        Vertex<String, String> f = new Vertex<>("F");
        Vertex<String, String> g = new Vertex<>("G");
        Vertex<String, String> j = new Vertex<>("J");
        Vertex<String, String> h = new Vertex<>("H");
        Vertex<String, String> k = new Vertex<>("K");
        Vertex<String, String> l = new Vertex<>("L");

        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(a, f);
        graph.addEdge(c, b);
        graph.addEdge(c, e);
        graph.addEdge(c, d);
        graph.addEdge(b, d);
        graph.addEdge(d, e);
        graph.addEdge(d, j);
        graph.addEdge(d, f);
        graph.addEdge(e, h);
        graph.addEdge(f, g);
        graph.addEdge(g, j);
        graph.addEdge(g, l);
        graph.addEdge(j, h);
        graph.addEdge(j, k);
        graph.addEdge(k, l);

        for (Edge<String, String> edge : graph.getPathTo(a, h)){
            System.out.println(edge.getStartVertex().getLabel() + " - " + edge.getEndVertex().getLabel());
        }
        graph.dfsEntry(a.getLabel());

//        DirectioanalGraphImpl<String, String> graphDir = new DirectioanalGraphImpl<>();
//        graphDir.addEdge(a, c);
//        graphDir.addEdge(a, f);
//        graphDir.addEdge(b, a);
//        graphDir.addEdge(b, c);
//        graphDir.addEdge(c, d);
//        graphDir.addEdge(e, c);
//        graphDir.addEdge(d, e);
//        graphDir.addEdge(d, j);
//        graphDir.addEdge(f, d);
//        graphDir.addEdge(f, g);
//        graphDir.addEdge(j, g);
//        graphDir.addEdge(j, h);
//        graphDir.addEdge(h, e);
//        graphDir.addEdge(g, l);
//        graphDir.addEdge(l, k);
//        graphDir.addEdge(k, j);
//
//        for (Edge<String, String> edge : graphDir.getPathTo(d, k)) {
//            System.out.println(edge.getStartVertex().getLabel() + " - " + edge.getEndVertex().getLabel());
//        }
    }
}
