package com.ensa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ensa.entities.Article;
import com.ensa.services.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleRestController {

	@Autowired
	ArticleService articleService;
	
	@GetMapping("")
	public List<Article> getAllArticles() {
		return articleService.getAllArticles();
	}
	@GetMapping("/get/{id}")
	public Article getArticle(@PathVariable Long id) {
		return articleService.getArticle(id);
	}
	@PutMapping("/update/{id}")
	public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
		return articleService.updateArticle(article, id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteArticle(@PathVariable Long id) {
		articleService.deleteArticle(id);
	}
	
	
	
	
	
	
	
	
}
