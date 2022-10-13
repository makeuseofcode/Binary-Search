def binarySearch(arr, arr_size, search_number):
    low = 0
    high = arr_size - 1
    while low <= high:
        mid = low + (high-low)//2
        if arr[mid] == search_number:
            return mid
        elif arr[mid] > search_number:
            high = mid - 1
        else:
            low = mid + 1
    return -1

arr_size = int(input("Enter number of elements: "))
arr=[]
print("Please enter numbers: ", end=" ")
for i in range(0,arr_size):
    arr.append(int(input()))
search_number = int(input("Enter number to be searched: "))
result = binarySearch(arr, arr_size, search_number)

if result == -1:
    print("Number not present")
else:
    print("Number is present at position ", (result + 1))
