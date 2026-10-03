class Addition 
{ 
 int a,b; 
 Addition(int x,int y) 
 { 
  a=x; 
  b=y; 
 } 
 void display() 
 { 
  System.out.println("Addition="+(a+b)); 
 } 
 public static void main(String args[]) 
 { 
  Addition a1=new Addition(100,200); 
  a1.display(); 
 } 
} 