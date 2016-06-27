
public class DeclareVariables {
	public static void main(String[] args) {
		int a;
		//정수형 변수 a 선언
		float b;
		//실수형 변수 b 선언
		
		a=(int)627.55;
		b=812;
		
		System.out.printf("a의 값 ==> %d \n",a);
		System.out.printf("b의 값 ==> %f \n",b);
		
		int intVar1,intVar2;
		float floatVar1,floatVar2;
		
		intVar1=627;
		intVar2=intVar1;
		
		floatVar1=627.55f;
		floatVar2=floatVar1;
		
		System.out.printf("intVar1,intVar12의 값 ==>"
				+ "%d, %d \n", intVar1,intVar2);
		System.out.printf("floatVar1,floatVar2의 값 ==>"
				+ "%5.1f, %5.1f \n", floatVar1,floatVar2);
	}
}












