package ru.aryukov.undirectionalGraphTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.aryukov.impl.DirectioanalGraphImpl;
import ru.aryukov.impl.UnDirectionalGraphImpl;
import ru.aryukov.impl.Vertex;

public class UndirectionalGraphTest {
    private UnDirectionalGraphImpl<String, String> graphDir;
    Vertex<String, String> a;
    Vertex<String, String> b;
    Vertex<String, String> c;
    Vertex<String, String> d;
    Vertex<String, String> e;
    Vertex<String, String> f;
    Vertex<String, String> g;
    Vertex<String, String> j;
    Vertex<String, String> h;
    Vertex<String, String> k;
    Vertex<String, String> l;

    @Before
    public void beforeTests() {
        graphDir = new UnDirectionalGraphImpl<>();
        a = new Vertex<>("A");
        b = new Vertex<>("B");
        c = new Vertex<>("C");
        d = new Vertex<>("D");
        e = new Vertex<>("E");
        f = new Vertex<>("F");
        g = new Vertex<>("G");
        j = new Vertex<>("J");
        h = new Vertex<>("H");
        k = new Vertex<>("K");
        l = new Vertex<>("L");

        graphDir.addEdge(a, c);
        graphDir.addEdge(a, f);
        graphDir.addEdge(c, d);
        graphDir.addEdge(e, c);
        graphDir.addEdge(d, e);
        graphDir.addEdge(d, j);
        graphDir.addEdge(f, d);
        graphDir.addEdge(f, g);
        graphDir.addEdge(j, g);
        graphDir.addEdge(j, h);
        graphDir.addEdge(h, e);
        graphDir.addEdge(g, l);
        graphDir.addEdge(l, k);
        graphDir.addEdge(k, j);
    }

    @Test
    public void findPathIExist() {
        Assert.assertNotNull(graphDir.getPathTo(a, h));
        Assert.assertNotNull(graphDir.getPathTo(a, j));
        Assert.assertNotNull(graphDir.getPathTo(d, h));
    }

    @Test
    public void returnNullIfPathNotExist() {
        Assert.assertTrue(graphDir.getPathTo(a, b).isEmpty());
    }
}
