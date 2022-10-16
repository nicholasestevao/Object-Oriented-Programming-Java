
public class teste {
    public static void main(String[] args) {
        MinhaMatrizDinamica mtrz = new MinhaMatrizDinamica(12,8);
        mtrz.getMatriz();
        mtrz.setInsereMatriz(3, 4, 8);
        mtrz.getMatriz();
        mtrz.setPreencheMatriz();
        mtrz.getMatriz();
    }
}
