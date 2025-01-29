class Exam {
    private String message;
    private double price;
    private boolean status;

    public Exam() {
        this.message = "Good luck";
    }

    public Exam(String period, String level) {
    }

    public double getPrice() {
        return price;
    }

    public boolean isFinished() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

class Midterm extends Exam {
    public Midterm() {
        super();
        System.out.println("Exam has started.");
    }
}

class Essay extends Midterm {
}

class Quiz {
}

class EssayQuiz extends Quiz {
}

public class MidtermExam {
    public static void main(String[] args) {
        Exam exam = new Exam();
        System.out.println("Message from Exam: " + exam.getMessage());

        Midterm midterm = new Midterm();

        Essay essay = new Essay();
        System.out.println("Essay object created successfully.");

        EssayQuiz essayQuiz = new EssayQuiz();
        System.out.println("EssayQuiz object created successfully.");
    }
}
