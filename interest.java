import java.util.*; 
interface Interest  
{ 
 int R=25; 
 void Simple_Interest(); 
 void Compound_Interest(); 
} 
class InterestCalc implements Interest 
{ 
 int P,T,N; 
 public void Simple_Interest() 
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter Principal Amount:"); 
  P=sc.nextInt(); 
  System.out.println("Enter no of years:"); 
  T=sc.nextInt(); 
  int SI=(P*R*T); 
  System.out.println("Simple Interest="+SI); 
 } 
 public void Compound_Interest() 
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter Principal Amount:"); 
  P=sc.nextInt(); 
  System.out.println("Enter no of years:"); 
  T=sc.nextInt(); 
  System.out.println("No of times compounded interest calculated:"); 
  N=sc.nextInt(); 
  float CI=(P*(1+(R/N))^(N*T)); 
  System.out.println("Compound Interest="+CI); 
 } 
 public static void main(String args[]) 
 { 
  InterestCalc c1=new InterestCalc(); 
  c1.Simple_Interest(); 
  c1.Compound_Interest();
}
}