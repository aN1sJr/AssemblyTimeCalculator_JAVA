package TP;
import java.util.ArrayList;


public class PieceComp extends PieceG {
	ArrayList<PieceG> lp = new ArrayList<PieceG>();
	
	public PieceComp(int t) {
		super(t);
	}
	
	public void ajouter(PieceG p) {
		lp.add(p);
	}
	
	public int fab_time() {
		int somme = super.time;
		for(PieceG p:lp) {
			somme += p.fab_time();
		}
		return somme;
	}
}