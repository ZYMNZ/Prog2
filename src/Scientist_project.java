import java.util.*;

class Scientist {
    String Sci_No;
    String Sci_Name;
    ArrayList<String> Proj_No;

    public Scientist(String sci_No, String sci_Name, String proj_No) {
        Sci_No = sci_No;
        Sci_Name = sci_Name;
        Proj_No = new ArrayList<>();
    }

    public String getSci_No() {
        return this.Sci_No;
    }

    public void setSci_No(String sci_No) {
        Sci_No = sci_No;
    }

    public String getSci_Name() {
        return this.Sci_Name;
    }

    public void setSci_Name(String sci_Name) {
        Sci_Name = sci_Name;
    }

    public ArrayList<String> getProj_No() {
        return this.Proj_No;
    }

    public void setProj_No(ArrayList<String> proj_No) {
        Proj_No = proj_No;
    }

    public String toString() {
        return "Scientist{" +
            " Sci_No='" + getSci_No() + "'" +
            ", Sci_Name='" + getSci_Name() + "'" +
            ", Proj_No='" + getProj_No() + "'" +
            "}";
    }
}

class Project {
    String Proj_No;
    String Proj_Name;


    public Project(String proj_No, String proj_Name) {
        Proj_No = proj_No;
        Proj_Name = proj_Name;
    }

    public String getProj_No() {
        return this.Proj_No;
    }

    public void setProj_No(String proj_No) {
        Proj_No = proj_No;
    }

    public String getProj_Name() {
        return this.Proj_Name;
    }

    public void setProj_Name(String proj_Name) {
        Proj_Name = proj_Name;
    }

    public String toString() {
        return "Project{" +
            " Proj_No='" + getProj_No() + "'" +
            ", Proj_Name='" + getProj_Name() + "'" +
            "}";
    }
}


