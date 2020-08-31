package com.ensa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.entities.Article;
import com.ensa.repositories.ArticleRepo;

@Service
public class ArticleService {
	@Autowired
	ArticleRepo articleRepo;
	
	public Article addArticle(Article article) {
		return articleRepo.save(article);
	}
	public Article getArticle(Long id) {
		return articleRepo.findById(id).get();
	}
	public List<Article> getAllArticles() {
		return articleRepo.findAll();
	}
	public void deleteArticle(Long id) {
		articleRepo.deleteById(id);
	}
	public Article updateArticle(Article article, Long id) {
		Article a = articleRepo.findById(id).get();
		a.setAffectations(article.getAffectations());
		a.setAffilitation(article.getAffilitation());
		a.setAuteur(article.getAuteur());
		a.setContenu(article.getContenu());
		a.setDecision(article.getDecision());
		a.setEtat(article.getEtat());
		a.setMotCle(article.getMotCle());
		a.setResume(article.getResume());
		a.setTitre(article.getTitre());
		return articleRepo.save(a);
	}
	
	
	
	
}
