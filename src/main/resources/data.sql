INSERT INTO book (idb, author, publisher, title, category, publication_year) VALUES (1, 'Sienkiewicz', 'PWN', 'Latarnik', 'powiesc', 2015);
INSERT INTO book (idb, author, publisher, title, category, publication_year) VALUES (2, 'Augustyn', 'WAM', 'Wyznania', 'religia', 2001);
INSERT INTO book (idb, author, publisher, title, category, publication_year) VALUES (3, 'Staff', 'PWN', 'Wiersze wybrane', 'poezja', 1997);
INSERT INTO book (idb, author, publisher, title, category, publication_year) VALUES (4, 'Socci', 'PWN', 'Tajemnice Jana Pawla II', 'religia', 2005);
INSERT INTO person (idp, first_name, last_name) VALUES (1, 'Jan', 'Kowalski');
INSERT INTO person (idp, first_name, last_name) VALUES (2, 'Marek', 'Nowak');
INSERT INTO person (idp, first_name, last_name) VALUES (3, 'Zosia', 'Zaremba');
INSERT INTO person (idp, first_name, last_name) VALUES (4, 'Ala', 'Krokus');
INSERT INTO person (idp, first_name, last_name) VALUES (5, 'Piotrek', 'Kowalski');
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (1, 20180412, 1,1, false);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (2, 20180105, 1,3, true);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (3, 20180612, 2,1, false);

