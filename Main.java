import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Precione 1 si es propietario y 2 si es inquilino o 3 si desea registrar un inmueble");
		System.out.println("");
		 int op = scan.nextInt();
		
		 switch(op) {
		 
		 case 1:
			String n = ""; 
			  try {
				 
				 System.out.println("Ingrese su nombre");
				 
				 String n1 = scan.next(); 
				 
				 Name nm = new Name(n1);
				 
				 System.out.println("Ingrese su documento");
				 
				 n = scan.next(); 
				 
				 Documento d1 = new Documento(n);
				 
				 d1.Agregar(n);
				 
				 System.out.println(" ");
				 
				 Propietarios p1 = new Propietarios(nm, d1);
				 
				  p1.nameanddoc(n);
				  
				  System.out.println(" ");
				  System.out.println("Ingrese el tipo de inmueble a registrar ");
				  String t = scan.next(); 
				  System.out.println("Ingrese la uicacion de inmueble a registrar ");
				  String u = scan.next();
				  
				 System.out.println("Su "+t+" Ubicada en: "+u+" ha sido registrada con exito");
				 
				 
			 }  catch (Error ex) {
		            System.out.println(" ");
		            
		            System.out.println(ex.getMessage());
	 
		         } finally {
		        	  System.out.println("");
		            System.out.println("Estamos para servirle,Gracias por registrarce señor Propietario");
		        }
			 
			 
			 
			
			 break;
			 
			 
		 case 2:
			 
			 
try {
				 
				 System.out.println("Ingrese su nombre");
				 
				 String n1 = scan.next(); 
				 
				 Name nm = new Name(n1);
				 
				 System.out.println("Ingrese su documento");
				 
				 n = scan.next(); 
				 
				 Documento d1 = new Documento(n);
				 
				 d1.Agregar(n);
				 
				 System.out.println(" ");
				 
				 Inquilinos p1 = new Inquilinos(nm, d1);
				 
				  p1.nameanddoc2(n);
				  
				  System.out.println(" ");
				 
				 
			 }  catch (Error ex) {
		            System.out.println(" ");
		            
		            System.out.println(ex.getMessage());
	 
		         } finally {
		        	  System.out.println("");
		            System.out.println("Estamos para servirle,Gracias por registrarce señor Inquilino");
		        }
			 
			 
			 break;
		 
		 case 3:
			 
			 System.out.println(" ");
			  System.out.println("Ingrese el tipo de inmueble a registrar ");
			  String t = scan.next(); 
			  System.out.println("Ingrese la uicacion de inmueble a registrar ");
			  String u = scan.next();
			  
			 System.out.println("Su "+t+" Ubicada en: "+u+" ha sido registrada con exito");
			 
			 
			 
			 
			 break;
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
