/*
 * @auteur Benjamin Daunar
 * @date 23 Janvier 2021
 */
package triangle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Triangle {
	
	private float coteA;
	private float coteB;
	private float coteC;
	
	public Triangle (float a, float b, float c) {
		coteA = a;
		coteB = b;
		coteC = c;
	}
	
	public float getCoteA() {
		return coteA;
	}
	
	public float getCoteB() {
		return coteB;
	}
	
	public float getCoteC() {
		return coteC;
	}
	
	public void setCoteA(float newA) {
		this.coteA = newA;
	}
	
	public void setCoteB(float newB) {
		this.coteB = newB;
	}
	
	public void setCoteC(float newC) {
		this.coteC = newC;
	}
	
	public int typeTriangle() {
		float a = this.coteA;
		float b = this.coteB;
		float c = this.coteC;
		/* On commence pa vérifier s'il s'agit bien d'un triangle. */
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			if ((a == b) && (a == c))
				return 3; /* Triangle équilatéral */
			if ((a == b) || (a == c) || (b == c))
				return 2; /* Triangle isocèle */
			return 1; /* Triangle scalène */
			}
		return -1;
	}
	
	public Triangle readData(String path){
		/* Triangle par défaut à retourner en cas d'erreur. */
		Triangle out = new Triangle(-1, -1, -1);
		/*
		 * Ici, nous sommes obligés de faire un try...catch car, en cas d'erreur, on souhaite 
		 * être en mesure de retourner le triangle par défaut.
		 */
		try {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			LineNumberReader ctr = new LineNumberReader(reader);
			String line = "";
			int i = 0;
			float tmp[] = {-1, -1, -1};
			while ((line = ctr.readLine()) != null) {
			    if (i < 3) {
			    	tmp[i] = Float.valueOf(line);
					i++;
			    } else {
			    	ctr.close();
			    	return out;
			    }
			}
			if (tmp[0] != -1 && tmp[1] != -1 && tmp[2] != -1) {
				out.setCoteA(tmp[0]);
				out.setCoteB(tmp[1]);
				out.setCoteC(tmp[2]);
			}
			ctr.close();
			return out;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return out;
	}
	
	public boolean equals(Triangle t) {
		return this.coteA == t.coteA && this.coteB == t.coteB && this.coteC == t.coteC;
	}
}
