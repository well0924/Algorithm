package Practice;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Practice.Domain.Board;
import Practice.Domain.Comment;
import Practice.Domain.Dto.CommentDto;

public class MapFlatMapTest {
	public static void main(String[] args) {
		//map 은 각 요소를 주어진 함수에 적용하여 새로운 요소로 변환하는 연산을 수행하는 메서드
		//flatmap은 각 용소를 스트림으로 매핑을 한 후, 이들 스트림을 하나의 평면화된 스트림으로 연결
		//하는 연산을 수행합니다.
		
		Board board = new Board(1,"test title","test author","test contents",false,0,LocalDateTime.now(),
				Arrays.asList(
						new Comment(1,"test comments"),
						new Comment(2,"test comment"),
						new Comment(3,"test comments")));
		
		List<CommentDto>commentList = board.getCommentList().stream()
				.flatMap(comment
							->Stream.of(
									new CommentDto(comment.getId(),comment.getContents())))
				.collect(Collectors.toList());
		
		System.out.println(commentList);
	}
}
