package info.victorchu.simplification;

import org.junit.Test;

public class BooleanMatrixTest {

    @Test
    public void or(){
        int [][] tmp = new int[][]{
                {1,0,0,0},{0,0,0,1},{1,0,1,1}
        };
        int [][] tmp2 = new int[][]{
                {1,0,0,1},{0,1,0,0},{1,0,1,0}
        };
        BooleanMatrix booleanMatrix1 = new BooleanMatrix(3,4,tmp);
        BooleanMatrix booleanMatrix2= new BooleanMatrix(3,4,tmp2);
        BooleanMatrix booleanMatrix = booleanMatrix1.or(booleanMatrix2);
        System.out.println(booleanMatrix.print());
        System.out.println(booleanMatrix.simplify().print());

    }

    @Test
    public void simplify() {
        int [][] tmp = new int[][]{
                {1,0,0},{0,1,0},{1,0,1}
        };
        BooleanMatrix booleanMatrix = new BooleanMatrix(3,3,tmp);
        System.out.println(booleanMatrix.print());
        booleanMatrix = booleanMatrix.simplify();
        System.out.println(booleanMatrix.print());
    }

    @Test
    public void and() {
        int [][] tmp = new int[][]{
                {1,0,0,0},{0,0,0,1},{1,0,1,1}
        };
        int [][] tmp2 = new int[][]{
                {1,0,0,1},{0,1,0,0},{1,0,1,0}
        };
        BooleanMatrix booleanMatrix1 = new BooleanMatrix(3,4,tmp);
        BooleanMatrix booleanMatrix2= new BooleanMatrix(3,4,tmp2);
        BooleanMatrix booleanMatrix = booleanMatrix1.and(booleanMatrix2);
        System.out.println(booleanMatrix.print());
        System.out.println(booleanMatrix.simplify().print());
    }
}