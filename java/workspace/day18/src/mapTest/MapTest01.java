package mapTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//5번 : HashMap
public class MapTest01 {
   public static void main(String[] args) {
      // ArrayList 객체
      ArrayList<Integer> al1 = new ArrayList<>();
      System.out.println(al1); // []
      al1.add(1);
      al1.add(2);
      al1.add(3);
      al1.add(3);
      System.out.println(al1);
      System.out.println(al1.get(1)); // 인덱스를 알아야 해당하는 값을 출력할 수 있다

      HashMap<String, Integer> map = new HashMap<>();
      System.out.println(map.toString());
      map.put("a", 10);
      map.put("b", 20);
      System.out.println(map.get("c"));
      System.out.println("---" + map.put("c", 30)); // "c"라는 key가 있니? x c에 해당하는 value가 아직 없는 상태 => null
      System.out.println(map.get("c"));
      System.out.println(map);
      System.out.println("---" + map.put("c", 50)); // "c"라는 key가 기존에 존재 => 해당하는 value가 있었다 30
      System.out.println(map); // {key=value, key=value}
      System.out.println(map.get("a")); // 인덱스를 몰라도 key으로 해당 value를 출력할 수 있다

      map.put("d", 10);
      System.out.println(map);
      // put(key, value) 추가메소드
      // get(key) 해당 key의 value 반환
      // size() 해당 요소의 길이 반환
      // keySet()
      // values()

      System.out.println(map.keySet()); // 반환타입 Set인터페이스
      Set set = map.keySet();
      System.out.println(map.values()); // 반환타입 Collection 인터페이스
      Collection co = map.values();
      System.out.println(co.toString());

   }
}
