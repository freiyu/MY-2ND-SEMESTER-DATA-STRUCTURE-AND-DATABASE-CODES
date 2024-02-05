public class Main {
    public static void main(String[] args) {

       System.out.println("============================");
       System.out.println("Create:");
       Array array = new Array(1);
       array.printArray();
       System.out.println("============================");

       System.out.println("Append:");
       array.append(2);
       array.printArray();
       array.append(3);
       array.printArray();
       array.append(4);
       array.printArray();
       System.out.println("============================");

       System.out.println("Prepend:");
       array.append(6);
       array.printArray();
       array.append(7);
       array.printArray();
       array.append(8);
       array.printArray();
       System.out.println("============================");

       System.out.println("Remove First:");
       array.removeFirst();
       array.printArray();
       array.removeFirst();
       array.printArray();
       System.out.println("============================");

       System.out.println("Remove Last:");
       array.removeLast();
       array.printArray();
       array.removeLast();
       array.printArray();
       System.out.println("============================");

       System.out.println("Get Node By Index:");
       System.out.println("Array Index of 1: " + array.get(1));
       array.printArray();
       System.out.println("Array Index of 2: " + array.get(2));
       array.printArray();
       System.out.println("Array Index of 3: " + array.get(3));
       array.printArray();
       System.out.println("============================");

       System.out.println("Add Node By Index:");
       array.insert(1, 1);
       array.printArray();
       array.insert(3, 2);
       array.printArray();
       System.out.println("============================");


       System.out.println("Remove Node By Index:");
       array.printArray();
       System.out.println("Removed node (Index : 1): " +  array.remove(1));
       array.printArray();
       System.out.println("Removed node (Index : 2): " +  array.remove(2));
       array.printArray();
       System.out.println("============================");

       System.out.println("Reverse Array:");
       System.out.println("Before Reversed");
       array.printArray();
       System.out.println("After Reversed");
       array.reverse();
       array.printArray();
       System.out.println("============================");

    }
}
