/*
 * @auteur Benjamin Daunar
 * @auteur Georges Bardaghji
 * @auteur Salem Doub
 * @auteur Thibaut Gounin
 * @date 23 Janvier 2021
 */
package triangle_test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import triangle.Triangle;

class TestReadData {
	Triangle t;
	
	@BeforeAll
	static void init() throws Exception {
		System.out.println("============================================================");
		System.out.println("Début des tests relatifs à la méthode 'readDatat' de la\n"
					+	   "classe 'Triangle'");
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		System.out.println("Fin des tests relatifs à la méthode 'Triangle.readData'");
		System.out.println("============================================================");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".....");
		t = new Triangle(-1, -1, -1);
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println(".....");
	}
	
	/*
	 * Le test suivant permet de mettre à l'épreuve le comportement de la fonction readData 
	 * dans le trautement d'un fichier vide
	 */
	@Test
	public final void testEmptyFile() throws IOException {
		System.out.println("==> ReadData - empty.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/empty.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * ***********************************************************************************************
	 * 
	 * Dans cette partie, les tests permettent de vérifier le comportement de la fonction dans le cas 
	 * où il y aurait un argument de trop (au moins) sur une ligne.
	 */
	@Test
	public final void testExtraArgs1() throws IOException {
		System.out.println("==> ReadData - extraArgs1.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/extraArgs1.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testExtraArgs2() throws IOException {
		System.out.println("==> ReadData - extraArgs2.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/extraArgs2.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testExtraArgs3() throws IOException {
		System.out.println("==> ReadData - extraArgs3.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/extraArgs3.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * ************************************************************************************************
	 * Ici, on traite le cas d'une (ou plus) lignes supplémentaires.
	 */
	@Test
	public final void testExtraLine() throws IOException {
		System.out.println("==> ReadData - extraLine.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/extraLine.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * *******************************************************************************************************
	 * Il existe plusieurs façons de se tromper lors de la création du fichier type, ainsi, nous avons cherché
	 * à constituer des fichiers mal formatés, de manière assez barbare, afin de vérifier que le triangle par 
	 * défaut est bien obtenu.
	 */
	@Test
	public final void testMalFormed1() throws IOException {
		System.out.println("==> ReadData - malFormed1.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/malFormed1.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMalFormed2() throws IOException {
		System.out.println("==> ReadData - malFormed2.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/malFormed2.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMalFormed3() throws IOException {
		System.out.println("==> ReadData - malFormed3.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/malFormed3.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * ***************************************************************************************************
	 * Dans cette partie, nous avons bien des fichiers de trois lignes, auxquels il manque un, deux ou 
	 * 3 données.
	 */
	@Test
	public final void testMissingArgs1() throws IOException {
		System.out.println("==> ReadData - missingArgs1.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs1.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMissingArgs2() throws IOException {
		System.out.println("==> ReadData - missingArgs2.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs2.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMissingArgs3() throws IOException {
		System.out.println("==> ReadData - missingArgs3.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs3.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMissingArgs4() throws IOException {
		System.out.println("==> ReadData - missingArgs4.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs4.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMissingArgs5() throws IOException {
		System.out.println("==> ReadData - missingArgs5.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs5.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testMissingArgs6() throws IOException {
		System.out.println("==> ReadData - missingArgs6.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingArgs6.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * *****************************************************************************************
	 * Le test suivant permet de vérifier si la fonction se comporte correctement lorsqu'il manque
	 * une ligne au fichier
	 */
	@Test
	public final void testMissingLine() throws IOException {
		System.out.println("==> ReadData - missingLine.txt");
		long début = System.currentTimeMillis();
		assertTrue(t.equals(t.readData("res/missingLine.txt")));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	/*
	 * *********************************************************************************************
	 * Des tests  simples pour vérifier que des données sont bien lues.
	 */
	@Test
	public final void testNotATriangle() throws IOException {
		System.out.println("==> ReadData - not_a_triangle.txt");
		long début = System.currentTimeMillis();
		assertNotNull(t.readData("res/not_a_triangle.txt"));
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
	
	@Test
	public final void testTriangle() throws IOException {
		System.out.println("==> ReadData - triangle.txt");
		long début = System.currentTimeMillis();
		assertNotNull(t.readData("res/triangle.txt"), "\n==> Error while parsing file\n");
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("le test a duré : " + durée + " ms");
	}
}
