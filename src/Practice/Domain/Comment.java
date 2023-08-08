package Practice.Domain;

public class Comment {
	
	private Integer id;
	private String contents;
	
	public Comment(Integer id,String contents) {
		this.id = id;
		this.contents = contents;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ id="+id+", contents="+contents+"}";
	}
	
}
