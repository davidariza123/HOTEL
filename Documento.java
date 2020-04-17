
public class Documento {
	
	private String numeber;
	
	

	public Documento(String numeber) {
		super();
		this.numeber = numeber;
	}

	public String getNumeber() {
		return numeber;
	}

	public void setNumeber(String numeber) {
		this.numeber = numeber;
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	
	
	public void Agregar (String n) throws Error{

		if (isNumeric(n)) {
			
		   System.out.println("documento: "+n);
		   
			
			
	     }else{
			
			
		
		throw new Error("Error no es un numero de documento valido"); 
	}
	
	}
}
