CREATE TABLE LOCALIDAD
(
	ID NUMBER NOT NULL,
	ID_SITIO NUMBER NOT NULL,
	NOMBRE VARCHAR(255),
	PRECIO NUMBER NOT NULL,
	CAPACIDAD NUMBER NOT NULL,
	
	CONSTRAINT PK_LOCALIDAD PRIMARY KEY(ID),
	CONSTRAINT FK_SITIO FOREIGN KEY(ID_SITIO) REFERENCE SITIO(ID)
),

INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (0,'79','Steel Hopper','386','47');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (1,'73','Bert Kaufman','228','69');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (2,'42','Aladdin Martinez','693','37');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (3,'49','Ian Hurst','366','28');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (4,'25','Knox Sosa','533','21');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (5,'11','Quamar Cook','894','69');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (6,'64','Jasper Kinney','878','74');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (7,'72','Ethan Garrett','713','54');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (8,'14','Emmanuel Wilson','730','76');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (9,'40','Otto Warner','583','48');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (10,'50','Kennedy Christian','342','63');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (11,'75','Xander Kline','717','36');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (12,'79','Hall Callahan','852','56');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (13,'52','Ian Johnston','911','94');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (14,'55','Fritz Huffman','387','31');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (15,'20','Kasimir Fleming','791','11');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (16,'87','Caldwell Floyd','074','14');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (17,'06','Armand Trevino','168','90');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (18,'94','Darius Brock','468','51');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (19,'14','Patrick Herrera','113','85');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (20,'44','Ferris Taylor','182','38');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (21,'43','Brock Faulkner','766','11');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (22,'57','Raphael Oneil','398','19');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (23,'83','Richard Chang','284','04');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (24,'51','Ulric Austin','149','82');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (25,'34','Demetrius Beard','595','37');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (26,'67','Simon Bennett','979','85');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (27,'26','Odysseus Farrell','644','12');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (28,'01','Palmer Herman','697','53');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (29,'10','Allistair Rojas','397','24');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (30,'83','Judah Jenkins','645','99');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (31,'97','Warren Hess','408','66');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (32,'02','Bruce Rivera','479','19');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (33,'69','Samuel Gaines','978','76');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (34,'78','Alfonso Roy','287','37');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (35,'57','Troy Dunn','976','48');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (36,'88','Erasmus Molina','083','66');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (37,'56','Buckminster Curtis','144','34');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (38,'03','Fitzgerald Acosta','207','19');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (39,'76','Gray Bishop','992','92');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (40,'29','Chester Dudley','071','52');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (41,'59','Derek Sanford','241','87');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (42,'95','Carter Williams','930','57');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (43,'16','Raymond Watts','403','64');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (44,'24','Garrison Everett','691','35');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (45,'98','Akeem Owens','572','53');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (46,'28','Melvin Mcgee','508','91');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (47,'02','Matthew Lloyd','089','42');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (48,'71','Zephania Moran','835','50');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (49,'98','Wing David','673','14');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (50,'71','Emerson Holden','950','78');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (51,'07','Phillip Holder','800','25');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (52,'11','Zachery Carr','695','36');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (53,'20','Jonah Hardy','754','86');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (54,'15','Aidan Chaney','056','51');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (55,'77','Robert Horton','665','18');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (56,'07','Tate Hood','466','59');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (57,'72','Louis Gallagher','064','22');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (58,'35','Keegan Mendez','719','50');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (59,'56','Joel Shields','850','42');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (60,'65','Hunter Combs','895','31');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (61,'78','Vaughan Holland','743','59');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (62,'96','Declan Dodson','897','03');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (63,'90','Chase Craft','397','12');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (64,'13','Todd Mullen','289','33');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (65,'58','Slade Scott','994','92');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (66,'08','Burke Byrd','119','66');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (67,'37','Garrett Delgado','132','07');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (68,'17','Shad Manning','506','35');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (69,'20','Anthony Blevins','037','08');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (70,'31','Fulton Puckett','537','13');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (71,'15','Magee Graves','689','80');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (72,'14','Harrison Boyer','099','40');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (73,'41','Lane Morales','359','81');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (74,'55','Jerome Waller','254','63');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (75,'69','Christian Barnett','287','19');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (76,'85','Brady Camacho','835','79');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (77,'21','Clark Adams','642','90');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (78,'85','Samuel Downs','743','84');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (79,'52','Demetrius Delaney','766','93');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (80,'84','Barry Villarreal','580','04');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (81,'44','Silas Gillespie','979','96');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (82,'81','Felix Morales','437','35');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (83,'69','Zachary Crawford','196','27');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (84,'21','Wang Stevens','637','48');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (85,'31','Garth Guerra','675','96');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (86,'31','Brent Farrell','620','98');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (87,'95','Kennedy Aguirre','610','45');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (88,'59','Dominic Higgins','664','06');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (89,'97','Rigel Benson','420','80');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (90,'41','Raja Jacobs','819','84');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (91,'29','Kadeem Mcclure','922','45');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (92,'79','Tiger Gillespie','066','79');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (93,'03','Rigel Henry','605','81');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (94,'52','Xavier Nicholson','636','81');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (95,'76','Marsden Williams','132','54');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (96,'65','Finn Gallagher','425','43');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (97,'06','Chase Lucas','402','06');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (98,'31','Ralph Espinoza','020','19');
INSERT INTO LOCALIDAD (ID,ID_SITIO,NOMBRE,PRECIO,CAPACIDAD) VALUES (99,'74','Timon Jarvis','074','78');

COMMIT;