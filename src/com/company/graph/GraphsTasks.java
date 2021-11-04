package com.company.graph;

import com.company.graph.simple.Graph;

import java.util.Arrays;
import java.util.Set;

public class GraphsTasks {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");

        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");

        Set<String> depthFirstTraversalResult = graph.depthFirstTraversal("Alice");

        System.out.println("Depth first traversal results if start from Alice");
        System.out.println(Arrays.toString(depthFirstTraversalResult.toArray()));


        Set<String> breadthFirstTraversalResult = graph.breadthFirstTraversal("Alice");

        System.out.println("Breadth first traversal results if start from Alice");
        System.out.println(Arrays.toString(breadthFirstTraversalResult.toArray()));
    }
}
