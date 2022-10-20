class StudentDetails{

String name;
int rollnumber;
String branch;

void StudentDetails(){
System.out.println("Name :" + name );
System.out.println("Roll Number :" + rollnumber );
System.out.println("Branch :" + branch );
}


public static void main(String args[]){

StudentDetails Student1 = new StudentDetails();

Student1.name = "Vishnu";
Student1.rollnumber = 24;
Student1.branch = "Mech";

Student1.StudentDetails();

StudentDetails Student2 = new StudentDetails();

Student2.name = "Adi";
Student2.rollnumber = 2;
Student2.branch = "IS";

Student2.StudentDetails();

}

}