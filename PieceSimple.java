package TP;

public class PieceSimple extends Piece  {
	
	private int ftime;
	
	public PieceSimple(int t) {
		this.ftime=t;
	}
	
	public int fab_time() {
		return ftime;
	}
	
	public int get_time() {
		return ftime;
	}
	
	public void set_time(int t) {
		this.ftime=t;
	}
	
}
