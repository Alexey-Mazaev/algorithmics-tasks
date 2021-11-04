package com.company.graph.wieghted;

import com.company.graph.utils.Vertex;

import java.util.*;

public class WeightedGraph {

    private final Map<Vertex, List<Edge>> items = new HashMap<>();

    public void addEdge(String vertexName, String relatedVertexName, int weight) {
        Vertex vertex = new Vertex(vertexName);

        if (!items.containsKey(vertex)) {
            items.put(vertex, new ArrayList<>());
        }

        Vertex relatedVertex = new Vertex(relatedVertexName);

        if (!items.containsKey(relatedVertex)) {
            items.put(relatedVertex, new ArrayList<>());
        }

        Edge edge = new Edge(relatedVertex, weight);
        items.get(vertex).add(edge);
    }

    public void removeEdge(String vertexName, String relatedVertexName) {
        Vertex vertex = new Vertex(vertexName);

        List<Edge> edges = items.get(vertex);
        Optional<Edge> removableEdge = edges.stream()
                .filter(e -> e.getRelatedVertex().getName().equals(relatedVertexName))
                .findFirst();

        removableEdge.ifPresent(edges::remove);
    }
}
