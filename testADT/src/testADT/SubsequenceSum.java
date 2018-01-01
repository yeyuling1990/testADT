package testADT;

public class SubsequenceSum {

	public static int maxSubSuml( int[] a )
	{
		int maxSum = 0;
		for(int i = 0; i < a.length; i++ )
			for( int j = i; j < a.length; j++ )
			{
				int thisSum = 0;
				for(int k = i; k < j; k++ )
				{
					thisSum += a[k];
				}
			
				if(thisSum > maxSum )
				maxSum = thisSum;					
			}
		return maxSum;
	}
	
	public static int maxSubSum2(int[] a )
	{
		int maxSum = 0;
		for( int i = 0; i < a.length; i++ )
		{
			int thisSum = 0;
			for(int j = i;j < a.length; j++ )
			{
				thisSum += a[j];
				
				if(thisSum > maxSum )
					maxSum = thisSum;
			}
		}
		return maxSum;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {-2,11,-4,13,-5,-2,5,34,-33,24,22,-5,-56,23,55};
		int maxSeqSum = maxSubSuml(arr);
		System.out.println(maxSeqSum);
		System.out.println();
		System.out.println("hehe");
	}

}
