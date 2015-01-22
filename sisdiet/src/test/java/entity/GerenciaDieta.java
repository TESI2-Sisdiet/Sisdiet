package entity;

import java.io.Serializable;
import java.util.Calendar;

import entity.Dieta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class GerenciaDieta implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JoinColumn(name="idUsuario")
	private int idUsuario;
	Usuario usuario;
	@Column
	private int idDieta;

	private Double CalTotal;

	private String Data;

	public Calendar getData() {
		Calendar Data = Calendar.getInstance();  
		return Data;
	}


	public Double getCalTotal() {
		return CalTotal;
	}
	public void setCalTotal(Double CalTotal) {
		this.CalTotal = CalTotal;
	}


	/*public void CalcCal(List<dieta> listaCaloriasAlimentos){


		for(String elemento : listaAlimentos){
			calorias = calorias =+ Alimento
		}
		
		for (String elemento : lList) {
		System.out.println(temp);
	}
		
	}*/
	
/*
		
		
		//pseudocodigo
	 public void CalcCal(Dieta.lista){

	for (Dieta alimento : alimentos) {
			System.out.println(alimentos);

		itemdieta.calcCalorias = <alimento.caloria 1+ alimento.caloria 2+ ... + alimento.caloria n>
		
			se CalcCal > (Bmr * exercício)
				mudar label para vermelho
			senão se CalcCal < (Bmr * exercício)
				mudar label para verde
				
				return calorias

			} */
}