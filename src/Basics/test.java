package Basics;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static int getMinMaxLatency(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight, int k) {
        // Parent array for Union-Find (Disjoint Set)
        int[] parent = new int[gNodes];
        int[] rank = new int[gNodes];

        // Initialize the parent array (every node is its own parent at first)
        for (int i = 0; i < gNodes; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        // Function to find the representative of a set (with path compression)
        java.util.function.IntUnaryOperator find = new java.util.function.IntUnaryOperator() {
            @Override
            public int applyAsInt(int node) {
                if (parent[node] != node) {
                    parent[node] = applyAsInt(parent[node]);  // Path compression
                }
                return parent[node];
            }
        };

        // Function to union two sets (Union by rank)
        java.util.function.BiConsumer<Integer, Integer> union = new java.util.function.BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer u, Integer v) {
                int rootU = find.applyAsInt(u);
                int rootV = find.applyAsInt(v);
                if (rootU != rootV) {
                    if (rank[rootU] > rank[rootV]) {
                        parent[rootV] = rootU;
                    } else if (rank[rootU] < rank[rootV]) {
                        parent[rootU] = rootV;
                    } else {
                        parent[rootV] = rootU;
                        rank[rootU]++;
                    }
                }
            }
        };

        // Create a list of edges with their weights
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < gFrom.size(); i++) {
            edges.add(new int[]{gFrom.get(i) - 1, gTo.get(i) - 1, gWeight.get(i)});  // 0-indexed
        }

        // Sort edges by weight (latency)
        edges.sort((a, b) -> Integer.compare(a[2], b[2]));

        // Use Kruskal's algorithm to form MST
        List<int[]> mstEdges = new ArrayList<>();
        for (int[] edge : edges) {
            if (find.applyAsInt(edge[0]) != find.applyAsInt(edge[1])) {
                union.accept(edge[0], edge[1]);
                mstEdges.add(edge);
            }
        }

        // Sort MST edges by weight in reverse order
        mstEdges.sort((a, b) -> Integer.compare(b[2], a[2]));

        // Remove the largest k-1 edges from the MST
        for (int i = 0; i < k - 1 && !mstEdges.isEmpty(); i++) {
            mstEdges.remove(0);  // Remove the largest edge
        }

        // The maximum weight of the remaining edges is the answer
        int maxLatency = 0;
        for (int[] edge : mstEdges) {
            maxLatency = Math.max(maxLatency, edge[2]);
        }

        return maxLatency;
    }

}
