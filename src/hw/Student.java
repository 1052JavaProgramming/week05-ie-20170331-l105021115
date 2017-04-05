package hw;
/*
 * Topic: hw01_Student class 
 * Date: 2017/3/31
 * Author: 105021115 陳邦天
 */
public class Student {
       private String name,id;
       private int score;
       public Student(String name1,String id1,int score1){
    	   name = name1;
    	   id = id1;
    	   setScore(score1);
       }
       public void setScore(int val){
    	   score = val;
       }
       public String getName(){
    	   return name;
       }
       public String getID(){
    	   return id;
       }
       public int getScore(){
    	   return score;
       }
       
       public void showAll(){
    	   System.out.print(getName()+"\t"+getID()+"\t"+getScore());
       }
}
