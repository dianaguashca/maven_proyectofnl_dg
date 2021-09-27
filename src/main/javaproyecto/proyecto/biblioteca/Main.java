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
		List<LibroDatos> libros = new ArrayList<LibroDatos>();
		LibroDatos libro1 = new LibroDatos();
     	libro1.setCodigo("11111");
		libro1.setNombre("Luces de bohemia");
		libro1.setAutor("Ramón del Valle-Inclán");
		libro1.setAnioDePublicacion("1998");
		libro1.setEstado("Disponible");
		libro1.setFechaEntrega("28/09/2021");
	
		LibroDatos libro2 = new LibroDatos();
		libro2.setCodigo("22222");
		libro2.setNombre("Crimen y castigo");
		libro2.setAutor("Fedor Dostoievsk");
		libro2.setAnioDePublicacion("1950");
		libro2.setEstado("Reservado");
		libro2.setFechaEntrega("12/10/2021");
	
		LibroDatos libro3 = new LibroDatos();
		libro3.setCodigo("33333");
		libro3.setNombre("100 años de Soledad");
		libro3.setAutor("Gabriel García Márquez");
		libro3.setAnioDePublicacion("1976");
		libro3.setEstado("Prestado");
		libro3.setFechaEntrega("11/10/2021");
	
		LibroDatos libro4 = new LibroDatos();
		libro4.setCodigo("44444");
		libro4.setNombre("Programacion I");
		libro4.setAutor("Adam Bien");
		libro4.setAnioDePublicacion("1674");
		libro4.setEstado("Disponible");
		libro4.setFechaEntrega("10/10/2021");
	
		LibroDatos libro5 = new LibroDatos();
		libro5.setCodigo("55555");
		libro5.setNombre("Programacion II");
		libro5.setAutor("Adam Bien");
		libro5.setAnioDePublicacion("1679");
		libro5.setEstado("Disponible");
		libro5.setFechaEntrega("10/11/2021");
	
		LibroDatos libro6 = new LibroDatos();
		libro6.setCodigo("66666");
		libro6.setNombre("Algebra Lineal");
		libro6.setAutor("Lara y arroba");
		libro6.setAnioDePublicacion("1675");
		libro6.setEstado("Reservado");
		libro6.setFechaEntrega("23/11/2021");
		libros.add(libro1);
		libros.add(libro2);
		libros.add(libro3);
		libros.add(libro4);
		libros.add(libro5);
		libros.add(libro6);
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
							LibroDatos libros1 = nuevoLibro[i];
							boolean encontrar = libros1.getCodigo().contains(codigo);
							boolean encontrar11 = libros1.getCedula().contains(cedula);
                
							
							if (encontrar == true  || encontrar11==false) {
								if (libros1.getEstado().equals("Disponible")) {
									libros1.setEstado("reservado");
									System.out.println(nuevoLibro[i]);
									
									nuevoLibro[i].setCedula(cedula);
									
									System.out.println("El libro ha sido correctamente reservado debe pasarlo "
											+ "a retirar de la biblioteca ");

								}
								
							}
							
							nuevoLibro[i]=libros1;
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
					LibroDatos objetoLibro=new LibroDatos();

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
							LibroDatos libros1 = nuevoLibro[i];
							boolean encontrar = libros1.getCodigo().contains(codi);

							if (encontrar == true) {
								
								
								if (libros1.getEstado().equals("reservado")) {
									
									System.out.println(nuevoLibro[i]);
									
									
									System.out.println("Elija una opcion");
									System.out.println("1.-Prestar");
									System.out.println("2.-No prestar");
								int escoger = lector.nextInt();
								if(escoger==1) {
									libros1.getEstado().equals("reservado");
									libros1.setEstado("prestado");
									
									 diaHoy=LocalDate.now();
									 diaHoy=diaHoy.plusDays(5);
									 System.out.println("Fecha de Entrega:"+nuevoLibro[i].getFechaDeEntrega());
									
								}else if(escoger==2) {
									libros1.setEstado("Disponible");
									
								}
									System.out.println("El libro ha sido correctamente reservado debe pasarlo "
											+ "a retirar de la biblioteca ");

								}
							}
							nuevoLibro[i]=libros1;
						}
							

					}else if(opcion.equals("c")) {
						System.out.println("Ingrese el código del libro");
						 String codigLibr=lector.nextLine();
						System.out.println("Ingrese la cedula del estudiante ");
						String cedulaEstudiante=lector.nextLine();
			
							
							for (int i = 0; i < nuevoLibro.length; i++) {
								LibroDatos libros1 = nuevoLibro[i];
								boolean encontrar = libros1.getCodigo().contains(codigLibr);
								boolean encontrar2 = libros1.getCedula().contains(cedulaEstudiante);

								if (encontrar == true && encontrar2==true ) {
									
									
									if (libros1.getEstado().equals("prestado")) {
										
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
								nuevoLibro[i]=libros1;
							} 
					}	 
			}

		} while (numerOpcion != 3);
		System.out.println("Vuelva Pronto");
	}

}
