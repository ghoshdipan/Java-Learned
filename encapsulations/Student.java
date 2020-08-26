package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>21) {
			System.out.println("FUCK OFF SENIOR CITIZEN "+age);
		}else {
			this.age=age;
			System.out.println("OK "+age);
		}
	}

}
