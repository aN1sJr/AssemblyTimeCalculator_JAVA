package TP;

import java.util.ArrayList;

public class PieceComposee extends Piece  {
    
	int astime;
	ArrayList<Piece> lp;// = new ArrayList<Piece>();
	
	public PieceComposee(int t) {
		this.astime=t;
		lp = new ArrayList<Piece>();
	}
	
	public void ajouter(Piece p) {
		lp.add(p);
	}
	
	public int fab_time() {
		int somme = this.astime;
		for (Piece p:lp) {
			somme += p.fab_time();	
		}
		
		return somme;
	}
	
}
