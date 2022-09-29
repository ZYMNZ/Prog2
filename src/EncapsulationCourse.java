public class EncapsulationCourse {
    public static void main(String[] args) {
        class Course {
            private String code;
            private String description;
            private int numberOfCredits;

            public Course(String code, String description, int numberOfCredits) {
                this.code = code;
                this.description = description;
                this.numberOfCredits = numberOfCredits;
            }

            public void getCode() {
                System.out.println( "Course code: " + code);
            }

            public void setCode(String code) {
                if(code.matches("[A-Za-z]+") == true && code != null){
                    this.code = code;
                }
            }

            public void getDescription() {
                System.out.println( "Course description: " + description);
            }

            public void setDescription(String description) {
                if(description.matches("[A-Za-z]+") == true && description != null){
                    this.description = description;
                }
            }

            public void getNumberOfCredits() {
                System.out.println( "Course number of credits: " + numberOfCredits);
            }

            public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
            }
        }
    }
}
