package com.example.hvorforfunkerdetikke

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Hva heter blobben?",
            R.drawable.ic_kirby,
            "Kirby", "Pichu",
            "Yoshi", "Jigglypuff", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Hvilket spill kommer denne karakteren fra?",
            R.drawable.ic_madeline,
            "Terraria", "Pokémon",
            "Celeste", "Super Mario", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Hvem pokémon er dette?",
            R.drawable.ic_charizard,
            "Charmander", "Charmeleon",
            "Blaziken", "Charizard", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Hvilket spill er denne karakteren fra?",
            R.drawable.ic_bowser,
            "Zelda", "Super Mario",
            "Duck Hunt", "Space Invaders", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Hvilket spill kommer denne karakteren fra?",
            R.drawable.ic_steve,
            "Terraria", "CS:GO",
            "Minecraft", "Rust", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "I hvilket spill ble denne karakteren først introdusert?",
            R.drawable.ic_scuttlebug,
            "Super Mario 64", "Super Mario Sunshine",
            "New Super Mario Bros.", "Super Mario Galaxy", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Hvilket spill kommer denne karakteren fra?",
            R.drawable.ic_pac_man,
            "Mario Bros.", "Mega Man 2",
            "Pac-Man", "Ice Climber", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "Hvilket spill er dette?",
            R.drawable.ic_tetris,
            "Pac-Land", "Space Panic",
            "The Legend of Kage", "Tetris", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Når ble Mario Kart DS lansert?",
            R.drawable.ic_mario_kart,
            "2001", "2005",
            "2007", "2009", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "Er denne appen dårlig?",
            R.drawable.ic_bigshit,
            "Ja", "Kanskje",
            "Nei", "Joe", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}