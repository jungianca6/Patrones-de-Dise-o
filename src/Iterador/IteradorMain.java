package Iterador;



import java.util.List;

public class IteradorMain {
    public static void main(String[] args) {
        // Prueba con un arreglo
        List<Integer> array = List.of(1, 2, 3, 4, 5);
        IterableFinal arrayIterable = new ArrayIterable(array);
        Iterador arrayIterator = arrayIterable.createIterator();

        IteratorTester tester = new IteratorTester();
        System.out.println("Array:");
        tester.testIterator(arrayIterator);

        // Prueba con un árbol binario
        TreeNode tree = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, null, null));
        IterableFinal treeIterable = new BinaryTreeIterable(tree);
        Iterador treeIterator = treeIterable.createIterator();

        System.out.println("Binary Tree:");
        tester.testIterator(treeIterator);

        // Prueba con una matriz
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        IterableFinal matrixIterable = new MatrixIterable(matrix);
        Iterador matrixIterator = matrixIterable.createIterator();

        System.out.println("Matrix:");
        tester.testIterator(matrixIterator);

        // Prueba con la nueva estructura
        List<Integer> newData = List.of(10, 11, 12, 13, 14);
        IterableFinal newIterable = new NewStructureIterable(newData);
        Iterador newIterator = newIterable.createIterator();

        System.out.println("New Structure:");
        tester.testIterator(newIterator);
    }
}
