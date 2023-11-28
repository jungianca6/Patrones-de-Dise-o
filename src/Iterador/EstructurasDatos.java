package Iterador;



import java.util.ArrayList;
import java.util.List;

class ArrayIterator implements Iterador {
    private List<Integer> data;
    private int index;

    public ArrayIterator(List<Integer> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public Object next() {
        if (hasNext()) {
            int value = data.get(index);
            index++;
            return value;
        } else {
            throw new IndexOutOfBoundsException("Iterator out of bounds");
        }
    }
}

// -------------------------------------------------------
// Implementación de Iterator para árbol binario
class BinaryTreeIterator implements Iterador {
    private List<TreeNode> stack;
    private TreeNode current;

    public BinaryTreeIterator(TreeNode root) {
        this.stack = new ArrayList<>();
        this.current = root;
        populateStack();
    }

    private void populateStack() {
        while (current != null) {
            stack.add(current);
            current = current.left;
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public Object next() {
        if (hasNext()) {
            TreeNode node = stack.remove(stack.size() - 1);
            current = node.right;
            populateStack();
            return node.value;
        } else {
            throw new IndexOutOfBoundsException("Iterator out of bounds");
        }
    }
}

// -------------------------------------------------------
// Implementación de Iterator para matriz
class MatrixIterator implements Iterador {
    private int[][] matrix;
    private int rows, cols;
    private int currentRow, currentCol;

    public MatrixIterator(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.currentRow = this.currentCol = 0;
    }

    public boolean hasNext() {
        return currentRow < rows && currentCol < cols;
    }

    public Object next() {
        if (hasNext()) {
            int value = matrix[currentRow][currentCol];
            currentCol++;
            if (currentCol == cols) {
                currentCol = 0;
                currentRow++;
            }
            return value;
        } else {
            throw new IndexOutOfBoundsException("Iterator out of bounds");
        }
    }
}

// -------------------------------------------------------
// Clase para probar el Iterator
class IteratorTester {
    void testIterator(Iterador iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

// -------------------------------------------------------
// Clase de ejemplo para árbol binario
class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

// -------------------------------------------------------
// Implementación de Iterable para lista
class ArrayIterable implements IterableFinal {
    private List<Integer> data;

    public ArrayIterable(List<Integer> data) {
        this.data = data;
    }

    public Iterador createIterator() {
        return new ArrayIterator(data);
    }
}

// -------------------------------------------------------
// Implementación de Iterable para árbol binario
class BinaryTreeIterable implements IterableFinal {
    private TreeNode root;

    public BinaryTreeIterable(TreeNode root) {
        this.root = root;
    }

    public Iterador createIterator() {
        return new BinaryTreeIterator(root);
    }
}

// -------------------------------------------------------
// Implementación de Iterable para matriz
class MatrixIterable implements IterableFinal {
    private int[][] matrix;

    public MatrixIterable(int[][] matrix) {
        this.matrix = matrix;
    }

    public Iterador createIterator() {
        return new MatrixIterator(matrix);
    }
}

// -------------------------------------------------------
// Nueva estructura (ejemplo)
// Aquí puede reemplazar la estructura que le da el profesor

class NewStructureIterable implements IterableFinal {
    private List<Integer> data;

    public NewStructureIterable(List<Integer> data) {
        this.data = data;
    }
    public Iterador createIterator() {
        return new NewStructureIterator(data);
    }

    // Agrega los métodos de recorrido e impresión específicos de la nueva estructura
    void customTraversalMethod() {
        // Implementación específica de recorrido
    }

    void customPrintMethod() {
        // Implementación específica de impresión
    }
}

class NewStructureIterator implements Iterador {
    private List<Integer> data;
    private int index;

    public NewStructureIterator(List<Integer> data) {
        this.data = data;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < data.size();
    }

    public Object next() {
        if (hasNext()) {
            int value = data.get(index);
            index++;
            return value;
        } else {
            throw new IndexOutOfBoundsException("Iterator out of bounds");
        }
    }
}
