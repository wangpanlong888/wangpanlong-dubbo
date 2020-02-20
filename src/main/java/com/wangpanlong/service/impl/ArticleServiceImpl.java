package com.wangpanlong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangpanlong.entity.Article;
import com.wangpanlong.entity.Condition;
import com.wangpanlong.mapper.ArticleMapper;
import com.wangpanlong.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleMapper articleMapper;
	
	@Override
	public List<Article> list(Condition con, int sortt) {
		return articleMapper.list(con,sortt);
	}

}
