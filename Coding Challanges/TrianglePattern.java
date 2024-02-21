package com.edu;

public class TrianglePattern {

	public static void main(String[] args) {
		
		int r1=3, r2=2, r3=4;
		
		for(int i=1;i<=r1;i++) {
			//blank
			for(int b=1;b<=r1-i;b++) { //2 blanks
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) { //
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//second pattern
		for(int i=1;i<=r2;i++) {
			//blank
			for(int b=1;b<=r2-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//third pattern
		for(int i=1;i<=r3;i++) {
			//blank
			for(int b=1;b<=r3-i;b++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
