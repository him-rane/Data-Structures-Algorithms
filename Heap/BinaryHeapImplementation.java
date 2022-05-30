package Heap;

class MinHeap {
    int[] arr;
    int size;
    int capacity;

    MinHeap(int c) {
        this.capacity = c;
        arr = new int[c];
        size = 0;
    }

    int left(int i) {
        return (2 * i) + 1;
    }

    int right(int i) {
        return (2 * i) + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void insert(int x) {
        if (capacity == size) {
            System.out.println("Heap is fulll");
            return;
        }
        arr[size - 1] = x;
        int i = size - 1;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void heapif(int i) {
        int l = left(i);
        int r = right(i);

        int min = i;

        if (l < size && arr[l] < arr[min]) {
            min = l;
        }
        if (r < size && arr[r] < arr[min]) {
            r = min;
        }

        if (i != min) {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            heapif(min);
        }
    }
}
