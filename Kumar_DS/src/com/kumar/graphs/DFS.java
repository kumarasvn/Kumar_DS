package com.kumar.graphs;

public class DFS {
	public static void main(String[] args) {
		int v = 4;
		int e = 4;
		int adj[][] = { { 0, 1, 0, 1 }, { 1, 0, 1, 0 }, { 0, 1, 0, 1 },
				{ 1, 0, 1, 0 } };
		int visit[] = new int[v];
		for (int i = 0; i < v; i++)
			visit[i] = 0;
		Graph g = new Graph(v, e, adj, visit);
		cc(g);
	}

	public static void cc(Graph g) {
		for (int u = 0; u < g.v; u++) {
			if (g.visit[u] == 0)
				dfs(g, u);
		}
	}

	public static void dfs(Graph g, int u) {
		g.visit[u] = 1;
		System.out.print(u + " ");
		for (int v = 0; v < g.v; v++) {
			if ((g.adj[u][v] == 1) && (g.visit[v] == 0)) {
				dfs(g, v);
			}
		}
	}

}
