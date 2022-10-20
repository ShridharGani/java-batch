class NestedIfCondition{
public static void main(String args[]){
   String qualification = "BE";
   boolean knowjava = false;
   
   if(qualification == "BE"){
     if(knowjava){
	 System.out.println("Eligible to attend the interview");
	 }
	 else{
	 System.out.println("Not eligible to attend the interview");
	 }
		}
   else{
   System.out.println("You are not eligible to attend the interview");
   }
  }
 }