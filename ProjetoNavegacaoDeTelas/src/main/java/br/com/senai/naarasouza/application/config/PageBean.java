package br.com.senai.naarasouza.application.config;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.naarasouza.application.config.PageBean.Pages;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable {
	
	private String page;
	
	public enum Pages{	//Criando um ENUM
		page_a,page_b;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}	
	public Pages goTo () {
		
		if("a".equals(page)) {
			return Pages.page_a;	//Criando um ENUM
			
			
		}else if("b".equals(page)) {
			return Pages.page_b;
		}else {
			return null;
		}
		
		
	}

}
