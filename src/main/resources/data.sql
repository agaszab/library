INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (1, 'Henryk Sienkiewicz', 'PWN', 'Latarnik', 'powiesc', 2015, 'Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.');
INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (2, 'Augustyn', 'WAM', 'Wyznania', 'religia', 2001, 'Java to język programowania, którego warto się nauczyć. To technologia nowoczesna i użyteczna, a jej możliwości doceniają nawet największe firmy z całego świata. ');
INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (3, 'Leopold Staff', 'PWN', 'Wiersze wybrane', 'poezja', 1997, 'Ta książka to bardzo przystępny, zwięzły podręcznik składający się z 24 godzinnych lekcji. Jej celem jest nauka programowania w języku Java od podstaw. ');
INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (4, 'Socci', 'PWN', 'Tajemnice Jana Pawla II', 'religia', 2005, 'Zbiór przysłów oraz zwrotów idiomatycznych i kolokwialnych, aby móc wyrażać się w sposób bardziej naturalny Zobrazowanie zróżnicowanych znaczeń zwrotów ');
INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (5, 'Leopold Staff', 'PWN', 'Wiersze wybrane', 'poezja', 2000, '');
INSERT INTO book (idb, author, publisher, title, category, publication_year, description) VALUES (6, 'Twardowski', 'PWN', 'Wiersze', 'poezja', 2005, 'Jakiś tam opis książki');
INSERT INTO person (idp, first_name, last_name, phone) VALUES (1, 'Jan', 'Kowalski', 500123345);
INSERT INTO person (idp, first_name, last_name, phone) VALUES (2, 'Marek', 'Nowak', 551445554);
INSERT INTO person (idp, first_name, last_name, phone) VALUES (3, 'Zosia', 'Zaremba', 600100323);
INSERT INTO person (idp, first_name, last_name, phone) VALUES (4, 'Ala', 'Krokus', 510505600);
INSERT INTO person (idp, first_name, last_name, phone) VALUES (5, 'Piotrek', 'Kowalski', 276454332);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (1, 20180412, 3,1, false);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (2, 20180412, 1,6, false);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (3, 20180412, 1,5, false);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (4, 20180105, 1,3, true);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (5, 20180612, 2,2, false);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (6, 20180905, 1,2, true);
INSERT INTO borrowed (id, date_borrowing, idp, idb, returned) VALUES (7, 20180905, 1,1, true);

