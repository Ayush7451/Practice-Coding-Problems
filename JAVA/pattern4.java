class Pattern4{

	public static void main(String []arg){
		int count=1,i,j,ind=0,preValue=1,n=3,sum=0,c=0;
		int arr[][]=new int [n][n*2];
		for(i=0;i<n;i++)
		{	count=i+i+1;
			for(j=0;j<i+i+1;j++)
			{	if(j!=0)
				{
				c=count/2;
				if(c==j)
				{
					ind=j;
					continue;	
				}
				}
				//System.out.print(j+" "+preValue+" "+c+",");
				arr[i][j]=preValue;
				sum=sum+preValue;
				preValue+=2;
				
			}
				System.out.println();
				arr[i][ind]=sum;
				sum=0;
		}
		for(int x=0;x<n;x++)
		{
			for(int a=0;a<((n+x)-(x+x+1));a++)
					System.out.print(" ,");
			for(int y=0;y<x+x+1;y++)
			{
				System.out.print(arr[x][y]+",");
			}
			System.out.println();
		}

	}
}
