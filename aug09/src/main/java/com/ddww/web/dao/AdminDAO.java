package com.ddww.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.fasterxml.jackson.databind.JsonNode;

@Mapper
public interface AdminDAO {

	Map<String, Object> adminLogin(Map<String, Object> map);

	List<Map<String, Object>> notice();

	void noticeWrite(Map<String, Object> map);

	String noticeDetail(int nno);

	int noticeHide(int nno);

	List<Map<String, Object>> setupBoardList();

	int multiBoardInsert(Map<String, String> map);

	List<Map<String, Object>> memberList();

	int gradeChange(Map<String, Object> map);

	List<Map<String, Object>> post(Map<String, Object> map);

	List<Map<String, Object>> boardList();

	Map<String, Object> postDetail(int mbno);

}
