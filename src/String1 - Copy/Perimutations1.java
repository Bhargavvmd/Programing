package String1;

public class Perimutations1 {
	public static void main(String[] args) {
		String str="bhargav";
		int n=str.length();

		Perimutations1 permutation=new Perimutations1();
		permutation.permit(str, 0, n-1);

	}
	public void permit(String str,int start,int end) {
		
		if(start==end) {
			System.out.println(str);
		}
		else {
			
			for(int i=start;i<=end;i++) {
				str=swap(str,start,i);
				permit(str,start+1,end);
				str=swap(str,start,i);
				
			}
		}
	}
	private String swap(String str, int i, int j) {
		// TODO Auto-generated method stub
		char []ar=str.toCharArray();
		char temp;
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		return String.valueOf(ar);
	}

}	

