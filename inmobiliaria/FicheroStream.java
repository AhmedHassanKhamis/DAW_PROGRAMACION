package inmobiliaria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.TreeMap;

public class FicheroStream {


	TreeMap<Integer, Cliente> clientes;
	TreeMap<Integer, Anuncio> anuncios;
	
	public FicheroStream() {
		this.clientes = new TreeMap<>();
		this.anuncios = new TreeMap<>();
	}
	
	
	public void leerFichero(File fichero) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(fichero));
			int cantidad = in.readInt();
			for (int i = 0; i < cantidad; i++) {
				int nif = in.readInt();
				String nombre = in.readUTF();
				int dia = in.readInt();
				int mes = in.readInt();
				int anio = in.readInt();
				LocalDate fechanacimiento = LocalDate.of(anio, mes, dia);
				String calle = in.readUTF();
				int portal = in.readInt();
				String localidad = in.readUTF();
				int codigopostal = in.readInt();
				Direccion direccion = new Direccion(calle, portal, localidad, codigopostal);
				clientes.put(nif, new Cliente(nif, nombre, fechanacimiento, direccion));
			}
			int cantidad2 = in.readInt();
			for (int i = 0; i < cantidad2; i++) {
				int codigo = in.readInt();
				int importe = in.readInt();
				int dia = in.readInt();
				int mes = in.readInt();
				int anio = in.readInt();
				LocalDate fechapublicacion = LocalDate.of(anio, mes, dia);
				char tienebaja = in.readChar();
				int dia2;
				int mes2;
				int anio2;
				LocalDate fechabaja = null;
				if (tienebaja == 's') {
					dia2 = in.readInt();
					mes2 = in.readInt();
					anio2 = in.readInt();
					fechabaja = LocalDate.of(anio, mes, dia);
				}else {
					//nada
				}
				String temporal = in.readUTF();
				Estado estado;
				if (temporal.equalsIgnoreCase("libre")) {
					estado = Estado.LIBRE;
				}else if (temporal.equalsIgnoreCase("señalizado")) {
					estado = Estado.SENIALIZADO;
				}else {
					estado = Estado.ALQUILADO;
				}
				String calle = in.readUTF();
				int portal = in.readInt();
				String localidad = in.readUTF();
				int codigopostal = in.readInt();
				Direccion direccion = new Direccion(calle, portal, localidad, codigopostal);
				char tipo = in.readChar();
				if (tipo == 'p') {
					int numerodormitorios = in.readInt();
					int numerobanios = in.readInt();
					int posibilidadcalefaccion = in.readInt();
					boolean calefaccion;
					if (posibilidadcalefaccion == 1) {
						calefaccion = true;
					}else {
						calefaccion = false;
					}
					if (tienebaja == 's') {
						anuncios.put(codigo, new Piso(codigopostal, importe, fechapublicacion, fechabaja, estado, direccion, numerodormitorios, numerobanios, calefaccion));
					} else {
						anuncios.put(codigo, new Piso(codigopostal, importe, fechapublicacion, estado, direccion, numerodormitorios, numerobanios, calefaccion));
					}
				} else {
					int metros = in.readInt();
					int posibilidadmascota = in.readInt();
					boolean mascota;
					if (posibilidadmascota == 1) {
						mascota = true;
					}else {
						mascota = false;
					}
					if (tienebaja == 's') {
						anuncios.put(codigo, new Habitacion(codigopostal, importe, fechapublicacion, fechabaja, estado, direccion, metros, mascota));
					} else {
						anuncios.put(codigo, new Habitacion(codigopostal, importe, fechapublicacion, estado, direccion, metros, mascota));
					}
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}

	

	public void escribirFichero(TreeMap<Integer, Cliente> clientes, TreeMap<Integer, Anuncio> anuncios,File fichero) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fichero));
			out.writeInt(clientes.size());
			for (Cliente cliente : clientes.values()) {
				out.writeInt(cliente.getNif());
				out.writeUTF(cliente.getNombre());
				out.writeInt(cliente.getFechanacimiento().getDayOfMonth());
				out.writeInt(cliente.getFechanacimiento().getMonthValue());
				out.writeInt(cliente.getFechanacimiento().getYear());
				out.writeUTF(cliente.getDireccion().getCalle());
				out.writeInt(cliente.getDireccion().getPortal());
				out.writeUTF(cliente.getDireccion().getLocalidad());
				out.writeInt(cliente.getDireccion().getCodigopostal());
			}
			out.writeInt(anuncios.size());
			for (Anuncio anuncio : anuncios.values()) {
				out.writeInt(anuncio.getCodigo());
				out.writeInt(anuncio.getImporte());
				out.writeInt(anuncio.getFechapublicacion().getDayOfMonth());
				out.writeInt(anuncio.getFechapublicacion().getMonthValue());
				out.writeInt(anuncio.getFechapublicacion().getYear());
				if (anuncio.getFechabaja() != null ){
					out.writeChar('s');
					out.writeInt(anuncio.getFechabaja().getDayOfMonth());
					out.writeInt(anuncio.getFechabaja().getMonthValue());
					out.writeInt(anuncio.getFechabaja().getYear());
				}else {
					out.writeChar('n');
				}
				if (anuncio.getEstado().equals(Estado.LIBRE)) {
					out.writeUTF("LIBRE");
				}else if (anuncio.getEstado().equals(Estado.SENIALIZADO)) {
					out.writeUTF("SENIALIZADO");
				}else {
					out.writeUTF("ALQUILADO");
				}
				out.writeUTF(anuncio.getDireccion().getCalle());
				out.writeInt(anuncio.getDireccion().getPortal());
				out.writeUTF(anuncio.getDireccion().getLocalidad());
				out.writeInt(anuncio.getDireccion().getCodigopostal());
				if (anuncio instanceof Piso ) {
					Piso piso = (Piso) anuncio;
					out.writeInt(piso.getNumerodormitorios());
					out.writeInt(piso.getNumerobanios());
					if (piso.isCalefaccion() == true) {
						out.writeInt(1);
					}else {
						out.writeInt(2);
					}
				}else {
					Habitacion habitacion = (Habitacion) anuncio;
					out.writeInt(habitacion.getMetros());
					if (habitacion.isMascota() == true) {
						out.writeInt(1);
					}else {
						out.writeInt(2);
					}
				}
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		
	}
	
	

	public TreeMap<Integer, Cliente> getclientes() {
		return clientes;
	}


	public TreeMap<Integer, Anuncio> getanuncios() {
		return anuncios;
	}


	
}
