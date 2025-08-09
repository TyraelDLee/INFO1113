package T1;

public class Grade {
    public static void main(String[] args){
        //remember, command line arguments are in <args>!
        double grade = Double.parseDouble(args[0]);
        String gradeString = "";
        if(grade >= 85)
            gradeString = "High Distinction";
        else if (grade >= 75)
            gradeString = "Distinction";
        else if (grade >= 65)
            gradeString = "Credit";
        else if (grade >= 50)
            gradeString = "Pass";
        else
            gradeString = "Fail";
        System.out.println(gradeString);
        /* Also can be written like below:
        * if(grade >= 85)
            gradeString = "High Distinction";
        else if (grade >= 75 && grade < 85)
            gradeString = "Distinction";
        else if (grade >= 65 && grade < 75)
            gradeString = "Credit";
        else if (grade >= 50 && grade < 65)
            gradeString = "Pass";
        else
            gradeString = "Fail";*/
    }
}
