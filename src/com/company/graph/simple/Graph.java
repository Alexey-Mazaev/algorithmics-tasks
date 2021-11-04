package com.company.graph.simple;

import com.company.graph.utils.Vertex;

import java.util.*;

public class Graph {

    private final Map<Vertex, List<Vertex>> items = new HashMap<>();

    public void addVertex(String name) {
        Vertex newVertex = new Vertex(name);
        items.putIfAbsent(newVertex, new ArrayList<>());
    }

    public void removeVertex(String name) {
        Vertex vertex = new Vertex(name);

        items.values().forEach(e -> e.remove(vertex));
        items.remove(vertex);
    }

    public void addEdge(String vertexName, String relatedVertexName) {
        Vertex vertex = new Vertex(vertexName);
        Vertex relatedVertex = new Vertex(relatedVertexName);

        if (!items.containsKey(vertex)) {
            items.put(vertex, new ArrayList<>());
        }

        items.get(vertex).add(relatedVertex);

        if (!items.containsKey(relatedVertex)) {
            items.put(relatedVertex, new ArrayList<>());
        }

        items.get(relatedVertex).add(vertex);
    }

    public void removeEdge(String vertexName, String relatedVertexName) {
        Vertex vertex = new Vertex(vertexName);
        Vertex relatedVertex = new Vertex(relatedVertexName);

        if (items.containsKey(vertex)) {
            items.get(vertex).remove(relatedVertex);
        }

        if (items.containsKey(relatedVertex)) {
            items.get(relatedVertex).remove(vertex);
        }
    }

    public Set<String> depthFirstTraversal(String rootName) {
        Set<String> visitedVertexes = new LinkedHashSet<>();

        Stack<String> stack = new Stack<>();
        stack.push(rootName);

        while (!stack.isEmpty()) {
            String vertexName = stack.pop();

            if (!visitedVertexes.contains(vertexName)) {
                visitedVertexes.add(vertexName);

                Vertex vertex = new Vertex(vertexName);
                List<Vertex> relatedVertexes = items.get(vertex);

                for (Vertex v : relatedVertexes) {
                    stack.push(v.getName());
                }
            }
        }

        return visitedVertexes;
    }

    public Set<String> breadthFirstTraversal(String rootName) {
        Set<String> visitedVertexes = new LinkedHashSet<>();
        visitedVertexes.add(rootName);

        Queue<String> queue = new LinkedList<>();
        queue.add(rootName);

        while (!queue.isEmpty()) {
            Vertex vertex = new Vertex(queue.poll());

            for (Vertex v : this.items.get(vertex)) {
                if (!visitedVertexes.contains(v.getName())) {
                    visitedVertexes.add(v.getName());
                    queue.add(v.getName());
                }
            }
        }

        return visitedVertexes;
    }
}
