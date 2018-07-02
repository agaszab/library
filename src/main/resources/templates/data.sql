INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("Latarnik","Sienkiewicz","powieść","PWN", 1997);
INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("Wyznania","Augustyn","religia","WAM", 2004);
INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("Historia Polski","Jurek","powieść","PWN", 2018);
INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("Ks. Dolindo","Piątkowska","religia","Esprint", 1983);
INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("DOS","Jakisktos","informatyka","PWN", 1745);
INSERT INTO `book` (`title`,`author`,`type`,`publisher`,`year`) VALUES("Anielka","Sienkiewicz","powieść","WAM", 2000);

INSERT INTO `person` (`name`,`surname`) VALUES ( "Anna", "Nowak");
INSERT INTO `person` (`name`,`surname`) VALUES ( "Piotr", "Nowak");
INSERT INTO `person` (`name`,`surname`) VALUES ( "Magdalena", "Kowal");
INSERT INTO `person` (`name`,`surname`) VALUES ( "Marcin", "Kowal");
INSERT INTO `person` (`name`,`surname`) VALUES ( "Jaś", "Kowal");
INSERT INTO `person` (`name`,`surname`) VALUES ("Genowefa", "Polak");
INSERT INTO `person` (`name`,`surname`) VALUES ( "Robert", "Nowak");
INSERT INTO `person` (`name`,`surname`) VALUES ("Anna", "Zawada");
INSERT INTO `person` (`name`,`surname`) VALUES ("Paweł", "Zawada");

INSERT INTO `person` (`idb`,`idp`,`dateBorrowing`,`returned`) VALUES (1, 1, 2018-05-02, true);
INSERT INTO `person` (`idb`,`idp`,`dateBorrowing`,`returned`) VALUES (2, 1, 2018-06-22, true);
INSERT INTO `person` (`idb`,`idp`,`dateBorrowing`,`returned`) VALUES (5, 3, 2018-01-15, false);
INSERT INTO `person` (`idb`,`idp`,`dateBorrowing`,`returned`) VALUES (6, 2, 2018-05-02, false);