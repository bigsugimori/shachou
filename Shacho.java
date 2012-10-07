
public class Shacho {
    public static void main(String[] args){

	
	Shain shain = null;
	System.out.println(args[0]);
	//	Shain shain = new Shain("aaa");

	if(args[0].equals("Bucho")) {
	    shain = new Bucho("tanaka");
	} else if (args[0].equals("Shunin")) {
	    shain = new Shunin("sato");		
	} else if (args[0].equals("Tanto")) {
	    shain = new Tanto("yoshida");		
	} else {
	    shain = new Shain("aaa");
	}

	shain.kiritsu();
	shain.kyuryo(new Integer(args[1]));
    }
}
