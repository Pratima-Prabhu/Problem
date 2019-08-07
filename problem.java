package com.edureka;

public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {0,0,-2,3};
		int tot=2;
		int diff=arr.length;
		int a=-1,b=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(((arr[i]+arr[j])==tot )&&((j-i)<diff)) {
					diff=j-i;
					a=arr[i];
					b=arr[j];
				}
			}
		}
		if(a==-1) {
			System.out.println("None");
		}
		else {
			System.out.println(a+","+b);
		}
		
		
		
		
	}

}
