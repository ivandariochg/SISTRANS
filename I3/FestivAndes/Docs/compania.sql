CREATE TABLE COMPANIA
(
	ID NUMBER NOT NULL,
	ID_PERSONA NUMBER NOT NULL,
	NOMBRE VARCHAR(255),
	PAIS VARCHAR(255),
	WEB VARCHAR(255),
	CONSTRAINT PK_COMPANIA PRIMARY KEY(ID),
	CONSTRAINT FK_PERSOAN FOREIGN KEY(ID_PERSONA) REFERENCES PERSONA(ID)
);

INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (1,'43','Remedios Lamb','Costa Rica','eu.neque@Maecenasliberoest.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (2,'27','Meredith Payne','Iceland','Duis.gravida@ultriciesdignissim.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (3,'23','Ina Shepard','Venezuela','Vivamus@ipsumnunc.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (4,'58','Patrick Rose','Venezuela','semper.auctor@aliquetodioEtiam.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (5,'94','Freya Richardson','Uzbekistan','nibh@Duisdignissim.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (6,'03','Eliana Mccormick','Guinea','facilisis.Suspendisse@dictum.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (7,'33','Lydia Neal','Greenland','Nam.porttitor.scelerisque@Pellentesque.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (8,'54','Joan Craft','Uzbekistan','posuere.cubilia.Curae@magnis.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (9,'56','Rae Small','Greenland','euismod@eu.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (10,'51','Xerxes Suarez','Egypt','felis.orci@imperdietornare.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (11,'64','Isabella Rodgers','Latvia','sociis@Fusce.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (12,'48','Caldwell Raymond','Sao Tome and Principe','dui.in@arcu.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (13,'99','Edward Mckenzie','Palau','et.malesuada@diamdictumsapien.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (14,'83','Oren Valdez','Micronesia','cursus@nisi.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (15,'69','Keiko Rocha','Timor-Leste','purus@ac.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (16,'63','Myles Kirk','Liberia','rutrum@utquamvel.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (17,'95','Charissa Fischer','Papua New Guinea','libero.Integer@penatibusetmagnis.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (18,'35','Reagan Schmidt','New Zealand','ultrices.Duis.volutpat@luctus.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (19,'14','Phelan Watson','Ukraine','elit.pede.malesuada@orciquis.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (20,'72','Amos Molina','Indonesia','neque.pellentesque.massa@Vivamuseuismodurna.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (21,'90','Nita Barron','Afghanistan','ornare@blanditcongue.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (22,'45','Kato Woods','United States Minor Outlying Islands','mattis@diamProindolor.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (23,'55','Sydnee Schultz','Serbia','lorem.fringilla.ornare@dignissimlacus.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (24,'05','Erich Holder','Armenia','non.feugiat@porttitor.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (25,'15','Hilda Adkins','Bouvet Island','odio.Aliquam@asollicitudinorci.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (26,'40','Bo Bray','American Samoa','malesuada.fames.ac@cursusIntegermollis.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (27,'57','Caldwell Guy','Montenegro','Phasellus.ornare.Fusce@vulputateeu.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (28,'04','Montana Reyes','Mexico','dui.nec@elitfermentum.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (29,'12','Kay Stephenson','Congo, the Democratic Republic of the','blandit.viverra@magna.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (30,'21','Kirby Flores','San Marino','Donec.nibh@nuncQuisqueornare.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (31,'19','Slade Foster','Mexico','augue.id.ante@velvenenatisvel.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (32,'06','Brendan Burke','Swaziland','dolor@sit.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (33,'97','Kermit Sullivan','Turks and Caicos Islands','felis.Donec@temporarcuVestibulum.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (34,'00','Michelle Levine','Anguilla','dapibus.id.blandit@sitametdapibus.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (35,'58','Hayfa Good','Trinidad and Tobago','semper.rutrum@pedesagittis.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (36,'20','Troy Jefferson','Samoa','tellus@eleifendegestas.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (37,'03','Georgia Patel','Saint Helena, Ascension and Tristan da Cunha','Morbi.neque.tellus@etultricesposuere.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (38,'68','Darryl Malone','Angola','Donec.vitae@nuncidenim.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (39,'05','Ray Kirby','Bosnia and Herzegovina','consequat.nec@enimCurabiturmassa.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (40,'44','Karly Robbins','El Salvador','Cum@vestibulum.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (41,'80','McKenzie Hayden','Honduras','tortor@Sedauctor.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (42,'69','Leilani Lewis','Barbados','Aliquam.auctor@Maurisblanditenim.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (43,'48','Brody Burns','Uzbekistan','ac.eleifend.vitae@anteipsumprimis.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (44,'69','Iona Mcgowan','Antarctica','purus@lectus.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (45,'14','Uma Perkins','Iceland','aliquet.lobortis@aliquamerosturpis.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (46,'85','Fritz Odom','Algeria','penatibus@malesuada.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (47,'48','Wilma Dixon','Libya','Mauris@morbitristique.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (48,'18','Lani Rice','San Marino','diam.vel.arcu@acfacilisisfacilisis.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (49,'90','Dacey Cain','Sri Lanka','Nunc.sollicitudin@Nullam.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (50,'34','Mariko Sykes','Lithuania','dui@Aliquam.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (51,'17','Ava Phillips','Aruba','lacinia.vitae.sodales@auctor.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (52,'73','Lawrence Roth','New Caledonia','vitae.nibh@arcuMorbi.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (53,'37','Azalia Murphy','Morocco','Integer.vulputate.risus@adlitora.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (54,'60','Kuame Lane','Haiti','justo.sit@aultriciesadipiscing.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (55,'55','Yen Blankenship','Curaçao','quam@odio.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (56,'25','Amelia Pena','Palau','blandit.at@ipsumportaelit.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (57,'66','Victoria Allen','Israel','amet.consectetuer.adipiscing@dictumProin.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (58,'50','Ava Rush','Bermuda','orci@tristiquesenectuset.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (59,'81','Lara Vinson','Greenland','penatibus@ornare.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (60,'89','Damian Barlow','Bolivia','tellus@ultriciesadipiscing.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (61,'16','Myles Bond','Monaco','sem.semper.erat@velitegetlaoreet.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (62,'00','Rhea Mcdowell','Chile','ante@dictumaugue.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (63,'90','Benedict Petersen','Turks and Caicos Islands','libero.dui.nec@sit.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (64,'13','Zena Bentley','Brunei','tempus@ullamcorper.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (65,'28','Amber Warren','Cape Verde','ipsum.Suspendisse.non@molestietortor.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (66,'87','Inez Raymond','Guernsey','est.mauris@egetipsumSuspendisse.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (67,'59','Jolie Mitchell','Djibouti','Vestibulum@tristiquealiquetPhasellus.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (68,'33','Halla Joyner','Laos','imperdiet.erat@Naminterdumenim.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (69,'54','Martina Odonnell','Macao','vel@dolorDonec.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (70,'90','Constance Craig','Greece','venenatis@lacusUtnec.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (71,'54','Flavia Morris','Denmark','eget@semutdolor.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (72,'59','Fredericka Valenzuela','Tonga','Nunc.mauris@Maurisvelturpis.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (73,'20','Quinn Willis','Lithuania','ullamcorper@telluslorem.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (74,'99','Maris Rollins','Portugal','dapibus.quam@magnisdis.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (75,'85','Doris Shannon','Jamaica','convallis.ligula@mattis.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (76,'19','Megan Silva','Turkmenistan','dui.augue.eu@Integereulacus.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (77,'31','Dylan Molina','Guinea-Bissau','quis.accumsan.convallis@velitAliquam.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (78,'54','Eugenia Blanchard','Kiribati','nisl@Cras.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (79,'82','Alexis White','Iraq','Donec.dignissim.magna@a.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (80,'43','Yuri Cox','Cayman Islands','pede@eratvolutpat.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (81,'88','Iliana Floyd','Brunei','lacus@Phasellus.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (82,'96','Graiden Rosa','Saint Barthélemy','cursus@laciniamattis.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (83,'90','Lavinia Buchanan','Wallis and Futuna','Quisque.varius.Nam@ultriciesornare.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (84,'65','Ima Salinas','Argentina','Curae.Phasellus@Duiselementumdui.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (85,'26','Ira Manning','Italy','sit.amet@acliberonec.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (86,'54','Iola Gray','Belgium','semper.egestas@sodalespurusin.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (87,'78','Dillon Lopez','Czech Republic','sagittis.lobortis@malesuada.net');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (88,'32','Tashya Trevino','Morocco','dictum@Nuncpulvinar.co.uk');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (89,'14','Yuri Oconnor','Bermuda','malesuada@volutpatNullafacilisis.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (90,'48','Molly Barnes','Niger','mauris.ut.mi@malesuadamalesuada.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (91,'79','Minerva Compton','Nepal','orci.in.consequat@dignissimMaecenas.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (92,'50','Yoshi Collins','Brunei','sagittis.augue@Inornare.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (93,'71','Tucker Carlson','Ireland','eu.sem.Pellentesque@Pellentesquetincidunt.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (94,'92','Jaden Grant','Kyrgyzstan','Suspendisse@ametluctusvulputate.ca');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (95,'00','Rowan Holloway','Kazakhstan','Nullam.scelerisque@acmattis.com');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (96,'28','Ciara Pollard','Jersey','justo.nec.ante@Craseutellus.org');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (97,'03','Deirdre Mcgee','Israel','eget.metus.eu@et.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (98,'96','Cedric Olsen','Belarus','rhoncus@accumsaninterdum.edu');
INSERT INTO COMPANIA (ID,ID_PERSONA,NOMBRE,PAIS,WEB) VALUES (99,'31','Pandora Solomon','Guadeloupe','pede.nonummy.ut@inmagnaPhasellus.org');


COMMIT;