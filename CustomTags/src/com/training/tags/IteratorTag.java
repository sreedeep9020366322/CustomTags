package com.training.tags;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class IteratorTag extends TagSupport {
	
	private String items;

	public IteratorTag() {
		
		super();
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public int doStartTag() throws JspException {

		List<String> names = (List<String>) pageContext.findAttribute(items);
		
		JspWriter out = pageContext.getOut();
		
		try {
			
			for(int i = 0; i< names.size(); i++)
				out.println(names.get(i));
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY;
	}

	
	
	
}
