


public class construct {
    public static void main(String[] args) {
      Student s1 = new Student("shivam"); //
     System.out.println(s1.name); //
     Student s = new Student();   // constructor overloading
     s.marks[0] = 100;
     s.marks[1] = 90;
     s.marks[2] = 80;
    Student s2 = new Student(12343);//

    s.name = "sarkaar";
    s.roll = 1234;
    s.password = "akashShukla";

    Student s4 = new Student(s);
    s4.password = "abcd";
    s.marks[2]=50;

    for(int i = 0; i < s.marks.length; i++){
        System.out.println(s4.marks[i]);
    }
}

}


class Student{
   String name;
   int roll;
   String password;
   int marks[];
   
   Student(){// non parameterized constructor
    marks = new int[3];
    System.out.println("constructor called");
   }
  
// deep copy constructor
Student (Student s){
  marks = new int[3];
    this.name = s.name;
  this.roll = s.roll;
    for(int i = 0; i < marks.length; i++){
        this.marks[i] = s.marks[i];
}
}



   // shallow copy constructor

  //  Student(Student s){
  //   marks = new int[3];
  //   this.name = s.name;
  //   this.roll = s.roll;
  //   this.marks = s.marks;

  //  }



   Student(String name){// parameterized constructor
    marks = new int[3];
    this.name = name;
   }
 Student(int roll){
  marks = new int[3];
  this.roll = roll;
 }
}
