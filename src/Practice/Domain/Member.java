package Practice.Domain;

public class Member {
	
	private String name;
	private String job;
	private Integer age;
	
	public Member(String name,String job,Integer age) {
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{name:"+name+" , job:"+job+"}";
	}
	
	
}
