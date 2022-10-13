#include <stdio.h>

int binarySearch(int arr[], int arr_size, int search_number) {

  int low =0, high = arr_size - 1, mid;
  
  while (low <= high) {
    mid = (low + (high - low))/2;
    if (arr[mid] == search_number)
      return mid;
    else if (arr[mid] > search_number)
      high = mid - 1;
    else
      low = mid + 1;
  }
  return -1;
}

int main() {
 int arr[100], i, arr_size, search_number;
  printf("Enter number of elements: ");
  scanf("%d", &arr_size);
  printf("Please enter numbers: ");
  
  for(i=0;i<arr_size;i++){
    scanf("%d", &arr[i]);
  }
  
  printf("Enter number to be searched: ");
  scanf("%d", &search_number);
  i = binarySearch(arr, arr_size, search_number);
  if(i==-1)
  printf("Number not present");
  else
  printf("Number is present at position %d", i + 1);
  return 0;
}
