import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class file {
    Scanner scan = new Scanner(System.in);
    public void createFolder() {
        try {
            //FileWriter folderWriter = new FileWriter("C:\\Users\\yaman\\OneDrive\\Desktop\\mainfile");
            System.out.println("");
            File folder = new File("C:\\Users\\yaman\\OneDrive\\Desktop\\mainfile");
            if (folder.mkdir()){
                System.out.println("Folder created ");
            }else {
                System.out.println("already exists");
            }
            throw new Exception();
        }catch (Exception e){
            System.out.println("An error occurred");
        }

    }


    public void createFile() {
        try{
            System.out.println("in what folder: ");

            File file = new File("C:\\Users\\yaman\\OneDrive\\Desktop\\mainfolder\\fileOne");
            if (file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("file already there la");
            }




        }catch (IOException e){
            System.out.println("An error occurred");
        }

    }


    public void writeFile() {
        FileWriter file;
    }


    public void showFillInfo() {
        try {
            Scanner scan = new Scanner(System.in);
            
            File file = new File("C:\\Users\\yaman\\\\OneDrive\\Desktop\\mainfile");
            Scanner sc = new Scanner(file);

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }


        }catch (IOException e){
            System.out.println("An error occurred");
        }
    }


    public void deleteFile() {


    }


    public void deleteFolder() {
        File folder = new File("C:\\Users\\yaman\\OneDrive\\Desktop\\mainfile");
        if(folder.delete()){
            System.out.println("Folder deleted ");
        }else{
            System.out.println("Folder cant be deleted");
        }
    }
}

class driver{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Menu");
            System.out.print("1- Create a folder");
            System.out.print("2- Create a file");
            System.out.print("3- write the file");
            System.out.print("4- show all info");
            System.out.print("5- delete file");
            System.out.print("6- delete folder");
            System.out.print("7- Exit");




        }
    }
}
















