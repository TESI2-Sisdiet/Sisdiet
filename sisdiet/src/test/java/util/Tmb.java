package util;

public class Tmb {

private double tmb;
private double tmbFinal;

public double getTmb() {
return tmb;
}

public void setTmb(double tmb) {
	this.tmb = tmb;
}

	public double CalcTMB (String sexo, double peso, double altura, int idade, int exercicio){

		if (sexo == "Homem"){ 
		tmb = (88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade));
		}else
			
		if(sexo == "Mulher"){
		tmb = (447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade));
		}
		
		switch (exercicio) {
		 
		 case 1:  tmbFinal = tmb * 1.2;
		 break;
		 case 2:  tmbFinal = tmb * 1.375;
		 break;
		 case 3:  tmbFinal = tmb * 1.55;
		 break;
		 case 4:  tmbFinal = tmb * 1.725;
		 break;
		 case 5:  tmbFinal = tmb * 1.9;
		 break;
		 
		}
		
		
		return tmbFinal;

	}	
}
