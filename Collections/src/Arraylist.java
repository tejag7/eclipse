import java.util.*;  
class Arraylist{  
 public static void main(String args[]){  
  ArrayList list=new ArrayList();
  list.add(1);  
  list.add(2);  
  list.add(3);  
  list.add(5);  
  list.remove(3);
  list.add(25);
  
  
 
  
  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }

}