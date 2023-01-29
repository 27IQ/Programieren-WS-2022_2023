package aufgabe1;

public class CopyArray {

	public int[] copyPartToArray(int[] source,int start,int end) {
		if(0>start||start>=source.length||0>end||end>=source.length||start>end)
		return null;

		int[] arr=new int[end-start+1];

		for(int i=start;i<=end;i++){
			arr[i-start]=source[i];
		}

		return arr;
	}
}
