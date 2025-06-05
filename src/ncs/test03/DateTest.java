package ncs.test03;

import java.time.Year;
import java.util.Calendar;

//GregorianCalendar 클래스를 사용하여, 현재 년도와 비교한 나이를 계산하고 생일의 요일을 출력
//한다.  출력시 SimpleDateFormat 을 사용하여 출력한다. 

//사용 데이터
//year			month				day
//1987			5					27
//현재 년도		현재 월				오늘 날짜
//
//main 함수 안에서 모든 코드 작업 진행
//class명과 method명은 변경 하지않는다

public class DateTest {
	public static void main(String[] args) {

		// Calendar는 추상클래스이므로 객채생성을 할 수 없다. (Calendar cal = new calendar X)
//getInstance-singltonpatton(객체를 딱 한번 생성 계속 공유쓰는 방식,객체가 없으면 만들고 있으면 리턴)
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);

//캘린더 Java155_Calendar, 챗gpt참고
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
//요일은 숫자로 나오니까 숫자를 한글로 변환
		int dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		String[] days = { "", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };
		String week = days[dayOfweek];
//System.out.println("--현재(리얼)--");
//System.out.printf("%d-%d-%d \n", year,month,date);

//현재
		cal.set(2016, 3, 18);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		System.out.printf("현재 : %d년 %d월 %d일 \n", year, month, date);

//생일
		cal.add(Calendar.YEAR, -29);
		cal.add(Calendar.MONTH, +1);
		cal.add(Calendar.DATE, +9);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		dayOfweek = cal.get(Calendar.DAY_OF_WEEK);
		week = days[dayOfweek];
		System.out.printf("생일 : %d년 %d월 %d일 %s\n", year, month, date, week);
//=============================================================================
		//나이 (만나이)
		//기준 날짜 오늘로 다시 설정
		Calendar now = Calendar.getInstance();
		now.set(2016, 4, 18);
		 // 생일 날짜를 복사해서 birth 변수에 저장 (복사본 만들기
		Calendar birth = (Calendar) cal.clone();
		// 현재 연도 - 생일 연도 = 기본 나이 계산 (여기까진 오케이)
		int age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		
		if (now.get(Calendar.MONTH) < birth.get(Calendar.MONTH) || // 지금 달이 생일 달보다 앞이면
				(now.get(Calendar.MONTH) == birth.get(Calendar.MONTH)// 달이 같아도
				&& now.get(Calendar.DATE) < birth.get(Calendar.DATE))) { // 날짜가 더 전이면 생일 전
			age--; // 한 살 줄인다
		}
		System.out.println("나이 : " + age + "세");
//============================================================================
		//참고 java157
//		long eventDay = examDay.getTimeInMillis();
//		long nowDay = toDay.getTimeInMillis();
//		System.out.println(eventDay);
//		System.out.println(nowDay);
//		System.out.println(60 * 60 * 24 * 1000);
//		
//		// 차이 값을 하루의 밀리초인(60 * 60 * 24 * 1000)으로 나눠주면 밀리초가 아닌 일 단위 값을 얻을 수 있다.
//		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
//		System.out.println(endDay);
		
	} // end main()
} // end class

//출력값
//생일 : 1987년 5월 27일 수요일
//현재 : 2016년 4월 18일
//나이 : 29 세

//요일 숫자를 한글로 변환