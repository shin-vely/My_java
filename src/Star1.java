
public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("오늘의체크리스트");
		System.out.println("For문으로 별증가시키기");
		
		int i=0;
		int j=0;
		for(i=1; i<=5; i++) {
			
          for(j=1;j<=i; j++) {
        	  System.out.print("☆");
          }
          System.out.println("");
            
		}
		
        for(i=1; i<=5; i++) {
      	  for(j=5; j>=i; j--) {
          	  System.out.print("☆");  
        }
        System.out.println("");
	}
}
}
