
package fr.epita.quiz.services.business;

import javax.inject.Inject;
import javax.sql.DataSource;

import fr.epita.quiz.services.dao.AnswerDAO;
import fr.epita.quiz.services.dao.QuestionDAO;



public class ExamDataService {	
	@Inject
	QuestionDAO questionDAO;
	
	@Inject
	AnswerDAO answerDAO;
	
	@Inject
	DataSource ds;
	

		

	
	//public answerToMCQ(User user, MCQQuestion mcq, List<MCQChoices> choices);
	

}
