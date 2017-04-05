package hw;
/*
 * Topic: hw01 
 * Date: 2017/3/31
 * Author: 105021115 陳邦天
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw01_105021115 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> arr =new ArrayList<Student>();
		int a=0,score;
		String name,id,n;
		
		while(a==0){
			System.out.print("請輸入名字-");
			name = scn.next();
			System.out.println();
			
			System.out.print("請輸入學號-");
			id = scn.next();
			System.out.println();
			
			System.out.print("請輸入分數-");
			score = scn.nextInt();
			System.out.println();
			
			arr.add(new Student(name,id,score));
			//顯示原始成績
			for(int i=0 ;i<arr.size();i++){
				arr.get(i).showAll();
				System.out.println();
			}
			System.out.println();
			//成績排序
			for(int i=0 ; i<arr.size() ; i++){
				for(int j=i+1 ; j<arr.size() ; j++){
					if(arr.get(i).getScore()<arr.get(j).getScore()){													
						Student s1 = new Student(arr.get(i).getName(),arr.get(i).getID(),arr.get(i).getScore());
						arr.set(i, arr.get(j));
						arr.set(j, s1);
						
					}
				}
			}
			//顯示排序後的成績
			for(int i=0 ;i<arr.size();i++){
				arr.get(i).showAll();
				System.out.println();
			}
			
			System.out.print("輸入N or n 結束程式-");
			n = scn.next();
			System.out.println();
			if(78==(int)n.charAt(0) || 110==(int)n.charAt(0) ){
				break;
			}
		}
		
		
	}

	

}