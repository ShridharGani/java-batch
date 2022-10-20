class  IfElseIfCondition{
public static void main(String args[]){
  double marks= 34;
  
  if(marks >= 85){
  System.out.println("Passed with distinction");
  }
  
  else if(marks >=60 && marks <85){
  System.out.println("Passed with first class");
  }
  
  else if(marks <60 && marks >=35){
  System.out.println("Passed with second class");
  }
  
  else{
  System.out.println("You Failed");
  }
  
 }
}