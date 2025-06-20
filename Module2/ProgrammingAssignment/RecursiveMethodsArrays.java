package Module2.ProgrammingAssignment;

public class RecursiveMethodsArrays{

  public static void main(String[] args){
    int[] arr={2, 4, 3, 89, 0, -9};
    System.out.println(smallest(arr));
    int[][] ar={{1, 2, 3, 4, 1, 0},{0, -8, -90}};
    System.out.println(smallest(ar));
    System.out.println(repeat(args[0], Integer.parseInt(args[1])));
  }
    
  public static int smallest(int[] arr){
    int i;
    if (arr.length == 1) {
      return arr[0];
    }

    int[] rest = new int[arr.length - 1];
    for (i = 0; i < rest.length; i++) {
      rest[i] = arr[i + 1];
    }

    return Math.min(arr[0], smallest(rest));
  }
       
  public static int smallest(int[][] arr){
    if (arr.length == 1) {
      return smallest(arr[0]);
    }

    int[][] rest = new int[arr.length - 1][];
    System.arraycopy(arr, 1, rest, 0, arr.length-1);
    return Math.min(smallest(arr[0]), smallest(rest));
  }

  public static String repeat(String s, int n){
    if (n <= 0) {
      return "";
    } else {
      return s + repeat(s, n - 1);
    }
  }
}