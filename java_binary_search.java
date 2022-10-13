import java.util.*;
class Main {
  static int binarySearch(int arr[], int arr_size, int search_number) {
    int low = 0, high = arr_size - 1, mid;
    while (low <= high) {
      mid = low + (high - low) / 2;

      if (arr[mid] == search_number)
        return mid;

      if (arr[mid] > search_number)
        high = mid - 1;

      else
        low = mid + 1;
    }

    return -1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of element you want to enter: ");
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    System.out.print("Please enter numbers: ");
    for(int i=0; i<arr_size;i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter number to be searched: ");
    int search_number = sc.nextInt();
    int result = binarySearch(arr, arr_size, search_number);
    if (result == -1)
      System.out.println("Number not present");
    else
      System.out.println("Number is present at position " + (result + 1));
  }
}
