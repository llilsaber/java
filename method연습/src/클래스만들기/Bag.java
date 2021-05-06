package 클래스만들기;

public class Bag {
	String name;
	int age;
	double weight;
	
	
	@Override
	public String toString() {
		return "Bag [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	//컨트롤+쉬프트+s+r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
