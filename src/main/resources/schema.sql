
CREATE TABLE questions(
            id INTEGER NOT NULL AUTO_INCREMENT,
            question VARCHAR NOT NULL,
            PRIMARY KEY(id));

   CREATE TABLE options(
            id INTEGER NOT NULL AUTO_INCREMENT ,
            correct_answer BOOLEAN not null,
            option VARCHAR not null,
            quiz_id INTEGER NOT NULL,
            FOREIGN KEY  (quiz_id) REFERENCES questions(id),
            PRIMARY KEY(id));

    CREATE TABLE user_answers(
                id INTEGER NOT NULL AUTO_INCREMENT,
                quiz_id INTEGER NOT NULL,
                selected_option INTEGER NOT NULL,
                FOREIGN KEY  (selected_option) REFERENCES options(id),
                FOREIGN KEY  (quiz_id) REFERENCES questions(id),
                PRIMARY KEY(id));
