Public class Student{
  private int rollNumber;
  private String name;
  public Student(int rollNumber,String name){
  this.rollNumber=rollNumber;
  this.name=name;
  }

  public String toString(){
    return "\nRoll Number:"+rollNumber+" \t Name:"+name;
  }
}
