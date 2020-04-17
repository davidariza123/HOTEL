
public class Inquilinos {

	

	private Name name;
	
	private Documento documento;

	public Inquilinos(Name name, Documento documento) {
		
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
	
	
	
public void nameanddoc2 (String n) {
		
		System.out.println("Documento: "+ documento.getNumeber()+" Nombre: "+name.getNombre());
		
	}
	
	
	
	

}
