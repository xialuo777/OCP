package ocp1Z0_829.question46;

final class Folder implements AutoCloseable {
    public void open(){
        System.out.println("open");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
