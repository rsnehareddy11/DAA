
public class dijkstra 
{
	public static void main(String args[])
	{
		int graph[][]=new int[][]{{0,2,0,0,0,0,6,0},
		{2,0,7,0,2,0,0,0},
		{0,7,0,3,0,3,0,9},
		{0,0,3,0,0,0,0,2},
		{0,2,0,0,0,2,1,0},
		{0,0,3,0,2,0,0,2}, 
		{6,0,0,0,1,0,0,4},
		{0,0,0,0,0,2,4,2
		}};
		int visited[]=new int[8];
		int min=999,nextnode=0;
		int pred[]=new int[8];
		int distance[]=new int[8];
		System.out.println("the minimum edge length from source to the destination");
		
		for(int i=0;i<8;i++)
		{
			visited[i]=0;
			pred[i]=0;
			for(int j=0;j<distance.length;j++)
			{
				if(graph[i][j]==0)
				{
					graph[i][j]=999;
				}
			}
		}
	distance=graph[0];
	visited[0]=1;
	distance[0]=0;
	
	for(int counter=0;counter<8;counter++)
	{
		min=999;
		for(int i=0;i<8;i++)
		{
			if(min>distance[i]&&visited[i]!=1)
			{
				min=distance[i];
				nextnode=i;
			}
		}
	
		visited[nextnode]=1;
	for(int i=0;i<8;i++)
	{
		if(visited[i]!=1)
		{
			if(min+graph[nextnode][i]<distance[i])
			{
				distance[i]=min+graph[nextnode][i];
			}
		}
	}
	
	}
	
	for(int i=0;i<8;i++)
	{
		System.out.println(i+"th vertex distance from the source node=="+distance[i]); 
	}
}
}