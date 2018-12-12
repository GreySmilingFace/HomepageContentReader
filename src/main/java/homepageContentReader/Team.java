package homepageContentReader;

public class Team {

	private String rang;
	private String mannschaft;
	private String begegnungen;
	private String s;
	private String u;
	private String n;
	private String tore;
	private String plus_minus;
	private String punkte;

	public Team() {
	}

	public Team(String rang, String mannschaft, String begegnungen, String s, String u, String n, String tore,
			String plus_minus, String punkte) {
		this.rang = rang;
		this.mannschaft = mannschaft;
		this.begegnungen = begegnungen;
		this.s = s;
		this.u = u;
		this.n = n;
		this.tore = tore;
		this.plus_minus = plus_minus;
		this.punkte = punkte;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getMannschaft() {
		return mannschaft;
	}

	public void setMannschaft(String mannschaft) {
		this.mannschaft = mannschaft;
	}

	public String getBegegnungen() {
		return begegnungen;
	}

	public void setBegegnungen(String begegnungen) {
		this.begegnungen = begegnungen;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getU() {
		return u;
	}

	public void setU(String u) {
		this.u = u;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getTore() {
		return tore;
	}

	public void setTore(String tore) {
		this.tore = tore;
	}

	public String getPlus_minus() {
		return plus_minus;
	}

	public void setPlus_minus(String plus_minus) {
		this.plus_minus = plus_minus;
	}

	public String getPunkte() {
		return punkte;
	}

	public void setPunkte(String punkte) {
		this.punkte = punkte;
	}

	@Override
	public String toString() {
		return "Team [rang=" + rang + ", mannschaft=" + mannschaft + ", begegnungen=" + begegnungen + ", s=" + s
				+ ", u=" + u + ", n=" + n + ", tore=" + tore + ", plus_minus=" + plus_minus + ", punkte=" + punkte
				+ "]";
	}

}
