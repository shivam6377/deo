class student
{
	private int rollno;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setrollno(int r)
	{
		rollno=r;
	}
	public int getrollno()
	{
		return rollno;
	}
}
public class Encapuslationdemo {

	public static void main(String[] args)
	{
		student s1=new student();
		s1.setrollno(2);
		s1.setName("navin");
		
		System.out.println(s1.getrollno());
		System.out.println(s1.getName());

	}

}
