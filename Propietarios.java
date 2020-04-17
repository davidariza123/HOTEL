
import java.util.*;

public class Propietarios {
	
	private Name name;
	
	private Documento documento;

	public Propietarios(Name name, Documento documento) {
		
		this.name = name;
		this.documento = documento;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	
	public void nameanddoc (String n) {
		
		System.out.println("Documento: "+ documento.getNumeber()+" Nombre: "+name.getNombre());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
