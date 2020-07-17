package support;

import java.util.Arrays;

public class ComplexDigit implements Complex{
	
	private final Double re;
	private final Double im;
	
	public ComplexDigit(double r, double i) {
		re=r;
		im=i;
	}
	
	@Override
	public Complex sum(Complex other) {
		return new ComplexDigit(re+other.getReal(), im+other.getImage());
	}
	
	@Override
    public Complex sub(Complex other) {
		return new ComplexDigit(re-other.getReal(), im-other.getImage());
	}
	


	@Override
    public Complex mul(Complex other) {
		Double a = re*other.getReal();
		Double b = re*other.getImage();
		Double c = im*other.getReal();
		Double d = (im*other.getImage())*(-1);
		return new ComplexDigit(a+d, b+c);
	}
	

	@Override
	public double getReal() {
		return re;
	}
	

	@Override
	public double getImage() {
		return im;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.hashCode()!=obj.hashCode())
			return false;
		
		String a = this.toString();
		String b = obj.toString();

		if (a.equals(b))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		String real = rounding(re.toString());
		String image = rounding(im.toString());
		return real.hashCode()+image.hashCode();
	}
	
	@Override
	public String toString() {
		String result = "";
		String real = rounding(re.toString());
		result = result.concat(real);
		if (im>0) {
			result = result.concat("+");
		}
		String image = rounding(im.toString());
		result=result.concat(image+"i");
		return result;
	}
	
	private String rounding(String n) {
		char[] tmp = n.toCharArray();
		int point=0;
		for (int i=0; i<tmp.length; i++) {
			if (tmp[i]=='.') 
				point=i;
		}
		point+=2;
		
		for (int i=point+1; i<tmp.length; i++) {
			if (tmp[i]>='0' && tmp[i]<='4') {
				n=n.substring(0, point+1);
				break;
			}
			else if (tmp[i]>='5' && tmp[i]<='9') {
				if (tmp[point]!='9') {
					tmp[point]+=1;
					n=n.substring(0, point);
					n=n.concat(""+tmp[point]);
					break;
				} else {
					int j=point;
					while (j>=0 && (tmp[j]=='9' || tmp[j]=='.')) {
						if (tmp[j]=='.') {
							j--;
							continue;
						}
							tmp[j]='0';
							j--;
					}
					j=j<0 ? 0 : j;
					if (tmp[j]!='0') {
						tmp[j]+=1;
						n = Arrays.toString(tmp).replaceAll("\\[|\\]|,|\\s", "");
						n = n.substring(0, point+1);
						break;
					}
					else {
						String tab = Arrays.toString(tmp).replaceAll("\\[|\\]|,|\\s", "");
						n="1"+tab;
						n = n.substring(0, point+2);
						break;
					}
				}		
			}
		}
		return n;
		}
	
}
