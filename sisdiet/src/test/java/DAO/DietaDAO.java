package DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.HibernateUtil;

import entity.Dieta;

public class DietaDAO extends MasterDAO{

	public void inserirDieta(Dieta die){
		inserirObjeto(die);
	}
	public void atualizarUsuario(Dieta die){
		atualizarObjeto(die);
	}
	public void deletarUsuario(Dieta die){
		deletarObjeto(die);
	}
	public Dieta getDieta(Integer idDieta){
		return getObjeto(Dieta.class, idDieta);
	}
	
	//lista de itens da dieta 
	public List<Dieta> getListaDieta(){
		return getLista(Dieta.class, "from Dieta die");
	}

	
	
	
}
