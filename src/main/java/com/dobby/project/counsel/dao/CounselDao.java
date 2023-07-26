package com.dobby.project.counsel.dao;
import com.dobby.project.counsel.domain.*;

import java.util.List;
import java.util.Map;

public interface CounselDao {

    // mbrId = 회원 아이디, cnslId = 상담글 번호

    // 메서드명 : selectFromMember
    // 기   능 : session에 저장 된 아이디 (mbrId)에 해당하는 회원의 정보를 조회하는 메서드
    MemberDto selectFromMember(String mbrId) throws Exception; // 1:1 상담 작성 전 회원 조회


    // 메서드명 : insertCounsel
    // 기   능 : 1:1 상담을 작성하는 메서드
    void insertCounsel(CounselDto counselDto) throws Exception; // 1:1 상담 작성

    // 메서드명 : selectProdList
    // 기   능 : 1:1 상담 중 문의 제품 목록을 불러오는 기능
    List<ProdDto> selectProdList(Map map) throws Exception; // 문의 제품 목록



    // 메서드명 : countCounselByMember
    // 기   능 : 회원별 1:1 상담 총 개수
    int countCounselByMember(String mbrId) throws Exception; // 회원별  1:1 상담 총 개수

    // 메서드명 : countProd
    // 기   능 : 1:1 상담 중 문의 제품 목록의 총 개수
    int countProd() throws Exception;   // 상품 총 개수

    // 메서드명 :
    // 기   능 :
    void insertFile(BbsFileDto bbsFileDto) throws Exception; // 1:1 상담 첨부파일
//    List<BbsFileDto> insertFile(Map map) throws Exception;

    // 메서드명 : selectListByMember
    // 기   능 : 회원별로 1:1 상담 목록을 불러오는 메서드
    List<CounselAnswerDto> selectListByMember(String mbrId) throws Exception;// 회원별 1:1 상담 목록 불러오기 (COUNSEL+ANSWER JOIN)

    // 메서드명 : deleteCounsel
    // 기   능 : 회원별 1:1 상담 게시물을 삭제하는 메서드 (답변 완료 전에만 가능)
    int deleteCounsel(Integer cnslId) throws Exception;   // 회원별 1:1 상담 게시물 삭제




    //여기부터 관리자 페이지


    // 메서드명 : countAllCounsel
    // 기   능 : 모든 회원들의 1:1 상담 총 개수
    int countAllCounsel() throws Exception; // 1:1 상담 총 개수


    // 메서드명 : selectAllList
    // 기   능 : 모든 회원들의 1:1 상담 목록 불러오기
    List<CounselAnswerDto> selectAllList(Map map) throws Exception; // 전체 1:1 상담 목록 불러오기 (COUNSEL+ANSWER JOIN)

    // 메서드명 : insertAnswer
    // 기   능 : 회원이 작성한 상담글에 답변을 작성
    void insertAnswer(AnswerDto answerDto) throws Exception; // 답변 작성

    // 메서드명 :
    // 기   능 :
    int updateCounselStatus(CounselDto counselDto) throws Exception;   // 1:1 상담 게시물 상태 업데이트

    // 메서드명 :
    // 기   능 :
    CounselDto getCounselByCNSL_ID(Integer CNSL_ID) throws Exception;   // 상담번호로 해당 Dto 가져오기

}
