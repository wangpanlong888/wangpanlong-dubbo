package com.wangpanlong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangpanlong.entity.Article;
import com.wangpanlong.entity.Condition;

public interface ArticleMapper {

	List<Article> list(@Param("con")Condition con, @Param("sortt")int sortt);

}
