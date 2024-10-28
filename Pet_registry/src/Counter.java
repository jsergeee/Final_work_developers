class Counter implements AutoCloseable {
    private int count;
    private boolean isUsed;

    public Counter() {
        this.count = 0;
        this.isUsed = false;
    }

    public void add() {
        count++;
        isUsed = true; // Отмечаем, что объект использован
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception {
        if (!isUsed) {
            throw new Exception("Counter was not used properly.");
        }
    }
}