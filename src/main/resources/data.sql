INSERT INTO USER(first_name,last_name,address) VALUES('George','Lukas','Irwwn 32,Xaidari');
INSERT INTO USER(first_name,last_name,address) VALUES('Clint','McFee','Venizelou 44,Kalithea');
INSERT INTO USER(first_name,last_name,address) VALUES('Maria','Papadaki','Irous 109,Menidi');
INSERT INTO USER(first_name,last_name,address) VALUES('Amelie','Sarantou','Sarantaporou 78,Xalandri');
INSERT INTO USER(first_name,last_name,address) VALUES('Chris','Tzanis',null);
INSERT INTO USER(first_name,last_name,address) VALUES('Maria','Makantasi','Nea Ionia');
INSERT INTO USER(first_name,last_name,address) VALUES('George','Giotis','Kifisia');



INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191723',2,0,'The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. A daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged.','The Lord of the Rings: The Fellowship of the Ring');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191725',5,3,'','The Lord of the Rings: The Two Towers');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191783',9,9,'','The Lord of the Rings: The Return of the King');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-45783-08',3,3,'This is a book of Albert Camus','The Stranger');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-45783-09',2,1,'Gerorge Orwell wrote that book.','1984');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-45883-07',4,4,'','The snowman');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-56789-08',2,2,'Animal Farm is an allegorical novella by George Orwell, first published in England on 17 August 1945. The book tells the story of a group of farm animals who rebel against their human farmer, hoping to create a society where the animals can be equal, free, and happy','Animal farm');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('978-34-54678-01',7,6,'','Harry Potter: The Philosophers Stone');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-02',8,8,'','Harry Potter: The Chamber of Secrets');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-03',4,4,'','Harry Potter: The Prisoner of Azkaban');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-04',4,3,'','Harry Potter: The Goblet of Fire');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-05',4,4,'','Harry Potter: The Order of the Phoenix');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-06',4,4,'','Harry Potter: The Half-Blood Prince');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('979-34-54678-07',4,4,'','Harry Potter: The Deathly Hallows');

INSERT INTO USER_BOOK(user_id,isbn) VALUES(1,'9788373191723');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(4,'9788373191723');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(1,'9788373191725');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(5,'9788373191725');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(7,'979-34-45783-09');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(7,'978-34-54678-01');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(5,'979-34-54678-04');
