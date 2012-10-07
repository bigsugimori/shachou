
public class Shunin extends Shain {
    public Shunin(String name) {
	super(name);
    }
    public void kiritsu() {
	System.out.println("shunin ga subayaku tachimasita ");
    }
    public void kyuryo(Integer kihon) {
	System.out.println("私の給料は" + (kihon*2+1) + "円です");
    }

}
