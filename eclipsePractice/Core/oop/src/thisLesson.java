
public class thisLesson {

	public static void main(String[] args) {
		Human Anna = new Human();
		Anna.setName("ANNA");
		Anna.setAge(27);
		Anna.getInfo();
		Human Geka = new Human();
		Geka.setAge(35);
		Geka.setName("Geka");
		System.out.println(Geka.getAge() + " = age");
		Geka.getInfo();

	}
	

}
/**
 * @author rttr
 *
 */
class Human{
	String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void getInfo() {
		System.out.println(name+ " - " + age);
	}
}