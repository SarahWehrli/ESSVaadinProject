package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The QuestionManager is the central entry point for you to get the list of questions.
 * It is implemented as a Singleton so you can get the single instance of QuestionManager from every point in your application.
 */
public class QuestionsManager {

    private static QuestionsManager qmInstance;

    private QuestionsManager() {

    }

    public static QuestionsManager getInstance() {
        if (qmInstance == null) {
            qmInstance = new QuestionsManager();
        }
        return qmInstance;
    }


    // This is the method that loads the questions from the text file. Feel free to add more questions.
    public List<Question> loadQuestions() throws IOException {

        List<Question> questions = new ArrayList<Question>();

        int i = 1;
        InputStream resource = this.getClass().getResourceAsStream("/questions.txt");
        try (InputStreamReader isr = new InputStreamReader(resource);
             BufferedReader br = new BufferedReader(isr);)
        {
            String line;
            while ((line = br.readLine()) != null) {
                Question q = new Question(i, line);
                questions.add(q);
                i++;
            }
            resource.close();
        }

        return questions;
    }

}
