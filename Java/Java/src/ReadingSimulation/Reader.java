package ReadingSimulation;

public class Reader {
	String name;
	int age;
	char gender;

	void read(Book book) {
		System.out.println(name+" is reading: "+book.getTitle());
		System.out.println(book.getTitle()+"'s author is "+book.author.getName()+".");
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
