public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private static final String[] code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::", "||:::"};
    public BarCode(String zip){
	try{
	    if(zip.length() == 5){
		_zip = zip;
		_checkDigit = checkSum();
	    }
	    else{
		throw new RuntimeException();
	    }
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
	int ans = 0;
	for(int i = 0; i < _zip.length(); i++){
	    ans += Integer.parseInt(_zip.substring(i, i + 1));
	}
	while(ans >= 10){
	    ans = ans % 10;
	}
	return ans;
    }
    public String getZip(){
	return _zip;
    }
    public String toString(){
	int ans =  Integer.parseInt(_zip);
	return "|" + BarCode.code[Integer.parseInt(_zip.substring(0, 1))]+  BarCode.code[Integer.parseInt(_zip.substring(1, 2))] +  BarCode.code[Integer.parseInt(_zip.substring(2, 3))] + BarCode.code[Integer.parseInt(_zip.substring(3, 4))] + BarCode.code[Integer.parseInt(_zip.substring(4, 5))] + BarCode.code[_checkDigit] + "|";
    }
    public boolean equals(Object other){
	if(other instanceof BarCode){
	    return toString().equals(other.toString());
	}
	return false;
    }
    public int compareTo(Object other){
	return this.toString().compareTo(other.toString());
    }
}
