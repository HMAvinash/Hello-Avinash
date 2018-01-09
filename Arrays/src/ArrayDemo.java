
public class ArrayDemo {

	public static void main(String[] args) {

		int arr[];
		int arr1[]={10,20,30};
		int arr3[]=new int[5];
		arr3[1]=10;
		arr3[2]=34;
		arr3[3]=32;
		arr3[0]=2;
		arr3[4]=6;
		for(int i=0;i<=arr3.length-1;i++)
		{
			System.out.println(arr3[i]);
		}
		System.out.println("______________________________");
		for(int i:arr3)
		{
			System.out.println(i);
		}
	}

}
