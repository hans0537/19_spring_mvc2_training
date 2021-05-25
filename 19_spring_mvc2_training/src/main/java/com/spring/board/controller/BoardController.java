package com.spring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.board.dto.BoardDTO;

@Controller // 컨트롤러임을 명시 (controller bean에 등록시킴)
public class BoardController {

	// value : url 주소를 명시
	// method : 요청타입을 명시
	@RequestMapping(value="/boardWrite" , method=RequestMethod.GET)
	public String boardWrite() {
		return "board/bWrite"; // servlet-context.xml 에 명시된 대로 포워딩할 jsp파일을 작성해 준다.
	}
	
	@RequestMapping(value="/boardWrite" , method=RequestMethod.POST)
	public String boardWrite(BoardDTO bdto) {
		return "잠시대기";
	}
}
