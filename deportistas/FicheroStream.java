package deportistas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;

public class FicheroStream {
	HashMap<String, Deportista> deportistas2;
	
	public FicheroStream() {
		this.deportistas2 = new HashMap<String,Deportista>();
	}
	
	
	
	public void escribirFichero(HashMap<String, Deportista> deportistas,File fichero) {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fichero));
			out.writeInt(deportistas.size());
			for (Deportista deportista: deportistas.values()) {
				if (deportista instanceof Atleta) {
					Atleta atleta = (Atleta) deportista;
					out.writeChar('A');
					out.writeUTF(atleta.getDni());
					out.writeUTF(atleta.getNombre());
					out.writeInt(atleta.getFechanacimiento().getDayOfMonth());
					out.writeInt(atleta.getFechanacimiento().getMonthValue());
					out.writeInt(atleta.getFechanacimiento().getYear());
					out.writeUTF(atleta.getLugarprueba());
					out.writeInt(atleta.getDistanciarecorrida());
					out.writeInt(atleta.getMarca().getSecond());
					out.writeInt(atleta.getMarca().getMinute());
					out.writeInt(atleta.getMarca().getHour());
				}else {
					Ciclista ciclista = (Ciclista) deportista;
					out.writeChar('C');
					out.writeUTF(ciclista.getDni());
					out.writeUTF(ciclista.getNombre());
					out.writeInt(ciclista.getFechanacimiento().getDayOfMonth());
					out.writeInt(ciclista.getFechanacimiento().getMonthValue());
					out.writeInt(ciclista.getFechanacimiento().getYear());
					out.writeUTF(ciclista.getNombreprueba());
					out.writeInt(ciclista.getNumeroetapas());
					out.writeInt(ciclista.getNumeroetapas());
					out.writeInt(ciclista.getPuestoclasificacion());
					out.writeInt(ciclista.getEtapasganadas());
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void leerFichero(File fichero) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream(fichero));
			int cantidad = in.readInt();
			for (int i = 0; i < cantidad; i++) {
				char tipodeportista = in.readChar();
				String dni = in.readUTF();
				String nombre = in.readUTF();
				int dianacimiento = in.readInt();
				int mesnacimiento = in.readInt();
				int anionacimiento = in.readInt();
				if (tipodeportista == 'A') {
					String lugarprueba = in.readUTF();
					int distanciarecorrida = in.readInt();
					int segmarca = in.readInt();
					int minmarca = in.readInt();
					int horamarca = in.readInt();
					deportistas2.put(dni, new Atleta(dni, nombre, LocalDate.of(anionacimiento, mesnacimiento, dianacimiento), lugarprueba, distanciarecorrida, LocalTime.of(horamarca, minmarca)));
				}else {
					String nombreprueba = in.readUTF();
					int numeroetapas = in.readInt();
					int puestoclasificacion = in.readInt();
					int etapasganadas = in.readInt();
					deportistas2.put(dni, new Ciclista(dni, nombre, LocalDate.of(anionacimiento, mesnacimiento, dianacimiento), nombreprueba, numeroetapas, puestoclasificacion, etapasganadas));
				}
			}
			

		} catch (IOException e) {
			e.printStackTrace();		
		}finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Error: "+e.getMessage());
					e.printStackTrace();
				}
			}
		}
		
	}

	public HashMap<String, Deportista> getdeportistas2() {
		return deportistas2;
	}

}
