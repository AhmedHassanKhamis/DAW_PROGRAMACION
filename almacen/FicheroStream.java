package almacen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeMap;

public class FicheroStream {
	
	TreeMap<Integer, Producto> productos;
	

	public FicheroStream() {
		this.productos = new TreeMap<>();
	}



	public TreeMap<Integer, Producto> leerFichero(File fichero) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(fichero));
			int cantidad = in.readInt();
			for (int i = 0; i < cantidad; i++) {
				int numeroreferencia = in.readInt();
				String nombre = in.readUTF();
				int precio = in.readInt();
				int stock = in.readInt();
				if (in.readChar()== 'P') {
					int dia = in.readInt();
					int mes = in.readInt();
					int anio = in.readInt();
					LocalDate fechacaducidad = LocalDate.of(anio, mes, dia);
					productos.put(numeroreferencia, new Perecedor(numeroreferencia, nombre, precio, stock, fechacaducidad));
				}else {
					String temporal = in.readUTF();
					Tipo tipo;
					if (temporal.equalsIgnoreCase("belleza")) {
						 tipo = Tipo.BELLEZA;
					} else if (temporal.equalsIgnoreCase("limpieza")) {
						 tipo = Tipo.LIMPIEZA;
					}else {
						 tipo = Tipo.CONSUMIBLE;
					}
					String paisprocedencia = in.readUTF();
					productos.put(numeroreferencia,new NoPerecedor(numeroreferencia, nombre, precio, stock, tipo,paisprocedencia));
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
		return productos;
	}
	
	
	
	
	
	
	
	
	
	public void escribirFichero(TreeMap<Integer, Producto> productos,File fichero) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fichero));
			out.writeInt(productos.size());
			for (Producto producto : productos.values()) {
				if (producto instanceof Perecedor) {
					Perecedor perecedor = (Perecedor) producto;
					out.writeInt(perecedor.getNumero());
					out.writeUTF(perecedor.getNombre());
					out.writeInt(perecedor.getPrecio());
					out.writeInt(perecedor.getStock());
					out.writeChar('P');
					out.writeInt(perecedor.getFechacaducidad().getDayOfMonth());
					out.writeInt(perecedor.getFechacaducidad().getMonthValue());
					out.writeInt(perecedor.getFechacaducidad().getYear());
				}else {
					NoPerecedor noPerecedor = (NoPerecedor) producto;
					out.writeInt(noPerecedor.getNumero());
					out.writeUTF(noPerecedor.getNombre());
					out.writeInt(noPerecedor.getPrecio());
					out.writeInt(noPerecedor.getStock());
					out.writeChar('N');
					if (noPerecedor.getTipo().equals(Tipo.BELLEZA)) {
						  out.writeUTF("belleza");
					} else if (noPerecedor.getTipo().equals(Tipo.LIMPIEZA)) {
						out.writeUTF("limpieza");
					}else {
						out.writeUTF("consumible");
					}
					out.writeUTF(noPerecedor.getPaisprocedencia());
					
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
	
	
	
	
	
	
	

}
