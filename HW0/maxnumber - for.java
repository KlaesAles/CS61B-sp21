public class ClassNameHere {
    public static int max(int[] m) {
       int m_max = m[0];
       for (int i = 0; i < m.length; i += 1){
          if (m[i] > m_max)
             m_max = m[i];
       }
       return m_max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));
    }
 }