// stack
class QueueX
{
	private final int SIZE = 20;
	private int queueArray[];
	int front;
	int rear;

	public QueueX{
		queueArray = new int[SIZE];
		front = 0;
		rear = -1;
	}

	public void insert(int i){
		if(rear == SIZE-1)
			rear = -1;
		queueArray[++rear] = i
	}

	public void remove(){
		int temp = queueArray[front++];
		if(front == SIZE)
			front = 0;
		return temp;
	}

	public boolean isEmpty(){
		return ( rear+1 == front || (front+SIZE-1 == rear) );
	}
}


// vertex
class Vertex
{
	public char label;
	// label (e.g. ‘A’)
	public boolean wasVisited;
	public Vertex(char lab){
		label = lab;
		wasVisited = false;
	}
}


// graph
class Graph{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][];
	private int nVerts;
	private StackX theQueue;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)
			for(int k=0; k<MAX_VERTS; k++)
				adjMat[j][k] = 0;
		theQueue = new QueueX();
	} 

	public void addVertex(char lab){
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	public void bfs() 
	{
		vertexList[0].wasVisited = true; // mark it
		displayVertex(0);
		theQueue.insert(0);
		while( !theQueue.isEmpty() ){
			int v1 = theQueue.remove();
			
			while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
			{
				// get one,
				vertexList[v2].wasVisited = true; // mark it
				displayVertex(v2);
				// display it
				theQueue.insert(v2);
				// insert it
			}
		} 

		for(int j=0; j<nVerts; j++)
			// reset flags
			vertexList[j].wasVisited = false;
	} 

	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<nVerts; j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1;
	}
}


public class DepthFirstSearch
{
	public static void main(String[] args)
	{
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
		
		System.out.print(" Visits : ");
		theGraph.bfs();
		System.out.println();
	}
}