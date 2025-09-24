class SpecialQueue {

    private Queue<Integer> queue;      // normal queue
    private Deque<Integer> minDeque;   // keep track of minimum
    private Deque<Integer> maxDeque;   // keep track of maximum

    public SpecialQueue() {
        queue = new LinkedList<>();
        minDeque = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }

    public void enqueue(int x) {
        queue.add(x);

        // Maintain minDeque
        while (!minDeque.isEmpty() && minDeque.peekLast() > x) {
            minDeque.pollLast();
        }
        minDeque.addLast(x);

        // Maintain maxDeque
        while (!maxDeque.isEmpty() && maxDeque.peekLast() < x) {
            maxDeque.pollLast();
        }
        maxDeque.addLast(x);
    }

    public void dequeue() {
        if (queue.isEmpty()) return;

        int removed = queue.poll();

        // Remove from minDeque if necessary
        if (!minDeque.isEmpty() && minDeque.peekFirst() == removed) {
            minDeque.pollFirst();
        }

        // Remove from maxDeque if necessary
        if (!maxDeque.isEmpty() && maxDeque.peekFirst() == removed) {
            maxDeque.pollFirst();
        }
    }

    public int getFront() {
        return queue.peek();
    }

    public int getMin() {
        return minDeque.peekFirst();
    }

    public int getMax() {
        return maxDeque.peekFirst();
    }


}