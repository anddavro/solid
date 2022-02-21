package isp.good;

public class exportPDF {
    public void exportPDFException() { // estamos obligados a implementarlo aunque no nos haga falta
        throw new UnsupportedOperationException();
    }
    public void exportPDF() {
        System.out.println("Im PDF!");
    }
}
