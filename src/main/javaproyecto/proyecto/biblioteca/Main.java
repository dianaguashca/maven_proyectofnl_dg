package proyecto.biblioteca;

import java.util.Scanner;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main extends LibroDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		Scanner lector2 = new Scanner(System.in);
		String opcion;
		String autor;
		String codigo;
		String cedula;
		
		int numerOpcion;
		System.out.println("Bienvenidos BIBLIOTECA UCE");
		System.out.println("...............................");
		
		
		
//		LibroDatos objetoLibro=new LibroDatos();
         LibroDatos[] nuevoLibro=new LibroDatos[20];
		int k=0;
		
		Date date=new Date();
		
		LocalDate diaHoy=LocalDate.now();

		do {
			System.out.println("Elija una opcion");
			System.out.println("1.- si es un Estudiante");
			System.out.println("2.- si es el Bibliotecario");
			System.out.println("3.- SALIR");

			numerOpcion = lector2.nextInt();

			if (numerOpcion == 1) {

				do {
					System.out.println("a. Consultar libros");
					System.out.println("b. Reservar libro");

					System.out.println("Elija una opcion");
					opcion = lector.nextLine();

					if (opcion.equals("a")) {
						System.out.println("Ingrese el nombre y/o autor del  Libro ");
						String nombre = lector.nextLine();
						
					
						
						for (int i = 0; i < nuevoLibro.length; i++) {
							
							LibroDatos bucaLibro= nuevoLibro[i];
							LibroDatos bucaLibro1= nuevoLibro[i];
							if(bucaLibro !=null || bucaLibro1 != null) {
							String nombreExistente=bucaLibro.getNombre();
							String autorExistente=bucaLibro1.getAutor();
							boolean encontrar1=nombre.equals(nombreExistente);
							boolean encontrar2=nombre.equals(autorExistente);
							
							if (encontrar1 == false || encontrar2==true) {
								
								
								
								System.out.println(nuevoLibro[i]);

							}else if(encontrar1 == true || encontrar2==false){
								
								System.out.println(nuevoLibro[i]);
								System.out.println("Libro no encotrado");
							}
							
							}
						}

					} else if (opcion.equals("b")) {

						System.out.println("El código del libro a reservar: ");
						codigo = lector.nextLine();
						System.out.println("La cedula del estudiante: ");
						cedula = lector.nextLine();
						
						for (int i = 0; i < nuevoLibro.length; i++) {
							LibroDatos libros = nuevoLibro[i];
							boolean encontrar = libros.getCodigo().contains(codigo);
							boolean encontrar11 = libros.getCedula().contains(cedula);
                
							
							if (encontrar == true  || encontrar11==false) {
								if (libros.getEstado().equals("Disponible")) {
									libros.setEstado("reservado");
									System.out.println(nuevoLibro[i]);
									
									nuevoLibro[i].setCedula(cedula);
									
									System.out.println("El libro ha sido correctamente reservado debe pasarlo "
											+ "a retirar de la biblioteca ");

								}
								
							}
							
							nuevoLibro[i]=libros;
						}
					}
				} while (opcion.equals("c"));

			} else if (numerOpcion == 2) {
				
					System.out.println("a.Ingresar un libro");
					System.out.println("b. Prestar un libro");
					System.out.println("c. Aplazar fecha de entrega");
					System.out.println("*********************************");
					System.out.println("Elija una opcion");
					opcion = lector.nextLine();

					if (opcion.equals("a")) {
						
						System.out.println("Ingrese la siguiente información:");
						System.out.println("***************************************");
						System.out.println("Código del libro");
						String codigoL = lector.nextLine();
						System.out.println("Nombre del libro");
						String nombreL = lector.nextLine();
						System.out.println("Autor del libro");
						String autorL = lector.nextLine();
						System.out.println("Año de Publicacion");
						String anioL = lector.nextLine();
						System.out.println("Editorial");
						String editorialL = lector.nextLine();
						System.out.println("Cantidad de paginas");
						String canPagL = lector.nextLine();
						System.out.println("Precio del libro");
						String precioL = lector.nextLine();
	
						LibroDatos objetoLibro=new LibroDatos();
						objetoLibro.setCodigo(codigoL);
						objetoLibro.setNombre(nombreL);
						objetoLibro.setAutor(autorL);
						objetoLibro.setAnioDePublicacion(anioL);
						objetoLibro.setEditorial(editorialL);
						objetoLibro.setCantidadDePaginas(canPagL);
						objetoLibro.setPrecio(precioL);
						
      					nuevoLibro[k]= new LibroDatos();
					
						
						String eleccion;
							System.out.println("Elija el tipo de libro");
							System.out.println("*****************************");
							System.out.println("1. Libro de trabajo");
							System.out.println("2. Libro lectura");
							eleccion = lector.nextLine();
							switch (eleccion) {
							case "1":
								System.out.println("Código autorización");
								String cod = lector.nextLine();
								objetoLibro.setCodigoAutor(cod);
								
								k++;
								System.out.println("Ha sido guardado exitosamente.");
								break;
							case "2":
								System.out.println("Tiempo aproximado de lectura ");
								int tiempo = lector.nextInt();
								objetoLibro.setTiempoLectura(tiempo);
								nuevoLibro[k]= new LibroDatos();
								
								k++;
																
								break;
							}
						
							
							nuevoLibro[k]= new LibroDatos();
							
							k++;
							System.out.println("Ha sido guardado exitosamente.");
							

					} else if (opcion.equals("b")) {
						System.out.println("Ingrese el código del libro:");
						String codi = lector.nextLine();
						
						for (int i = 0; i < nuevoLibro.length; i++) {
							LibroDatos libros = nuevoLibro[i];
							boolean encontrar = libros.getCodigo().contains(codi);

							if (encontrar == true) {
								
								
								if (libros.getEstado().equals("reservado")) {
									
									System.out.println(nuevoLibro[i]);

									System.out.println("1.-Prestar");
									System.out.println("2.-No prestar");
								int escoger = lector.nextInt();
								if(escoger==1) {
									libros.getEstado().equals("reservado");
									libros.setEstado("prestado");
									
									 diaHoy=LocalDate.now();
									 diaHoy=diaHoy.plusDays(5);
									 System.out.println("Fecha de Entrega:"+nuevoLibro[i].getFechaDeEntrega());
									
								}else if(escoger==2) {
									libros.setEstado("Disponible");
									
								}
									System.out.println("El libro ha sido correctamente reservado debe pasarlo "
											+ "a retirar de la biblioteca ");

								}
							}
							nuevoLibro[i]=libros;
						}
							

					}else if(opcion.equals("c")) {
						System.out.println("Ingrese el código del libro");
						 String codigLibr=lector.nextLine();
						System.out.println("Ingrese la cedula del estudiante ");
						String cedulaEstudiante=lector.nextLine();
			
							
							for (int i = 0; i < nuevoLibro.length; i++) {
								LibroDatos libros = nuevoLibro[i];
								boolean encontrar = libros.getCodigo().contains(codigLibr);
								boolean encontrar2 = libros.getCedula().contains(cedulaEstudiante);

								if (encontrar == true && encontrar2==true ) {
									
									
									if (libros.getEstado().equals("prestado")) {
										
										System.out.println(nuevoLibro[i]);

										System.out.println("1.-Aplazar");
										System.out.println("2.-No aplazar");
									int escoger = lector.nextInt();
									if(escoger==1) {
										
										LocalDate diaPlazo=LocalDate.now();
										  diaPlazo=diaHoy.plusDays(5);
										 nuevoLibro[i].setFechaDeEntrega(diaPlazo);
										 System.out.println("Fecha de Entrega:"+nuevoLibro[i].getFechaDeEntrega());
										
									}else if(escoger==2) {
										System.out.println("El libro no esta aplazado ");
									}
										
									}
								}
								nuevoLibro[i]=libros;
							} 
					}	 
			}

		} while (numerOpcion != 3);
		System.out.println("Vuelva Pronto");
	}

}
