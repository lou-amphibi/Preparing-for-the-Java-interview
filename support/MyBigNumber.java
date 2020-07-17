package support;

public class MyBigNumber implements BigNumber {

    private final String number;

    public MyBigNumber(String number) {
        this.number = number;
    }

    @Override
    public BigNumber add(BigNumber bigNumber) {
    		
    		if (!this.number.startsWith("-") && bigNumber.toString().startsWith("-")) {
    			String to = bigNumber.toString().substring(1);
    			MyBigNumber tmp= new MyBigNumber(to);
    			return this.sub(tmp);
    		}
    		else if (this.number.startsWith("-") && !bigNumber.toString().startsWith("-")) {
    			String to = number.substring(1);
    			MyBigNumber tmp= new MyBigNumber(to);
    			return bigNumber.sub(tmp);
    		}
    		else if (this.number.startsWith("-") && bigNumber.toString().startsWith("-")) {
    			String to = number.substring(1);
    			String to1 = bigNumber.toString().substring(1);
    			MyBigNumber tmp= new MyBigNumber(to);
    			MyBigNumber tmp1= new MyBigNumber(to1);
    			MyBigNumber res = (MyBigNumber) tmp.add(tmp1);
    			to = "-" +res.toString();
    			res = new MyBigNumber(to);
    			return res;	
    		}
    		
    		String one = this.number;
    		String two = bigNumber.toString();
    		if (one.length() > two.length()) {
    			two = withZero(two, one);
    		}
    		else if (two.length() > one.length()) {
    			one = withZero(one, two);
    		}
    		char[] a= one.toCharArray();
        	char[] b = two.toCharArray();
        	int tmp;
        	int inMind=0;
        	String result="";
        	for (int i=a.length-1; i>=0; i--) {
        		if (( (a[i]-'0')+inMind)+(b[i]-'0')<10) {
        			result=result.concat("" + (char) ((a[i]+b[i]+inMind)-'0'));
        			inMind=0;
        		}
        		else {
        			tmp=(( (a[i]-'0')+(b[i]-'0')+inMind))%10;
        			tmp+='0';
        			result=result.concat(""+(char) tmp);
        			if (i==0) {
        				tmp=(( (a[i]-'0')+(b[i]-'0')+inMind))/10;
        				tmp+='0';
        				result=result.concat(""+(char) tmp);
        			}
        			inMind=1;
        			
        		}
        	}
        	result = new StringBuilder(result).reverse().toString();
        	BigNumber res = new MyBigNumber(result);
        	return res;
        	
    }

    @Override
    public BigNumber sub(BigNumber bigNumber) {
    	
    	if (!this.number.startsWith("-") && bigNumber.toString().startsWith("-")) {
			String to = bigNumber.toString().substring(1);
			MyBigNumber tmp= new MyBigNumber(to);
			return this.add(tmp);
		}
    	else if (this.number.startsWith("-") && !bigNumber.toString().startsWith("-")) {
			String to = number.substring(1);
			MyBigNumber tmp= new MyBigNumber(to);
			tmp =(MyBigNumber) tmp.add(bigNumber);
			to = "-" +tmp.toString();
			return new MyBigNumber(to);
		}
    	else if (this.number.startsWith("-") && bigNumber.toString().startsWith("-")) {
    		String to1 = bigNumber.toString().substring(1);
    		String to = number.substring(1);
    		MyBigNumber res = new MyBigNumber(to1);
			MyBigNumber tmp = new MyBigNumber(to);
			return res.sub(tmp);
    	}
    	
    	int comp = this.compareTo(bigNumber);
    	boolean isMinus = false;
    	String one;
		String two;
    	if (comp==0)
    		return new MyBigNumber("0");
    	else if (comp==1) {
    		one = this.number;
    		two = bigNumber.toString();
    		if (one.length() > two.length()) 
    			two = withZero(two, one);
    	}
    	else {
    		one = bigNumber.toString();
    		two = this.number;
    		if (one.length() > two.length()) 
    			two = withZero(two, one);
    		isMinus = true;
    	}
    	char[] a= one.toCharArray();
    	char[] b = two.toCharArray();
    	int tmp;
    	int inMind=0;
    	String result="";
    	for (int i=a.length-1; i>=0; i--) {
    		if (( (a[i]-'0')-inMind)-(b[i]-'0')>=0) {
    			if ( ((a[i]-'0')-inMind)-(b[i]-'0')!=0 || i!=0)
    			result=result.concat("" + (char) ((a[i]-b[i]-inMind)+'0'));
    			inMind=0;
    		}
    		else {
    			tmp=(( (a[i]-'0'+10)-(b[i]-'0')-inMind));
    			tmp+='0';
    			
    			
    			result=result.concat(""+(char) tmp);
    			inMind=1;
    		}
    	}
    	if (isMinus)
    		result=result.concat("-");
    	result = new StringBuilder(result).reverse().toString();
    	BigNumber res = new MyBigNumber(result);
    	return res;
    }

    @Override
    public int compareTo(Object o) {
        MyBigNumber inO = (MyBigNumber) o;
        String ts = this.number.toString();
        String in = inO.toString();
        
        if (ts.equals(in) ) {
        	return 0;
        }

        char[] a = ts.toCharArray();
        char[] b = in.toCharArray();
        if (a[0]=='-' && b[0]!='-')
        	return -1;
        else if (b[0]=='-' && a[0]!='-')
        	return 1;
        if (a[0]!='-' && b[0]!='-') {
        	if (a.length>b.length)
        		return 1;
        	else if (b.length>a.length)
        		return -1;
        	for (int i=0; i<a.length; i++) {
        		if (a[i]>b[i]) 
        			return 1;
        	}
        	return -1;
        }
        else {
        	if (a.length>b.length)
        		return -1;
        	else if (b.length>a.length)
        		return 1;
        	for (int i=0; i<a.length; i++) {
        		if (a[i]>b[i]) 
        			return -1;
        	}
        	return 1;
        }  	
    }

    @Override
    public String toString() {
        return number;
    }
    
    private String withZero(String lower, String bigger) {
    	lower = new StringBuilder(lower).reverse().toString();
    	while (lower.length()<bigger.length()) {
    		lower=lower.concat("0");
    	}
    	return  new StringBuilder(lower).reverse().toString();
    }
}
