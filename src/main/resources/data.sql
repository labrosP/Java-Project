INSERT INTO USER(first_name,last_name,address) VALUES('George','Lukas','Irwwn 32,Xaidari');
INSERT INTO USER(first_name,last_name,address) VALUES('Clint','McFee','Venizelou 44,Kalithea');
INSERT INTO USER(first_name,last_name,address) VALUES('Maria','Papadaki','Irous 109,Menidi');
INSERT INTO USER(first_name,last_name,address) VALUES('Amelie','Sarantou','Sarantaporou 78,Xalandri');
INSERT INTO USER(first_name,last_name,address) VALUES('Chris','Tzanis',null);


INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191723',2,0,'The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. A daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged.','The Lord of the Rings: The Fellowship of the Rin');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191725',5,2,'The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. A daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged.','The Lord of the Rings: The Fellowship of the Rin');
INSERT INTO BOOK(isbn,copies,copies_for_loan,summary,title) VALUES('9788373191783',9,9,'The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. A daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged.','The Lord of the Rings: The Fellowship of the Rin');


INSERT INTO USER_BOOK(user_id,isbn) VALUES(1,'9788373191723');
INSERT INTO USER_BOOK(user_id,isbn) VALUES(4,'9788373191723');

INSERT INTO USER_BOOK(user_id,isbn) VALUES(1,'9788373191725');

INSERT INTO USER_BOOK(user_id,isbn) VALUES(5,'9788373191725');