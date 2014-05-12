package com.kumar.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public static void main(String[] args) {
		int v = 5;
		int e = 5;
		int adj[][] = { { 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 } };

		int visit[] = new int[v];
		for (int i = 0; i < v; i++)
			visit[i] = 0;
		Graph g = new Graph(v, e, adj, visit);
		cc(g);
	}

	// for unconnected components
	public static void cc(Graph g) {

		for (int u = 0; u < g.v; u++) {
			if (g.visit[u] == 0)
				bfs(g, u);
		}
	}

	private static void bfs(Graph g, int u) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(u);
		g.visit[u] = 1;
		while (!q.isEmpty()) {
			int n = q.poll();
			System.out.print(n + " ");
			for (int v = 0; v < g.v; v++) {

				if ((g.adj[n][v] == 1) && (g.visit[v] == 0)) {
					q.add(v);
					g.visit[v] = 1;
				}

			}
		}
	}
}
