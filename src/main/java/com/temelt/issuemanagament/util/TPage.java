package com.temelt.issuemanagament.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;


//spring'in page nesnesiyle değilde buradaki page nesnesiyle konuşacak
public class TPage<T> {
  private int number;
  private int size;
  private Sort sort;
  private int totalPages;
  private Long totalElements;
  private List<T> content;

  //spring'in kendi içindeki Page nesnesinin propertylerini kendi nesneme doldurdum.
  public void setStat(Page page, List<T> list){ //List'in içindeki T ile TPage'in içindeki T örtüşmeli
    this.number=page.getNumber();
    this.size=page.getSize();
    this.sort=page.getSort();
    this.totalPages=page.getTotalPages();
    this.totalElements=page.getTotalElements();
    this.content=list;

  }

}

//pagination için front'un size(kaçarlı göst) num: kaçıncı sayfa görünüyor o an-  content: döneceğimdata

