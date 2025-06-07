package ncs.test10;

public class Company {
	public static void main(String[] args) {

		//배열값 2개 생성 em배열객체 생성
		Employee[] em= new Employee[2];
		
		//em의 배열에 객체값 넣기
		Secretary sc = new Secretary("Hilery", 1, "secretary", 800);
		em[0] = sc;
		Sales sa = new Sales("Clinten", 2, "sales", 1200);
		em[1] = sa;
		
		System.out.println("name\t department\t salary");
		System.out.println("-------------------------------");
		for(int i = 0; i < em.length; i++) {
			//형식포맷 출력 이름,부서,급여
			System.out.printf("%s\t%s\t%d\n", em[i].getName(),em[i].getDepatment(),
					em[i].getSalary());
		}
		
		System.out.println("인센티브 100지급");
		sc.incentive(100);
		sa.incentive(100);
		
		//세금
		System.out.println("name\t department\tsalary\ttax");
		System.out.println("-------------------------------");
		for (int i = 0; i < em.length; i++) {
			System.out.printf("%s\t%s\t%d\t%.1f\n", em[i].getName(),em[i].getDepatment(),
					em[i].getSalary(),em[i].tax());
		}
	} // end main()
} // end class
