public class GFG_ImplementQueueArray {
    
}
// https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
class myQueue {

    int rear; // last pointer
    int front; // first pointer
    int capacity; // length
    int[] arr;
    int size;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        rear = -1; 
        front = 0; 
        capacity = n;
        arr = new int[n];
        size = 0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        return size==capacity;
    }

    public void enqueue(int x) {
        // Enqueue - push - insert - offer - add
        if(isFull()){
            return;
        }
        rear = (rear + 1)%capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        // Dequeue - pop - removeLast
        if(isEmpty()){
            return;
        }
        front = (front + 1)%capacity;
        
        size--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
}
