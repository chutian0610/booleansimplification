package info.victorchu.simplification;

import info.victorchu.simplification.BooleanMatrixV2.MatrixNode;
import org.junit.Test;

import static info.victorchu.simplification.BooleanMatrixV2.MatrixNode.*;

public class BooleanMatrixV2Test {

    @Test
    public void or() {
        MatrixNode[][] tmp = new MatrixNode[][]{
            {POSITIVE,EMPTY,EMPTY,EMPTY},
            {EMPTY,NEGATIVE,EMPTY,POSITIVE}
        };
        MatrixNode [][] tmp2 = new MatrixNode[][]{
            {POSITIVE,EMPTY,EMPTY,POSITIVE},
            {EMPTY,POSITIVE,EMPTY,POSITIVE}
        };
        BooleanMatrixV2 booleanMatrix1 = new BooleanMatrixV2(2,4,tmp);
        BooleanMatrixV2 booleanMatrix2= new BooleanMatrixV2(2,4,tmp2);
        BooleanMatrixV2 booleanMatrix = booleanMatrix1.or(booleanMatrix2);
        System.out.println(booleanMatrix.print());
        System.out.println(booleanMatrix.simplify().print());
    }

    @Test
    public void or2() {
        MatrixNode[][] tmp = new MatrixNode[][]{
            {POSITIVE,EMPTY,EMPTY,EMPTY},
            {EMPTY,NEGATIVE,EMPTY,POSITIVE}
        };
        MatrixNode [][] tmp2 = new MatrixNode[][]{
            {POSITIVE,EMPTY,EMPTY,POSITIVE},
            {NEGATIVE,EMPTY,EMPTY,POSITIVE}
        };
        BooleanMatrixV2 booleanMatrix1 = new BooleanMatrixV2(2,4,tmp);
        BooleanMatrixV2 booleanMatrix2= new BooleanMatrixV2(2,4,tmp2);
        BooleanMatrixV2 booleanMatrix = booleanMatrix1.or(booleanMatrix2);
        System.out.println(booleanMatrix.print());
        System.out.println(booleanMatrix.simplify().print());
    }

    @Test
    public void and() {
        MatrixNode [][] tmp = new MatrixNode[][]{
            {NEGATIVE,EMPTY,EMPTY,EMPTY},
            {EMPTY,EMPTY,EMPTY,NEGATIVE}
        };
        MatrixNode [][] tmp2 = new MatrixNode[][]{
            {POSITIVE,EMPTY,EMPTY,POSITIVE},
            {EMPTY,POSITIVE,EMPTY,NEGATIVE}
        };
        BooleanMatrixV2 booleanMatrix1 = new BooleanMatrixV2(2,4,tmp);
        BooleanMatrixV2 booleanMatrix2= new BooleanMatrixV2(2,4,tmp2);
        BooleanMatrixV2 booleanMatrix = booleanMatrix1.and(booleanMatrix2);
        System.out.println(booleanMatrix.print());
        System.out.println(booleanMatrix.simplify().print());
    }

    @Test
    public void simplify() {
        MatrixNode [][] tmp = new MatrixNode[][]{
            {NEGATIVE,EMPTY,EMPTY},
            {EMPTY,MUTEX,EMPTY},
            {NEGATIVE,EMPTY,NEGATIVE},
            {POSITIVE,EMPTY,EMPTY},
            {EMPTY,EMPTY,POSITIVE},
            {EMPTY,EMPTY,NEGATIVE}
        };
        BooleanMatrixV2 booleanMatrix = new BooleanMatrixV2(6,3,tmp);
        System.out.println(booleanMatrix.print());
        booleanMatrix = booleanMatrix.simplify();
        System.out.println(booleanMatrix.print());
    }
}