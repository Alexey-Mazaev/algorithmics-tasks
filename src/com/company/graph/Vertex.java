package com.company.graph;

public class Vertex {

    private final String name;

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        for (int i = 0; i < this.name.length(); i++) {
            hash += this.name.charAt(i);
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Vertex vertex)) {
            return false;
        }

        return this.name.equals(vertex.name) && vertex.hashCode() == this.hashCode();
    }
}
