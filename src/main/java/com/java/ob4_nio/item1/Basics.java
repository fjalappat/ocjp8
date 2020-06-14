package com.java.ob4_nio.item1;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

//Use BufferedReader, BufferedWriter, File, FileReader, FileWriter, FileInputStream,
// FileOutputStream, ObjectOutputStream, ObjectInputStream, and PrintWriter in the java.io.package.
public class Basics {

    public static void main(String[] args) {
//        useBufferedReader();
        float value1 = 102;
        float value2 = (float) 102.00;
        float value3 = (float) (1f * 0.0);
        float value4 = 1f * (short) 0.0;
//        float value5 = 1f * (boolean) 0;

        System.out.println((float) 102.00);
        System.out.println(1f * (short) 0.0);
//        System.out.println(1f * (boolean) 0);
        System.out.println((float) 102.00);
        System.out.println((float) 102.00);

        int[][] arr = { {1,2,4}, {7,5,3,6,7,8}};
        for(int[] a:arr){
            for(int k:a) {
                System.out.print(k+ " ");
            }
            System.out.print("\n");
        }
    }

    private static void useBufferedReader() {
//        Path p = Paths.get("C:\\gitRepos\\ocjp8");
//        System.out.println(p);
        File f = new File("Test.txt");
        try {
//            Files.createLink(Paths.get("C:\\gitRepos\\ocjp8\\link1.lnk"), Paths.get("C:\\gitRepos\\react-and-spring\\finished.png"));
//            System.out.println("file created: "+f.createNewFile());
//            System.out.println("file getAbsolutePath: "+f.getAbsolutePath());
//            System.out.println("file getCanonicalPath: "+f.getCanonicalPath());
//            System.out.println("file getParent: "+f.getParent());
//            System.out.println("file getPath: "+f.getPath());
//            Files.createDirectory(Paths.get("C:\\gitRepos\\ocjp8\\sample"));
            Files.delete(Paths.get("C:\\gitRepos\\ocjp8\\sample"));
//            Path startingDir = Paths.get("C:\\gitRepos\\ocjp8");
//            PrintFiles pf = new PrintFiles();
//            Files.walkFileTree(startingDir, pf);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}

class PrintFiles
        extends SimpleFileVisitor<Path> {

    // Print information about
    // each type of file.
    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attr) throws IOException {
        if (attr.isSymbolicLink()) {
            System.out.format("Symbolic link: %s ", file);
        } else if (attr.isRegularFile()) {
            System.out.format("Regular file: %s ", file);
            String type = Files.probeContentType(file);
            if (type == null) {
                System.err.format("'%s' has an" + " unknown filetype.%n", file.getFileName());
            } else {
                System.out.println("File Type = "+type);
            }
        } else {
            System.out.format("Other: %s ", file);
        }
        System.out.println("(" + attr.size() + "bytes)");
        return FileVisitResult.CONTINUE;
    }

    // Print each directory visited.
    @Override
    public FileVisitResult postVisitDirectory(Path dir,
                                              IOException exc) {
        System.out.format("Directory: %s%n", dir);
        return FileVisitResult.CONTINUE;
    }

    // If there is some error accessing
    // the file, let the user know.
    // If you don't override this method
    // and an error occurs, an IOException
    // is thrown.
    @Override
    public FileVisitResult visitFileFailed(Path file,
                                           IOException exc) {
        System.err.println(exc);
        return FileVisitResult.CONTINUE;
    }
}