package First;

import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList numList = new ArrayList();
		// oddSum--9, evemSum---12
		numList.add(-1);
		numList.add(2);
		numList.add(3);
		numList.add(-4);
		numList.add(5);
		numList.add(6);
		int pos=0,neg=0,num;
		for(int i=0;i<numList.size();i++) {
			num = (int)numList.get(i);
			if(num > 0) {
				pos = pos + num; 
			}
			else {
			neg = neg + num;	
			}
		}// loop
		
		System.out.println("PositiveSum---->"+pos);
		System.out.println("NegativeSum---->"+neg);
	}   

}