public class Maiin {
      public static void main(String args[]){
            String s = "what";
            StringBuffer sb = new StringBuffer("what");
            System.out.print(sb.equals(s)+","+s.equals(sb));
      }
}