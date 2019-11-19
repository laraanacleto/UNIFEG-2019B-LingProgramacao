package br.edu.unifeg.entity;


import javax.persistence.Entity;
import javax.persistence.GeneraedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

Public class Product{

@Id
@GeneraedValue(strategy=GenerationType.AUTO)
private String code;
private String name;
private double price;
private int qtdStock;

public void setCode(String code){
  this.code = code;
}
public void setName(String name){
  this.name = name;

}
public void setPrice(double price){
  this.price = price;
}
public double getPrice(){
  return this.price;
}
public void setQtdStock(int qtdStock){
  this.qtdStock = qtdStock;
}
public int getQtdStock(){
  return this.qtdStock;
}
}
