package Practice.Domain;

import java.time.LocalDateTime;
import java.util.List;

public class Board {
	
	private Integer id;
	
	private String title;
	
	private String contetns;
	
	private String author;
	
	private Boolean liked;
	
	private Integer readCount;
	
	private LocalDateTime createdTime;
	
	private List<Comment>commentList;
	
	public Board(Integer id,String title,String author,String contents,Boolean liked,Integer readCount,LocalDateTime createdTime,List<Comment>list) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.contetns = contents;
		this.liked = liked;
		this.readCount = readCount;
		this.createdTime = createdTime;
		this.commentList = list;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContetns() {
		return contetns;
	}
	public void setContetns(String contetns) {
		this.contetns = contetns;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Boolean getLiked() {
		return liked;
	}
	public void setLiked(Boolean liked) {
		this.liked = liked;
	}
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public LocalDateTime getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(LocalDateTime createdTime) {
		this.createdTime = createdTime;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
		
}
