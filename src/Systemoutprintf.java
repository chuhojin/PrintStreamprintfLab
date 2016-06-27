
public class Systemoutprintf {
	public static void main(String[] args) {
		System.out.printf("5+5");	//숫자가 아닌 글자임.
		System.out.printf("\n");
		System.out.printf("%d \n",5+5);//숫자 10을 의미.
		/*
		 * 서식(%d)이 지정된 숫자임. 정수(decimal) 의미.
		 * 서식의 갯수 = 큰따옴표 위에 오는 숫자(문자)갯수
		 */
		System.out.printf("%d  \n" , 627, 5);
		//System.out.printf("%d %d", 5);
		
		/*
		 * 627과 5를 더한 결과가 나올수 있도록 %d를 3개 사용
		 * 627+5=632
		 * 627/5=125.4
		 */
		System.out.printf("%d+%d=%d \n", 627,5,632);
		System.out.printf("%d/%d=%f \n", 627,5,125.4);
		
		System.out.printf("%c %c \n", 'g','A');
		
		System.out.printf("%s %s \n", "google","Apple");
		
		
		//정수형  다양한 서식 활용
		System.out.printf("%d\n",627);
		System.out.printf("%5d\n",627);
		System.out.printf("%05d\n",627);
		
		//실수형 다양한 서식 활용
		System.out.printf("%f\n",627.55);
		System.out.printf("%7.1f\n",627.55);
		System.out.printf("%7.3f\n",627.55);
		
		//문자열 다양한 서식 활용
		System.out.printf("%s\n","facebook");
		System.out.printf("%10s","facebook");
		
		//다양한 서식 활용
		System.out.printf("\n줄바꿈\n여기요 \n");
		System.out.printf("\t탭키\t여기요 \n");
		System.out.printf("줄의 맨 앞으로\r갑니다 \n");
		System.out.printf("글자가 \"강조\"되는 효과  \n");
		System.out.printf("\\\\\\ 역슬래시 세개 출력");
		
		
		
	}
}






