class StackX {
	private final int SIZE = 20;
	private int top;
	private int[] st;

	public stackX() {
		st = new int[SIZE];
		top = -1;
	}

	public void push(int j) {
		st[++top] = j;
	}

	public int pop() {
		return st[top--];
	}

	public int peek() {
		return st[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}


class Vertex {
	private char label;
	private boolean wasVisited;

	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}
}



class Graph {
	private final int MAX_VERTS = 20;
	private int nVerts;
	private Vertex vertexList[];
	private int adjMat[][];
	private StackX theStack;

	public Graph() {
		nVerts = 0;
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		theStack = new StackX();
		for (int j=0; j<MAX_VERTS; j++) {
			for (int k=0; k<MAX_VERTS ; k++) {
				adjMat[j][k] = 0;
			}
		}
	}

	public void addVertex(char label) {
		vertexList[nVerts++] = new Vertex(label);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}

	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}

	public void dfsAlgo() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()) {
			int v = getAdjUnvisitedVertex(theStack.peek());
			if(v == -1)
				theStack.pop();
			else {
				vertexList[v].wasVisited = true;
				displayVertex(v);
				theStack.push(v);
			}
			for(int j=0; nVerts; j++)
				vertexList[j].wasVisited = false;
		}
	}

	public int getAdjUnvisitedVertex(int v) {
		for(int j=0; j<nVerts; j++) {
			if(adjMat[v][j] == 1 && vertexList[v].wasVisited == false)
				return j;
			return -1
		}
	}
}


public class dfs {
	public static void main(String args[]) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');

		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);

		System.out.pritln("Visits : ");
		theGraph.dfsAlgo();

		System.out.println();
	}
}