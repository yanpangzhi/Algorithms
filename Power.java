//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
public class Power {
	public double PowerFunction(double base, int exponent) {
	if(base==0.0 &&exponent==0)
		return 0;
	if(exponent <0) {
		base = 1/base;
		exponent =Math.abs(exponent);
	}
	double res=1.0;
	for(int i=0;i<exponent;i++) {
		res*= base;
	}
	return res;
	}
}
