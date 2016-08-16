
-- Inserting questions into the question table--------

INSERT INTO questions
            (question)
            VALUES('To prance or jump around excitedly');

INSERT INTO  questions
            (question)
            VALUES('To increase in size or intensity');

INSERT INTO questions
            (question)
            VALUES('Mediocre or ordinary');

INSERT INTO questions
            (question)
            VALUES('Narrow and rigid in opinion');

INSERT INTO questions
            (question)
            VALUES('To emmit a harsh, grating sound');

--Inserting answer choices into the options table----

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('cavort', 1, true);

INSERT INTO options
              (option, quiz_id, correct_answer)
              VALUES('obsolesence', 1, false);

INSERT INTO options
            (option, quiz_id, correct_answer)
            VALUES('definiens', 1, false);

INSERT INTO options
            (option, quiz_id, correct_answer)
            VALUES('shivaree', 1, false);

INSERT INTO options
            (option, quiz_id, correct_answer)
             VALUES('telesthesia', 2, false);

INSERT INTO options
            (option, quiz_id, correct_answer)
             VALUES('aggrandize', 2, true);

INSERT INTO options
            (option, quiz_id, correct_answer)
             VALUES('oxter', 2, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('agog', 2, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('gainsay', 3, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('middling', 3, true);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('moonbow', 3, false);


INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('quidnunc', 3, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('blithe', 4, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('cynosure', 4, false);

INSERT INTO options
             (option, quiz_id, correct_answer)
              VALUES('syzygy', 4, false);

INSERT INTO options
              (option, quiz_id, correct_answer)
               VALUES('hidebound', 4, true);

INSERT INTO options
              (option, quiz_id, correct_answer)
               VALUES('scroop', 5, true);

INSERT INTO options
              (option, quiz_id, correct_answer)
               VALUES('bucolic', 5, false);

INSERT INTO options
              (option, quiz_id, correct_answer)
               VALUES('pifle', 5, false);

INSERT INTO options
              (option, quiz_id, correct_answer)
               VALUES('aver', 5, false);