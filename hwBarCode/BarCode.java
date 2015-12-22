public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private static final String[] code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::", "||:::"};
    public BarCode(String zip){
	try{
	    if(zip.length() != 5){
		_zip = zip;
		_checkDigit = checkSum();
	    }
	    throw new RuntimeException();
	}
	catch(NumberFormatException e){
	    throw new RuntimeException();
	}
    }
    public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }
    private int checkSum(){
	int zip = Integer.parseInt(_zip);
	int ans = 0;
	
    }
}