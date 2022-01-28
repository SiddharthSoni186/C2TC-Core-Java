package Arrays;


		public class Index {
		       public static int  findIndex (int[] my_array, int t) {
		        if (my_array == null) return -1;
		        int len = my_array.length;
		        int num = 0;
		        while (num < len) {
		            if (my_array[num] == t) return num;
		            else num=num+1;
		        }
		        return -1;
		    }
		    public static void main(String[] args) {
		      int[] my_array = {18, 24, 66, 10, 33, 66, 88, 16, 22, 36};
		      System.out.println("Index position of 33 is: " + findIndex(my_array, 33));
		      System.out.println("Index position of 36 is: " + findIndex(my_array, 36));
		       }
		}
	
