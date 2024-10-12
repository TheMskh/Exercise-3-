def find_local_maxima(arr):
    n = len(arr)
    
    # First element
    if n > 1 and arr[0] > arr[1]:
        print(arr[0], end=" ")
    
    # Middle elements
    for i in range(1, n - 1):
        if arr[i] > arr[i - 1] and arr[i] > arr[i + 1]:
            print(arr[i], end=" ")
    
    # Last element
    if n > 1 and arr[n - 1] > arr[n - 2]:
        print(arr[n - 1], end=" ")
    print()

arr = [2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8]
find_local_maxima(arr)
