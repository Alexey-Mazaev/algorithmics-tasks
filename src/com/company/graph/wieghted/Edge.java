package com.company.graph.wieghted;

import com.company.graph.utils.Vertex;

public class Edge {

    private final Vertex relatedVertex;

    private final int weight;

    public Edge(Vertex relatedVertex, int weight) {
        this.relatedVertex = relatedVertex;
        this.weight = weight;
    }

    public Vertex getRelatedVertex() {
        return relatedVertex;
    }

    public int getWeight() {
        return weight;
    }
}
