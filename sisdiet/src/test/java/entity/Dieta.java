package entity ;


import java.io.Serializable;
import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Dieta implements Serializable{


	
	//SimpleDateFormat fmt = new SimpleDateFormat("dd-mm-yyyy");
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDieta;
	@Column
	private String nomeDieta;
	@Column
	private Date dataDieta;
	

	//lista de itens presentes nessa dieta
	@Column
	private List listaDieta;
	
	public int getIdDieta() {
		return idDieta;
	}
	public void setIdDieta(int idDieta) {
		this.idDieta = idDieta;
	}
	public String getNomeDieta() {
		return nomeDieta;
	}
	public void setNomeDieta(String nomeDieta) {
		this.nomeDieta = nomeDieta;
	}
	public Date getDataDieta() {
		return dataDieta;
	}
	public void setDataDieta(Date dataDieta) {
		this.dataDieta = dataDieta;
	}
}