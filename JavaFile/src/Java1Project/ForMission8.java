package Java1Project;

public class ForMission8 {

	public static void main(String[] args) {
		
		//____*
		//___**
		//__***
		//-****
		//*****
		
		int star = 10;
		int k = 0;
		
		for (int j=0; j<star; j++) {
			for(int m = star; m > j; m--) {
				System.out.printf("_");
			}
			for(int i =0; i <= k; i++) {
				System.out.printf("*");
			}
			k++;
			System.out.printf("\n");
		}
		
//		for(int i=star; i>0; i--) {
//			for(int k=1; k<=star; k++) {
//				if(k<i) {System.out.print("-"); }
//				else {System.out.print("*");}
//			}
//			System.out.println();
//		}
//		
//		for(int i=1; i<=star; i++) {
//			for(int z=i; z<star; z++) {
//				System.out.print("_");
//			}
//			for(int k=0; k<i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		

		
		
		
		
		
		
		
		
		
	}
}
