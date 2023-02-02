package ex1_operator;
import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {
		/* 동물원에 호랑이 4 사자 5 치타 6
		      나들이를 나가는 호랑이 3마리 사자는 1마리 치타는 2마리 이다.
		
		1. 나들이를 나가지 않고 남아있는 동물들의 수를 출력
		2. 나들이를 나가는 동물들의 수를 출력
		3. 남아있는 동물이 2마리를 이상이면 정상 영업, 아니면 폐업 출력
		
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("호랑이 수를 입력하시오 = ");
		int t = s.nextInt();
		System.out.println("사자 수를 입력하시오 = ");
		int l =s.nextInt();
		System.out.println("치타 수를 입력하시오 = ");
		int c =s.nextInt();
	
		
		int sum = t + l + c ;
		
		int go_out_t = 4;
		int go_out_l = 5;
		int go_out_c = 5;
		int go_out_sum = go_out_t+go_out_l+go_out_c; 
		int inzoo = sum - go_out_sum;
		
		System.out.println("1. 나들이를 나가지 않고 남아있는 동물들의 수 : " + inzoo + "마리 ");
		System.out.println("2. 나들이를 나가는 동물들의 수 : " + go_out_sum + "마리");
		
		String res = inzoo >= 2 ? "정상영업" : "폐업" ;
		System.out.println("3. "+ res);
		
		
		System.out.println("지금 당장 먹고싶은것을 입력하시오. = ");
		String food = s.next();
		System.out.println("지금 당장 먹고싶은것. = " + food);

		
	}
}
