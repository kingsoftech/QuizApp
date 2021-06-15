package com.example.quizapp
object Constants{
    const val USER_NAME:String = "User_name"
    const val TOTAL_QUESTION:String = "total_questions"
    const val CORRECT_ANSWER:String = "correct_answer"
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()



        val question1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)
        questionList.add(question1)
        val question2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            2)
        questionList.add(question2)
        val question3= Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Bulgaria",
            "Burundi",
            "Bahamas",
            1)
        questionList.add(question3)
        val question4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belgium",
            "Bulgaria",
            "Brazil",
            "Belize",
            3)
        questionList.add(question4)
        val question5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Dabur",
            "Dallas",
            "Gabon",
            1)
        questionList.add(question5)
        val question6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon",
            "Finland",
            "France",
            "Fiji",
            4)
        questionList.add(question6)
        val question7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Gabon",
            "Germany",
            "Gombe",
            "Austria",
            2)

        questionList.add(question7)
        val question8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Australia",
            "Armenia",
            "Austria",
            1)
        questionList.add(question8)
        val question9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Qatar",
            "kuwait",
            "UAE",
            "Saudi Arabia",
            2)
        questionList.add(question2)
        val question10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "England",
            "Netherland",
            "New Zealand",
            "Russia",
            3)
        questionList.add(question10)
        return questionList
    }
}