// stack
class StackX
{
	private final int SIZE = 20;
	private int[] st;
	private int top;
	
	public StackX(){
		st = new int[SIZE];
		top = -1;
	}
	
	public void push(int j){ 
		st[++top] = j; 
	}
	
	public int pop(){ 
		return st[top--]; 
	}
	
	public int peek(){ 
		return st[top]; 
	}
	
	public boolean isEmpty(){ 
		return (top == -1); 
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


// graoh
class Graph{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][];
	private int nVerts;
	private StackX theStack;
	
	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)
			for(int k=0; k<MAX_VERTS; k++)
				adjMat[j][k] = 0;
		theStack = new StackX();
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
	
	public void dfs() 
	{
		// begin at vertex 0
		vertexList[0].wasVisited = true; // mark it
		displayVertex(0);
		// display it
		theStack.push(0);
		// push it
		while( !theStack.isEmpty() ){
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1)
				// if no such vertex,
				theStack.pop();
			else{
				vertexList[v].wasVisited = true; // mark it
				displayVertex(v);
				// display it
				theStack.push(v);
				// push it
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


class DepthFirstSearch
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
		theGraph.dfs();
		System.out.println();
	}
}