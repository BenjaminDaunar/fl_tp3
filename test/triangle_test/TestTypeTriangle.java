/*
 * @auteur Benjamin Daunar
 * @auteur Georges Bardaghji
 * @auteur Salem Doub
 * @auteur Thibaut Gounin
 * @date 23 Janvier 2021
 */
package triangle_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import triangle.Triangle;

class TestTypeTriangle {
	
	Triangle triangle;
	float nul;
	float pos;
	float neg;
	
	@BeforeAll
	static void init() throws Exception {
		System.out.println("============================================================");
		System.out.println("Début des tests relatifs à la méthode 'typeTriangle' de la\n"
						+  "classe 'Triangle'");
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		System.out.println("Fin des tests relatifs à la méthode 'Triangle.typeTriangle'");
		System.out.println("============================================================");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".....");
		nul = 0;
		pos = 2;
		neg = -2;
	}
	
	@AfterEach
	void tearDown() throws Exception {
		System.out.println(".....");
	}
	
	/*
	 * Test du constructeur
	 */
	@Test
	void testConstructeur() {
		System.out.println("==> Constructeur");
		triangle = new Triangle(1, 1, 1);
		assertNotNull(triangle, "\ndéfaut du constructeur\n");
	}
	
	/*
	 * Tests des getters et setters
	 */
	@Test
	public final void testGetCoteA() {
		System.out.println("==> getCoteA()");
		triangle = new Triangle(1, 2, 3);
		assertEquals(1, triangle.getCoteA(), "\ngetCoteA() erroné\n");
	}
	
	@Test
	public final void testGetCoteB() {
		System.out.println("==> getCoteB()");
		triangle = new Triangle(1, 2, 3);
		assertEquals(2, triangle.getCoteB(), "\ngetCoteB() erroné\n");
	}
	
	@Test
	public final void testGetCoteC() {
		System.out.println("==> getCoteC()");
		triangle = new Triangle(1, 2, 3);
		assertEquals(3, triangle.getCoteC(), "\ngetCoteC() erroné\n");
	}
	
	@Test
	public final void testSetCoteA() {
		System.out.println("==> setCoteA(float val)");
		triangle = new Triangle(2, 2, 2);
		triangle.setCoteA(3);
		assertEquals(3, triangle.getCoteA(), "\nsetCoteA(float val) erroné\n");
	}
	
	@Test
	public final void testSetCoteB() {
		System.out.println("==> setCoteB(float val)");
		triangle = new Triangle(2, 2, 2);
		triangle.setCoteB(3);
		assertEquals(3, triangle.getCoteB(), "\nsetCoteB(float val) erroné\n");
	}
	
	@Test
	public final void testSetCoteC() {
		System.out.println("==> setCoteC(float val)");
		triangle = new Triangle(2, 2, 2);
		triangle.setCoteC(3);
		assertEquals(3, triangle.getCoteC(), "\nsetCoteC(float val) erroné\n");
	}

	/*
	 * Tests de la méthode typeTriangle() avec valeurs nulles
	 */
	@Test
	public final void testNullValue011() {
		System.out.println("==> TypeTriangle() -> Null 011");
		triangle = new Triangle(nul, pos, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-011\n");
	}
	
	@Test
	public final void testNullValue101() {
		System.out.println("==> TypeTriangle() -> Null 101");
		triangle = new Triangle(pos, nul, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-011\n");
	}
	
	@Test
	public final void testNullValue110() {
		System.out.println("==>TypeTriangle() -> Null 110");
		triangle = new Triangle(pos, pos, nul);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-110\n");
	}
	
	@Test
	public final void testNullValue001() {
		System.out.println("==> TypeTriangle() -> Null 001");
		triangle = new Triangle(nul, nul, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-001\n");
	}
	
	@Test
	public final void testNullValue010() {
		System.out.println("==> TypeTriangle() -> Null 010");
		triangle = new Triangle(nul, pos, nul);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-010\n");
	}
	
	@Test
	public final void testNullValue100() {
		System.out.println("==> TypeTriangle() -> Null 100");
		triangle = new Triangle(pos, nul, nul);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-100\n");
	}
	
	@Test
	public final void testNullValue000() {
		System.out.println("==> TypeTriangle() -> Null 000");
		triangle = new Triangle(nul, nul, nul);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle ==> nuyll-000\n");
	}
	
	/*
	 * Tests de la méthode typeTriangle avec vameirs négatives
	 */
	@Test
	public final void testNegativeVal011() {
		System.out.println("==> TypeTriangle() -> Negative 011");
		triangle = new Triangle(neg, pos, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-011\n");
	}
	
	@Test
	public final void testNegativeVal101() {
		System.out.println("==> TypeTriangle() -> Negative 101");
		triangle = new Triangle(pos, neg, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-101\n");
	}
	
	@Test
	public final void testNegativeVal110() {
		System.out.println("==> TypeTriangle() -> Negative 110");
		triangle = new Triangle(pos, pos, neg);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-110\n");
	}
	
	@Test
	public final void testNegativeVal001() {
		System.out.println("==> TypeTriangle() -> Negative 001");
		triangle = new Triangle(neg, neg, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-001\n");
	}
	
	@Test
	public final void testNegativeVal010() {
		System.out.println("==> TypeTriangle() -> Negative 010");
		triangle = new Triangle(neg, pos, neg);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-010\n");
	}
	
	@Test
	public final void testNegativeVal100() {
		System.out.println("==> TypeTriangle() -> Negative 100");
		triangle = new Triangle(pos, neg, neg);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-100\n");
	}
	
	@Test
	public final void testNegativeVal000() {
		System.out.println("==> TypeTriangle() -> Negative 000");
		triangle = new Triangle(neg, neg, neg);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - Negative-000\n");
	}
	
	/*
	 * Tests de la méthode typeTriangle() sur des objets non triangulaires
	 */
	@Test
	public final void testWrongSize112() {
		System.out.println("==> TypeTriangle() -> WrongSize 112");
		triangle = new Triangle(pos, pos, pos * 2);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-112\n");
	}
	
	@Test
	public final void testWrongSize121() {
		System.out.println("==> TypeTriangle() -> WrongSize 121");
		triangle = new Triangle(pos, pos * 2, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-121\n");
	}
	
	@Test
	public final void testWrongSize211() {
		System.out.println("==> TypeTriangle() -> WrongSize 112");
		triangle = new Triangle(pos * 2, pos, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-211\n");
	}
	
	@Test
	public final void testWrongSize113() {
		System.out.println("==> TypeTriangle() -> WrongSize 113");
		triangle = new Triangle(pos, pos, pos * 3);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-113\n");
	}
	
	@Test
	public final void testWrongSize131() {
		System.out.println("==> TypeTriangle() -> WrongSize 131");
		triangle = new Triangle(pos, pos * 3, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-131\n");
	}
	
	@Test
	public final void testWrongSize311() {
		System.out.println("==> TypeTriangle() -> WrongSize 311");
		triangle = new Triangle(pos * 3, pos, pos);
		assertEquals(-1, triangle.typeTriangle(), "\nErreur de typage du triangle - WrongSize-311\n");
	}
}
