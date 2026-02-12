public class GarbageCollection {
    
    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollection obj = new GarbageCollection();

        obj = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
