package ocp1Z0_829.question33;

public enum Desig {
    CEO('A'),
    CMO('B'),
    CTO('C'),
    CFO('D');
    char c;
    private Desig(char c) {
        this.c = c;
    }
}
