package others_api.gson;

public class Member {
	private String name;
	private String email;
	private int age;
	private Address address;

	public Member(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member{" +
			"name='" + name + '\'' +
			", email='" + email + '\'' +
			", age=" + age +
			'}';
	}
}
