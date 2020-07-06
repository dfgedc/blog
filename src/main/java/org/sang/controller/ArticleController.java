package org.sang.controller;

import org.sang.bean.Article;
import org.sang.bean.RespBean;
import org.sang.service.ArticleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/article")
public class ArticleController {


    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    ArticleService articleService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public RespBean addNewArticle(Article article){
        int result = articleService.addNewArticle(article);
        if(result ==1){
            return new RespBean("success",article.getId()+"");
        }else{
            return new RespBean("error", article.getState() == 0 ? "文章保存失败!" : "文章发表失败!");
        }
    }
}
