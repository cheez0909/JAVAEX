package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("dani", "dani");
        map.put("HKD", "1234");
        map.put("Id", "Pw");
        map.put("LLL", "12345");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("아이디를 입력하세요");
            String id = sc.nextLine().trim(); // .trim() -> 공백제거
            if(map.containsKey(id)) {
                System.out.println("비밀번호를 입력하세요");
                String pw = sc.nextLine().trim();
                if(map.get(id).equals(pw)){
                    System.out.println("로그인 성공!");
                    break;
                }
            }else{
                System.out.println("존재하지 않는 아이디입니다.");
            }
        }
    }
}
