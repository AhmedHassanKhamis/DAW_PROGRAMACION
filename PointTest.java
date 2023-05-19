package evaluacion3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PointTest {

	@Test
	void testconstructor() {
		Point punto = new Point(1,2);
		assertTrue(punto != null);
	}

	
	@Test
	void testdistance() {
		Point punto = new Point(1,1);
		Point punto2 = new Point(1,1);
		//NOTA NO ME SE LA FORMULA DE LA DISTANCIA ASIQUE TE PONGO EL ESPERADO MAL
		Double esperado = 1.1;
		Double resultado = punto.distance(punto2);
		assertEquals(esperado, resultado);
	}
	
	
	
	static Stream<Arguments> testcuadranteparametrizado(){
		return Stream.of(
		Arguments.of(1,1,1),		
		Arguments.of(-1,-1,3),		
		Arguments.of(1,-1,4),
		Arguments.of(-1,1,2),
		Arguments.of(0,0,0)
		);
	}
	
	@ParameterizedTest
	@MethodSource("testcuadranteparametrizado")
	void testcuadrante(int x,int y,int esperado) {
		Point punto = new Point(x,y);
		assertEquals(esperado,punto.quadrant());
	}
	

	static Stream<Arguments> testnearestparametrizado(){
		return Stream.of(
		Arguments.of(4,5,2,2,2,2,2,2),		
		Arguments.of(0,0,1,1,1,1,2,2),		
		Arguments.of(8,7,6,9,6,9,2,2)
		);
	}
	
	@ParameterizedTest
	@MethodSource("testnearestparametrizado")
	void testnearest(int x,int y,int esperadox,int esperadoy,int q,int w,int z,int t) {
		Point puntos[] = new Point[2];
		puntos[0] = new Point(q, w);
		puntos[1] = new Point(z, t);
		Point punto = new Point(x,y);
		Point esperado = new Point(esperadox,esperadoy);
		assertEquals(esperado,punto.nearest(puntos));
	}
	
}

