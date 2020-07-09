import java.util.ArrayList;
import java.util.Collections;
public class randommatrix {
	public static void main(String args[]) {
		int i,j;
		int[] matrix= new int[100];
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (i=1; i<15; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        
         int k=1;   
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
	          //matrix[i][j]=list.get(i+j).intValue();
				System.out.print(list.get(k)+" ");
				k=(k+1)%14;
			}System.out.print("\n");
		}
		
	}

}
