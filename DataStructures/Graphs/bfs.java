class QueueX {
	private final int SIZE = 20;
	private int front;
	private int rear;
	private int qarray[];

	public QueueX() {
		qarray = new int[SIZE];
		front = 0;
		rear = -1;
	}

	public void insert(int j) {
		if(rear == SIZE-1)
			rear = -1;
		qarray[++rear] == j;
	}

	public void remove() {
		int temp = qarray[front++];
		if(front == SIZE)
			front = 0;
		return temp;
	}

	public boolean isEmpty() {
		return (rear+1==front || front+SIZE-1==rear);
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
	private final int MAX_VERTS =20;
	private Vertex vertexList[];
	private int adjMat[][];
	private QueueX theQueue;
	private int nVerts;

	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		for (int j=0;j<MAX_VERTS ; j++) {
			for (int k=0; k<MAX_VERTS ; k+=) {
				adjMat[j][k] = 0;
			}
		}
		nVerts = 0;
		theQueue = new QueueX();
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

	public void bfsAlgo() {
		vertexList[0].wasVisited = true;
		displayVertex(0);
		theQueue.insert(0);
		int v2;
		while(!theQueue.isEmpty()) {
			int v2 = theQueue.remove();
			while((v2=getAdjUnvisitedVertex(v1)) != -1) {
				vertexList[v2].wasVisited = true;
				displayVertex(v2);
				theQueue.insert(v2);
			}
		}
		for(int j=0l j<nVerts; j++)
			vertexList[j].wasVisited = false;
	}

	public int getAdjUnvisitedVertex(int v) {
		for(int j=0; j<nVerts; j++) {
			if(adjMat[v][j]==1 && vertexList[v].wasVisited == false)
				return j;
			return -1;
		}
	}
}


public class bfs {
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
		theGraph.bfsAlgo();

		System.out.println();
	}
}