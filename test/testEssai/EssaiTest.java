/*
 * * @auteur Benjamin Daunar
 * @auteur Georges Bardaghji
 * @auteur Salem Doub
 * @auteur Thibaut Gounin
 * @date 31 Janvier 2021
 */
package testEssai;

import essai.Essai;

/*ATTENTION: rajouter les imports nécessaires pour vos tests*/

/* nécessaire pour les timeout */
import static java.time.Duration.ofMillis;

/* importer les assertions utilisées */
import static org.junit.jupiter.api.Assertions.*;
/* importer les annotations utilisées*/
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class EssaiTestEtu {

	Essai essai;  //à initialiser avant chaque test!!!
	Essai essai1;
	Essai essai2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("============================================================");
		System.out.println("Début des tests relatifs à la classe 'Essai'");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("fin des tests relatifs à la classe 'Essai'");
		System.out.println("============================================================");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println(".....");
		essai = new Essai(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println(".....");
	}
	
	/*
	 * Ce test permet de vérifier  s'il y a un problème à l'initialisation
	 */
	@Test
	public final void testConstructor() {
		long début = System.currentTimeMillis();
		System.out.println("==> Début du test du constructeur");
		double val = 1.0;
		essai1 = new Essai(val);
		assertNotNull(essai1, "constructor may have a problem");
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("Fin du test - Durée : " + durée + " ms");
	}
	
	/*
	 * Ce test permet de vérifier s'il y a un soucis avec la méthode getVal
	 */
	@Test
	public final void testGetVal() {
		long début = System.currentTimeMillis();
		System.out.println("==> Début du test de la méthode getVal()");
		assertAll("Test getVal()",
				() -> {
					double val = 1.0;
					essai1 = new Essai(val);
					assertNotNull(essai1, "constructor may have a problem");
					assertEquals(val, essai1.getVal());
					}
				);
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("Fin du test - Durée : " + durée + " ms");
	}
	
	/*
	 * Ce test permet de vérifier s'il y a un soucis avec la méthode setVal
	 */
	@Test
	public final void testSetVal() {
		long début = System.currentTimeMillis();
		System.out.println("==> Début du test de la méthode setVal()");
		assertAll("Test setVal()",
				() -> {
					double val1 = 1.0;
					double val2 = 10.0;
					essai2 = new Essai(val1);
					assertNotNull(essai2, "constructor may have a problem");
					assertEquals(val1, essai2.getVal());
					essai2.setVal(val2);
					assertEquals(val2, essai2.getVal());
					}
				);
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("Fin du test - Durée : " + durée + " ms");
	}

	/*
	 * désactiver ce test
	 */
	@Disabled
	void test() {
		fail("Not yet implemented");
	}

	/*
	 * un exemple de test pour l'inverse
	 */
	@Test
	public final void testInverse(){
		long début = System.currentTimeMillis();
		System.out.println("==> Début du test de la méthode inverserVal()");
		essai.setVal(2.0);
		double val = essai.inverserVal();
		double expected = 1/ 2.0;
		assertTrue(val == expected,() ->"\n...");
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("Fin du test - Durée : " + durée + " ms");
	}
	
	/*
	 * Ecrire un test vérifiant que diviser par zéro lève une exception
	 */
	@Test
	 public final void testExceptionInverse(){
		long début = System.currentTimeMillis();
		System.out.println("==> Début du test de la méthode inverserVal() quand la valeur est initialisée à 0");
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
		essai.inverserVal());
		assertEquals("0 can't be inverted", exception.getMessage());
		long fin = System.currentTimeMillis();
		long durée = fin - début;
		System.out.println("Fin du test - Durée : " + durée + " ms");
	}
	
	/*
	 * Ecrire un test qui échoue si le calcul avec infinite prend trop de temps 
	 */
	@Test
	public final void testTimeoutInfinite(){
		System.out.println("==> Début du test de la méthode infinite()");
		assertTimeoutPreemptively(ofMillis(100), () -> {
			essai.infinite();
			}, "\n ==> la méthode est lente ou ne termine pas\n");
	}
		
}
