package structural.composite.pattern;

/**
 * ----------
 * Step 4
 * ----------
 * Demonstrates the usage of the Composite Pattern with File and Folder components.
 */
public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.csv");
        File file3 = new File("file3.pdf");
        File file4 = new File("file4.png");

        Folder folder1 = new Folder("Folder 1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Folder 2");
        folder2.add(file3);

        Folder folder3 = new Folder("Folder 3");
        folder3.add(file4);
        folder3.add(folder1);

        Folder root = new Folder("/");
        root.add(folder2);
        root.add(folder3);

        root.showDetails("");

        /*
        * Result:
        *
        * + Folder: /
        *  + Folder: Folder 2
        *   - File: file3.pdf
        * + Folder: Folder 3
        *  - File: file4.png
        *  + Folder: Folder 1
        *    - File: file1.txt
        *    - File: file2.csv
        * */
    }
}
