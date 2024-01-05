package homework;

import java.util.Scanner;

public class MemberService {

   private boolean end = true;
   private MemberDTO[] ar = new MemberDTO[5];
   
   Scanner sc = new Scanner(System.in);
   
   
   
   public boolean isEnd() {
      return this.end;
   } // isEnd

   
   public void menu() {
      System.out.println("****************");
      System.out.println("1. 가입");
      System.out.println("2. 출력");
      System.out.println("3. 수정");
      System.out.println("4. 탈퇴");
      System.out.println("5. 끝내기");
      System.out.println("****************");
      
      System.out.print("번호 : ");
      int num = sc.nextInt();
      
      if(num == 1) {
         insert();
      } else if(num == 2) {
         list();
      } else if(num == 3) {
         update();
      } else if(num == 4) {
         delete();
      } else if(num == 5) {
         this.end = false;
      } // if-else if
      
   } // menu
   
   public void insert() {
      
      while(true) {
         
         int cnt = 0;
         
         for(int i=0; i<ar.length; i++) {
            
            if(ar[i] == null) {
               MemberDTO dto = new MemberDTO();
               
               System.out.print("이름 입력 : ");
               String name = sc.next();
               
               dto.setName(name);
               
               System.out.print("나이 입력 : ");
               int age = sc.nextInt();
               
               dto.setAge(age);
               
               System.out.print("폰번호 입력 : ");
               String phoneNumber = sc.next();
               
               dto.setPhoneNumber(phoneNumber);
               
               System.out.print("주소 입력 : ");
               String juso = sc.next();
               
               dto.setJuso(juso);
               System.out.println();
               
               ar[i] = dto;
               System.out.println("1 row created");
               System.out.println();
               
               cnt++;
               
               break;
               
            } // if
            
         } // for
         
         if(cnt == 0) {
            System.out.println("5명의 정원이 꽉 찼습니다...");
         } // if
         
         break;
         
      } // while
      
   } // insert
   
   public void list() {
      
      System.out.println("이름\t나이\t폰번호\t\t주소");
      for(int i=0; i<ar.length; i++) {
         if(ar[i] == null) {
            continue;
         } // if
         
         System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" +
                          ar[i].getPhoneNumber() + "\t" +
                          ar[i].getJuso()
               );
         
      } // for
      System.out.println();
      
   } // list
   
   public void update() {
      MemberDTO dto = new MemberDTO();
      
      System.out.print("폰번호 입력 : ");
      String phoneNumber = sc.next();
      
      int cnt = 0;
      
      for(int i=0; i<ar.length; i++) {
         if(ar[i] == null) {
            continue;
         } // if
         
         if(ar[i].getPhoneNumber().equals(phoneNumber)) {
            System.out.println(ar[i].getName() + "\t" + ar[i].getAge() + "\t" +
                       ar[i].getPhoneNumber() + "\t" +
                       ar[i].getJuso()
            );
            
            System.out.print("수정할 이름 입력 : ");
            String name = sc.next();
            
            System.out.print("수정할 폰번호 입력 : ");
            String phoneNum = sc.next();
            
            System.out.print("수정할 주소 입력 : ");
            String juso = sc.next();
            
            dto.setName(name);
            dto.setAge(ar[i].getAge());
            dto.setPhoneNumber(phoneNum);
            dto.setJuso(juso);
            
            ar[i] = dto;
            
            System.out.println();
            System.out.println("1 row(s) updated");
            
            cnt++;
            
            break;
            
         }
         
      } // for
      
      if(cnt == 0) {
         System.out.println("찾는 회원이 존재하지 않습니다.");
      } // if
      
      System.out.println();
      
   } // update
   
   public void delete() {
      
      MemberDTO dto = new MemberDTO();
      
      System.out.print("폰번호 입력 : ");
      String phoneNumber = sc.next();
      
      int cnt = 0;
      
      for(int i=0; i<ar.length; i++) {
         
         if(ar[i] == null) {
            continue;
         } // if
         
         if(ar[i].getPhoneNumber().equals(phoneNumber)) {
            
            dto = null;
            
            ar[i] = dto;
            System.out.println("1 row deleted");
            
            cnt++;
            
         } // if
         
      } // for
      
      if(cnt == 0) {
         System.out.println("찾는 회원이 존재하지 않습니다.");
      } // if
      
      
      System.out.println();
      
   } // delete
   
} // end class

/*

클럽 회원관리 프로그램 작성
여기는 폐쇄적인 모임으로 회원은 총 5명으로 한다
회원의 정보는 이름, 나이, 핸드폰, 주소로 설정한다
회원 가입, 수정, 출력 프로그램을 작성하시오
각각의 메소드로 구성하시오

[실행결과]
menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면 

또는

이름 입력 :
나이 입력 :
핸드폰 입력 :
주소 입력 :

1 row created


[2번 경우]
list()
이름      나이      핸드폰      주소

[3번 경우]
update()
핸드폰 번호 입력 : 010-123-1234
홍길동      25      xxx      xxx

수정 할 이름 입력 : 
수정 할 핸드폰 입력 : 
수정 할 주소 입력 : 

1 row(s) updated

또는

핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 : 
1 row deleted

또는

핸드폰 번호 입력 : 
찾는 회원이 없습니다

*/