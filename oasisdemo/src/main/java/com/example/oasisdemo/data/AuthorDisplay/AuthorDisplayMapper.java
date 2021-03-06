package com.example.oasisdemo.data.AuthorDisplay;

import com.example.oasisdemo.vo.AuthorPortraitVO;
import com.example.oasisdemo.vo.AuthorVO;
import com.example.oasisdemo.vo.DocumentSummaryVO;
import com.example.oasisdemo.vo.RelationVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface AuthorDisplayMapper {


    int getAuthorCount(@Param("id") int affiliationId);

    List<AuthorVO> selectByAffId(@Param("id") int affiliationId);

    List<AuthorVO> selectByAuthorKeyword(@Param("keyword") String keyword);

    List<AuthorPortraitVO> selectTopTenPublication();

    List<AuthorPortraitVO> selectAuthorById(@Param("id") int id);

    List<AuthorPortraitVO> selectAllAuthor();

    List<AuthorPortraitVO> selectAuthorByName(@Param("name") String name);

    Integer getPaperCitation(@Param("title") String title);

    String getPaperAuthors(@Param("title") String title);

    List<RelationVO> selectRelationById(@Param("id") int authorId);

    List<RelationVO> selectABRelation(@Param("Aid") int Aid,@Param("Bid") int Bid);

    int updateHeat(@Param("id") int id,@Param("heat") int heat);

    List<AuthorPortraitVO> selectAuthorByHeat();

}
