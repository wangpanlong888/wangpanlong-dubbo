package com.wangpanlong.service;

import java.util.List;

import com.wangpanlong.entity.Article;
import com.wangpanlong.entity.Condition;

public interface ArticleService {

	List<Article> list(Condition con, int sortt);

}
