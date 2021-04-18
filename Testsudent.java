class Student{
int id;
String name;
void insertRecord(int i,String n){
	id=i;
	name=n;
}
void display(){
	System.out.println(id+ "   " +name);
}
}
class Testsudent{
	public static void main(String args[]){
		Student s1=new Student();
		s1.insertRecord(10,"vasu");
		s1.display();
	}
}
		      