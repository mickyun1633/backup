package wrapperTest;

public class StringMethod {
   public static void main(String[] args) {

      String msg = "안녕하세요";

      System.out.println(msg.toString());
      // charAt()
      System.out.println(msg.charAt(0));
//      try {
//         System.out.println(msg.charAt(10));
//      } catch (StringIndexOutOfBoundsException e) {
//         // TODO Auto-generated catch block
////         e.printStackTrace();
//         System.out.println("인덱스범위 재확인 필요");
//      }

//      int[] numbers = {1, 2, 3};
//      System.out.println(numbers[5]);

      // indexOf()
      System.out.println(msg.indexOf("안"));
      System.out.println(msg.indexOf("h"));

      // split()
      String msg2 = "안!녕!하!세!요!";
      System.out.println(msg2);
      System.out.println(msg2.split(" "));
      String[] ar = msg2.split("!");
      System.out.println(ar[0]);
      System.out.println(ar[1]);
      System.out.println(ar[2]);

      for (String str : ar) {
         System.out.println(str);
      }

      // length()
      System.out.println(msg2.length());
//      System.out.println(msg2.split("!").length());

      // strip()
      String msg3 = "        안녕    하세요 !!    !!          ";
      System.out.println(msg3);
      System.out.println(msg3.strip());

      // substring(start, end) : start부터 end - 1까지
      System.out.println(msg3.length());
      System.out.println(msg3.strip().substring(0, 2));

      // contains()
      System.out.println(msg3.contains("하"));
      System.out.println(msg3.contains("하하"));

   }
}