public class Scientist_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Scientist> sci = new ArrayList<Scientist>();
        ArrayList<Project> pr = new ArrayList<Project>();
        ArrayList<String> sci_proj = new ArrayList<String>();
        boolean flag = true;
        while (flag) {
            System.out.println("menu");
            System.out.println("1. add project");
            System.out.println("2. add scientist");
            System.out.println("3. show info");
            System.out.println("4. show info based on scientist name");
            System.out.println("5. delete project");
            System.out.println("6. delete scientist");
            System.out.println("7. exit");
            System.out.println("enter your choice");
            int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter project number");
                        String proj_No = sc.next();
                        boolean f = true;
                        while (f) {
                            if (pr.size() == 0) {
                                f = false;
                            } else {
                                for (int i = 0; i < pr.size(); i++) {
                                    if (pr.get(i).Proj_No.equals(proj_No)) {
                                        System.out.println("project number already exists");
                                        System.out.println("enter project number");
                                        proj_No = sc.next();
                                        break;
                                    } else {
                                        f = false;
                                    }
                                }
                            }
                        }

                        System.out.println("enter project name");
                        String proj_Name = sc.next();
                        //needs to be checked if it is unique(while loop) to be continued
                        while (f) {
                            if (pr.size() == 0) {
                                f = false;
                            } else {
                                for (int i = 0; i < pr.size(); i++) {
                                    if (pr.get(i).Proj_Name.equals(proj_Name)) {
                                        System.out.println("project name already exists");
                                        System.out.println("enter project name");
                                        proj_Name = sc.next();
                                        break;
                                    } else {
                                        f = false;
                                    }
                                }
                            }
                        }

                        Project p = new Project(proj_No, proj_Name);
                        pr.add(p);
                        break;
                    case 2:
                        System.out.println("enter scientist number");
                        String sci_No = sc.next();
                        boolean f1 = true;
                        while(f1) {
                            if (sci.size() == 0) {
                                f1 = false;
                            } else {
                                for (int i = 0; i < sci.size(); i++) {
                                    if (sci.get(i).Sci_No.equals(sci_No)) {
                                        System.out.println("scientist number already exists");
                                        System.out.println("enter scientist number");
                                        sci_No = sc.next();
                                        break;
                                    } else {
                                        f1= false;
                                    }
                                }
                            }
                        }
                        System.out.println("enter scientist name");
                        String sci_Name = sc.next();

                        System.out.println("enter number of projects");
                        int numOfProj = sc.nextInt();
                        //check if number of projects is less than the size of the project arraylist
                        while (numOfProj > pr.size()) {
                            System.out.println("number of projects is greater than the number of projects");
                            System.out.println("enter number of projects");
                            numOfProj = sc.nextInt();
                        }
                        boolean f2 = true;

                        for (int i = 0; i < numOfProj; i++) {
                            System.out.println("enter project number");
                            String proj_No1 = sc.next();

                          //check if the project number exists
                            while (f2) {
                                if (pr.size() == 0) {
                                    System.out.println("project number does not exist");
                                    System.out.println("enter project number");
                                    proj_No1 = sc.next();
                                } else {
                                    for (int j = 0; j < pr.size(); j++) {
                                        if (pr.get(j).Proj_No.equals(proj_No1)) {
                                            f2 = false;
                                            break;
                                        } else {
                                            System.out.println("project number does not exist");
                                            System.out.println("enter project number");
                                            proj_No1 = sc.next();
                                        }
                                    }
                                }
                            }
                            sci_proj.add(proj_No1);
                        }



                        Scientist s = new Scientist(sci_No, sci_Name, sci_proj.toString());
                        sci.add(s);
                        break;
                    case 3:
                        if (sci.isEmpty()){
                            System.out.println("Scientists list is empty.");
                        }

                        if (pr.isEmpty()) {
                            System.out.println("Projects list is empty.");
                        }

                        for (int i = 0; i < sci.size(); i++) {
                            System.out.println(sci.get(i));
                            for (int j = 0; j < sci.get(i).getProj_No().size(); j++) {
                                for (int k = 0; k < pr.size(); k++) {
                                    if (sci.get(i).getProj_No().get(j).equals(pr.get(k).getProj_No())) {
                                        System.out.println(pr.get(k).getProj_Name() + ", ");
                                    }
                                }
                            }
                            System.out.println();
                        }
                        for (Project project : pr) {
                                System.out.println("project name: " + project.Proj_Name + " " + project.Proj_No );
                        }


                        break;
                    case 4:
                        boolean f3 = true;
                        if (sci.isEmpty()){
                            System.out.println("Scientists list is empty.");
                        }
                        else {
                            System.out.println("enter scientist name u want to search");
                            String sci_Name1 = sc.next();

                            System.out.println();
                            for (int i = 0; i < sci.size(); i++) {
                                if (sci_Name1.equalsIgnoreCase(sci.get(i).getSci_Name())) {
                                    System.out.print(sci.get(i));
                                    for (int j = 0; j < sci.get(i).getProj_No().size(); j++) {
                                        for (int k = 0; k < pr.size(); k++) {
                                            if (sci.get(i).getProj_No().get(j).equalsIgnoreCase(pr.get(k).getProj_No())) {
                                                System.out.println(pr.get(k).getProj_Name() + ", ");
                                                f3 = true;
                                            }
                                        }
                                    }
                                }
                            }
                            if (f3 == false) {
                                System.out.println("scientist name does not exist");
                            }
                        }

                        break;
                    case 5:

                        if (pr.isEmpty()) {
                            System.out.println("Projects list is empty.");

                        } else {
                            System.out.println("enter project number");
                            String proj_No2 = sc.next();
                            if (proj_No2.equals(sci_proj)) {
                                System.out.println("Deletion not possible. Integrity constraint violation.");
                            } else {
                                for (int i = 0; i < pr.size(); i++) {
                                    if (pr.get(i).Proj_No.equals(proj_No2)) {
                                        pr.remove(i);
                                        System.out.println("project deleted");
                                    }
                                }
                            }
                        }

                        break;
                    case 6:
                        if(sci.isEmpty()){
                            System.out.println("Scientists list is empty.");
                        }
                        else {
                            System.out.println("enter scientist number");
                            String sci_No1 = sc.next();
                            for (int i = 0; i < sci.size(); i++) {
                                if (sci.get(i).Sci_No.equals(sci_No1)) {
                                    sci.remove(i);
                                    System.out.println("scientist deleted");
                                }
                            }
                        }

                        break;
                    case 7:
                        flag = false;
                        break;

                }



        }
    }
}

