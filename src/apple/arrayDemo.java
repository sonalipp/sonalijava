package apple;

public class arrayDemo {
public static void main(String[] args) {
	int[][] a;
	a=new int[4][];
	a[0]=new int[2];
	a[1]=new int[4];
	a[2]=new int[3];
	a[3]=new int[1];
	
	a[0][0]=12;
	a[0][1]=15;
	a[1][0]=16;
	a[1][1]=20;
	a[1][2]=36;
	a[1][3]=84;
	a[2][0]=37;
	a[2][1]=21;
	a[2][2]=22;
	a[3][0]=16;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[i][j]+"");
		}
	
		System.out.println();
		}
}
}