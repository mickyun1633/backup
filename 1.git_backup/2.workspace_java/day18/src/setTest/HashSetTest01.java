package setTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//4번 : HashSet 클래스
public class HashSetTest01 {
   public static void main(String[] args) {
      List<String> animal = new ArrayList<>();
      // 업캐스팅
      animal.add("고양이");
      animal.add("사자");
      animal.add("기린");
      animal.add("토끼");
      animal.add("하마");
      animal.add("하마");
      animal.add("하마");
      System.out.println(animal);

      HashSet<String> set = new HashSet<>(animal);
      System.out.println("ArrayList 객체를 담은 HashSet : " + set);
//      System.out.println(set.get(0));
      ArrayList<String> list = new ArrayList<>(set);
      System.out.println(list.get(0));

      HashSet<String> animal2 = new HashSet<>();
      animal2.add("고양이");
      animal2.add("사자");
      animal2.add("기린");
      animal2.add("토끼");
      animal2.add("하마");
      animal2.add("하마");
      animal2.add("하마");
      System.out.println(animal2);

      // Iterator : 반복자
      Iterator<String> animalIter = animal2.iterator();
      System.out.println(animalIter);

      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.next()); // 고양이
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.next()); // 기린
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.next()); // 토끼
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.next()); // 하마
//      System.out.println(animalIter.hasNext());
//      System.out.println(animalIter.next()); // 사자
//      System.out.println(animalIter.hasNext()); // false 이후에는 값이 없으므로 가져올 수 없다
//      System.out.println(animalIter.next()); // NoSuchElementException 예외발생

      while (animalIter.hasNext()) {
         System.out.println(animalIter.next());
      }

   }
}
