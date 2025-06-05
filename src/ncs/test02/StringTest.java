package ncs.test02;

//실수는 float과 double타입 (소수점)
//주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다.  
//단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다. 

public class StringTest{  
public static void main(String args[]) { 
      String str = "1.22,4.12,5.93,8.71,9.34"; //실수들이 들어있는 문자열(String)이니까
      // str에서 데이터를 분리한다.
      // 문자열 str.split을 이용하여 ","을 기준으로 배열을 5개로 나누기
      // splite으로 나누면 무조건 스트링으로 배열된다. -> 더블타입으로 변환해야함
      String[] st = str.split(",");
      //실수 배열의 공간만 저장하는 것이지 데이터 타입을 더블로 바꾸는게 아니다.
      //double data[]= new double[st.length];은 공간을 저장만 하는 것
      double data[]= new double[st.length]; //실수 데이터를 저장할 배열[5개]만 선언, st.length가 더 안전[나눠진거 자동계산]
      double sum = 0; // 합계를 저장할 변수선언
  
    //문자열이기 때문에 +,-같은 숫자 계산이 불가능하여 실수로 만들어야 한다.
     
   //for~each 문 사용한다.
   //for (자료형 변수명 : 배열이름)
   //→ 배열 안의 값을 하나씩 꺼내서 변수명에 담아 반복
   int i = 0;
   //string st자료형 변수명(변수명은 내가 정한다) : st<-(자료형 이름)
   for(String sn : st){
	   data[i] = Double.parseDouble(st[i]); // 데이터값을 스트링에서 Double.parsDouble(자료형 이름[인덱스])로 저장
	   // sum에 계속 더해서 누적하는 것
	   sum += data[i]; 
	   i++; //
}     
   //배열에 실수 데이터를 넣는다. 
   //배열 데이터의 합을 구한다.  
   
   //메모리 값에 실수가 들어가므로 double값으로 변환해서 평균을 구해야 한다.
   double avg = sum / data.length;
 System.out.printf("합계: %.3f\n" , sum);
 //소수점 3자리 %.3f(%.숫자f) 이때 숫자는 소수점 뒤자리를 말한다.
 System.out.printf("평균: %.3f", avg);
 
  // 결과 값을 출력 한다.   
   
} // end main()
} // end class

//합계:29.320   
//평균:5.864 
//소수점 3자리 출력


//=======================================
//일반 for문
//for (int i = 0; i < arr.length; i++) {
//    System.out.println(arr[i]);
//}

//// for-each문 (향상된 for문)
//for (int value : arr) {
//    System.out.println(value);
//}

//for (자료형 변수명 : 배열이름)
//   → 배열 안의 값을 하나씩 꺼내서 변수명에 담아 반복한다!
//for (String token : tokens)은
//     tokens[0], tokens[1], ..., tokens[n]을 순서대로 가져오는 거


