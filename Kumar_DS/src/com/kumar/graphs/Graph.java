package com.kumar.graphs;

public class Graph {
	int v;
	int e;
	int adj[][];
	int visit[];

	Graph(int v, int e, int adj[][], int visit[]) {
		this.v = v;
		this.e = e;
		this.adj = adj;
		this.visit = visit;
	}
}
