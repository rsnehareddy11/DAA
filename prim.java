public class prim{
	public static void main(String[] args){
		int graph[][]=new int[][]
		//{{0,4,3,0,0,0,0},{4,0,0,0,12,5,0},{3,0,0,7,10,0,0},{0,0,7,0,2,0,0}
		//,{0,0,10,2,0,0,5},{0,5,0,0,0,0,16},{0,0,0,0,5,16,0}};
	           	          { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
 
		int visited[] =new int[5];
		int min=99; int u=0;int v=0;int total=0;
		for(int i=0;i<5;i++)
		{
			visited[i]=0; 
			for(int j=0;j<5;j++){
				if (graph[i][j]==0){
					graph[i][j]=99; 
				}
			}
		}
		visited[0]=1;
		for(int counter=0;counter<4;counter++){
			min=999;
			for(int i=0;i<5;i++)
			{
				if(visited[i]==1)
				{
			 
			for(int j=0;j<5;j++)
			{
				if(visited[j]==0)
				{
					if(min>graph[i][j])
					{
						min=graph[i][j];
						u=i;
						v=j;
					}
				}
			}
		}
	}
	 visited[v]=1;
	 total=total+min;
	 System.out.println("source"+u+"--->"+v+":"+min);

}
     System.out.println("the total weight of the graph"+total);
}
}
