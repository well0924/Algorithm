package Practice.Domain;

public class Student {
	public enum Sex{MALE,FEMALE}
	public enum City{SEOUL,PUSAN}
	
	private String name;
	private Integer score;
	private Sex sex;
	private City city;
	
	public Student(String name,Integer score,Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student(String name,Integer score,Sex sex,City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+", 성별:"+sex;
	}
}
