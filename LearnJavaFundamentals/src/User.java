import java.util.Objects;

public class User {
	
	//initalize
	private String name;
	private int age;
	
	
	//constructor
	public User(String name, int age) throws InvalidAgeException {
		if (age < 0) {
			throw new InvalidAgeException("Age isnt negative bitch!"); //use it to throw an exception
		}
		if (age < 1000000) {
			throw new InvalidAgeException("We dont have the science to live this long bitch!"); //use it to throw an exception
		}
		this.name = name;
		this.age = age;
	}



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



	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
		
	
	
	//we want to see if the age is not a negative numbber
	
	//ionstnace of the user
	
	//we wont let that happen and make one of the exception class
	
	

}
