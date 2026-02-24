package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//6번 : HashMap 메소드
public class MapTest02 {
   public static void main(String[] args) {

      HashMap<String, Integer> coffee = new HashMap<>();

      // 추가 .add(key, value)
      // 아메리카노 2000
      // 카페라떼 2400
      // 카푸치노 2400
      // 카라멜마끼야또 3000
      coffee.put("아메리카노", 2000);
      coffee.put("카페라떼", 2400);
      coffee.put("카푸치노", 2400);
      coffee.put("카라멜마끼야또", 3000);
      System.out.println(coffee);

      // 조회 .get(key)
      System.out.println(coffee.get("아메리카노"));

      // 삭제 .remove(key) : 해당하는 key에 대응되는 value를 반환
//      System.out.println(coffee.remove("카푸치노"));
      System.out.println(coffee);
      // 삭제 .remove(key, value) : 해당하는 key와 value 일치 시 삭제 성공true반환
      // 불일치시 삭제 실패 false반환
      System.out.println(coffee.remove("카푸치노", 2400));
      System.out.println(coffee);

      // containsKey
      System.out.println(coffee.containsKey("새우깡"));
      System.out.println(coffee.containsKey(2000));
      // containsValue
      System.out.println(coffee.containsValue("새우깡"));
      System.out.println(coffee.containsValue(2400));

      // Iterator
      // keySet -> key만 가져오기
      System.out.println(coffee.keySet());
      Iterator<String> iter = coffee.keySet().iterator();
      System.out.println(iter);
      while (iter.hasNext()) {
         System.out.println(iter.next());
      }

      // values -> value만 가져오기
      System.out.println(coffee.values());
      Iterator<Integer> iter2 = coffee.values().iterator();
      System.out.println(iter2);
      while (iter2.hasNext()) {
         System.out.println(iter2.next());
      }

      // Entry Key, value 한쌍씩 가져오기
      System.out.println(coffee.entrySet());
      Set<Entry<String, Integer>> items = coffee.entrySet();
      for (Entry<String, Integer> entry : items) {
         System.out.println(entry);
      }

   }
}
