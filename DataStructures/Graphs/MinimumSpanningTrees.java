// The rest code similar to the Graph

// only adding the Minimum Spanning tree method

// it can be implemented using both BFS and DFS algorithm

// here it is using DFS

public static void mst() {
	vertexList[0].wasVisited = true;
	theStack.push(0);

	while(!theStack.isEmpty()) {
		int currentVertex = theStack.peek();
		int v1 = getAdjUnivsitedVertex(currentVertex);

		if(v1 == -1)
			theStack.pop();
		else {
			vertexList[v1].wasVisited = true;
			theStack.push(v1);
			displayVectex(currentVertex);
			displayVectex(v1);
			System.out.println(" ");
		}
	}

	for(int j=0; j<nVerts; j++)
		vertexList[j].wasVisited = false;
}

public static int getAdjUnivsitedVertex(int v) {
	for(int j=0; j<nVerts; j++) {
		if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false)
			return j;
	}
	return -1;
}